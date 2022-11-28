###### Diskrete Mathematik - Semesterwoche #3 - 3 Oktober 2022

# Literale

Atomare oder negiert atomare Formel

p, !q, T

# NNF, DNF, KNF

KNF --(Distribution)-> DNF

DNF --(Distribution)-> KNF

Beispiel:

DNF -> KNF:

$$
\begin{align*}
F &= (p \land q) \lor (z \land y) & &| \quad \text{Distribution} \\
&= ((p \land q) \lor z) \land ((p \land q) \lor y) & &| \quad \text{Distribution} \\
&= (z \lor p) \land (z \lor q) \land (y \lor p) \land (y \lor q)
\end{align*}
$$

KNF -> DNF

$$
\begin{align*}
F &= (p \lor q) \land (z \lor y) & &| \quad \text{Distribution} \\
&= ((p \lor q) \land z) \lor ((p \lor q) \land y) & &| \quad \text{Distribution} \\
&= (z \land p) \lor (z \land q) \lor (y \land p) \lor (y \land q)
\end{align*}
$$

# Mengen

$A = B \Leftrightarrow \forall x(x \in A \Leftrightarrow x \in B)$

$\\{x\\} = \\{x,x\\}$

$\\{x,y\\} = \\{y,x\\}$

### Teilmengen

$A = B \Leftrightarrow (A \subset B \land B \subset A)$
