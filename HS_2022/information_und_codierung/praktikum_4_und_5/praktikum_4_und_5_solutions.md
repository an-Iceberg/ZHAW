# Praktikum 4 und 5: Information und Entropie

## 1.

:heavy_check_mark:

## 2.

- a) 1'000'000

- b) -, O

- c) $P(-) = 0.499, P(O) = 0.5$

- d) 100 KB

- e) 133 KB

- f) Keine Ahnung.


## 3.

- a) Die einzigen erkennbaren Unterschiede sind die Grössen der komprimierten Dateien: source_1.7z = 133 KB, source_2.7z = 1 KB

- b) source_1.txt hat Zufällige Datenverteilung, source_2.txt hat ein Muster.

- c) :heavy_check_mark:

## 4.

- a) source_3.txt müsste deutlich höhere Entropie vorweisen als source_4.txt.

- b) Die Entropie ist beinhahe identisch.

- c) Es gibt keine auffälligen Unterschiede in den Zahlenwerten.

- d) source_3.txt hat die A's in einer zufälligen verteilung, source_4.txt hat sie in einem Muster angeordnet.

## 5.

- a) H(source_5.txt) = 3.79

- b) Nicht sehr, da eine sehr kleine Menge an Information verwendet wird.

## 6.

- a) H(source_6.txt) = 4.44

- b) Ohne Punktuation wäre H = 4.31

## 7.

- a)

- b)

---

# Hausaufgabe

## 1.

|$a$|$b$|$s_n$|
|-|-|-|
|1|1|11|
|1|2|12|
|1|3|13|
|1|4|14|
|||
|2|1|12|
|2|2|22|
|2|3|23|
|2|4|24|
|||
|3|1|13|
|3|2|23|
|3|3|33|
|3|4|34|
|||
|4|1|14|
|4|2|24|
|4|3|34|
|4|4|44|

***sn: {11, 12, 13, 14, 22, 23, 24, 33, 34, 44}***

## 2.

|$s_n$|$P(s_n)$|
|-|-|
|11|0.0625|
|12|0.125|
|13|0.125|
|14|0.125|
|22|0.0625|
|23|0.125|
|24|0.125|
|33|0.0625|
|34|0.125|
|44|0.0625|

## 3.

$E(s_n) = 21.875$

## 4.

$I(22) = \log_2({1 \over 0.0625}) = \underline{\underline{4}}$

$I(34) = \log_2({1 \over 0.125}) = \underline{\underline{3}}$

## 5.

$H(S) = 4(0.0625 \times 4) + 6(0.125 \times 3) = \underline{\underline{3.25}}$

## 6.

$H(S) = 3.322$

Die Entropie unserer Quelle ist ein wenig kleiner als das maximal Mögliche.

## 7.

$L = S(P(s_n) \times 8) = 4(0.0625 \times 8) + 6(0.125 \times 8) = 8$

$R = L - H = 8 - 3.25 = 4.75$
