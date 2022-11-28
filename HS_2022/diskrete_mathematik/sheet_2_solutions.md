# Übung 2, Aussagenlogik

## Aufgabe 1

$$
\begin{align*}
  F &:= p \to (q \land r) \\
  &\Rightarrow \lnot p \lor (q \land r)
\end{align*}
$$

$$
\begin{align*}
  Q &:= (r \land q) \to s \\
  &\Rightarrow ¬(r \land q) \lor s \\
  &\Rightarrow ¬r \lor ¬q \lor s
\end{align*}
$$

### a)

$$
\begin{align*}
  &\text{false} \to (\text{true} \land \text{true}) & &| \quad \text{Absorbtion} \\
  \Rightarrow\ &\text{false} \to \text{true}        & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬\text{false} \lor \text{true}      & &| \quad \text{Negation} \\
  \Rightarrow\ &\text{true} \lor \text{true}        & &| \quad \text{Absorption} \\
  \Rightarrow\ &\text{true}
\end{align*}
$$

$$
\begin{align*}
  &(\text{true} \land \text{true}) \to \text{false} & &| \quad \text{Absorption} \\
  \Rightarrow\ &\text{true} \to \text{false}        & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬\text{true} \lor \text{false}      & &| \quad \text{Negation} \\
  \Rightarrow\ &\text{false} \lor  \text{false}     & &| \quad \text{Absorbtion} \\
  \Rightarrow\ &\text{true}
\end{align*}
$$

### b)

$p = \text{true}$\
$q = \text{false}$\
$r = \text{false}$\
$s = \text{false}$

## Aufgabe 2

- a) DNF & KNF & NNF

- b) NNF

- c) -

- d) NNF

- e) KNF & DNF & NNF

## Aufgabe 3

### a)

$$
\begin{align*}
  &p \to (q \lor (p_1 \land p_2)) & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬p \lor (q \lor (p_1 \land p_2)) & &| \quad \text{Distributivität} \\
  \Rightarrow\ &¬p \lor ((p_1 \lor q) \land (p_2 \lor q)) & &| \quad \text{Distributivität} \\
  \Rightarrow\ &(¬p \lor p_1 \lor q) \land (¬p \lor p_2 \lor q) & &| \quad \text{Distributivität} \\
  \Rightarrow\ &(((¬p \lor p_1 \lor q) \land ¬p) \lor ((¬p \lor p_1 \lor q) \land p_2) \lor ((¬p \lor p_1 \lor q) \land q)) & &| \quad \text{Distributivität} \\
  \Rightarrow\ &(¬p \land ¬p) \lor (¬p \land p_1) \lor (¬p \land q) \lor (p_2 \land ¬p) \lor (p_2 \land p_1) \lor (p_2 \land q) \lor (q \land ¬p) \lor (q \land p_1) \lor (q \land q) & &| \quad \textsf{Vereinfachung} \\
  \Rightarrow\ &(¬p \land p_1) \lor (¬p \land q) \lor (p_2 \land ¬p) \lor (p_2 \land p_1) \lor (p_2 \land q) \lor (q \land ¬p) \lor (q \land p_1)
\end{align*}
$$

$$
\begin{align*}
  \text{KNF:} \ &(¬p \lor p_1 \lor q) \land (¬p \lor p_2 \lor q) \\
  \text{DNF:} \ &(¬p \land p_1) \lor (¬p \land q) \lor (p_2 \land ¬p) \lor (p_2 \land p_1) \lor (p_2 \land q) \lor (q \land ¬p) \lor (q \land p_1)
\end{align*}
$$

### b)

$$
\begin{align*}
  &p \to (q \to p_1) & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬p \lor ¬q \lor p_1
\end{align*}
$$

$$\text{DNF und KNF:} \ ¬p \lor ¬q \lor p_1$$

### c)

$$
\begin{align*}
  &(p \to q) \to p_1                             & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬(¬p \lor q) \lor p_1            & &| \quad \text{DeMorgaDeMorgann} \\
  \Rightarrow\ &(p \land ¬q) \lor p_1            & &| \quad \text{Distributivität} \\
  \Rightarrow\ &(p_1 \lor p) \land (p_1 \lor ¬q)
\end{align*}
$$

$$
\begin{align*}
  \text{DNF:} \ &(p \land ¬q) \lor p_1 \\
  \text{KNF:} \ &(p_1 \lor p) \land (p_1 \lor ¬q)
\end{align*}
$$

## Aufgabe 4

## Aufgabe 5

### a)

$$
\begin{align*}
  &p \to (q \to p)                  & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬p \lor ¬q \lor p   & &| \quad \text{Konstantes Element} \\
  \Rightarrow\ &\text{true} \lor ¬q & &| \quad \text{Tautologie} \\
  \Rightarrow\ &\text{true}
\end{align*}
$$

|$p$|$q$|$p \to (q \to p)$|
|:-:|:-:|:-:            |
|0|0|1            |
|0|1|1            |
|1|0|1            |
|1|1|1            |

$\text{(a) ist allgemeingültig}$

### b)

$$
\begin{align*}
  &(p \to q) \to (¬q \to ¬p)                           & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬(¬p \lor q) \lor (q \lor ¬p)          & &| \quad \text{DeMorgan} \\
  \Rightarrow\ &(p \land ¬q) \lor q \lor ¬p            & &| \quad \text{Distributivität} \\
  \Rightarrow\ &((q \lor p) \land (q \lor ¬q)) \lor ¬p & &| \quad \text{Konstantes Element} \\
  \Rightarrow\ &((q \lor p) \land 1) \lor ¬p           & &| \quad \text{Neutrales Element} \\
  \Rightarrow\ &q \lor p \lor ¬p                       & &| \quad \text{Konstantes Element} \\
  \Rightarrow\ &q \lor \text{true}                     & &| \quad \text{Tautologie} \\
  \Rightarrow\ &\text{true}
\end{align*}
$$

|$p$|$q$|$(p \to q) \to (¬q \to ¬p)$|
|:-:|:-:|:-:            |
|0|0|1                     |
|0|1|1                     |
|1|0|1                     |
|1|1|1                     |

$\text{(b) ist allgemeingültig}$

### c)

$$
\begin{align*}
  &(p \to q) \to (q \to p) & &| \quad \text{Implikation} \\
  \Rightarrow\ &¬(¬p \lor q) \lor (¬q \lor p) & &| \quad \text{DeMorgan} \\
  \Rightarrow\ &(p \land ¬q) \lor ¬q \lor p & &| \quad \text{Distributivität} \\
  \Rightarrow\ &((p \lor ¬q) \land (¬q \lor q)) \lor p & &| \quad \text{Konstantes Element} \\
  \Rightarrow\ &((p \lor ¬q) \land 1) \lor p & &| \quad \text{Neutrales Element} \\
  \Rightarrow\ &p \lor ¬q \lor p & &| \quad \text{Absorbtion} \\
  \Rightarrow\ &p \lor ¬q
\end{align*}
$$

|$p$|$q$|$(p \to q) \to (q \to p)$|
|:-:|:-:|:-:            |
|0|0|1                   |
|0|1|0                   |
|1|0|1                   |
|1|1|1                   |

$\text{(c) ist erfüllbar}$

### d)

$$
\begin{align*}
&(p \to q) \land (p \land ¬q) & &| \quad \text{Implikation} \\
\Rightarrow\ &(¬p \lor q) \land p \land ¬q & &| \quad \text{Distributivität} \\
\Rightarrow\ &((¬p \land p) \lor (q \land p)) \land ¬q & &| \quad \text{Konstantes Element} \\
\Rightarrow\ &(0 \lor (q \land p)) \land ¬q & &| \quad \text{Neutrales Element} \\
\Rightarrow\ &q \land p \land ¬q & &| \quad \text{Konstantes Element} \\
\Rightarrow\ &\text{false} \land p \\
\Rightarrow\ &\text{false}
\end{align*}
$$

|$p$|$q$|$(p \to q) \land (p \land ¬q)$|
|:-:|:-:|:-:            |
|0|0|0                  |
|0|1|0                  |
|1|0|0                  |
|1|1|0                  |

$\text{(d) ist unerfüllbar}$

## Aufgabe 6

### a)

>$\\{¬, \lor\\}$

$$
\begin{align*}
  A \land B &= ¬(¬A \lor ¬B) \\
  A \to B &= ¬A \lor B
\end{align*}
$$

### b)

>$\\{¬, \to\\}$

$$
\begin{align*}
  A \land B &= ¬(A \to ¬B) \\
  A \lor B &= A \to ¬B
\end{align*}
$$

### c)

>$\\{\bar{\land}\\}$ (nand)

$$
\begin{align*}
  A \land B &= (A \ \bar{\land} \ B) \ \bar{\land} \ (A \ \bar{\land} \ B) \\
  A \lor B &= (A \ \bar{\land} \ A) \ \bar{\land} \ (B \ \bar{\land} \ B) \\
  ¬A &= A \ \bar{\land} \ A \\
  A \to B &= (A \ \bar{\land} \ B) \ \bar{\land} \ A
\end{align*}
$$

### d)

>$\\{\bar{\lor}\\} (nor)$

$$
\begin{align*}
  A \land B &= \\
  A \lor B &= \\
  ¬A &= \\
  A \to B &=
\end{align*}
$$
