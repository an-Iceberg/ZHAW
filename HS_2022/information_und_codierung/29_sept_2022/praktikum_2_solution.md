# Praktikum 2: Sequentielle Logik

## Aufgabe 1

- a)
```
TODO: Q[1:0]
{signal: [
  {name: 'clk', wave: 'P........'},
  {name: 'serial_in', wave: '01.0.10..'},
  {},
  {name: 'Q0', wave: '0.1.0.10.'},
  {name: 'Q1', wave: '0..1.0.10'},
  {name: 'Q[1:0]', wave: 'xxxxxxxxx'},
]}
```

- b)
```
{signal: [
  {name: 'clk', wave: 'P........'},
  {name: 'serial_in', wave: '01.0.10..'},
  {},
  {name: 'Q0', wave: '0.1.0.10.'},
  {name: 'Q1', wave: '0..1.0.10'},
  {name: 'Q[1:0]', wave: 'xxxxxxxxx'},
  {},
  {name: 'serial_out', wave: '0.10101.0'},
]}
```

- c) Es werden sowohl die steigenen wie auch die fallended Flanken erkannt. Es wird `serial_in` zeitverzögert in zwei flip-flops "gespeichert" und miteinander verglichen. Wenn ein Unterscheid erkannt wird, heisst es, dass eine Flanke erkannt wurde.

- d) Keine Ahnung.

- e)
```
Q0 & !Q1
!Q0 & Q1
```

- f)
```
{signal: [
  {name: 'clk', wave: 'P........'},
  {name: 'serial_in', wave: '01.0.10..'},
  {},
  {name: 'Q0', wave: '0.1.0.10.'},
  {name: 'Q1', wave: '0..1.0.10'},
  {name: 'Q[1:0]', wave: 'xxxxxxxxx'},
  {},
  {name: 'serial_out', wave: '0.10101.0'},
  {name: 'steig', wave: '0.10..10.'},
  {name: 'fall', wave: '0...10.10'},
]}
```

## Aufgabe 2

TODO
