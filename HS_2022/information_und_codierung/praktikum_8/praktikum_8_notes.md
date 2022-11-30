# Praktikum 8: JPEG-Kompressionsverfahern

## 1.

### a)

Der Wert ganz oben links nach der DTC.

### b)

Die Koeffizienten an einer glatten Stelle sind homogen, während sie an einer strukturierten Stelle sehr viele unterschiedliche Werte aufweisen.

### c)

Es werden nur die Helligkeitskoeffizienten in das komprimierte Bild übertragen.

### d)

Es wird alles ausser der Helligkeit in das komprimierte Bild übertragen, sprich, nur die strukturellen Unterschiede.

### e)

Kleine (irrelevante) Werte werden ignoriert. Um genau zu bestimmen, welche Wellen mit welchen Werten ignoriert werden sollen, wird eine spezielle Quantisierungstabelle verwendet.

### f)

$Q_{00}$

### g)

Je höher der Quantisierungswert ist, desto verwaschener sind die Details auf den Steinen und in den Nadeln der Pflanzen. Des Weiteren werden eventuell auch die 8x8 Pixel Artefakte sichtbar.

### h)

|Roh Bild Grösse (in Bytes|Quantisierungsfaktor|JPEG komprimiertes Bild (in Bytes)|%|
|:-:|:-:|:-:|:-:|
|102'400|0|104'111|101.7|
|102'400|1|22'236|21.7|
|102'400|2|13'365|13|
|102'400|3|8'766|8.6|

### i)

Ein Verlust wird für mich ab $Q = 0.2$ sichtbar.

Für das 2. Bild.

### j)

Inhaltlich gibt es quasi keine Unterschiede. Die Grösse des Bildes ist jedoch um ca. 30% reduziert.

### k)

Absolut nicht empfehlenswert.

### l)

Vertikalen: $Q_{00} - Q_{07}$

Horizontalen: $Q_{00} - Q_{70}$

### m)

Die Vorzeichen verändern sich.

### n)

Es repräsentiert den Bildausschnitt zerlegt in verschiedene Wellenfunktionen

### o)

$F_{30}, F_{70}, F_{50}, F_{10}$

### p)

Auf den Feldern mit ungeradenen Zahlen $F_{13}, F_{37}, \dots$

### q)

Im Schachbrett oben rechts kann man bei der richtigen Positionierung eine DCT erhalten mit nur einem Koeffizienten in $F_{44}$.

### r)

Die Werte der einzelnen Koeffizienten.

### s)

## 2.

### a)

### b)

### c)

### d)

### e)

### f)
