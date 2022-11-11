# Information und Codierung - 4. Oktober 2022

## Zahlensysteme (Binär, Hexadezimal)

16 bit = 1 word

siehe Folien für besseres Verständnis!

x-Zahlensystem zu Dezimal

- x mit Zahlenposition als Potenz

$1101b \to (1 \times 2^3) + (1 \times 2^2) + (1 \times 2^0) = 8 + 4 + 1 = 13d$

- Zahlen hinter dem Komma werden mit negativen Potenzen verrrechnet

`Java: binary: 0b1, hexadecimal: 0x1, decimal: 0d1`

$0x\mathrm{dec} \to (11 \times 16^2) + (14 \times 16^1) + (12 \times 16^0) = (11 \times 256) + (14 \times 16) + 12 = 2816 + 224 + 12 = 0d3052$

$0xa4.3b \to (10 \times 16^1) + (4 \times 16^0) + (3 \times 16^{-1}) + (11 \times 16^{-2}) = 160 + 4 + 0.1875 + 0.04296875 = 0d164.23046875$

**Horner Schema zur Umwandlung**

siehe Folien

```
0d26.6875 -> 0bxxxxxx

26 / 2 = 13 0
13 / 2 = 6  1
6  / 2 = 3  0
3  / 2 = 1  1
1  / 2 = 0  1

-> 11010

0.6875 * 2 = 1.375 1
0.375  * 2 = 0.75  0
0.75   * 2 = 1.5   1
0.5    * 2 = 1     1

-> 1101

=> 0b11010.1101

0d1000 -> 0x

1000 / 16 = 62 8
62   / 16 = 3  14 -> E
3    / 16 = 0  3

-> 0x3E8
```

## Halbaddierer und Ganzaddierer

für Schaltung siehe Folien

## Addieren, Subtrahieren, Multiplikation

- Bitshift ist sehr effizient

5 * 14

```
101 * 1110
----------
+     1110 (bitshift to left by 0 places)
+    00000 (0 -> multiplication by 0)
+   111000 (bitshift to left by 2 places)
----------
   1000110
```

## Komplementärsysteme

```
0101 5
------
1er Komplement (alle bits invertieren) -> 1010
2er Komplement (1 addieren) -> 1011 -5
```

***siehe Folien***

1011 = -5

11011 = -5

11111111111111111011 = -5
