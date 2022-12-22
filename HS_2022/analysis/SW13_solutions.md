# Serie 13: Integralrechnung

## 1.

### a)

$$
\begin{align*}
  &\int \left(5 \cdot 4^x - {1 \over 2 \sqrt x}\right) \ \mathrm{d}x \\
  &= \int \left(5 \cdot 4^x - (2 \sqrt x)^{-1}\right) \ \mathrm{d}x \\
  &= \int \left(5 \cdot 4^x - (2x^{1 \over 2})^{-1}\right) \ \mathrm{d}x \\
  &= \int \left(5 \cdot 4^x - 2x^{-{1 \over 2}}\right) \ \mathrm{d}x \\
  &= 5 \cdot {4^x \over \ln(4)} - {1 \over -{1 \over 2} + 1} \cdot 2x^{-{1 \over 2} + 1} + C \\
  &= \boxed{{5 \cdot 4^x \over \ln(4)} - 4x^{1 \over 2} + C}
\end{align*}
$$

### b)

$$
\begin{align*}
  &\int \sqrt{x \sqrt x} \ \mathrm{d}x \\
  &= \int (x^1 \cdot x^{1 \over 2})^{1 \over 2} \\
  &= \int (x^{3 \over 2})^{1 \over 2} \\
  &= \int x^{3 \over 4} \\
  &= {1 \over {3 \over 4} + 1}x^{{3 \over 4} + 1} + C \\
  &= \boxed{{4 \over 7}x^{7 \over 4} + C}
\end{align*}
$$

### c)

$$
\begin{align*}
  &\int {1 - z^2 \over z} \ \mathrm{d}z \\
  &= \int ???
\end{align*}
$$

### d)

$$
\begin{align*}
  &\int (3 \cos(x) + 3^x) \ \mathrm{d}x \\
  &= \boxed{3 \sin(x) + {3^x \over \ln(3)} + C}
\end{align*}
$$

### e)

$$
\begin{align*}
  &\int 8e^{-2x} \ \mathrm{d}x \\
  &= \boxed{-{1 \over 2} 8e^{-2x} + C}
\end{align*}
$$

### f)

$$
\begin{align*}
  &\int \left(x^3 + x^{8 \over 7}\right) \ \mathrm{d}x \\
  &= \boxed{{1 \over 4}x^4 + {7 \over 15}x^{15 \over 7} + C}
\end{align*}
$$

### g)

$$
\begin{align*}
  &\int \left(x^2 - {1 \over 8 \sqrt x} - {4 \over 5}x^{-{2 \over 5}}\right) \ \mathrm{d}x \\
  &= \int \left(x^2 - 8x^{-{1 \over 2}} - {4 \over 5}x^{-{2 \over 5}}\right) \\
  &= {1 \over 2 + 1}x^{2 + 1} - {1 \over -{1 \over 2} + 1}8x^{-{1 \over 2} + 1} - {1 \over -{2 \over 5} + 1}x^{-{2 \over 5} + 1} \\
  &= \boxed{{1 \over 3}x^3 - 16 \sqrt x - {5 \over 3}x^{3 \over 5} + C} \\
\end{align*}
$$

### h)

$$
\begin{align*}
  &\int (3x + 2)^2 \ \mathrm{d}x \\
  &= \int 9x^2 + 12x + 4 \\
  &= \boxed{3x^3 + 6x^2 + 4x + C}
\end{align*}
$$

### i)

$$
\begin{align*}
  &\int \cos(2x - 3) \ \mathrm{d}x \\
  &= \boxed{{1 \over 2}\sin(2x - 3) + C}
\end{align*}
$$

### j)

$$
\begin{align*}
  &\int \sqrt{{3x \over 2} - 7} \ \mathrm{d}x \\
  &= \int \left({3x \over 2} - 7\right)^{1 \over 2} \\
  &= \int ???
\end{align*}
$$

## 2.

$$
\begin{align*}
  &\int_2^3 \left({6 \over x^2} - {2 \over x^3}\right) \ \mathrm{d}x \\
  &= \left({6 \over 3^2} - {2 \over 3^3}\right) - \left({6 \over 2^2} - {2 \over 2^3}\right) \\
  &= {16 \over 27} - {5 \over 4} \\
  &= \boxed{-{71 \over 108}} \\
\end{align*}
$$

## 3.

$$4y = x^2 \implies y = {x^2 \over 4}$$
$$y^2 = 4x \implies y = \sqrt{4x}$$

1. Schnittstelle: (0,0)\
2. Schnitstelle: (4,4)

$$
\begin{align*}
  {x^2 \over 4} &= \sqrt{4x} \ &&| \ \cdot 4, \div \sqrt{4x} \\
  {x^2 \over \sqrt{4x}} &= 4 \\
  x^2 \cdot {1 \over \sqrt{4x}} &= 4 \\
  x^2 \cdot {1 \over (4x)^{1 \over 2}} &= 4 \\
  x^2 \cdot (4x)^{-{1 \over 2}} &= 4 \\
  x^2 \cdot 4^{-{1 \over 2}} \cdot x^{-{1 \over 2}} &= 4 \\
  x^2 \cdot {1 \over \sqrt{4}} \cdot x^{-{1 \over 2}} &= 4 \\
  x^2 \cdot {1 \over 2} \cdot x^{-{1 \over 2}} &= 4 \ &&| \ \cdot 2 \\
  x^2 \cdot x^{-{1 \over 2}} &= 8 \\
  x^{2 - {1 \over 2}} &= 8 \\
  x^{3 \over 2} &= 8 \\
  (\sqrt[2]{x})^3 &= 8 \ &&| \ \sqrt[3]{} \\
  \sqrt{x} &= 2 \ &&| \ ^2 \\
  x &= 4
\end{align*}
$$

$$F(x) \Rightarrow (4x)^{1 \over 2} \Rightarrow {1 \over 6} \cdot (4x)^{3 \over 2} = {(\sqrt{4x})^3 \over 6}$$

$$ \int_0^4 {x^2 \over 4} \ \mathrm{d}x = {4^3 \over 12} - {0^3 \over 12} = {16 \over 3} $$
$$ \int_0^4 \sqrt{4x} \ \mathrm{d}x = {(\sqrt{4 \cdot 4})^3 \over 6} - {(\sqrt{4 \cdot 0})^3 \over 6} = {32 \over 3}$$
$$A = {32 \over 3} - {16 \over 3} = \boxed{16 \over 3}$$

## 4.

$$x_{1,2} = {-b \pm \sqrt{b^2 - 4ac} \over 2a}$$

$$
\begin{align*}
  f(x) &= -x^2 + 6x + 7 \\
  f^{(1)}(x) &= -2x + 6 \\
  F(x) &= -{1 \over 3}x^3 + 3x^2 + 7x + C
\end{align*}
$$

Scheitelpunkt von $f(x)$:
$$
\begin{align*}
  0 &= -2x + 6 \quad &&| \ + 2x \\
  2x &= 6 \quad &&| \ \div 2 \\
  x &= 3 \\
  \newline
  f(3) &= -3^2 + 6 \cdot 3 + 7 = -9 + 18 + 7 = 16 \\
  &S(3,16)
\end{align*}
$$

Nullstellen von $f(x)$:
$$
\begin{align*}
  x_{1,2} = {-6 \pm \sqrt{6^2 - 4 \cdot -1 \cdot 7} \over 2 \cdot -1} \\
  x_{1,2} = {-6 \pm 8 \over -2} \\
  x_1 = {-6 + 8 \over -2} = -{2 \over 2} = -1 \\
  x_2 = {-6 - 8 \over -2} = {-14 \over -2} = 7
\end{align*}
$$

Die Fläche des Dreiecks
$$
\begin{align*}
  {4 \cdot 16 \over 2} = 32
\end{align*}
$$

Integral - Fläche des Dreiecks
$$
\begin{align*}
  &\left(\int_{-1}^3 f(x) \ \mathrm{d}x \right) - 32 \\
  &= F(3) - F(-1) - 32 \\
  &= (-{1 \over 3}3^3 + 3\cdot 3^2 + 7\cdot 3) - (-{1 \over 3}(-1)^3 + 3(-1)^2 + 7(-1)) - 32 \\
  &= 39 - -3.66\dots - 32 \\
  &= \boxed{10.66\dots}
\end{align*}
$$

## 5.

$$f(x) = x^2 + 9x + 12,\ g(x) = 4x^2 - 27x + 72$$

$$F(x) = {x^3 \over 3} + {9x^2 \over 2} + 12x + C$$
$$G(x) = {4x^3 \over 3} - {27x^2 \over 2} + 72x + C$$

$$
\begin{align*}
  x^2 + 9x + 12 &= 4x^2 - 27x + 72 \ &&| \ -x^2, -9x, -72 \\
  -60 &= 3x^2 - 36x \ &&| \ + 60 \\
  0 &= 3x^2 - 36x + 60 \\
  &\Rightarrow \text{ midnight formula}
\end{align*}
$$

$$
\begin{align*}
  x_{1,2} &= {-b \pm \sqrt{b^2 - 4ac} \over 2a} \\
  &= {-(-36) \pm \sqrt{(-36)^2 - 4 \cdot 3 \cdot 60} \over 2 \cdot 3} \\
  &= {36 \pm 24 \over 6} \\
  x_1 &= {36 + 24 \over 6} = 10 \\
  x_2 &= {36 - 24 \over 6} = 2 \\
\end{align*}
$$

$$[2,10]$$

$$\int_2^{10} f(x) = \left({10^3 \over 3} + {9 \cdot 10^2 \over 2} + 12 \cdot 10\right) - \left({2^3 \over 3} + {9 \cdot 2^2 \over 2} + 12 \cdot 2\right) = 903.3333 - 44.6666 = 858.6667$$
$$\int_2^{10} g(x) = \left({4 \cdot 10^3 \over 3} - {27 \cdot 10^2 \over 2} + 72 \cdot 10\right) - \left({4 \cdot 2^3 \over 3} - {27 \cdot 2^2 \over 2} + 72 \cdot 2\right) = 703.3333 - 100.6666 = 602.6667$$
$$A = 858.6667 - 602.6667 = \boxed{256}$$

## 6.

### a)

$$y = 3x - x^3$$
$$Y = {3x^2 \over 2} - {x^4 \over 4}$$

$$
\begin{align*}
  0 &= 3x - x^3 \\
  0 &= x(3 - x^2) \\
  x_1 &= (3 - x^2 = 0) = (x^2 = 3) = \sqrt{3} \\
  x_2 &= 0 \\
  x_3 &= -\sqrt{3} \\
\end{align*}
$$

$$\int_0^{\sqrt{3}} Y = {3 \cdot \sqrt{3}^2 \over 2} - {\sqrt{3}^4 \over 4} - {3 \cdot 0^2 \over 2} - {0^4 \over 4} = 4.5 - 2.25 = \boxed{2.25}$$

### b)

$$
\begin{align*}
  3x - x^3 &= x \ &&| \ - x \\
  2x - x^3 &= 0 \\
  x(2 - x^2) &= 0 \\
  x_1 &= (2 -x^2 = 0) = (x^2 = 2) = \sqrt{2} \\
  x_2 &= 0 \\
  x_3 &= -\sqrt{2} \\
\end{align*}
$$

$$\int_0^{\sqrt{2}} Y = {3\sqrt{2}^2 \over 2} - {\sqrt{2}^4 \over 4} = 3 - 1 = 2$$
$$\int_0^{\sqrt{2}} x \ \mathrm{d}x= \sqrt{2}$$
$$A = \boxed{2 - \sqrt{2} \approx 0.5858}$$
