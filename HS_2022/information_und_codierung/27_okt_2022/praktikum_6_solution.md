# Praktikum 6: Quellencodierung

## Aufgabe 1.

### 1.

Die vorherig produzierten Ereignisse haben keinen Einfluss auf die folgenden Ereignisse.

### 2.

P(0) = 1 - 4/20 = 0.8\
<u class="solution">P(0) = 0.8</u>

P(1) = 4/20 = 0.2\
<u class="solution">P(1) = 0.2</u>

### 3.

H(X) = P(0) * log2(1/P(0)) + P(1) * log2(1/P(1)) = 0.722\
<u class="solution">H(X) = 0.722</u>

### 4.

L(X) = P(0) + P(1) = 1\
R(X) = L(X) - H(X) = 1 - 0.722 = 0.278\
<u class="solution">R(X) = 0.278</u>

### 5.

:heavy_check_mark:

### 6.

P(00) = 0.8 * 0.8 = 0.64\
P(01) = 0.8 * 0.2 = 0.16\
P(10) = 0.2 * 0.8 = 0.16\
P(11) = 0.2 * 0.2 = 0.04

<u class="solution">P(00) = 0.64</u>\
<u class="solution">P(01) = 0.16</u>\
<u class="solution">P(10) = 0.16</u>\
<u class="solution">P(11) = 0.04</u>

### 7.

H(Y) = P(00) * I(00) + P(01) * I(01) + P(10) * I(10) + P(11) * I(11) = 1.44\
<u class="solution">H(Y) = 1.44</u>

### 8.

L(Y) = P(00) * 2 + P(01) * 2 + P(10) * 2 + P(11) * 2 = 2\
R(Y) = L(Y) - H(Y) = 2 - 1.44 = 0.56\
<u class="solution">R(Y) = 0.56</u>

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

### 2.

## Aufgabe 3.

<u class="solution">P(A) = 0.1</u>

<u class="solution">P(B) = 0.3</u>

<u class="solution">P(C) = 0.6</u>

### 1.

H(X) = P(A) * I(A) + P(B) * I(B) + P(C) * I(C) = 1.3

<u class="solution">H(X) = 1.3</u>

### 2.

<u class="solution">C = 1</u>

<u class="solution">B = 01</u>

<u class="solution">A = 00</u>

### 3.

L(X) = P(A) * l(A) + P(B) * l(B) + P(C) * l(C) = 1.4

<u class="solution">L(X) = 1.4</u>

### 4.

P(AA) = 0.1 * 0.1 = 0.01

P(AB) = 0.1 * 0.3 = 0.03

P(AC) = 0.1 * 0.6 = 0.06

P(BA) = 0.3 * 0.1 = 0.03

P(BB) = 0.3 * 0.3 = 0.09

P(BC) = 0.3 * 0.6 = 0.18

P(CA) = 0.6 * 0.1 = 0.06

P(CB) = 0.6 * 0.3 = 0.18

P(CC) = 0.6 * 0.6 = 0.36

H(XX) = 2.56

<u class="solution">P(AA) = 0.01</u>

<u class="solution">P(AB) = 0.03</u>

<u class="solution">P(AC) = 0.06</u>

<u class="solution">P(BA) = 0.03</u>

<u class="solution">P(BB) = 0.09</u>

<u class="solution">P(BC) = 0.18</u>

<u class="solution">P(CA) = 0.06</u>

<u class="solution">P(CB) = 0.18</u>

<u class="solution">P(CC) = 0.36</u>

<u class="solution">H(XX) = 2.56</u>

### 5.

<u class="solution">CC = 1</u>

<u class="solution">CB = 011</u>

<u class="solution">BC = 010</u>

<u class="solution">BB = 0001</u>

<u class="solution">CA = 0011</u>

<u class="solution">AC = 0010</u>

<u class="solution">AB = 00001</u>

<u class="solution">BA = 000001</u>

<u class="solution">AA = 000000</u>

### 6.

<u class="solution">L(XX) = 2.32</u>

### 7.

Es ist nicht Präfixfrei

<style>
  u.solution {
    text-decoration-style: double;
    background-color: indigo;
    border-radius: 99px;
    padding: 0 10px;
  }
</style>
