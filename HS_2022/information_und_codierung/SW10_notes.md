###### Information und Codierung - Semesterwoche #10 - 22. November 2022

# Audiocodierung

Sub-Band Codierung

Bänder

# Fehlerlose Nachrichtübertragung

2 Arten:

- Backward Error Correction

  Bsp.:

  - Blockcodes

  -CRC

- Forward Error Correction

  Bsp.:

  - Blockcodes

  - Minimum-Distance-Decoding

  - Faltungscodes

## Bitfehlerwahrscheinlichkeit

BER := Bit Error Ratio

$\varepsilon =$ Wahrscheinlichkeit, ein Bit zu verfälschen

$N=$ Anzahl Datenbits

$P_{0,N} = {A_N \over A} = (1-\varepsilon)^N$

$\text{BER} = \text{Anzahl falsche Bit} \div \text{Total Anzahl Bit}$

> Binary Symmetric Channel (BSC)

Wahrscheinlichkeit $P_{F,N}$, dass in einer Sequenz von $N$ Datenbits genau $F$ Bitfehler auftreten:

$P_{F,N} = \binom{N}{F} \cdot \varepsilon^F \cdot (1 - \varepsilon)^{N - F}$

$P_{\leq F,N} = \sum^F_{t=0} \binom{N}{t} \cdot \varepsilon^t \cdot (1 - \varepsilon)^{N - t}$

$P_{>F,N} = 1 - P_{\leq F,N}$

$P_{>F,N} = \sum^N_{t=F+1} = \binom{N}{t} \cdot \varepsilon^t \cdot (1 - \varepsilon)^{N - t}$

## Kanalkapazität des BSC

$p :=$ Symbolwahrscheinlichkeit

$H_b = p \cdot \log_2 {1 \over p} + (1 - p) \cdot \log_2 {1 \over 1 - p}$

$C_{\text{BSC}} = 1 - H_b(\varepsilon)$

Die Fehlerquelle zerstört Informationen.

## Hamming codes

## Binäre Blockcodes

- Linearität

- Zyklizität
