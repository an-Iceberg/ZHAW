# Praktikum 10: Kanalcodierung

## 1.

$C_1$ = {000000, 011011, 101101, 110110}\
$C_2$ = {00000, 11111}\
$C_3$ = {0011, 1001, 1100, 0110}

|Bestimmen Sie:|Code $C_1$|Code $C_2$|Code $C_3$|
|:-|:-:|:-:|:-:|
|a) Anzahl Informationsbits $K$|2|1|2|
|b) Anzahl Codebits $N$|4|4|2|
|c) Code-Rates $R$|0.5|0.25|1|
|d) Linearer Code (Ja/Nein)|Ja|Ja|Nein|
|e) Zyklischer Code (Ja/Nein)|Ja|Nein|Ja|
|f) Min. Hammingdistanz $d_{\text{min}}$|4|5|2|
|g) Detektierbare Fehler|3|4|1|

## 2.

### a)

$P(x_1) \cdot (1 - \varepsilon) = 0.97$

$P(x_1) \cdot \varepsilon = 0.03$

$P(x_1) = 0.5 \ $ da die Wahrscheinlichkeiten bei 0 und 1 dieselbe ist.

$\boxed{\varepsilon = {0.03 \over 0.5} = 0.06 = \text{BER}}$

### b)

$H(Y) = \sum_{n = 0}^1 P(y_n) \cdot \log_2{1 \over P(y_n)}$

### c)

$C_{\text{BSC}}(\varepsilon) = 1 - (\varepsilon \cdot \log_2{1 \over \varepsilon} + (1 - \varepsilon) \cdot \log_2{1 \over 1 - \varepsilon})$

### d)

|Fehler $F$|0|1|2|3|4|5|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|$\binom{31}{F}$|||||||
|$\varepsilon^F$|||||||
|$(1 - \varepsilon)^{31 - F}$|||||||
|$P_{F, 31}$|||||||
|Summe $P_{0 \dots F,31}$|||||||

### e)

### f)

## 3.

||Code 1|Code 2|Code 3|
|:-|:-:|:-:|:-:|
|$N$|31|31|511|
|$K$|21|11|340|
|Korrigierbare Fehler $f$|2|5|20|
|a) Coderate||||
|b) Übertragung von ...|21 Infobits = 1 Codewort|11 Infobits = 1 Codewort|340 Infobits = 1 Codewort|
|Wahrscheinlichkeit für eine fehlerfreie Übertragung|||$P_{\leq20'511} = 0.9058$|
|c) Übertragung von ...|105 Infobits = _ Codeworte|99 Infobits = _ Codeworte|_|
|Wahrscheinlichkeit für eine fehlerfreie Übertragung|||_|
|d) Übertragung von ...|1008 Infobits = _ Codeworte|1001 Infobits = _ Codeworte|1020 Infobits = _ Codeworte|
|Wahrscheinlichkeit für eine fehlerfreie Übertragung||||

### a)

### b)

### c)
