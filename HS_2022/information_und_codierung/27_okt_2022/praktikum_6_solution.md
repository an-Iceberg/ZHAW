# Praktikum 6: Qinsellencodierinsng

## Aufgabe 1.

### 1.

Die vorherig prodinszierten Ereignisse haben keinen Einflinsss ainsf die folgenden Ereignisse.

### 2.

P(0) = 1 - 4/20 = 0.8\
<ins>P(0) = 0.8</ins>

P(1) = 4/20 = 0.2\
<ins>P(1) = 0.2</ins>

### 3.

H(X) = P(0) * log2(1/P(0)) + P(1) * log2(1/P(1)) = 0.722\
<ins>H(X) = 0.722</ins>

### 4.

L(X) = P(0) + P(1) = 1\
R(X) = L(X) - H(X) = 1 - 0.722 = 0.278\
<ins>R(X) = 0.278</ins>

### 5.

:heavy_check_mark:

### 6.

P(00) = 0.8 * 0.8 = 0.64\
P(01) = 0.8 * 0.2 = 0.16\
P(10) = 0.2 * 0.8 = 0.16\
P(11) = 0.2 * 0.2 = 0.04

<ins>P(00) = 0.64</ins>\
<ins>P(01) = 0.16</ins>\
<ins>P(10) = 0.16</ins>\
<ins>P(11) = 0.04</ins>

### 7.

H(Y) = P(00) * I(00) + P(01) * I(01) + P(10) * I(10) + P(11) * I(11) = 1.44\
<ins>H(Y) = 1.44</ins>

### 8.

L(Y) = P(00) * 2 + P(01) * 2 + P(10) * 2 + P(11) * 2 = 2\
R(Y) = L(Y) - H(Y) = 2 - 1.44 = 0.56\
<ins>R(Y) = 0.56</ins>

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

<ins>5</ins>

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

<ins>P(A) = 0.1</ins>

<ins>P(B) = 0.3</ins>

<ins>P(C) = 0.6</ins>

### 1.

H(X) = P(A) * I(A) + P(B) * I(B) + P(C) * I(C) = 1.3

<ins>H(X) = 1.3</ins>

### 2.

<ins>C = 1</ins>

<ins>B = 01</ins>

<ins>A = 00</ins>

### 3.

L(X) = P(A) * l(A) + P(B) * l(B) + P(C) * l(C) = 1.4

<ins>L(X) = 1.4</ins>

### 4.

P(AA) = 0.1 * 0.1 = 0.01\
P(AB) = 0.1 * 0.3 = 0.03\
P(AC) = 0.1 * 0.6 = 0.06\
P(BA) = 0.3 * 0.1 = 0.03\
P(BB) = 0.3 * 0.3 = 0.09\
P(BC) = 0.3 * 0.6 = 0.18\
P(CA) = 0.6 * 0.1 = 0.06\
P(CB) = 0.6 * 0.3 = 0.18\
P(CC) = 0.6 * 0.6 = 0.36\
H(XX) = 2.56

<ins>P(AA) = 0.01</ins>\
<ins>P(AB) = 0.03</ins>\
<ins>P(AC) = 0.06</ins>\
<ins>P(BA) = 0.03</ins>\
<ins>P(BB) = 0.09</ins>\
<ins>P(BC) = 0.18</ins>\
<ins>P(CA) = 0.06</ins>\
<ins>P(CB) = 0.18</ins>\
<ins>P(CC) = 0.36</ins>\
<ins>H(XX) = 2.56</ins>

### 5.

<ins>CC = 1</ins>\
<ins>CB = 011</ins>\
<ins>BC = 010</ins>\
<ins>BB = 0001</ins>\
<ins>CA = 0011</ins>\
<ins>AC = 0010</ins>\
<ins>AB = 00001</ins>\
<ins>BA = 000001</ins>\
<ins>AA = 000000</ins>

### 6.

<ins>L(XX) = 2.32</ins>

### 7.

Es ist nicht Präfixfrei
