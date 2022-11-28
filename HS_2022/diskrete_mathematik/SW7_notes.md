###### Diskrete Mathematik - Semesterwoche #7 - 31. Oktober 2022

# Relationen

$$
\begin{align*}
  \text{Reflexiv} &:\Leftrightarrow \forall x \in X (xRx) \\
  \text{Symmetrisch} &:\Leftrightarrow \forall x,y \in X (xRy \to yRx) \\
  \text{Antisymmetrisch} &:\Leftrightarrow \forall x,y \in X ((xRy \land yRx) \to x = y) \\
  \text{Transitiv} &:\Leftrightarrow \forall x,y,z \in X ((xRy \land yRz) \to xRz)
\end{align*}
$$

- Reflexiv wenn für alle $x \in X$

  $xRx$

- Symmetrisch, wenn für alle $x,y \in X$

  $xRy \to yRx$

- Antisymmetrisch, wenn für alle $x,y \in X$

  $xRy \land yRx \implies x = y$

- Transitiv, wenn für alle $x,y,z \in X$

  $xRy \land yRz \implies xRz$

# Äquivalenzrelationen

Eine Äquivalenzrelation ist reflexiv, symmetrisch und transitiv.

## Äquivalenzklassen

Die Menge aller Elemente, die in äquivalenter Relation zu x stehen.

$[x]_r := {y \in X \ | \ xRy}$

Bsp.: $[10]_< = x \in \mathbb{N} \ | \ x < 10 = \\{0,1,2,3,4,5,6,7,8,9\\}$
