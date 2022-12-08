# Serie 12: Differentialrechnung

## 1.

> $$h(t) = 5 + 35t - 5t^2$$

$$h'(t) = 35 - 5t$$

$$
\begin{align*}
  &35 - 5t = 0 \ &&| \ + 5t \\
  &\Leftrightarrow 35 = 5t \ &&| \ \div 5 \\
  &\Leftrightarrow t = 7
\end{align*}
$$

$$\boxed{h(7) =} 5 + 35 \cdot 7 - 5 \cdot 7^2 = \boxed{5}$$

## 2.

> $$f(x) = e^{-x^2}$$

$$f'(x) = -2xe^{-x^2}$$

$$
A = l \cdot b
\begin{cases}
  l =& 2x \\
  b =& f(x)
\end{cases}
$$

$$A(x) = 2x \cdot f(x) = 2xe^{-x^2}$$

$$A'(x) = -4xe^{-x^2}$$

$$
\begin{align*}
  0 &= \underbrace{-4x}_{0 \text{ or}}\underbrace{e^{-x^2}}_{0} \ &&| \ ??? \\
\end{align*}
$$

## 3.

$$A_\text{Circle} = \pi r^2$$
$$A_\text{Square} = x^2$$

$$C_\text{Circle} = 2 \pi r = (A'_\text{Circle})$$
$$C_\text{Square} = 4x$$

$$A = \pi r^2 + x^2$$

$$50 \text{cm} = 2\pi r + 4x$$

## 4.

$$400\text{m} = 2\pi r + 4r + 2x$$

$$
\begin{align*}
  & -2\pi r - 4r = 2x - 400\text{m} \\
  & -r(2\pi + 4) = 2x - 400\text{m} \ &&| \ \div (2\pi + 4) \\
  & -r = {2x - 400\text{m} \over 2\pi + 4} \ &&| \ \cdot (-1) \\
  & r = -{2x - 400\text{m} \over 2\pi + 4}
\end{align*}
$$

$$
\begin{align*}
  400\text{m} &= 2\pi \cdot -{2x - 400\text{m} \over 2\pi + 4} + 4 \cdot -{2x - 400\text{m} \over 2\pi + 4} + 2x \\
  &= 2x -{2\pi(2x - 400\text{m}) \over 2\pi + 4} -{4(2x - 400\text{m}) \over 2\pi + 4} \\
  &= 2x -{4x\pi - \pi \cdot 800\text{m} \over 2\pi + 4} -{4x - 1600\text{m} \over 2\pi + 4} \\
  &= 2x -{4x\pi - \pi \cdot 800\text{m} - 4x - 1600\text{m} \over 2\pi + 4} \\
  &= 2x -{4x\pi - 4x - \pi \cdot 800\text{m} - 1600\text{m} \over 2\pi + 4} \\
  &= 2x -{4x(\pi - 1) - \pi \cdot 800\text{m} - 1600\text{m} \over 2\pi + 4} \\
  &= 2x -{4x(\pi - 1) - 913.2741\dots\text{m} \over 2\pi + 4} \\
\end{align*}
$$

x max

## 5.

## 6.

$$f(x) = e^{-x}$$

$$f'(x) = -e^{-1} = {1 \over e}$$

$$x_0 = 0.5$$

$$x_{n + 1} = x_n - {f(x_n) \over f'(x_n)}$$

$$x_{n + 1} = x_n - {e^{-x} \over {1 \over e}}$$

$$x_1 = 0.5 - {e^{-0.5} \over {1 \over e}} = -1.1485$$

$$x_2 = -1.1485 - {e^{1.1485} \over {1 \over e}} = -9.7201$$

## 7.

$$0,1$$

$$x^3 - 5x^2 - 4x + 2 = 0$$

$$3x^2 - 10x - 4$$

$$x_{n + 1} = x - {x^3 - 5x^2 - 4x + 2 \over 3x^2 - 10x - 4}$$

$$x_1 = 0.9 - 0.4656 = 0.4344$$

$$x_2 = 0.4344 - 0.077 = 0.3574$$

$$x_3 = 0.3574 - 0.0031 = 0.3543$$

$$x_4 = 0.3543 - 0.0000 = 0.3543$$

$$\boxed{(0.3543, -0.0003)}$$

## 8.
