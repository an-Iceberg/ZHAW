###### Analysis - Semesterwoche #9 - 17. November 2022

# Ableitung

## Ableitung von Potenzfunktionen

$f(x) = x^n \quad n \in \mathbb{R}$

$\Rightarrow \boxed{f'(x) = n \cdot x^{n - 1}}$

$x^\alpha = \left(e^{\ln(x)} \right)^\alpha = e^{\ln(x) \cdot \alpha} \quad \alpha \in \mathbb{R}$

- a) $f(x) = {1 \over x^4} = x^{-4}$

  $f'(x) = -4 \cdot x^{-5} = {-4 \over x^5}$

- b) $f(x) = \sqrt{x^3} = x^{1 \over 3}$

  $f'(x) = {1 \over 3} \cdot x^{-{2 \over 3}}$

- c) $f(x) = {x^2 \cdot x^3 \over \sqrt[3]{x^5}} = {x^5 \over {x^{5 \over 3}}} = x^{{15 \over 3} - {5 \over 3}} = x^{10 \over 3}$

  $f'(x) = {10 \over 3} \cdot x^{{10 \over 3} - 1}$

$f(x) = e^x$

$\Rightarrow \boxed{f'(x) = e^x}$

$f(x) = a^x$

$\Rightarrow \boxed{f'(x) = a^x \cdot \ln(a)}$

$f(x) = \ln(x)$

$\Rightarrow \boxed{f'(x) = {1 \over x}}$

$f(x) = \log_a(x)$

$\Rightarrow \boxed{f'(x) = {1 \over x \cdot \ln(a)}}$

❗$x$ in Bogenmass ❗

$f(x) = \sin(x)$

$\Rightarrow \boxed{f'(x) = \cos(x)}$

$f(x) = \cos(x)$

$\Rightarrow \boxed{f'(x) = -\sin(x)}$

$f(x) = -\sin(x)$

$\Rightarrow \boxed{f'(x) = -\cos(x)}$

$f(x) = -\cos(x)$

$\Rightarrow \boxed{f'(x) = \sin(x)}$

$y = \sqrt{x} = x^{1 \over 2}$\
$\Rightarrow y' = {1 \over 2}x^{-{1 \over 2}} = {1 \over 2}{1 \over \sqrt{x}} = {1 \over 2\sqrt{x}}$

## Tangentengleichung

$y = f(x)$

Tangente von der Form: $y = ax + b$

Punkt $P(x_0, y_0) = P(x_0, f(x_0))$

Steigung $S = f'(x_0)$

${y - y_0 \over x - x_0} = m$

${y - f(x_0) \over x - x_0} = f'(x_0)$

$\boxed{y = f'(x_0) \cdot (x - x_0) + f(x_0)}$

---

>$x_0 = 1$\
>$f(x) = {1 \over 10}x^2 + {1 \over 2}$\
>$\Rightarrow f'(x) = {1 \over 5}x + {1 \over 2x}$

$y = f'(x_0) \cdot (x - x_0) + f(x_0) \quad | \quad f(x) = {1 \over 10}x^2 + {1 \over 2}, f'(x) = {1 \over 5}x + {1 \over 2x}$

$\Rightarrow y = {1 \over 5}x_0 + {1 \over 2x_0} \cdot (x - x_0) + {1 \over 10}x_0^2 + {1 \over 2} \quad | \quad x_0 = 1$

$\Rightarrow y = {1 \over 5} \cdot 1 + {1 \over 2 \cdot 1} \cdot (x - 1) + {1 \over 10} \cdot 1^2 + {1 \over 2}$

$\Rightarrow y = {1 \over 5} + {1 \over 2} \cdot (x - 1) + {1 \over 10} + {1 \over 2}$

$\Rightarrow y = {1 \over 5} + {1 \over 2} \cdot (x - 1) + {3 \over 5}$

$\Rightarrow y = {x \over 2} - {1 \over 2} + {4 \over 5}$

$y = {x \over 2} + {3 \over 10} = 0.5x + 0.3$

---

>$x_0 = 0$\
>$f(x) = e^x$\
>$\Rightarrow f'(x) = e^x$

$y = f^{(1)}(x_0) \cdot (x - x_0) + f(x_0) \quad | \quad f(x) = e^x, f^{(1)}(x) = e^x$

$\Rightarrow y = e^{x_0} \cdot (x - x_0) + e^{x_0} \quad | \quad x_0 = 0$

$\Rightarrow y = e^0 \cdot (x - 0) + e^0$

$\Rightarrow y = 1 \cdot x + 1$

$\Rightarrow y = x + 1$

## Höhere Ableitungen

$f(x) \Rightarrow f^{(7)}(x)$ (siebte Ableitung von $f(x)$)

---

$y = x^{10}$

$\Rightarrow y^{(k)} = $

$y = x^{-1}$

$\Rightarrow y^{(k)} = $

$y = \sqrt{x}$

$\Rightarrow y^{(k)} = $
