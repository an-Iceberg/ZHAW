#[cfg(test)]

#[path ="../src/math.rs"]
mod math;

// TODO: adjust types

#[test]
fn sum_tests()
{
  assert_eq!(math::sum(2, 31, 0.06_u128), 0.71_u128);
}

#[test]
fn power_tests()
{
  // TODO: test math::power()
}

#[test]
fn factorial_tests()
{
  assert_eq!(math::factorial(0), 1_u128);
  assert_eq!(math::factorial(1), 1_u128);
  assert_eq!(math::factorial(2), 2_u128);
  assert_eq!(math::factorial(3), 6_u128);
  assert_eq!(math::factorial(4), 24_u128);
  assert_eq!(math::factorial(8), 40_320_u128);
  assert_eq!(math::factorial(10), 3_628_800_u128);
  assert_eq!(math::factorial(15), 1_307_674_368_000_u128);
  assert_eq!(math::factorial(20), 2_432_902_008_176_640_000_u128);
  assert_eq!(math::factorial(30), 265_252_859_812_191_058_636_308_480_000_000_u128);
}

#[test]
fn binomial_tests()
{
  // TODO: redo these to assert that the return value is between two integers (in order to test fractional correctness)
  assert_eq!(math::binomial(31, 0), 1_u128);
  assert_eq!(math::binomial(31, 1), 31_u128);
  assert_eq!(math::binomial(31, 2), 465_u128);
  assert_eq!(math::binomial(31, 3), 4_495_u128);
  assert_eq!(math::binomial(31, 4), 31_465_u128);
  assert_eq!(math::binomial(31, 5), 169_911_u128);
  assert_eq!(math::binomial(31, 6), 736_281_u128);
}
