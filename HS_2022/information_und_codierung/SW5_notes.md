###### Information und Codierung - Semesterwoche #5 - 18. Oktober 2022

L = Länge

R = Redundanz

H = Entropie

H = L - R

**Mit Huffmann kann man die Redundanz minimieren**

# Quellencodierung

## Kompression

***Übertragungszeit kann durch Komprimierung reduziert werden.***

### Redundanz vs Irrelevanz

**Redundanz:** Es werden Daten weggelassen, die keine Informationen enthalten. (Der Informationsgehalt der ursprünglichen Quelle wird nicht reduziert.)

**Irrelevanz:** Es werden Daten weggelassen, die zwar Informationsträger sind, aber für den Empfänger nicht von bedeutung sind.

### Code

**Idee:** Symbole mit wenig Informationsgehalt: kurze Codes

**Idee:** Symbole mit viel Informationsgehalt: lange Codes

Bsp.: Morse Code (Codes sind auf der deutschen Sprache basiert)


### Präfixfreiheit

Ein Code ist präfixfrei, wenn jeder Code eindeutig zu einem decodierten Symbol zugeordnet werden kann.

***Formeln: siehe Folien***

> :warning: ***TODO: nte Entropie: Entropie pro Element (Buchstabe, Zeichen) berechnen***

## Run Length Encoding (RLE)

Lauflängencodierung: Marker, Anzahl, Zeichen

## Huffman Codes, Huffman Verfahren

Huffman Codes sind automatisch präfixfrei
