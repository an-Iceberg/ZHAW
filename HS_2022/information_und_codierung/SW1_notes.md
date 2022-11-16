###### Information und Codierung - Semesterwoche #1 - 20. September 2022
Dozent: rosn@zhaw.ch

Prüfungshilfe: 14 A4 Seiten hinten und vorne bedrukt

- Quellencodierung

- Kanalcodierung -> Fehlererkennung

# Kombinatorische Logik

Arithmetical and Logic Unit (ALU)

[megaprocessor](http://www.megaprocessor.com)

Gatter/Flip Flops (Gatter = gate)

1'000'000

## Wahrheitstabellen

- not ( ! )
- and ( & )

  A and 0 = 0

  A and 1 = A

  A and A = A

  A and not A = 0

- or ( # )

  0 or B = B

  1 or B = 1

  B or B = B

  B or not B = 1

- nand ( not(and) ) (uiversal gate, can solve every logical problem on it's own)
- nor ( not(or) )
- xor ( $ )
- xnor ( not(xor) )

## Beispiel

A := Auto fährt

B := Türe geschlossen

C := Sicherheitsgurt geschlossen

Z := Warnsummer aktivieren

Za = (A and not B) or (A and B and not C)

Zo = A and (not C or not B)

| A | B | C | Za | Zo |
| - | - | - | - | - |
| 0 | 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 0 | 0 |
| 0 | 1 | 0 | 0 | 0 |
| 0 | 1 | 1 | 0 | 0 |
| 1 | 0 | 0 | 1 | 1 |
| 1 | 0 | 1 | 1 | 1 |
| 1 | 1 | 0 | 1 | 1 |
| 1 | 1 | 1 | 0 | 0 |

## Addierung zweier Zahlen

---

| Syntax | Description |
| --- | --- |
| Header | Title |
| Paragraph | Text |
