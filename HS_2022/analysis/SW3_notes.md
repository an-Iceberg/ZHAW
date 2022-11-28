###### Analysis - Semesterwoche #3 - 6. Oktober 2022

# Ableitungen und Ableitung von Polynomen

- **Steigungsdreiecke**

**Lineare Funktion:** $f(x) = ax + b$

m ist die Steigung

- Ableitungsfunktionen

$$f(x) \to f'(x)$$

- stetig
- differenzierbar

> Binomische Formeln (Pascalsches Dreieck)

$$
\begin{align*}
f(x) &= x^n + c \\
f'(x) &= nx^{n - 1} + c
\end{align*}
$$

```
(f(x0 + h) - f(x0)) / h
f(x) = x^8

((x + h)^8 - x^8) / h
= (x^8 + 8(x^7)h + 28(x^6)h^2 + 56(x^5)h^3 + 70(x^4)h^4 + 56(x^3)h^5 + 28(x^2)h^6 + 8xh^7 + h^8 - x^8) / h
= (8(x^7)h + 28(x^6)h^2 + 56(x^5)h^3 + 70(x^4)h^4 + 56(x^3)h^5 + 28(x^2)h^6 + 8xh^7 + h^8) / h
= (8(x^7) + h * (...)) / h

/Algebra, Analysis

= lim(h->0) (8x^7 + h*(...))
= 8x^7 + 0
= 8x^7 = f'(x)

f'(x) = n * x^(n-1)
f'(x) = 8x^7
```

- a)

$$
\begin{align*}
f(x) &= 4x^7 - x + 2 \\
f'(x) &= 28x^6 - 1
\end{align*}
$$

- b)

$$
\begin{align*}
f(x) &= 5x^3 - 2x^2 \\
f'(x) &= 15x^2 - 4x
\end{align*}
$$

- c)
$$
\begin{align*}
f(x) &= \sqrt{x} \\
f'(x) &= {1 \over 0.5\sqrt{x}}
\end{align*}
$$

>**Ableitungssätze**
