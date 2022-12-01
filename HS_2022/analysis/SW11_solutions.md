# Serie 11: Differentialrechnung
TODO: create snippet for begin{align*}
## 1.

>$x = 1$

$$
\begin{align*}
  y &= -{2 \over 3}x^3 + 2x^2 - 2x + 2 \\
  y^{(1)} &= -2x^2 + 4x - 2 \\
  y^{(2)} &= -4x + 4 \\
  y^{(3)} &= -4
\end{align*}
$$

$$
\begin{align*}
  y &= -{2 \over 3} + 2 - 2 + 2 = 2 - {2 \over 3} &&= {4 \over 3} \\
  y^{(1)} &= -2 + 4 - 2 &&= 0 \\
  y^{(2)} &= -4 + 4 &&= 0 \\
  y^{(3)} & &&= -4
\end{align*}
$$

1. und 2. Ableitung sind 0 und die 3. Ableitung ist nicht 0 $\implies$ bei $(1, {4 \over 3})$ handelt es sich um einen Sattelpunkt.

## 2.

>$$
>\begin{align*}
>  y &= ax^2 + bx + c \\
>  S &= \left(-{b \over 2}, -\left({b \over 2}\right)^2 + c\right)
>\end{align*}
>$$

### a)

$$
\begin{align*}
  y &= -0.4x(x - 4) = -0.4x^2 + 1.6x \\
  y^{(1)} &= -0.8x + 1.6 \\
\end{align*}
$$

Der Scheitelpunkt von y befindet sich in $(-0.8, -0.64)$.

Da der höchste Grad negativ ist, krümmt die Kurve überall gegen rechts.

$\forall x < -0.8$ ist die Funktion streng monoton steigend, $\forall x > -0.8$ ist die Funktion streng monoton fallend.

### b)

$$
\begin{align*}
  y &= x + {1 \over x} = x + x^{-1} \quad (\text{für } x > 0) \\
  y^{(1)} &= 1 + -x^{-2} = 1 - {1 \over x^2}
\end{align*}
$$

Die Funktion ist streng monoton steigend da von $x$ nie etwas subtrahiert wird.

Die Funktion ist nach links gekrümmt, da zu $x$ immer etwas addiert wird (wobei der Summand immer kleiner wird, je grösser $x$ wird).

## 3.

Falls $\alpha > 0$ ohne Rest durch 2 Teilbar ist.

## 4.

>$$x_{1,2} = {-b \pm \sqrt{b^2 - 4ac} \over 2a}$$

### a)

$$
\begin{align*}
  y &= {1 \over 3}x^3 -2x^2 + x + 5 \\
  y^{(1)} &= x^2 - 4x + 1 \\
  y^{(2)} &= 2x - 4 \\
  y^{(3)} &= 2
\end{align*}
$$

$$
\begin{align*}
  x_{1,2} &= {--4 \pm \sqrt{-4^2 - 4 \cdot 1 \cdot 1} \over 2 \cdot 1} \\
  &= {4 \pm \sqrt{12} \over 2} \\
  x_1 &= {4 + \sqrt{12} \over 2} \\
  x_2 &= {4 - \sqrt{12} \over 2}
\end{align*}
$$

$$
\begin{align*}
  y^{(1)}(x_1) &= \left({4 + \sqrt{12} \over 2}\right)^2 - 4\left({4 + \sqrt{12} \over 2}\right) + 1 \\
  &= {(4 + \sqrt{12})^2 \over 2^2} - {4(4 + \sqrt{12}) \over 2} + 1 \\
  &= {28 + 8\sqrt{12} \over 4} - {16 + 4\sqrt{12} \over 2} + 1 \\
  &= {28 + 8\sqrt{12} - 32 + 8\sqrt{12} + 4 \over 4} \\
  &= {16\sqrt{12} \over 4} \\
\end{align*}
$$

$$
\begin{align*}
  y^{(2)}(x_1) &= 2\left({4 + \sqrt{12} \over 2}\right) - 4 \\
  &= {2(4 + \sqrt{12}) \over 2} - 4 \\
  &= {8 + 2\sqrt{12} \over 2} - 4 \\
  &= {8 + 2\sqrt{12} \over 2} - {8 \over 2} \\
  &= {8 + 2\sqrt{12} - 8 \over 2} \\
  &= {2\sqrt{12} \over 2} \\
\end{align*}
$$

$$
\begin{align*}
  y^{(1)}(x_2) &= \left({4 - \sqrt{12} \over 2}\right)^2 - 4\left({4 - \sqrt{12} \over 2}\right) + 1 \\
  &= {(4 - \sqrt{12})^2 \over 2^2} - {4(4 - \sqrt{12}) \over 2} + 1 \\
  &= {28 - 8\sqrt{12} \over 4} - {16 - 4\sqrt{12} \over 2} + 1 \\
  &= {28 - 8\sqrt{12} \over 4} - {2(16 - 4\sqrt{12}) \over 4} + {4 \over 4} \\
  &= {28 - 8\sqrt{12} - 32 - 8\sqrt{12} + 4 \over 4} \\
  &= {28 - 8\sqrt{12} - 32 - 8\sqrt{12} + 4 \over 4} \\
  &= -{16\sqrt{12}\over 4} \\
\end{align*}
$$

### b)

$$
\begin{align*}
  y &= {1 \over 3}x^3 -x^2 + x + 5 \\
  y^{(1)} &= x^2 - 2x + 1 \\
  y^{(2)} &= 2x - 2
\end{align*}
$$

## 5.

>$$y = ax^3 + bx^2 + cx + d \quad (a \neq 0)$$
>$$y' = 3ax^2 + 2bx + c$$
>$$y'' = 6ax + 4b$$

### a)

$$
\begin{align*}
  x_{1,2} = {-b \pm \sqrt{b^2 - 4ac} \over 2a}
\end{align*}
$$

### b)

## 6.

## 7.

## 8.

## 9.

## 10.
