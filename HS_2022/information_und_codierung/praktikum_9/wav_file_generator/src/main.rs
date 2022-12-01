use std::{fs, io::{Write, Seek}, f32::consts::PI};

fn main()
{
  let mut file;

  match fs::File::create("file.wav")
  {
    Ok(file_handle) =>
      file = file_handle,

    Err(err) =>
    {
      println!("{err}");
      std::process::exit(-1);
    }
  };

  let sample_rate: u32 = 44_100;
  let bits_per_sample: u16 = 16;
  let number_of_channels: u16 = 1;
  let duration: u32 = 3;
  let mut byte_count: u32 = 1;

  // file.write(b"RIFF").unwrap();
  write(&mut file, b"RIFF");
  // file.write(&2_084_u32.to_le_bytes()).unwrap(); // Final file size not known yet, write 0. This is = sample count + 36 bytes from header.
  write(&mut file, &2_084_u32.to_le_bytes());
  // file.write(b"WAVE").unwrap(); // Keyword "WAVE"
  write(&mut file, b"WAVE");
  // file.write(b"fmt ").unwrap(); // Keyword "fmt "
  write(&mut file, b"fmt ");
  // file.write(&16_u32.to_le_bytes()).unwrap(); // Sub-chunk size, 16 for PCM (2 bytes)
  write(&mut file, &16_u32.to_le_bytes());
  // file.write(&1_u16.to_le_bytes()).unwrap(); // AudioFormat, 1 for PCM (2 bytes)
  write(&mut file, &1_u16.to_le_bytes());

  // file.write(&number_of_channels.to_le_bytes()).unwrap(); // Number of channels, 1 for mono, 2 for stereo
  write(&mut file, &number_of_channels.to_le_bytes());
  // file.write(&sample_rate.to_le_bytes()).unwrap(); // Sample rate
  write(&mut file, &sample_rate.to_le_bytes());
  // file.write(&((sample_rate * bits_per_sample as u32 * number_of_channels as u32) / 8).to_le_bytes()).unwrap(); // Byte rate
  write(&mut file, &((sample_rate * bits_per_sample as u32 * number_of_channels as u32) / 8).to_le_bytes());
  // file.write(&((bits_per_sample * number_of_channels as u16) / 8).to_le_bytes()).unwrap(); // Block align
  write(&mut file, &((bits_per_sample * number_of_channels as u16) / 8).to_le_bytes());
  // file.write(&bits_per_sample.to_le_bytes()).unwrap(); // Bits per Sample
  write(&mut file, &bits_per_sample.to_le_bytes());
  // file.write(b"data").unwrap(); // Keyword "data"
  write(&mut file, b"data");

  // file.write(&0_u32.to_le_bytes()).unwrap(); // Data chunk size not known yet, write 0
  write(&mut file, &0_u32.to_le_bytes());

  // let frequency: f32 = 2_f32 * sample_rate as f32;
  let frequency = 1_000_f32;
  // $K = 2^{\text{bits per sample} - 1} - 1$
  let scaling_factor_k: f32 = 2_f32.powf(bits_per_sample as f32 - 1_f32) - 1_f32;

  for i in 0..(sample_rate * duration)
  {
    // TODO: make some noise!!
    // $S_i = K \cdot \sin\left({i \cdot 2\pi \cdot f \over R}\right)$
    let sample = (scaling_factor_k * ((i as f32 * 2_f32 * PI * frequency) / sample_rate as f32).sin()) as i16;

    // file.write(&sample.to_le_bytes()).unwrap();
    write(&mut file, &sample.to_le_bytes());
    byte_count += 2;
  }

  println!("\nbyte_count:{}\n", byte_count);

  file.seek(std::io::SeekFrom::Start(0x_4)).unwrap();
  file.write(&(byte_count + 36).to_le_bytes()).unwrap();

  file.seek(std::io::SeekFrom::Start(0x_28)).unwrap();
  file.write(&byte_count.to_le_bytes()).unwrap();
}

fn write(file: &mut fs::File, data: &[u8])
{
  match file.write(&data)
  {
    Ok(_) => {}

    Err(error) =>
    {
      println!("{}", error);
      std::process::exit(-1);
    }
  }
}

fn handle(result: Result<Ok(), Err()>)
{

}
