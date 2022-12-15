###### Analysis - Semesterwoche #13 - 15. Dezember 2022

# Integrale

## Unbestimmtes Integral

$$\int f(x) \ \mathrm{d}x = F(x) + C$$

## Bestimmtes Integral

$$\int_a^bf(x) \ \mathrm{d}x = F(b) - F(a)$$

Bsp.:
$$\int x^{1 \over 2} = {2 \over 3}x^{3 \over 2} + C$$
$$\int_1^2 \sqrt x \ \mathrm{d}x = {2 \over 3}2^{3 \over 2} - {2 \over 3}1^{3 \over 2} \approx 1.22 $$

---

$$\int 2e^{x + 2} \ \mathrm{d}x = 2e^{x + 2} + C \quad C \in \mathbb{R}$$

$$\int \cos(3x) \ \mathrm{d}x = {1 \over 3} \sin(3x) + C \quad C \in \mathbb{R}$$

## Integrationsregeln

Bsp.: $\int {1 \over x^2} = x^{-2} = {1 \over -2 + 1} \cdot x^{-1} = -1 \cdot {1 \over x} = -{1 \over x} + C$

$$
\begin{align*}
  &\boxed{\int x^{\alpha} \ \mathrm{d}x = {1 \over \alpha + 1}x^{\alpha + 1} + C} \\
  &\boxed{\int {1 \over x} \ \mathrm{d}x = \ln|x| + C} \\
  &\boxed{\int e^x \mathrm{d}x = e^x + C} \\
  &\boxed{\int a^x \ \mathrm{d}x = {a^x \over \ln(a)} + C} \\
  &\boxed{\int \ln(x) \ \mathrm{d}x = x \cdot \ln(x) + C} \\
  &\boxed{\int \log_a(x) \ \mathrm{d}x = {x \cdot \ln(x) - x \over \ln(a)} + C \quad (a > 0)} \\
  &\boxed{\int \cos(x) \ \mathrm{d}x = \sin(x) + C \quad (\text{!! in Bogenmass !!})} \\
  &\boxed{\int \sin(x) \ \mathrm{d}x = -\cos(x) + C \quad (\text{!! in Bogenmass !!})} \\
  &\boxed{\int \tan(x) \ \mathrm{d}x = -\ln|\cos(x)| + C \quad (\text{!! in Bogenmass !!})} \\
  &\boxed{\int {1 \over 1 + x^2} \ \mathrm{d}x = \arctan(x) + C} \\
  &\boxed{\int {1 \over \sqrt{1 - x^2}} \ \mathrm{d}x = \arcsin(x) + C} \\
  &\boxed{\int {-1 \over \sqrt{1 - x^2}} \ \mathrm{d}x = \arccos(x) + C} \\
  &\boxed{\int f(x - k) \ \mathrm{d}x = F(x - k) + C \quad (k \in \mathbb{R}) \quad (\text{- verschiebt den Graphen nach rechts})} \\
  &\boxed{\int f(k \cdot x) \ \mathrm{d}x = {1 \over k}F(k \cdot x) + C \quad (k \neq 0)} \\
\end{align*}
$$

Beispiele:
$$
\begin{align*}
  \int e^{x + 25} \ \mathrm{d}x &= e^{x + 25} + C \quad &&(C \in \mathbb{R}) \\
  \int e^{25x} \ \mathrm{d}x &= {1 \over 25}e^{25x} + C \quad &&(C \in \mathbb{R}) \\
  \int e^{{3 \over 2}x} \ \mathrm{d}x &= {2 \over 3}e^{{3 \over 2}x} + C \quad &&(C \in \mathbb{R}) \\
  \int {1 \over x - 6} \ \mathrm{d}x &= \ln|x - 6| + C \quad &&(C \in \mathbb{R}) \\
  \int \sin(2x) \ \mathrm{d}x &= -{1 \over 2}\cos(2x) + C \quad &&(C \in \mathbb{R})
\end{align*}
$$
