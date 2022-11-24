###### Analysis - Semesterwoche #10 - 24. November 2022

# Differentialrechnung

## Ableitung von zusammengesetzten Funktionen

**Verkettungen von Funktionen**

>$\tan(x) = {\sin(x) \over \cos(x)}$

### Addition

$\boxed{f(x) = a(x) + b(x) \implies f'(x) = a'(x) + b'(x)}$

### Subtraktion

$\boxed{f(x) = a(x) - b(x) \implies f'(x) = a'(x) - b'(x)}$

### Prokukt

$f(x) = g(x) + h(x) \implies f'(x) = g'(x) + h'(x)$

$\boxed{f(x) = g(x) \cdot h(x) \implies f'(x) = g'(x) \cdot h(x) + g(x) \cdot h'(x)}$

Bei 3 Faktoren:

$f(x) = a(x) \cdot b(x) \cdot c(x) \implies f'(x) = a'(x) \cdot b(x) \cdot c(x) + a(x) \cdot b'(x) \cdot c(x) +a(x) \cdot b(x) \cdot c'(x)$

Bsp.:

$f(x) = 2x^2e^x \implies f'(x) = 4xe^x + 2x^2e^x$

$f(x) = x^7\ln(x) \implies f'(x) = 7x^6\ln(x) + x^6$

$f(x) = e^x(x^2 + 5x - 8)\ln(x) \implies f'(x) = e^x(x^2 + 5x - 8)\ln(x) + e^x(2x + 5)\ln(x) + e^x(x^2 + 5x - 8){1 \over x}$

### Division

$\boxed{f(x) = {a(x) \over b(x)} \implies f'(x) = {a'(x) \cdot b(x) - a(x) \cdot b'(x) \over b(x)^2}}$

Bsp.:

$f(x) = {4x^2 + 1 \over x^3 - x} \implies f'(x) = {-4x^4 - x^2 - x - 1 \over x^6 - 2x^4 + x^2}$

$f(x) = {e^x \over x^4 + 1} \implies f'(x) = {e^xx^4 - e^x4x^3 + e^x \over x^6 + 2x^4 + 1}$

### Kettenregel

$\boxed{f(x) = (a \circ b)(x) = a(b(x)) \implies f'(x) = (a \circ b)'(x) = a'(b(x)) \cdot b'(x) = (a' \circ b)(x) \cdot b'(x)}$

Bsp.:

$f(x) = \sqrt{3x^2 + 4x} = (3x^2 + 4x)^{1 \over 2} \implies {1 \over 2}(3x^2 + 4x)^{-1 \over 2} \cdot (6x + 4) = {1 \over 2}{1 \over \sqrt{3x^2 + 4x}} \cdot (6x + 4) = {6x + 4 \over 2\sqrt{3x^2 + 4x}}$

$f(x) = (x^2 + e^x)^{100} \implies f'(x) = 100(x^2 + e^x)^{99} \cdot (2x + e^x)$

---

$x = e^{\ln(x)}$
