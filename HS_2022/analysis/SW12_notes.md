###### Analysis - Semesterwoche #12 - 8. Dezember 2022

# Extremwertprobleme

**Beispiel**:

Gesucht: Das Minimum von:

$$f(x) = x^2 + {1 \over x}$$

Definitionsbereich: $\mathbb{R}_{>0}$

$$f'(x) = 2x - {1 \over x^2}$$

$$0 = 2x - {1 \over x^2} \iff 2x = {1 \over x^2}$$

$$\Rightarrow x = {1 \over \sqrt[3]{2}} \iff x^3 = {1 \over 2}$$

$$\approx 0.7937$$

$$f''(x) = 2 + {2 \over x^3} \quad > 0 \text{ für alle } x > 0$$

---

$$l = \sqrt{2}x$$

$$b = \sqrt{2}(a - x)$$

$$
\begin{align*}
  A &= \sqrt{2}x \cdot \sqrt{2}(a - x) \\
  &= 2x(a - x) \\
  &= 2ax - 2x^2
\end{align*}
$$

$$A(x) = 2ax - 2x^2 \quad (0 \leq x \leq a)$$

$$A'(x) = 2a - 4x = 0 \\ \Rightarrow x = {a \over 2}$$

$$\Rightarrow
\begin{cases}
  &l = \sqrt{2} \cdot {a \over 2} = {a \over \sqrt{2}} \\
  &b = \sqrt{2} \cdot (a - {a \over 2}) = \dots
\end{cases}
$$

# Gleichungen lösen

$$E = m\sqrt[{3 \over 4}]{c^{3 \over 2}}$$

n-ter Schritt:

$$x_{n + 1} = x_n - {f(x_n) \over f'(x_n)}$$

Bsp.:

$$f(x) = x^2 + 2 - e^x$$

Startwert: $x_0 = 1.5$

$$f(x) = x^2 + 2 - e^x$$

$$f'(x) = 2x - e^x$$

Iteration:

$$x_{n + 1} = x_n - {{x_n}^2 + 2 - e^{x_n} \over 2x_n - e^{x_n}}$$

$$x_0 = 1.5$$

$$x_1 = 1.5 - {1.5^2 + 2 - e^{1.5} \over 2 \cdot 1.5 - e^{1.5}} = 1.3437$$

$$x_2 = 1.3437 - {1.3437^2 + 2 - e^{1.3437} \over 2\cdot1.3437 - e^{1.3437}} = 1.3235$$

$$\dots$$

---

$$f(x) = x^3 - 1.5x^2 + x - 1.5$$

$$f'(x) = 3x^2 - 3x + 1$$

$$x_{n+1} = x_n - {x_n^3 - 1.5x_n^2 + x_n - 1.5 \over 3x_n^2 - 3x_n + 1}$$
