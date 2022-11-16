###### Information und Codierung - 15. November 2022

# Audio Codierung

## Abtasttheorem

**Idee:** Einen Graphen in diskrete Werte (Stützstellen) zerlegen.

Signal darf maximal die Hälfte der Abtastfrequenz sein.

## Quantisierung

### Anzahl Bit für die Quantisierung

Quantisierungsrauschen: Differenz zwischen der Quantisierung und dem Signal.

## Pulse Code Modulation (PCM)

### Sprachcodierung

Abtastfrequenz: 8 kHz

ITU-T G.711:w

300-3400 Hz

### Musikcodierung

Abtastfrequenz: 44.1 kHz

## Differential-PCM (DPCM)

## Adaptive Differential-PCM (ADPCM)

Ausnutzung von $y = ax + b$.

DA = digital to analogue

AD = analogue to digital

## Linear Prediction Codex (LPC)

Modellierung des Sprachorgans (Vocoder)\
&nbsp;&nbsp;&nbsp;&nbsp;Optimiert für Raumfahrt

## Wave file format

$S_i = \text{Samples}$\
$f = \text{Frequenz}$\
$R = \text{Abtastrate}$\
$K = \text{Skalierungsfaktor}$\
$i = \text{Zähler}$

$S_i = K \times \sin\left({i \times 2\pi \times f \over R}\right)$

## Lossless Audio Encoding

Free Lossless Audio Codec (FLAC)

## Lossy Audio Encoding

MPEG

Sound Pressure Level (SPL)

Schallpegel $L = 20 \times \log_{10}\left({p \over p_0}\right)$

$p:$ Effektiver Schalldruck [Pa]\
$p_0:$ Bezugsschalldruck

$20 \times \log_{10}(2) = 6.02\text{dB}$

### Spektrale Maskierung
