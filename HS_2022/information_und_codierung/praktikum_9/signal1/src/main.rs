use std::{fs, io::{Write, Seek}, f32::consts::PI};

fn main()
{
  let mut file = match fs::File::create("signal1.wav")
  {
    Ok(file_handle) => file_handle,

    Err(err) =>
    {
      println!("{err}");
      std::process::exit(-1);
    }
  };

  let sample_rate: u32 = 44_100; // Originally 44'100
  let bits_per_sample: u16 = 16;
  let number_of_channels: u16 = 1;
  let duration: u32 = 3;
  let mut byte_count: u32 = 1;

  file.write(b"RIFF").unwrap();
  file.write(&2_084_u32.to_le_bytes()).unwrap(); // Final file size not known yet, write 0. This is = sample count + 36 bytes from header.
  file.write(b"WAVE").unwrap(); // Keyword "WAVE"
  file.write(b"fmt ").unwrap(); // Keyword "fmt "
  file.write(&16_u32.to_le_bytes()).unwrap(); // Sub-chunk size, 16 for PCM (2 bytes)
  file.write(&1_u16.to_le_bytes()).unwrap(); // AudioFormat, 1 for PCM (2 bytes)

  file.write(&number_of_channels.to_le_bytes()).unwrap(); // Number of channels, 1 for mono, 2 for stereo
  file.write(&sample_rate.to_le_bytes()).unwrap(); // Sample rate
  file.write(&((sample_rate * bits_per_sample as u32 * number_of_channels as u32) / 8).to_le_bytes()).unwrap(); // Byte rate
  file.write(&((bits_per_sample * number_of_channels as u16) / 8).to_le_bytes()).unwrap(); // Block align
  file.write(&bits_per_sample.to_le_bytes()).unwrap(); // Bits per Sample
  file.write(b"data").unwrap(); // Keyword "data"

  file.write(&0_u32.to_le_bytes()).unwrap(); // Data chunk size not known yet, write 0

  // let frequency: f32 = 2_f32 * sample_rate as f32;
  let frequency = 7_000_f32; // Originally 1'000
  // $K = 2^{\text{bits per sample} - 1} - 1$
  let scaling_factor_k: f32 = 2_f32.powf(bits_per_sample as f32 - 1_f32) - 1_f32;

  for i in 0..(sample_rate * duration)
  {
    // $S_i = K \cdot \sin\left({i \cdot 2\pi \cdot f \over R}\right)$
    let sample = (scaling_factor_k * ((i as f32 * 2_f32 * PI * frequency) / sample_rate as f32).sin()) as i16;

    file.write(&sample.to_le_bytes()).unwrap();
    byte_count += 2;
  }

  println!("\nbyte_count:{}\n", byte_count);

  file.seek(std::io::SeekFrom::Start(0x_4)).unwrap();
  file.write(&(byte_count + 36).to_le_bytes()).unwrap();

  file.seek(std::io::SeekFrom::Start(0x_28)).unwrap();
  file.write(&byte_count.to_le_bytes()).unwrap();
}
