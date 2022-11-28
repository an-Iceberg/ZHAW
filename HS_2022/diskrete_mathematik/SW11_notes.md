###### Diskrete Mathematik - Semesterwoche #11 - 28. November 2022

# Natürliche Zahlen

Teilen mit Rest: $m = kn + r \ | \ r < n$

$f(m,n) = (k,r)$

Beweis:

$n,m \in \mathbb{N}_{>0} (m,n)$

$k := \max(y \in \mathbb{N} \ | \ ny \leq m)$

$r := m - kn$

1. $kn + r = kn + \underbrace{(m - kn)}_{r} = m$

2. $r < n$

  (Beweis durch Widerspruch)

  Falls $r \ge n$

$$
\begin{align}
 m &= kn + r \nonumber \\
  &\le kn + n \nonumber \\
  &= (k + 1) \cdot n \nonumber
\end{align}
$$
⚡

---

$m = nk + r \quad m = nk' + r'$

$ r < n \quad r' < n$

Behauptung: $r = r', k = k'$

Beweis (Beweis durch Widerspruch): $nk + r = nk' + r'$

$k \ne k' \text{ O E } k < k'$

$k + x = k' \quad x \in \mathbb{N}$

$nk + r = n\underbrace{(k + x)}_{k' = k + x} + r'$

$r = nx + r'$

$r = nx + r' > n$ ⚡

---

## Grösster gemeinsamer Teiler

$ggT(n,m) = ggT(n - m,m)$

$$
\begin{align*}
&1. \quad x|n \land x|m \\ \\

&2. \quad x|(n - m) \land x|m \\ \\

&1 \implies 2 \qquad n = kx \qquad m = sx \\
n - m &= kx - sx \\
&= \underbrace{(k - s)}_{\in \mathbb{Z}} \cdot x \implies x|(n - m) \\ \\

&2 \implies 1 \qquad kx = n - m \qquad sx = m \\
n &= (n - m) + m \\
&= kx + sx \\
&= (k + s) \cdot x
\end{align*}
$$
