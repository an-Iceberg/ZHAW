# Analysis - 20. Oktober 2022

## Folgen und Reihen

### Folgen

***Was ist eine Folge?***

Eine Folge ist eine Abbildung von einer Menge von Zahlen.

#### Bildungsgesetze

- explizit/direkt (iterativ)

- rekursiv

#### Folgentypen

- arithmetische

  Differenz zweier benachbarter Glieder ist immer gleich gross.

  - rekursiv: `a(k + 1) - a(k) = d` ⇔ `a(k + 1) = a(k) + d`

  - iterativ: `a(n) = A + (n - 1) * d` d = Differenz, A = a(1)

  > :warning: Arithmetisches Mittel: (a + b)/2

- geometrische

  Quotient zweier benachbarter Glieder ist immer gleich gross.

  - rekursiv: `a(k + 1) / a(k) = q` ⇔ `a(k + 1) = a(k) * q`

  - iterativ: `a(n) = A * q^(n-1) = (A / q) * q^n` D = Differenz, A = a(1)

  > :warning: Geometrisches Mittel: sqrt(a * b)

##### Summenzeichen

Σ

##### Partialsummen

### Reihen

Reihen sind Folgen von Partialsummen.

#### Reihentypen

- arithmetische

- geometrische
