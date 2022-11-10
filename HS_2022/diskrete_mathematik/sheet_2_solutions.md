# Übung 2, Aussagenlogik

## Aufgabe 1

$F := p \to (q \land r)$\
$\Rightarrow \underline{\underline{\lnot p \lor (q \land r)}}$

$Q := (r \land q) \to s$\
$\Rightarrow ¬(r \land q) \lor s$\
$\Rightarrow \underline{\underline{¬r \lor ¬q \lor s}}$

### a)

$\text{false} \to (\text{true} \land \text{true}) \quad | \quad \text{Absorbtion}$\
$\Rightarrow \text{false} \to \text{true} \quad | \quad \text{Implikation}$\
$\Rightarrow ¬\text{false} \lor \text{true} \quad | \quad \text{Negation}$\
$\Rightarrow \text{true} \lor \text{true} \quad | \quad \text{Absorption}$

$\Rightarrow \underline{\underline{\text{true}}}$

$(\text{true} \land \text{true}) \to \text{false} \quad | \quad \text{Absorption}$\
$\Rightarrow \text{true} \to \text{false} \quad | \quad \text{Implikation}$\
$\Rightarrow ¬\text{true} \lor \text{false} \quad | \quad \text{Negation}$\
$\Rightarrow \text{false} \lor  \text{false} \quad | \quad \text{Absorbtion}$\
$\Rightarrow \text{false}$

$\Rightarrow \underline{\underline{\text{false}}}$

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

$p \to (q \lor (p_1 \land p_2)) \quad | \quad \text{Implikation}$\
$\Rightarrow ¬p \lor (q \lor (p_1 \land p_2)) \quad | \quad \text{Distributivität}$\
$\Rightarrow ¬p \lor ((p_1 \lor q) \land (p_2 \lor q)) \quad | \quad \text{Distributivität}$\
$\Rightarrow \underline{(¬p \lor p_1 \lor q) \land (¬p \lor p_2 \lor q)} \quad | \quad \text{Distributivität}$\
$\Rightarrow (((¬p \lor p_1 \lor q) \land ¬p) \lor ((¬p \lor p_1 \lor q) \land p_2) \lor ((¬p \lor p_1 \lor q) \land q)) \quad | \quad \text{Distributivität}$\
$\Rightarrow (¬p \land ¬p) \lor (¬p \land p_1) \lor (¬p \land q) \lor (p_2 \land ¬p) \lor (p_2 \land p_1) \lor (p_2 \land q) \lor (q \land ¬p) \lor (q \land p_1) \lor (q \land q)$\
$\Rightarrow \underline{(¬p \land p_1) \lor (¬p \land q) \lor (p_2 \land ¬p) \lor (p_2 \land p_1) \lor (p_2 \land q) \lor (q \land ¬p) \lor (q \land p_1)}$

$\underline{\underline{\text{KNF:} \ (¬p \lor p_1 \lor q) \land (¬p \lor p_2 \lor q)}}$\
$\underline{\underline{\text{DNF:} \ (¬p \land p_1) \lor (¬p \land q) \lor (p_2 \land ¬p) \lor (p_2 \land p_1) \lor (p_2 \land q) \lor (q \land ¬p) \lor (q \land p_1)}}$

### b)

$p \to (q \to p_1) \quad | \quad \text{Implikation}$\
$\Rightarrow ¬p \lor ¬q \lor p_1$\
$\underline{\underline{\text{DNF und KNF:} \ ¬p \lor ¬q \lor p_1}}$

### c)

$(p \to q) \to p_1 \quad | \quad \text{Implikation}$\
$\Rightarrow ¬(¬p \lor q) \lor p_1 \quad | \quad \text{DeMorgaDeMorgann}$\
$\Rightarrow \underline{(p \land ¬q) \lor p_1} \quad | \quad \text{Distributivität}$\
$\Rightarrow \underline{(p_1 \lor p) \land (p_1 \lor ¬q)}$

$\underline{\underline{\text{DNF:} \ (p \land ¬q) \lor p_1}}$\
$\underline{\underline{\text{KNF:} \ (p_1 \lor p) \land (p_1 \lor ¬q)}}$

## Aufgabe 4

## Aufgabe 5

### a)

$p \to (q \to p) \quad | \quad \text{Implikation}$\
$\Rightarrow ¬p \lor ¬q \lor p \quad | \quad \text{Konstantes Element}$\
$\Rightarrow \text{true} \lor ¬q \quad | \quad \text{Tautologie}$\
$\Rightarrow \text{true}$

|$p$|$q$|$p \to (q \to p)$|
|-|-|-            |
|0|0|1            |
|0|1|1            |
|1|0|1            |
|1|1|1            |

$\underline{\underline{\text{(a) ist allgemeingültig}}}$

### b)

$(p \to q) \to (¬q \to ¬p) \quad | \quad \text{Implikation}$\
$\Rightarrow ¬(¬p \lor q) \lor (q \lor ¬p) \quad | \quad \text{DeMorgan}$\
$\Rightarrow (p \land ¬q) \lor q \lor ¬p \quad | \quad \text{Distributivität}$\
$\Rightarrow ((q \lor p) \land (q \lor ¬q)) \lor ¬p \quad | \quad \text{Konstantes Element}$\
$\Rightarrow ((q \lor p) \land 1) \lor ¬p \quad | \quad \text{Neutrales Element}$\
$\Rightarrow q \lor p \lor ¬p \quad | \quad \text{Konstantes Element}$\
$\Rightarrow q \lor \text{true} \quad | \quad \text{Tautologie}$

|$p$|$q$|$(p \to q) \to (¬q \to ¬p)$|
|-|-|-                     |
|0|0|1                     |
|0|1|1                     |
|1|0|1                     |
|1|1|1                     |

$\underline{\underline{\text{(b) ist allgemeingültig}}}$

### c)

$(p \to q) \to (q \to p) \quad | \quad \text{Implikation}$\
$\Rightarrow ¬(¬p \lor q) \lor (¬q \lor p) \quad | \quad \text{DeMorgan}$\
$\Rightarrow (p \land ¬q) \lor ¬q \lor p \quad | \quad \text{Distributivität}$\
$\Rightarrow ((p \lor ¬q) \land (¬q \lor q)) \lor p \quad | \quad \text{Konstantes Element}$\
$\Rightarrow ((p \lor ¬q) \land 1) \lor p \quad | \quad \text{Neutrales Element}$\
$\Rightarrow p \lor ¬q \lor p \quad | \quad \text{Absorbtion}$\
$p \lor ¬q$

|$p$|$q$|$(p \to q) \to (q \to p)$|
|-|-|-                   |
|0|0|1                   |
|0|1|0                   |
|1|0|1                   |
|1|1|1                   |

$\underline{\underline{\text{(c) ist erfüllbar}}}$

### d)

$(p \to q) \land (p \land ¬q) \quad | \quad \text{Implikation}$\
$\Rightarrow (¬p \lor q) \land p \land ¬q \quad | \quad \text{Distributivität}$\
$\Rightarrow ((¬p \land p) \lor (q \land p)) \land ¬q \quad | \quad \text{Konstantes Element}$\
$\Rightarrow (0 \lor (q \land p)) \land ¬q \quad | \quad \text{Neutrales Element}$\
$\Rightarrow q \land p \land ¬q \quad | \quad \text{Konstantes Element}$\
$\Rightarrow \text{false} \land p$\
$\Rightarrow \underline{\underline{\text{false}}}$

|$p$|$q$|$(p \to q) \land (p \land ¬q)$|
|-|-|-                  |
|0|0|0                  |
|0|1|0                  |
|1|0|0                  |
|1|1|0                  |

$\underline{\underline{\text{(d) ist unerfüllbar}}}$

## Aufgabe 6

### a)

>$\{¬, \lor\}$

$A \land B = ¬(¬A \lor ¬B)$

$A \to B = ¬A \lor B$

### b)

>$\{¬, \to\}$

$A \land B = ¬(A \to ¬B)$

$A \lor B = A \to ¬B$

### c)

>$\{\text{ nand }\}$

$A \land B = (A \text{ nand } B) \text{ nand } (A \text{ nand } B)$

$A \lor B = (A \text{ nand } A) \text{ nand } (B \text{ nand } B)$

$¬A = A \text{ nand } A$

$A \to B = (A \text{ nand } B) \text{ nand } A$

### d)

>$\{\text{ nor }\}$

$A \land B =$

$A \lor B =$

$¬A =$

$A \to B =$
