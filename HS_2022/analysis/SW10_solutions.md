# Serie 10: Differentialrechnung

## 1.

>$y = (5x^3 - 4x) \cdot (x^2 + 5x)$

### a)

$y = (5x^3 - 4x) \cdot (x^2 + 5x) = (5x^3 \cdot x^2) + (5x^3 \cdot 5x) - (4x \cdot x^2) - (4x + 5x) = 5x^5 + 10x^3 - 4x^3 - 9x = 5x^5 + 6x^3 - 9x$

$y^{(1)} = (5 \cdot 5x^4) + (3 \cdot 6x^2) - 9 = \boxed{25x^4 + 18x^2 - 9}$

### b)

$y^{(1)} = (15x^2 - 4) \cdot (x^2 + 5x) + (5x^3 - 4x) \cdot (2x + 5) = 15x^4 + 75x^3 - 4x^2 - 9x^2 + 10x^4 + 25x^3 - 8x^2 - 9x = \dots$

## 2.

### a)

$y = 4x \sin(x)$

$\boxed{y^{(1)} = 4\sin(x) + 4x \cos(x)}$

### b)

$x^4e^x\cos(x)$

$\boxed{y^{(1)} = 4x^3e^x\cos(x) + x^4e^x\cos(x) - x^4e^x\sin(x)}$

### c)

$y = e^{-2x} \cdot \cos(x)$

$y^{(1)} = e^{-2x}\cos(x) - e^{-2x}\sin(x) = \boxed{\cos(x) - \sin(x)}$ this is probably wrong

### d)

$y = 4^{x \cdot \ln(x)}$

$a(x) = 4^x, b(x) = x \cdot \ln(x)$

$y^{(1)} = a'(b(x)) \cdot b'(x) = \left(4^{x \cdot \ln(x)} \cdot \ln(4)\right) \cdot \ln(x) \cdot x \cdot {1 \over x} = \boxed{\left(4^{x \cdot \ln(x)} \cdot \ln(4)\right) \cdot \ln(x)}$

### e)

$y = {\ln(x) \over \sqrt{x}}$

$\boxed{y^{(1)} = {{\sqrt{x} \over x} - {\ln(x) \over 2\sqrt{x}} \over x}}$

## 3.

>$y = {x^2 \over 1 - x^2}$

### a)

$y^{(1)} = {2x \over 1 - 2x^2 + x^4}$

### b)

$\text{Polynomdivision}$

## 4.

>$y = (x^2 + 1)^3 = x^6 + 3x^4 + 3x^2 + 1$

### a)

$\boxed{y^{(1)} = 6x^5 + 12x^3 + 6x}$

### b)

$y^{(1)} = 3(x^2 + 1)^2 \cdot 2x = (3x^4 + 6x^2 + 3) \cdot 2x = \boxed{6x^5 + 12x^3 + 6x}$

## 5.

>$y = (\sqrt{x})^{\sqrt{x}}$

## 6.

>$y = \sqrt{x} \cdot (x + 1)$

### a)

$y^{(1)} = {1 \over 2\sqrt{x}} \cdot (x + 1) + \sqrt{x} \cdot 1 = \boxed{{x + 1 \over 2\sqrt{x}} + \sqrt{x}}$

### b)

$y = x + \sqrt{x}$

$y^{(1)} = \boxed{1 + {1 \over 2\sqrt{x}}}$

## 7.

>$f(x) = \left(e^{2x} + 2\right)^3$

>$f(x) = e^{nx}$\
>$f(x) = a(b(x)),\ a(x) = e^x,\ b(x) = nx$\
>$\rightarrow f^{(1)}(x) = e^{nx} \cdot n = ne^{nx}$

⚠️ below is wrong ⚠️

### a)

$f^{(1)}(x) = 3\left(e^{2x} + 2\right)^2 \cdot e^{2x}$\
$= ((e^{2x})^2 + 2(e^{2x} \cdot 2) + 2^2) \cdot 3e^{2x}$\
$= (e^{4x} + 4e^{2x} + 4) \cdot 3e^{2x}$\
$= \boxed{3e^{6x} + 12e^{4x} + 12e^{2x}}$

### b)

$f(x) = (e^{2x})^3 + 3((e^{2x})^2 \cdot 2) + 3(e^{2x} \cdot 2^2) + (2)^3$\
$= e^{6x} + 6e^{4x} + 12e^{2x} + 8$

$f^{(1)}(x) = \boxed{e^{6x} + 6e^{4x} + 12e^{2x}}$

## 8.

### a)

### b)
