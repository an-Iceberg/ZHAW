//#[allow(dead_code)]

pub fn sum(f: f64, n: f64, epsilon: f64) -> f64
{
  let mut sum = 0_f64;

  for t in 0..=(f as i64)
  {
    sum += binomial(n, t as f64) * power(epsilon, t) * power(1_f64 - epsilon, n as i64 - t);
  }

  return sum;
}

pub fn power(base: f64, mut exponent: i64) -> f64
{
  let mut value = 1_f64;

  loop
  {
    if exponent < 1
    {
      break;
    }

    exponent -= 1;
    value *= base;
  }

  return value;
}

pub fn factorial(mut number: f64) -> f64
{
  let mut factorial = 1_f64;

  while number > 1_f64
  {
    factorial *= number;
    number -= 1_f64;
  }

  return factorial;
}

pub fn binomial(top: f64, bottom: f64) -> f64
{
  let up = factorial(top);
  let bottom_left = factorial(bottom);
  let bottom_right = factorial(top - bottom);

  return up / (bottom_left * bottom_right);
}
