# Diskrete Mathematik - 3 Oktober 2022

## Literale

Atomare oder negiert atomare Formel

p, !q, T

## NNF, DNF, KNF

KNF --(Distribution)-> DNF

DNF --(Distribution)-> KNF

Beispiel:

DNF -> KNF:

$F = (p \land q) \lor (z \land y) \quad | \quad \text{Distribution}$

$F = ((p \land q) \lor z) \land ((p \land q) \lor y) | Distribution$

$\underline{\underline{F = (z \lor p) \land (z \lor q) \land (y \lor p) \land (y \lor q)}}$

KNF -> DNF

$F = (p \lor q) \land (z \lor y) \quad | \quad \text{Distribution}$

$F = ((p \lor q) \land z) \lor ((p \lor q) \land y) \quad | \quad \text{Distribution}$

$\underline{\underline{F = (z \land p) \lor (z \land q) \lor (y \land p) \lor (y \land q)}}$

## Mengen

$A = B \iff \forall x(x \in A \iff x \in B)$

$\\{x\\} = \\{x,x\\}$

$\\{x,y\\} = \\{y,x\\}$

### Teilmengen

$A = B \iff (A \subset B \land B \subset A)$
