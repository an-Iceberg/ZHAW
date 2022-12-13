#[cfg(test)]

#[path ="../src/math.rs"]
mod math;

#[test]
fn sum_tests()
{
  assert!(math::sum(2_f64, 31_f64, 0.06) > 0.7 && math::sum(2_f64, 31_f64, 0.06) < 0.72);
}

#[test]
fn power_tests()
{
  assert_eq!(math::power(2_f64, 3), 8_f64);
  assert_eq!(math::power(3_f64, 2), 9_f64);
  assert_eq!(math::power(5_f64, 9), 1953125_f64);
  assert_eq!(math::power(9_f64, 5), 59049_f64);
}

#[test]
fn factorial_tests()
{
  assert_eq!(math::factorial(0_f64), 1_f64);
  assert_eq!(math::factorial(1_f64), 1_f64);
  assert_eq!(math::factorial(2_f64), 2_f64);
  assert_eq!(math::factorial(3_f64), 6_f64);
  assert_eq!(math::factorial(4_f64), 24_f64);
  assert_eq!(math::factorial(8_f64), 40320_f64);
  assert_eq!(math::factorial(10_f64), 3628800_f64);
  assert_eq!(math::factorial(15_f64), 1307674368000_f64);
  assert_eq!(math::factorial(20_f64), 2432902008176640000_f64);
  assert_eq!(math::factorial(30_f64), 265252859812191100000000000000000_f64);
}

#[test]
fn binomial_tests()
{
  assert!(math::binomial(31_f64, 0_f64) > 0_f64 && math::binomial(31_f64, 0_f64) < 2_f64);
  assert!(math::binomial(31_f64, 1_f64) > 30_f64 && math::binomial(31_f64, 1_f64) < 32_f64);
  assert!(math::binomial(31_f64, 2_f64) > 464_f64 && math::binomial(31_f64, 2_f64) < 466_f64);
  assert!(math::binomial(31_f64, 3_f64) > 4494_f64 && math::binomial(31_f64, 3_f64) < 4496_f64);
  assert!(math::binomial(31_f64, 4_f64) > 31464_f64 && math::binomial(31_f64, 4_f64) < 31466_f64);
  assert!(math::binomial(31_f64, 5_f64) > 169910_f64 && math::binomial(31_f64, 5_f64) < 169912_f64);
  assert!(math::binomial(31_f64, 6_f64) > 736280_f64 && math::binomial(31_f64, 6_f64) < 736282_f64);
}
