# Serie 6: Folgen und Reihen

## 1.

### a)

$q = {3 \over 2} = 0.75$\
$s = {2 \over 1 - 0.75} = 8$

$s=8$

### b)

$q = {{-3 \over 2} \over 2} = -0.75$\
$s = {2 \over 1 + 0.75} = 1.142857\dots$

$s=1.142857\dots$

### c)

$q = {0.99 \over 1} = 0.99$\
$s = {1 \over 1 - 0.99} = 100$

$s=100$

### d)

q = -0.99 / 1 = -0.99\
s = 1 / (1 + 0.99) ~= 0.5

<ins>s ~= 0.5</ins>

$q = {-0.99 \over 1} = -0.99$\
$s = {1 \over 1 + 0.99} \simeq 0.5$

$s \simeq 0.5$

## 2.

### a)

$a(1) = 5, a(2) = {-55 \over 12}$\
$q = {{-55 \over 12} \over 5} = {-55 \over 12} \cdot {1 \over 5} = {-11 \over 12} $\
$s = {5 \over 1 + {11 \over 12}} = {5 \over {23 \over 12}} \simeq 2.6$

$s \simeq 2.6$

### b)

$a(1) = 3, a(2) = 3 \cdot {4 \over 5} = 2.4$\
$q = {2.4 \over 3} = 0.8$\
$s = {3 \over 1 - 0.8} = 15$

$s = 15$

## 3.

$a(1) = 10$\
$s = 6 = {10 \over 1 - q} \quad$

$$
\begin{align*}
  6 &= {10 \over 1 - q}        & &| \quad \cdot (1 - q) \\
  &\to 6 \cdot (1 - q) = 10    \\
  &\to 6 - 6q = 10             & &| \quad -6 \\
  &\to -6q = 4                 & &| \quad \cdot (-1) \\
  &\to 6q = -4                 & &| \quad \div 6 \\
  &\Rightarrow q = -{4 \over 6}\\
  &= -{2 \over 3}
\end{align*}
$$

$a(2) = 10 \cdot -{2 \over 3} = -{20 \over 3}$\
$a(3) = -{20 \over 3} \cdot -{2 \over 3} = {40 \over 9}$\
$a(4) = {40 \over 9} \cdot -{2 \over 3} = -{80 \over 27}$

## 4.

$a(1)=4$\
$s=12$

$$
\begin{align*}
  12 &= {4 \over 1 - q} &&| \ (1 - q) \\
  12 - 12q &= 4 &&| \ -12 \\
  -12q &= -8 &&| \ (-1) \\
  12q &= 8 &&| \ \div 12 \\
  q &= {2 \over 3}
\end{align*}
$$

## 5.

> n-te Partialsumme:\
> $s(n) = A \cdot {1 - q^n \over 1 - q}$

### a)

> $q = 0.8$\
> $s = {1 \over 1 - 0.8} = 5$\
> $e = 10^{-3} = 0.00'1$\
> $s = s - e = 4.999$

$$
\begin{align*}
  4.999 &= 1 \cdot {1 - 0.8^n \over 1 - 0.8} &&| \ \cdot (1 - 0.8) \\
  0.99'98 &= 1 - 0.8^n &&| \ + 0.8^n, - 0.99'98 \\
  0.8^n &= 0.00'02 &&| \ \log \\
  \log_{0.8}(0.00'02) &= n \\
  n &= 38
\end{align*}
$$

$\Rightarrow n=38$

### b)

> $q = 0.9$\
> $s = {1 \over 1 - 0.9} = 10$\
> $e = 10^{-6} = 0.00'000'1$\
> $s = s - e = 9.99'999$

$$
\begin{align*}
9.99'999 &= 1 \cdot {1 - 0.9^n \over 1 - 0.9} &&| \ \cdot 0.1 \\
0.99'999'9 &= 1 - 0.9^n &&| \ + 0.9^n, - 0.99'999'9 \\
0.9^n &= 0.00'000'1 &&| \ \log \\
\log_{0.9}(0.00'000'1) &= n \\
n &= 131
\end{align*}
$$

### c)

> $q = 0.1$\
> $s = {1 \over 1 - 0.1} = 1.\overline{11}$\
> $e = 10^{-6} = 0.00'000'1$\
> $s = s - e = 1.11'110'\overline{11}$

$$
\begin{align*}
1.11'110'\overline{11} &= 1 \cdot {1 - 0.1^n \over 1 - 0.1} &&| \ \cdot 0.9 \\
0.99'999'0\overline{99} &= 1 - 0.1^n &&| \ + 0.1^n, - 099'999'0\overline{99} \\
0.1^n &= 0.00'000'9 &&| \ \log \\
\log_{0.1}(0.00'000'9) &= n \\
n &= 5
\end{align*}
$$

$\Rightarrow n=5$

## 6.

> $\Sigma^{\infty}_{k=1} a_k = 0.\overline{44}$

### a)

$q = 0.1$\
$a(1) = 0.4$\
$a(2) = 0.04$\
$a(3) = 0.00'4$

### b)

$\lim\limits_{n \to \infty} s_n = {0.4 \over 1 - 0.1n} = 0.\overline{44}$

$s=0.\overline{44}$

### c)

Keine Ahnung.
