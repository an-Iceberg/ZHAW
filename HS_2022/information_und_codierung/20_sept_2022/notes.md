# Information und Codierung - 20. September 2022
Dozent: rosn@zhaw.ch

Prüfungshilfe: 14 A4 Seiten hinten und vorne bedrukt

- Quellencodierung

- Kanalcodierung -> Fehlererkennung

## Kombinatorische Logik

Arithmetical and Logic Unit (ALU)

[megaprocessor](http://www.megaprocessor.com)

Gatter/Flip Flops (Gatter = gate)

1'000'000

### Wahrheitstabellen

- NOT ( ! )
- AND ( & )

  A AND 0 = 0

  A AND 1 = A

  A AND A = A

  A AND NOT A = 0

- OR ( # )

  0 OR B = B

  1 OR B = 1

  B OR B = B

  B OR NOT B = 1

- NAND ( NOT(AND) ) (uiversal gate, can solve every logical problem on it's own)
- NOR ( NOT(OR) )
- XOR ( $ )
- XNOR ( NOT(XOR) )

### Beispiel

A := Auto fährt

B := Türe geschlossen

C := Sicherheitsgurt geschlossen

Z := Warnsummer aktivieren

Za = (A AND NOT B) OR (A AND B AND NOT C)

Zo = A AND (NOT C OR NOT B)

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

### Addierung zweier Zahlen

---

| Syntax | Description |
| --- | --- |
| Header | Title |
| Paragraph | Text |
