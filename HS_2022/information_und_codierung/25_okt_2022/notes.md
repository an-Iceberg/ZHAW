# Information und Codierung - 25. Oktober 2022

## Quellencodierung 2

- LZ77

- LZW

### LZ77

**Idee:** 2 Buffer und Tokens generieren

- Such-Buffer

- Vorschau-Buffer

#### Beispiel

`AMAMMMAAAMMMTAAT...`

|Suchbuffer|Vorschaubuffer|Token|
|-|-|-|
||`AMAM`|(0,0,A)|
|`A`|`MAMM`|(0,0,M)|
|`AM`|`AMMM`|(2,2,M)|
|`AMAMM`|`MAAA`|(4,2,A)|
|`AMAMMMAA`|`AMMMT`|(6,4,T)|

#### Kompressionsrate R

R = Codierte Bits / Originale Bits

### LZW

**Idee:** Datenbank bauen
