###### Analysis - Semesterwoche #8 - 10. November 2022

# Grenzwert von Funktionen

**Idee:** alle y werte einer Funktion zu einer Folge machen und davon den Grenzwert bestimmen.

**Grenzwerte:** Aussagen über ${\infty \over \infty}$ oder ${0 \over 0}$ treffen können.

$f(x) = \sin({1 \over x})$ ist an der Stelle $f(0)$ nicht definiert.\
Was wäre der Grenzwert?

$f(x)$ ist immer im Bereich $[-1,1]$.

$\lim\limits_{x \to \infty} \sin({1 \over x}) \times x = 0$

${x^2 - 1 \over x - 1}$

$(x^2 - 1) \div (x - 1) = x + 1$

$(x^2 - 1) \times (x - 1)^{-1} $

Binomische Formel: $a^2 - b^2 = (a + b)\times(a - b)$

${x^2 - 1 \over x - 1} = {(x + 1)(x - 1) \over x - 1}$

$f(x) = {x^2 - 1 \over x - 1} \quad | \quad \mathbf{D}_f = \mathbb{R} \backslash \{1\}$

$g(x) = x + 1 \quad | \quad \mathbf{D}_g = \mathbb{R}$

Der Grenzwert ist der Versuch, Definitionslücken zu füllen.

- a)

  $f(x) = {1 \over x}$\
  $\lim\limits_{x\to\infty} {1 \over x} = 0$

- b)

  $f(x) = {7x + 1 \over 5x + 6}$\
  $\lim\limits_{x\to\infty} {7x + 1 \over 5x + 6} \quad | \quad \times {{1 \over x} \over {1 \over x}}$\
  $= \lim\limits_{x\to\infty} {7 + {1 \over x} \over 5 + {6 \over x}}$\
  $= \lim\limits_{x\to\infty} {7 + {1 \over x} \over 5 + {6 \over x}}$\
  $= {7 \over 5}$

- c)

  $f(x) = {x^3 \over x^2 + 1}$\
  $= \lim\limits_{x\to\infty} {x^3 \over x^2 + 1} \quad | \quad \times {{1 \over x^2} \over {1 \over x^2}}$\
  $= \lim\limits_{x\to\infty} {x \over 1 + {1 \over x^2}}$\
  $= {\infty \over 1}$\
  $= \infty$

- d)

  $f(x) = \sin(x)$

- e)

  $f(x) = \sin({1 \over x})$

# Stetigkeit

Man kann den Graphen ohne den Stift abheben zu müssen.

Der Funktionswert ist bei jeder Stelle gleich dem Grenzwert.

$f(x_0) = \lim\limits_{x \to x_0} f(x)$

Wenn die Funktion an einer Stelle nicht definiert ist, interessiert uns die Stetigkeit an dem Punkt nicht.

$f(x) = {1 \over x} \quad | \quad \mathbf{D}_f = \R \backslash \{0\}$

$\tilde{f}(x) =
\begin{cases}
  {x^2 - 1 \over x - 1}, & \text{if } x \neq 1 \\
  2, & \text{if } x = 1
\end{cases}
$
