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
