###### Diskrete Mathematik - 14. November 2022

(from last time: Hasse Diagramme)

# Natürliche Zahlen

Eine Menge, die injektiv aber nicht surjektiv ist impliziert, dass die Menge unendlich ist.

## Induktion

$|\mathcal{P}(n)| = 2^n$

$\underline{\text{Bew.:}} \quad n = 0 :$ :heavy_check_mark:

$\underline{n \to n+1} : \overbrace{A(n) = 2^n}^{\text{Induktinsannahme}} \implies A(n+1) = 2^{n+1}$

$2^{n+1} = 2 \quad 2^n = 2 \quad A(n) = A(n+1)$

---

Behauptung: $A(n)$ für alle $n \in \mathbb{N}$

Beweis: Wenn nicht $n_0 \in \mathbb{N}$

1. $¬A(n_0)$

2. $n_0$ ist kleinste natürliche Zahl mit $¬A(n_0)$

---

Behauptung: Jede Zahl $n < 1 \in \mathbb{N} $ ist von einer Primzahl teilbar.

$PZ(n) := \exists x,y \in \mathbb{N} \implies x|n \land y|n \land ((x = 1 \land y = n) \lor (y = 1 \land x = n))$

Behaupting: $n > 1 \implies PT(n) \neq \varnothing$

Beweis: Annahme: $n_0$ ist die kleinste Zahl, die nicht durch eine Primzahl geteilt werden kann.

$n_0 \notin \mathbb{P} \implies \overbrace{n_0 = x \times y}^{\text{dies gilt, weil sonst } n_0 \text{ eine Primzahl wäre}} \quad \boxed{1 < x,y < n_0}$ $\leftarrow$ Dies gilt, weil sonst $n_0$ eine Primzahl wäre.

$1 < x < n_0 \implies$ es gibt $p \in \mathbb{P}$ mit $p|x \quad \square$
