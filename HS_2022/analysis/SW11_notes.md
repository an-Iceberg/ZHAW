###### Analysis - Semesterwoche #11 - 1. Dezember 2022

# Kurvendiskussion

## Monotonie

Funktionen können (müssen aber nicht)

- monoton wachsend
- streng monoton wachsend
- monoton fallend
- streng monoton fallend

sein.

**Monoton fallend:**\
$x_1 < x_2 \Rightarrow f(x_1) \leq f(x_2)$

**Monoton Wachsend:**\
$x_1 < x_2 \Rightarrow f(x_1) \geq f(x_2)$

Bsp.:

- a)

$$
\begin{align*}
  y &= e^x \\
  y^{(1)} &= e^x > 0 \quad x \in \mathbb{R} \\
  &\Rightarrow \text{Kurve ist überall streng monoton steigend}
\end{align*}
$$

$$
\begin{align*}
  y &= e^{-x} \\
  y^{(1)} &= -e^{-x} < 0 \quad x \in \mathbb{R}\\
  &\Rightarrow \text{Kurve ist überall streng monoton fallend}
\end{align*}
$$

$$
\begin{align*}
  y &= \ln(x) \\
  y^{(1)} &= {1 \over x} > 0 \quad \forall x > 0 \\
  &\Rightarrow \text{Kurve überall streng monoton wachsend}
\end{align*}
$$

$$
\begin{align*}
  y &= (2 - 2x - x^2) \cdot e^{1 - x} \\
  y^{(1)} &= (-4 - 4x - x^2) \cdot e^{1 - x} \\
  y^{(1)} &= \underbrace{e^{1-x}}_{>0} \cdot \underbrace{(-4 + x^2)}_{
    \begin{cases}
      > 0 &=\\
      = 0 &(\\
      < 0 &\%
    \end{cases}
  }
\end{align*}
$$

## Krümmung

$$
\begin{align*}
  y &= e^x \\
  y^{(1)} &= e^x \\
  y^{(2)} &= e^x > 0 \\
  &\Rightarrow \text{überall Linkskurve}
\end{align*}
$$

$$
\begin{align*}
  y &= e^{-x} \\
  y^{(1)} &= -e^{-x} \\
  y^{(2)} &= e^{-x} > 0 \\
  &\Rightarrow \text{überall Linkskurve}
\end{align*}
$$

$$
\begin{align*}
  y &= \ln(x) \\
  y^{(1)} &= {1 \over x} \\
  y^{(2)} &= -{1 \over x^2} < 0 \\
  &\Rightarrow \text{überall Rechtskurve}
\end{align*}
$$

## Relative extrema

$x \land f'(x) = 0 \land f''(x) \neq 0$ dann kann man sich sicher sein, dass x ein lokales Extremum ist.

$f''(x) < 0 \Rightarrow \text{lokales Maximum}$

$f''(x) > 0 \Rightarrow \text{lokales Minimum}$

Bsp.:

$$
\begin{align*}
  y &= x^2 \\
  y' &= 2x &x=0 \Rightarrow y = 0\\
  y'' &= 2 &x=0 \Rightarrow y \neq 0 \\
  &\implies &x=0 \text{ ist ein lokales Extremum}
\end{align*}
$$

## Wendepunkte

Die Krümmung ändert sich an einem Wendepunkt.
