mod math;
#[path ="../tests/tests.rs"]
mod tests;

fn main()
{
  println!("  Rust ... something");

  println!("sum(5, 31, 0.06) = {}", math::sum(5_f64, 31_f64, 0.06));
}
