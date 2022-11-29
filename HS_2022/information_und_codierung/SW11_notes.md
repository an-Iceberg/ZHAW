###### Information und Codierung - Semesterwoche #11 - 29. November 2022

# Kanalcodierung Repetition

Die Wahrscheinlichket, dass 0 oder 1 Bit aus N übertragenen Bits falsch übertragen wird beträgt:

$\varepsilon = \text{Wahrscheinlichkeit zur verfälschung von einem Bit}$

$$P_{(0,1),N} = \sum_0^N \binom{N}{1} \cdot \varepsilon^N \cdot (1 - \varepsilon)^{N - 1}$$

## Fehlererkennung (durch Hamming codes)

Hamming Distanz - 1 = Anzahl erkennbare Fehler in der Übertragung

# CRC (Cyclic Redundancy Check)

N Codewortbits\
K Informationsbits\
N - K Fehlerschutzbits

P Prüfbits\
N = K + P

### Bsp.: Parity

- Even Parity
- Odd Parity

# Galois-Feld

Polynomaddition im GF(2)

Addition $\oplus$ (XOR)

Multiplikation $\cdot$ (AND)

$$(z^3 + \not{z^2} + \not{1}) + (\not{z^2} + z + \not{1}) = z^3 + z$$

$$(z^2 + z + 1) \cdot (z^2 + z) = (z^4 + \not{z^3}) + (\not{z^3} + \not{z^2}) + (\not{z^2} + z) = z^4 + z$$

```
(111) * (110)

  000
 1110
11100
-----
10010
```

## CRC

Generatorpolynom $g$ vom Grad $m$\
Polynom $p$ (Nachricht der Länge K)
