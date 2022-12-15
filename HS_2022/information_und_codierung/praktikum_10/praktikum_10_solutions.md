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

|Fehler $F$|0|1|2|3|4|5|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|$\binom{31}{F}$             |${8.22\text{e}+33 \over 1 \cdot 8.22\text{e}+33} = 1$|${8.22\text{e}+33 \over 1 \cdot 2.65\text{e}+32} \approx 31$|${8.22\text{e}+33 \over 2 \cdot 8.842\text{e}+30} \approx 464.83$|${8.22\text{e}+33 \over 6 \cdot 304.89\text{e}+27} \approx 4'493.42$|${8.22\text{e}+33 \over 24 \cdot 10.89\text{e}+27} \approx 31'450.87$|${8.22\text{e}+33 \over 120 \cdot 403.3\text{e}+24} \approx 169'848.75$|
|$\varepsilon^F$             |$0.06^0 = 1$                                         |$0.06^1 = 0.06$                                             |$0.06^2 = 0.0036$                                                |$0.06^3 = 0.000216$                                                 |$0.06^4 = 0.00001296$                                                |$0.06^5 = 0.0000007776$|
|$(1 - \varepsilon)^{31 - F}$|$(1 - 0.06)^{31} \approx 0.147$                      |$(1 - 0.06)^{30} \approx 0.156$                             |$(1 - 0.06)^{29} \approx 0.166$                                  |$(1 - 0.06)^{28} \approx 0.177$                                     |$(1 - 0.06)^{27} \approx 0.188$                                      |$(1 - 0.06)^{26} \approx 0.2$|
|$P_{F, 31}$                 |$P_{0, 31} = 1 \cdot 1 \cdot 0.147 \approx 0.14$     |$P_{0, 30} = 31 \cdot 0.06 \cdot 0.156 \approx 0.29$        |$P_{0, 29} = 464.83 \cdot 0.0036 \cdot 0.166 \approx 0.28$       |$P_{0, 28} = 4'493.42 \cdot 0.000216 \cdot 0.177 \approx 0.17$      |$P_{0, 27} = 31'450.87 \cdot 0.00001296 \cdot 0.188 \approx 0.07$    |$P_{0, 26} = 169'848.75 \cdot 0.0000007776 \cdot 0.2 \approx 0.02$|
|Summe $P_{0 \dots F,31}$    |$0.14$                                               |$0.43$                                                      |$0.71$                                                           |$0.88$                                                              |$0.95$                                                               |$0.97$|

### e)

Kein Faktor scheint einen überheblichen Einfluss auf das Resultat auszuüben.

### f)

$$\sum_{F=0}^5 {F \over N} \cdot P_F = \underbrace{{0 \over 31} \cdot 0.14}_{0} + \underbrace{{1 \over 31} \cdot 0.29}_{\approx 0.00935} + \underbrace{{2 \over 31} \cdot 0.28}_{\approx 0.018} + \underbrace{{3 \over 31} \cdot 0.17}_{\approx 0.01645} + \underbrace{{4 \over 31} \cdot 0.07}_{\approx 0.009} + \underbrace{{5 \over 31} \cdot 0.02}_{\approx 0.00322} = 0.05602 \boxed{\approx 0.06}$$

## 3.

||Code 1|Code 2|Code 3|
|:-|:-:|:-:|:-:|
|$N$                     |31|31|511|
|$K$                     |21|11|340|
|Korrigierbare Fehler $f$|2|5|20|
|a) Coderate             |0.677|0.355|0.665|
|b) Übertragung von ...  |21 Infobits = 1 Codewort|11 Infobits = 1 Codewort|340 Infobits = 1 Codewort|
|Wahrscheinlichkeit für eine fehlerfreie Übertragung|$P_{\leq 2, 31} = \sum_{t = 0}^2 \binom{31}{t} \cdot 0.06^t \cdot (1 - 0.06)^{31 - t} = 0.71$|$P_{\leq 5,31} = \sum_{t = 0}^5 \binom{31}{t} \cdot 0.06^t \cdot (1 - 0.06)^{31 - t} = 0.99$|$P_{\leq20, 511} = 0.9058$|
|c) Übertragung von ...  |105 Infobits = 5 Codeworte|99 Infobits = 9 Codeworte|-|
|Wahrscheinlichkeit für eine fehlerfreie Übertragung|$0.71^5 = 0.18$|$0.99^9 = 0.91$|-|
|d) Übertragung von ...  |1008 Infobits = 48 Codeworte|1001 Infobits = 91 Codeworte|1020 Infobits = 3 Codeworte|
|Wahrscheinlichkeit für eine fehlerfreie Übertragung|$0.71^{48} \approx 0$|$0.99^{91} = 0.4$|$0.9058^3 = 0.74$|

### a)

Ungefähr 2 mal so lange da 2 mal mehr codes geschickt werden müssen um die gleiche Menge an Information zu übertragen.

### b)

Ja.

### c)

Code 2 hat die meiste Redundanz, hat aber die fehlerfreieste Übertragugnsrate. Code 1 hat die grösste Datenrate. Code 3 muss ein Witz sein da es sehr unpraktisch ist, solche grosse Datenpackete auf einmal zu schicken (verglichen mit Code 1 und 2).
