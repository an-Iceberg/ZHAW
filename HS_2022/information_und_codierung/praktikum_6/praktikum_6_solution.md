# Praktikum 6: Quellencodierung

## Aufgabe 1.

### 1.

Die vorherig produzierten Ereignisse haben keinen Einfluss auf die folgenden Ereignisse.

### 2.

$P(0) = 1 - {4 \over 20} = 0.8$\
$\underline{\underline{P(0) = 0.8}}$

$P(1) = {4 \over 20} = 0.2$\
$\underline{\underline{P(1) = 0.2}}$

### 3.

$H(X) = P(0) \times \log_2({1 \over P(0)}) + P(1) \times \log_2({1 \over P(1)}) = 0.722$\
$\underline{\underline{H(X) = 0.722}}$

### 4.

$L(X) = P(0) + P(1) = 1$\
$R(X) = L(X) - H(X) = 1 - 0.722 = 0.278$\
$\underline{\underline{R(X) = 0.278}}$

### 5.

:heavy_check_mark:

### 6.

$\underline{\underline{P(00)}} = 0.8 * 0.8 = \underline{\underline{0.64}}$\
$\underline{\underline{P(01)}} = 0.8 * 0.2 = \underline{\underline{0.16}}$\
$\underline{\underline{P(10)}} = 0.2 * 0.8 = \underline{\underline{0.16}}$\
$\underline{\underline{P(11)}} = 0.2 * 0.2 = \underline{\underline{0.04}}$

### 7.

$H(Y) = P(00) \times I(00) + P(01) \times I(01) + P(10) \times I(10) + P(11) \times I(11) = 1.44$\
$\underline{\underline{H(Y) = 1.44}}$

### 8.

$L(Y) = P(00) \times 2 + P(01) \times 2 + P(10) \times 2 + P(11) \times 2 = 2$\
$R(Y) = L(Y) - H(Y) = 2 - 1.44 = 0.56$\
$\underline{\underline{R(Y) = 0.56}}$

### 9.

|Symbol|Wahrscheinlichkeit|Anzahl Nullen pro Symbol|Anzahl Einsen pro Symbol|Total Nullen in 1000 Symbolen (im Mittel)|Total Einsen in 100 Symbolen (im Mittel)|
|:-:|:-:|:-:|:-:|:-:|:-:|
|x0|0.8|1|0|800|0|
|x1|0.2|0|1|0|200|
|Total|-|-|-|800|200|
|Anzahl in Prozent|-|-|-|0.8|0.2|
|y0|0.64|1|0|640|0|
|y1|0.16|1|1|160|160|
|y2|0.16|1|2|160|320|
|y3|0.04|0|3|0|120|
|Total|-|-|-|960|600|
|Anzahl in Prozent|-|-|-|0.96|0.6|

## Aufgabe 2.

### 1.

$\underline{\underline{5}}$

### 2.

```
start:
take 2 balls

compare them

if scale is balanced
  put balls into bucket "are same"
  return to start
else
  %% one of the balls is not the same weight as the others

  compare ball #left with a random ball from the "are same" bucket or any of the other remaining balls

  if scale is balanced
    ball #right is the odd one
  else
    ball #left is the odd one
```

## Aufgabe 3.

$\underline{\underline{P(A) = 0.1}}$

$\underline{\underline{P(B) = 0.3}}$

$\underline{\underline{P(C) = 0.6}}$

### 1.

$H(X) = P(A) \times I(A) + P(B) \times I(B) + P(C) \times I(C) = 1.3$

$\underline{\underline{H(X) = 1.3}}$

### 2.

$\underline{\underline{C = 1}}$

$\underline{\underline{B = 01}}$

$\underline{\underline{A = 00}}$

### 3.

$L(X) = P(A) \times l(A) + P(B) \times l(B) + P(C) \times l(C) = 1.4$\
$\underline{\underline{L(X) = 1.4}}$

### 4.

$\underline{\underline{P(AA)}} = 0.1 * 0.1 = \underline{\underline{0.01}}$\
$\underline{\underline{P(AB)}} = 0.1 * 0.3 = \underline{\underline{0.03}}$\
$\underline{\underline{P(AC)}} = 0.1 * 0.6 = \underline{\underline{0.06}}$\
$\underline{\underline{P(BA)}} = 0.3 * 0.1 = \underline{\underline{0.03}}$\
$\underline{\underline{P(BB)}} = 0.3 * 0.3 = \underline{\underline{0.09}}$\
$\underline{\underline{P(BC)}} = 0.3 * 0.6 = \underline{\underline{0.18}}$\
$\underline{\underline{P(CA)}} = 0.6 * 0.1 = \underline{\underline{0.06}}$\
$\underline{\underline{P(CB)}} = 0.6 * 0.3 = \underline{\underline{0.18}}$\
$\underline{\underline{P(CC)}} = 0.6 * 0.6 = \underline{\underline{0.36}}$\
$\underline{\underline{H(XX) = 2.56}}$

### 5.

$\underline{\underline{CC = 1}}$\
$\underline{\underline{CB = 011}}$\
$\underline{\underline{BC = 010}}$\
$\underline{\underline{BB = 0001}}$\
$\underline{\underline{CA = 0011}}$\
$\underline{\underline{AC = 0010}}$\
$\underline{\underline{AB = 00001}}$\
$\underline{\underline{BA = 000001}}$\
$\underline{\underline{AA = 000000}}$

### 6.

$\underline{\underline{L(XX) = 2.32}}$

### 7.

Es ist nicht Präfixfrei
