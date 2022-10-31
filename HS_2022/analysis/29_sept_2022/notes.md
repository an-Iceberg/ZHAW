# Analysis - 29 September 2022

## Intervall

**Intervall**<br>
Zusamenhängende Teilmenge

**zusammenhängend**<br>
von einem Element gibt es einen Weg zu einem anderen Element im Intervall

> :warning:️ **Unendlich ist keine Zahl**

## Nullstellen

Unterschiedliche Arten:
- schneidend
- berührend
- durchsetzend

## Symmetrie

**gerade**<br>
f(-x) = f(x)<br>
Funktion ist achsensymmetrisch zur y-Achse. (Sind nie injektiv)

**ungerade**<br>
f(-x) = -f(x)<br>
Funktion ist punktsymmetrisch zum Ursprung

> :warning: Die meisten Funktionen sind weder gerade noch ungerade.

## Injektiv, surjektiv, bijektiv

f(x) = y

> :warning: Die Mengen müssen gleich gross sein.

**injektiv**<br>
Für jedes x gibt es nicht mehr als ein y.

**surjektiv**<br>
Jedes y hat mindestens ein x.

**bijektiv**<br>
injektiv und surjektiv. Eine bijektive Funktion kann invertiert werden (Umkehrfunktion).

>y = x<sup>2</sup>
>
>weder injektiv, noch surjektiv

## Horner Schema

p(x) = 2x<sup>4</sup> - 3x<sup>3</sup> + 4x<sup>2</sup> - 5x + 6

x = 2

| | 2 | -3 | 4 | -5 | 6 |
|-|-  |-   |-  |-   |-  |
|2|   | 4  | 2 | 12 | 14|
| |   |    |   |    |   |
| | 2 | 1  | 6 | 7  | 20|

p(2) = 20

>Horner Schema anwenden auf Polynomdivision

## Arithmetik auf Funktionen

Normale Arithmetik (+, -, *, /)

Komposition (Verkettung)

(g ° f)(x) =g(f(x))

> :warning: Komposition ist nicht kommutativ. f ° g != g ° f
