# Übung 2, Aussagenlogik

## Aufgabe 1

F := p -> (q & r)

> => !p # (q & r)

Q := (r & q) -> s

> => !(r & q) # s
>
> => !r # !q # s

- a)

  false -> (true & true) | Absorbtion

  => false -> true | Implikation

  => !false # true | Negation

  => true # true | Absorption

  => true

  (true & true) -> false | Absorption

  => true -> false | Implikation

  => !true # false | Negation

  => false # false | Absorbtion/Auswertung

  => false

- b)

  p == true

  q == false

  r == false

  s == false

## Aufgabe 2

- a) DNF & KNF & NNF

- b) NNF

- c) -

- d) NNF

- e) KNF & DNF & NNF

## Aufgabe 3

- a)

  p -> (q # (p1 & p2)) | Implikation

  => !p # (q # (p1 & p2)) | Distributivität

  => !p # ((p1 # q) & (p2 # q)) | Distributivität

  => **(!p # p1 # q) & (!p # p2 # q)** | Distributivität

  => (((!p # p1 # q) & !p) # ((!p # p1 # q) & p2) # ((!p # p1 # q) & q)) | Distributivität

  => (!p & !p) # (!p & p1) # (!p & q) # (p2 & !p) # (p2 & p1) # (p2 & q)) # (q & !p) # (q & p1) # (q & q) | Absorption

  => **(!p & p1) # (!p & q) # (p2 & !p) # (p2 & p1) # (p2 & q) # (q & !p) # (q & p1)**

  >KNF: (!p # p1 # q) & (!p # p2 # q)
  >
  >DNF: (!p & p1) # (!p & q) # (p2 & !p) # (p2 & p1) # (p2 & q) # (q & !p) # (q & p1)

- b)

  p -> (q -> p1) | Implikation

  => **!p # !q # p1**

  >DNF & KNF: !p # !q # p1

- c)

  (p -> q) -> p1 | Implikation

  => !(!p # q) # p1 | DeMorgan

  => **(p & !q) # p1** | Distributivität

  => **(p1 # p) & (p1 # !q)**

  >DNF: (p & !q) # p1
  >
  >KNF: (p1 # p) & (p1 # !q)

## Aufgabe 4

## Aufgabe 5

- a)

  p -> (q -> p) | Implikation

  => !p # !q # p | Konstantes Element

  => 1 # !q | Tautologie

  => 1

  |p|q|p -> (q -> p)|
  |-|-|-            |
  |0|0|1            |
  |0|1|1            |
  |1|0|1            |
  |1|1|1            |

  (a) ist allgemeingültig.

- b)

  (p -> q) -> (!q -> !p) | Implikation

  => !(!p # q) # (q # !p) | DeMorgan

  => (p & !q) # q # !p | Distributivität

  => ((q # p) & (q # !q)) # !p | Konstantes Element

  => ((q # p) & 1) # !p | Neutrales Element

  => q # p # !p | Konstantes Element

  => q # 1 | Tautologie

  |p|q|(p -> q) -> (!q -> !p)|
  |-|-|-                     |
  |0|0|1                     |
  |0|1|1                     |
  |1|0|1                     |
  |1|1|1                     |

  (b) ist allgemeingültig.

- c)

  (p -> q) -> (q -> p) | Implikation

  => !(!p # q) # (!q # p) | DeMorgan

  => (p & !q) # !q # p | Distributivität

  => ((p # !q) & (!q # q)) # p | Konstantes Element

  => ((p # !q) & 1) # p | Neutrales Element

  => p # !q # p | Absorbtion

  => p # !q

  |p|q|(p -> q) -> (q -> p)|
  |-|-|-                   |
  |0|0|1                   |
  |0|1|0                   |
  |1|0|1                   |
  |1|1|1                   |

  (c) ist erfüllbar.

- d)

  (p -> q) & (p & !q) | Implikation

  => (!p # q) & p & !q | Distributivität

  => ((!p & p) # (q & p)) & !q | Konstantes Element

  => (0 # (q & p)) & !q | Neutrales Element

  => q & p & !q | Konstantes Element

  => 0 & p

  => 0 | "unerfüllbar"

  |p|q|(p -> q) & (p & !q)|
  |-|-|-                  |
  |0|0|0                  |
  |0|1|0                  |
  |1|0|0                  |
  |1|1|0                  |

  (d) ist unerfüllbar.

## Aufgabe 6

- a) {!, #}

  A & B = !(!A # !B)

  A -> B = !A # B

- b) {!, ->}

  A & B = !(A -> !B)

  A # B = A -> !B

- c) {!&} (NAND = !(A & B))

  A & B = (A !& B) !& (A !& B)

  A # B =

  !A = A !& A

  A -> B = (A !& B) !& A

  |A|A !& A|
  |-|-|
  |0|1|
  |1|0|

  |A|B|A !& B|
  |-|-|-|
  |0|0|1|
  |0|1|1|
  |1|0|1|
  |1|1|0|

  |A|B|(A !& B) !& A|
  |-|-|-|
  |0|0|1|
  |0|1|1|
  |1|0|0|
  |1|1|1|

  |A|B|(A !& A) !& A|
  |-|-|-|
  |0|0|1|
  |0|1|0|
  |1|0|1|
  |1|1|1|

  |A|B|(A !& x) !& B|
  |-|-|-|
  |0|0|1|
  |0|1|0|
  |1|0|1|
  |1|1|1|

  |A|B|(A !& B) !& (A !& A)|
  |-|-|-|
  |0|0|0|
  |0|1|0|
  |1|0|1|
  |1|1|1|

  |A|B|(A !& B) !& (B !& B)|
  |-|-|-|
  |0|0|0|
  |0|1|1|
  |1|0|0|
  |1|1|1|

  |A|B|A # B|
  |-|-|-|
  |0|0|0|
  |0|1|1|
  |1|0|1|
  |1|1|1|

- d) {!#} (NOR = !(A # B))

  A & B =

  A # B =

  !A =

  A -> B =
