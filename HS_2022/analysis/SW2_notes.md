###### Analysis - Semesterwoche #2 - 29 September 2022

# Intervall

**Intervall**\
Zusamenhängende Teilmenge

**zusammenhängend**\
von einem Element gibt es einen Weg zu einem anderen Element im Intervall

> :warning:️ **Unendlich ist keine Zahl**

# Nullstellen

Unterschiedliche Arten:
- schneidend
- berührend
- durchsetzend

# Symmetrie

**gerade**\
$f(-x) = f(x)$\
Funktion ist achsensymmetrisch zur y-Achse. (Sind nie injektiv)

**ungerade**\
$f(-x) = -f(x)$\
Funktion ist punktsymmetrisch zum Ursprung

> :warning: Die meisten Funktionen sind weder gerade noch ungerade.

# Injektiv, surjektiv, bijektiv

$f(x) = y$

> :warning: Die Mengen müssen gleich gross sein.

**injektiv**\
Für jedes x gibt es nicht mehr als ein y.

**surjektiv**\
Jedes y hat mindestens ein x.

**bijektiv**\
injektiv und surjektiv. Eine bijektive Funktion kann invertiert werden (Umkehrfunktion).

>$y = x^2$
>
>weder injektiv, noch surjektiv

# Horner Schema

$p(x) = 2x^4 - 3x^3 + 4x^2 - 5x + 6$

$x = 2$

| | 2 | -3 | 4 | -5 | 6 |
|-|-  |-   |-  |-   |-  |
|2|   | 4  | 2 | 12 | 14|
| |   |    |   |    |   |
| | 2 | 1  | 6 | 7  | 20|

$p(2) = 20$

>Horner Schema anwenden auf Polynomdivision

# Arithmetik auf Funktionen

Normale Arithmetik (+, -, *, /)

Komposition (Verkettung)

$(g \circ f)(x) =g(f(x))$

> :warning: Komposition ist nicht kommutativ. $f \circ g \neq g \circ f$
