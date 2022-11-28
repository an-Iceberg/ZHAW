# Praktikum 6: Quellencodierung

## Aufgabe 1.

### 1.

Die vorherig produzierten Ereignisse haben keinen Einfluss auf die folgenden Ereignisse.

### 2.

$P(0) = 1 - {4 \over 20} = 0.8$\
$P(0) = 0.8$

$P(1) = {4 \over 20} = 0.2$\
$P(1) = 0.2$

### 3.

$H(X) = P(0) \cdot \log_2({1 \over P(0)}) + P(1) \cdot \log_2({1 \over P(1)}) = 0.722$\
$H(X) = 0.722$

### 4.

$L(X) = P(0) + P(1) = 1$\
$R(X) = L(X) - H(X) = 1 - 0.722 = 0.278$\
$R(X) = 0.278$

### 5.

:heavy_check_mark:

### 6.

$P(00) = 0.8 * 0.8 = 0.64$\
$P(01) = 0.8 * 0.2 = 0.16$\
$P(10) = 0.2 * 0.8 = 0.16$\
$P(11) = 0.2 * 0.2 = 0.04$

### 7.

$H(Y) = P(00) \cdot I(00) + P(01) \cdot I(01) + P(10) \cdot I(10) + P(11) \cdot I(11) = 1.44$\
$H(Y) = 1.44$

### 8.

$L(Y) = P(00) \cdot 2 + P(01) \cdot 2 + P(10) \cdot 2 + P(11) \cdot 2 = 2$\
$R(Y) = L(Y) - H(Y) = 2 - 1.44 = 0.56$\
$R(Y) = 0.56$

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

$5$

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

$P(A) = 0.1$

$P(B) = 0.3$

$P(C) = 0.6$

### 1.

$H(X) = P(A) \cdot I(A) + P(B) \cdot I(B) + P(C) \cdot I(C) = 1.3$

$H(X) = 1.3$

### 2.

$C = 1$

$B = 01$

$A = 00$

### 3.

$L(X) = P(A) \cdot l(A) + P(B) \cdot l(B) + P(C) \cdot l(C) = 1.4$\
$L(X) = 1.4$

### 4.

$P(AA) = 0.1 * 0.1 = 0.01$\
$P(AB) = 0.1 * 0.3 = 0.03$\
$P(AC) = 0.1 * 0.6 = 0.06$\
$P(BA) = 0.3 * 0.1 = 0.03$\
$P(BB) = 0.3 * 0.3 = 0.09$\
$P(BC) = 0.3 * 0.6 = 0.18$\
$P(CA) = 0.6 * 0.1 = 0.06$\
$P(CB) = 0.6 * 0.3 = 0.18$\
$P(CC) = 0.6 * 0.6 = 0.36$\
$H(XX) = 2.56$

### 5.

$CC = 1$\
$CB = 011$\
$BC = 010$\
$BB = 0001$\
$CA = 0011$\
$AC = 0010$\
$AB = 00001$\
$BA = 000001$\
$AA = 000000$

### 6.

$L(XX) = 2.32$

### 7.

Es ist nicht Präfixfrei
