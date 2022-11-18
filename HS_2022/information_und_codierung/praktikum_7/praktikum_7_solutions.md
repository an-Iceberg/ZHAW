# Praktikum 7: Datenkompression

>X[.] = { CCACBCCCBBCCBCCBCCAB ... }

## Aufgabe 1

### a)

|Nr.|Text|Token (Offset,Länge,Wert)|
|:-:|:-:|:-:|
|1||(0,0,C)|
|2|C|(1,1,A)|
|3|C|(2,1,B)|
|4|CC|(5,2,C)|
|5|B|(4,1,B)|
|6|CCB|(4,3,C)|
|7|CBC|(3,3,C)|
|8||(0,0,A)|
|9||(0,0,B)|

### b)

|Nr.|Text|Token (Offset,Länge,Wert)|
|:-:|:-:|:-:|
|1||(0,0,C)|
|2||(1,1,A)|
|3||(2,1,B)|
|4||(5,2,C)|
|5||(4,1,B)|
|6||(4,3,C)|
|7||(11,4,A)|
|8||(0,0,B)|

### c)

für a)\
$\text{Offset: } 0 \dots 5 = 3 \text{ Bits}$\
$\text{Länge: } 0 \dots 3 = 2 \text{ Bits}$\
$\text{Wärtebereich: } A \dots C = 3 \text{ Bits}$\
$3 + 2 + 3 = 8 \text{ Bits für 1 Token}$\
$9 \text{ Tokens} \cdot 8 \text{ Bits} = \underline{\underline{72 \text{ Bits}}}$

für b)\
$\text{Offset: } 0 \dots 11 = 4 \text{ Bits}$\
$\text{Länge: } 0 \dots 4 = 3 \text{ Bits}$\
$\text{Wärtebereich: } A \dots C = 3 \text{ Bits}$\
$4 + 3 + 3 = 10 \text{ Bits für 1 Token}$\
$8 \text{ Tokens} \cdot 10 \text{ Bits} = \underline{\underline{80 \text{ Bits}}}$

### d)

Für die Zahl 8 bräuchten wir ein weiteres Bit, um es kodieren zu können.

### e)

❌

## Aufgabe 2

### a)

|Von&nbsp;Hand||||Mit&nbsp;Maschine|||
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|Index|Eintrag|Token||Index|Eintrag|Token|
|||||||(67)|
|||||||(67)|
|||||||(65)|
|||||||(67)|
|||||||(66)|
|||||||(256)|
|||||||(259)|
|||||||(260)|
|||||||(259)|
|||||||(256)|
|||||||(263)|
|||||||(65)|
|||||||(66)|

### b)

❌

### c)

|Verfahren|#Token|#Bit/Token|#Zeichen|R|
|:-:|:-:|:-:|:-:|:-:|
|LZ-77 1a)|9||15.8 B|0.788|
|LZ-77 1b)|8||15 B|0.75|
|LZW|13||14.6 B|0.65|

## Aufgabe 3

### a)

|Grafikzeilen|Pixel / Token|
|:-:|:-|
|1|G5Y, G4R, B|
|2|G4Y, G4R, G2B|
|3|G3Y, G4R, G3B|
|4|G2Y, G4R, G4B|
|5|Y, G4R, G1G, G4B|
|6|G4R, G2G, G4B|
|7|G3R, G7B|
|8|G2R, G8B|
|9|R, G9B|
|10|G10B|

### b)

> \<Marker\>\<Zahl\>\<Farbe\>\
> Marker hat 2 Bits\
> Zahl hat 10 Bits (10 in binär ist 1010 (4 Bits))\
> Farbe hat 2 Bits

$\text{Marker} + \text{Anzahl} + \text{Zeichen}$\
$2 + 4 + 2 = 8$\
$\underline{\underline{14\text{ Bits}}}$

### c)

$\text{Marker} + \text{Anzahl} + \text{Zeichen}$\
$2 + 4 + 2 = 8$\
$\underline{\underline{8\text{ Bits}}}$

### d)

$(2 \times 4\text{ Bit}) + (23 \times 8\text{ Bits}) + (3 \times 2\text{ Bits}) = \underline{\underline{198\text{ Bits}}}$

### e)

$198 / 208 = \underline{\underline{0.95}}$

### f)

### g)

## Aufgabe 4

### a)

G15Y, G30R, G4B, G2G, G8B, G1G, G40B

$2 + 6 + 2 = \underline{\underline{10}}$

### b)

$(2 \times 4\text{ Bit}) + (7 \times 14\text{ Bits}) = \underline{\underline{106\text{ Bits}}}$

### c)

$106 / 208 = \underline{\underline{0.5}}$

## Aufgabe 5

:exclamation::warning: Der Text wird auf 100'000 Zeichen limitiert :warning::exclamation:
