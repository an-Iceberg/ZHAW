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

$31 \cdot 0.03 = \boxed{0.93}$

### c)

$$
\begin{align*}
  C_{\text{BSC}}(\varepsilon) &= 1 - \left(\varepsilon \cdot \log_2{1 \over \varepsilon} + (1 - \varepsilon) \cdot \log_2{1 \over 1 - \varepsilon}\right) \quad &&| \quad \varepsilon = 0.06 \\
  &= 1 - \left(0.06 \cdot \log_2{1 \over 0.06} + (1 - 0.06) \cdot \log_2{1 \over 1 - 0.06}\right) \\
  &\approx 1 - 0.3282 \\
  &\boxed{\approx 0.6718} \\
\end{align*}
$$

### d)

$N = 31$\
$F = 0 \dots 5$\
$\varepsilon = 0.06$

$P_{F,N} = \binom{N}{F} \cdot \varepsilon^F \cdot (1 - \varepsilon)^{N - F}$\
$P_{F,N} = {N! \over F! \cdot (N - F)!} \cdot \varepsilon^F \cdot (1 - \varepsilon)^{N - F}$

|Fehler $F$|0|1|2|3|4|5|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|$\binom{31}{F}$             |${8.22\text{e}+33 \over 1 \cdot 8.22\text{e}+33} = 1$|${8.22\text{e}+33 \over 1 \cdot 2.65\text{e}+32} \approx 31$|${8.22\text{e}+33 \over 2 \cdot 8.842\text{e}+30} \approx 464.83$|${8.22\text{e}+33 \over 6 \cdot 304.89\text{e}+27} \approx 4'493.42$|${8.22\text{e}+33 \over 24 \cdot 10.89\text{e}+27} \approx 31'450.87$|${8.22\text{e}+33 \over 120 \cdot 403.3\text{e}+24} \approx 169'848.75$|
|$\varepsilon^F$             |$0.06^0 = 1$                                         |$0.06^1 = 0.06$                                             |$0.06^2 = 0.0036$                                                |$0.06^3 = 0.000216$                                                 |$0.06^4 = 0.00001296$                                                |$0.06^5 = 0.0000007776$|
|$(1 - \varepsilon)^{31 - F}$|$(1 - 0.06)^{31} \approx 0.147$                      |$(1 - 0.06)^{30} \approx 0.156$                             |$(1 - 0.06)^{29} \approx 0.166$                                  |$(1 - 0.06)^{28} \approx 0.177$                                     |$(1 - 0.06)^{27} \approx 0.188$                                      |$(1 - 0.06)^{26} \approx 0.2$|
|$P_{F, 31}$                 |$P_{0, 31} = 1 \cdot 1 \cdot 0.147 \approx 0.14$     |$P_{0, 30} = 31 \cdot 0.06 \cdot 0.156 \approx 0.29$        |$P_{0, 29} = 464.83 \cdot 0.0036 \cdot 0.166 \approx 0.28$       |$P_{0, 28} = 4'493.42 \cdot 0.000216 \cdot 0.177 \approx 0.17$      |$P_{0, 27} = 31'450.87 \cdot 0.00001296 \cdot 0.188 \approx 0.07$    |$P_{0, 26} = 169'848.75 \cdot 0.0000007776 \cdot 0.2 \approx 0.02$|
|Summe $P_{0 \dots F,31}$    |$0.14$                                               |$0.43$                                                      |$0.71$                                                           |$0.88$                                                              |$0.95$                                                               |$0.97$|

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
