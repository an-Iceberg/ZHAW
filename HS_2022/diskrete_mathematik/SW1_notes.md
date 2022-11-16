###### Diskrete Mathematik - Semesterwoche #1 - 19. September 2022
Dozent: Dandolo Flumini

Prüfungshilfe: 5 A4 Seiten hinten und vorne bedrukt

---

Aussage: grundlegenster Baustein der Mathematik

$2=5 \to \text{false}$

$x=1 \to$ keine Aussage, da man nicht sagen kann, ob es wahr oder falsch ist. x ist in diesem Beispiel ein Prädikat.

Eine Aussage ist ein null-stelliges Prädikat.

Ein n-stelliges Prädikat hat n freie Variabeln.

Prädikate $\to$ siehe Skript

Prädikate $\simeq$ constructors

Junktoren $\simeq$ operators

Durch einen Quantor wird eine Variable gebunden und ist nicht mehr frei.

$\forall x \in M (A(x)) \iff \forall x (x \in M \implies A(x))$

$\exists x \in M(A(x)) \iff \exists x (x \in M \land A(x))$

$¬\forall x A(x) \iff \exists x ¬A(x)$

$¬\exists x A(x) \iff \forall ¬A(x)$

Übung 3.

```
A(x) := ¬(∀x(P(x)) ∨ ∀x(Q(x))) | DeMorgan
<=> ¬∀x(P(x)) ∧ ¬∀x(Q(x)) | Quantoren
<=> ∃x(¬P(x)) ∧ ∃x(¬Q(x)) | Distributivität // !! Gilt NICHT für Quantoren
<=> ∃x(¬P(x) ∧ ¬Q(x)) | DeMorgan
<=> ∃x¬(P(x) ∨ Q(x))

A(x) := ∃x¬(P(x) ∨ Q(x))
B(x) := ∀x(P(x) ∨ Q(x))

∃x¬(P(x) ∨ Q(x)) ∧ ∀x(P(x) ∨ Q(x)) <== kann nicht wahr sein

¬(A(x) ∧ B(x))

∃x¬(x > 10 ∨ x < 11) ∧ ∀x(x > 10 ∨ x < 11)
```

Übung 4.

```
1. ∀x(P(x) => Q(x)) | Implikation
<=> ∀x(¬P(x) ∨ Q(x))

2. ∃x(P(x) <=> Q(x)) | Äquivalenz
<=> ∃x((P(x) => Q(x)) ∧ (Q(x) => P(x))) | Implikation
<=> ∃x((¬P(x) ∨ Q(x)) ∧ (P(x) ∨ ¬Q(x)))

3. ∀x(Q(x) => P(x)) | Implikation
<=> ∀x(¬Q(x) ∨ P(x)) | Kommutativität
<=> ∀x(P(x) ∨ ¬Q(x))

4. ∀x(¬P(x) => ¬Q(x)) | Implikation
<=> ∀x(¬¬P(x) ∨ ¬Q(x)) | Doppelte Negation
<=> ∀x(P(x) ∨ ¬Q(x))

5. ∀x(¬Q(x) => ¬P(x)) | Implikation
<=> ∀x(¬¬Q(x) ∨ ¬P(x)) | Doppelte Negation
<=> ∀x(Q(x) ∨ ¬P(x)) | Kommutativität
<=> ∀x(¬P(x) ∨ Q(x))

6. ¬∃x(¬¬Q(x) ∧ ¬P(x)) | DeMorgan
<=> ¬∃x¬(¬Q(x) ∨ P(x)) | Quantoren
<=> ∀x(¬Q(x) ∨ P(x)) | Kommutativität
<=> ∀x(P(x) ∨ ¬Q(x))

7. ¬∃x(P(x) ∧ ¬Q(x)) | Quantoren
<=> ∀x¬(P(x) ∧ ¬Q(x)) | DeMorgan
<=> ∀x(¬P(x) ∨ ¬¬Q(x)) | Doppelte Negation
<=> ∀x(¬P(x) ∨ Q(x))

8. ∃x(P(x) ∧ Q(x)) ∨ ∃x(¬P(x) ∧ ¬Q(x)) | DeMorgan
<=> ∃x(P(x) ∧ Q(x)) ∨ ∃x¬(P(x) ∨ Q(x))

9. ∀x∃y(P(x) ∧ P(y)) | Quantoren
<=> ¬∃x¬∃y(P(x) ∧ P(y))

(1, 5, 7), (3, 4, 6), (2), (8), (9)
```

∀∃∈∉∧∨
