pub fn sum(f: u128, n: u128, epsilon: f64) -> f64
{
  let mut sum = 0;

  for t in 0..=f
  {
    sum += binomial(n, t) * power(epsilon, t) * power(1_f64 - epsilon, n - t);
  }

  return sum;
}

pub fn power(mut base: f64, exponent: u128) -> f64
{
  for _i in 0..=exponent
  {
    base *= base;
  }

  return base;
}

pub fn factorial(mut number: u128) -> u128
{
  let mut factorial = 1_u128;

  while number > 0
  {
    factorial *= number;
    number -= 1;
  }

  return factorial;
}

// TODO: needs to return an f64
pub fn binomial(top: u128, bottom: u128) -> f64
{
  let up = factorial(top);
  let bottom_left = factorial(bottom);
  let bottom_right = factorial(top - bottom);

  return up / (bottom_left * bottom_right);
}
