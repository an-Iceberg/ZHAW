# Praktikum 1: Digitaler Würfel

## Aufgabe 1
a)

| Augenzahl | iputs | L1 | L2 | L3 | L4 | L5 | L6 | L7 |
| -         | -     | -  | -  | -  | -  | -  | -  | -  |
| 0         | 0 0 0 | 0  | 0  | 0  | 0  | 0  | 0  | 0  |
| 1         | 0 0 1 | 0  | 0  | 0  | 0  | 0  | 0  | 1  |
| 2         | 0 1 0 | 1  | 0  | 0  | 0  | 0  | 1  | 0  |
| 3         | 0 1 1 | 1  | 0  | 0  | 0  | 0  | 1  | 1  |
| 4         | 1 0 0 | 1  | 0  | 1  | 1  | 0  | 1  | 0  |
| 5         | 1 0 1 | 1  | 0  | 1  | 1  | 0  | 1  | 1  |
| 6         | 1 1 0 | 1  | 1  | 1  | 1  | 1  | 1  | 0  |
| 7         | 1 1 1 | 1  | 1  | 1  | 1  | 1  | 1  | 1  |

b)

```
L1 = ((!b2 & b1 & !b0) # (!b2 & b1 & b0)) # ((b2 & !b1 & !b0) # (b2 & !b1 & b0)) # ((b2 & b1 & !b0) # (b2 & b1 & b0)) | Distributivgesetz (!b2 & b1), (b2 & !b1), (b2 & b1)

  = ((!b2 & b1) & (!b0 # b0)) # ((b2 & !b1) & (!b0 # b0)) # ((b2 & b1) & (!b0 # b0)) | Konstantes Element

  = ((!b2 & b1) & 1) # ((b2 & !b1) & 1) # ((b2 & b1) & 1) | Neutrales Element

  = (!b2 & b1) # (b2 & !b1) # (b2 & b1) | Distributivgesetz

  = (!b2 & b1) # (b2 & (!b1 # b1)) | Konstante Element

  = (!b2 & b1) # (b2 & 1) | Neutrales Element

  = (!b2 & b1) # b2 | Distributivgesetz

  = (!b2 # b2) & (!b1 # b2) | Konstantes Element

  = 1 & (!b1 # b2) | Neutrales Element

  = !b1 # b2
```
```
L2 = (b2 & b1 & !b0) # (b2 & b1 & b0) | Distributivgesetz (b2 & b1)

  = (b2 & b1) & (!b0 # b0) | Konstantes Element kürzen

  = (b2 & b1) & 1

  = b2 & b1
```
```
L3 = ((b2 & !b1 & !b0) # (b2 & !b1 & b0)) # ((b2 & b1 & !b0) # (b2 & b1 & b0)) | Distributivgesetz (b2 & !b1), (b2 & b1)

  = ((b2 & !b1) & (!b0 # b0)) # ((b2 & b1) & (!b0 # b0)) | Konstantes Element kürzen

  = (b2 & !b1) # (b2 & b1) | Distributivgesetz

  = b2 & (!b1 # b1) | Konstantes Element kürzen

  = b2 & 1 | Neutrale Element

  = b2
```
```
L4 = (b2 & !b1 & !b0) # (b2 & !b1 & b0) # (b2 & b1 & !b0) # (b2 & b1 & b0)  | Distributivgesetz (b2 & !b1), (b2 & b1)

  = ((b2 & !b1) & (!b0 # b0)) # ((b2 & b1) & (!b0 # b0)) | Konstantes Element kürzen

  = (b2 & !b1) # (b2 & b1) | Distributivgesetz

  = b2 & (!b1 # b1) | Konstantes Element kürzen

  = b2 & 1 | Neutrale Element

  = b2
```
```
L5 = (b2 & b1 & !b0) # (b2 & b1 & b0) | Distributivgesetz (b2 & b1)

  = (b2 & b1) & (!b0 # b0) | Konstantes Element kürzen

  = (b2 & b1) & 1

  = b2 & b1
```
```
L6 = ((!b2 & b1 & !b0) # (!b2 & b1 & b0)) # ((b2 & !b1 & !b0) # (b2 & !b1 & b0)) # ((b2 & b1 & !b0) # (b2 & b1 & b0)) | Distributivgesetz (!b2 & b1), (b2 & !b1), (b2 & b1)

  = ((!b2 & b1) & (!b0 # b0)) # ((b2 & !b1) & (!b0 # b0)) # ((b2 & b1) & (!b0 # b0)) | Konstantes Element

  = ((!b2 & b1) & 1) # ((b2 & !b1) & 1) # ((b2 & b1) & 1) | Neutrales Element

  = (!b2 & b1) # (b2 & !b1) # (b2 & b1) | Distributivgesetz

  = (!b2 & b1) # (b2 & (!b1 # b1)) | Konstante Element

  = (!b2 & b1) # (b2 & 1) | Neutrales Element

  = (!b2 & b1) # b2 | Distributivgesetz

  = (!b2 # b2) & (!b1 # b2) | Konstantes Element

  = 1 & (!b1 # b2) | Neutrales Element

  = !b1 # b2
```
```
L7 = ((!b2 & !b1 & b0) # (!b2 & b1 & b0)) # ((b2 & !b1 & b0) # (b2 & b1 & b0)) | Distributivgesetz b0

  = (b0 & ((!b2 & !b1) # (!b2 & b1))) # (b0 & ((b2 & !b1) # (b2 & b1))) | Distributivgesetz !b2, b2

  = (b0 & (!b2 & (!b1 # b1))) # (b0 & (b2 & (!b1 # b1))) | Konstantes Element

  = (b0 & (!b2 & 1)) # (b0 & (b2 & 1)) | Neutrales Element

  = (b0 & !b2) # (b0 & b2) | Distributivgesetz

  = b0 & (!b2 # b2) | Konstantes Element

  = b0 & 1 | Neutrales Element

  = b0
```

## Aufgabe 2

a)

b)

c)

  `L1 = b1 # b2`

  `L2 = b1 & b2`

  `L3 = b2`

  `L4 = b2`

  `L5 = b1 & b2`

  `L6 = b1 # b2`

  `L7 = b0`

d)

## Aufgabe 3

a)

  ```
  h = (!x & y) # (x & !y) # (y & !z) | Kommutativgesetz

    = (!z & y) # (!x & y) # (x & !y) | Distributivgesetz

    = (y & (!z # !x)) # (x & !y) | Distributivgesetz

    = (x # (y & (!z # !x))) & (!y # (y & (!z # !x))) | Distributivgesetz

    = ((x # y) & (x # (!z # !x))) & ((!y # y) & (!y # (!z # !x))) | Konstantes Element

    = ((x # y) & (x # (!z # !x))) & (1 & (!y # (!z # !x))) | Neutrales Element

    = ((x # y) & (x # (!z # !x))) & (!y # (!z # !x)) | ? Distributivgesetz

    = ((x # y) & ((x # !z) # (x # !x))) & (!y # (!z # !x)) | Konstantes Element

    = ((x # y) & ((x # !z) # 1))) & (!y # (!z # !x)) | Kürzung von '# 1'

    = ((x # y) & 1) & (!y # (!z # !x)) | Konstantes Element

    = (x # y) & (!y # (!z # !x)) | Distributivgesetz

    = ((x # y) & !y) # ((x # y) & (!z # !x)) | Distributivgesetz

    = ((x & !y) # (y & !y)) # ((x # y) & (!z # !x)) | Konstantes Element

    = ((x & !y) # 0) # ((x # y) & (!z # !x)) | Neutrales Element

    = (x & !y) # ((x # y) & (!z # !x)) | Distributivgesetz

    = ((x & !y) # (x # y)) & ((x & !y) # (!z # !x)) | Distributivgesetz

    = ((x # (x # y)) & (!y # (x # y))) & ((x & !y) # (!z # !x)) | Kommutativgesetz und Assoziativgesetz

    = (y & (1 # x)) & ((x & !y) # (!z # !x)) | Kürzung von '# 1'

    = y & ((x & !y) # (!z # !x)) | Distributivgesetz

    = (y & (x & !y)) # (y & (!z # !x)) | Kommutativgesetz und Assoziativgesetz

    = (x & 0) # (y & (!z # !x)) | Kürzung

    =  0 # (y & (!z # !x)) | Kürzung

    = y & (!z # !x) | DeMorgan

    = y & !(z & x)

---

  h = (!x & y) # (x & !y) # (y & !z) | Distributivgesetz

    = (((!x & y) # x) & ((!x & y) # !y))) # (y & !z) | Distributivgesetz

    = (((x # !x) & (x # y)) & (!x # !y) & (!y & y)) # (y & !z) | Konstantes Element

    = ((1 & (x # y)) & (!x # !y) & 0) # (y & !z) | Neutrales Element, Kürzen

    = ((x # y) & 0) # (y & !z) | Kürzen

    = 0 # (y & !z) | Neutrales Element

    = y & !z
  ```

  ```
  i = (!x & z) # (!y & z) | Distributivgesetz

    = z & (!x # !y) | DeMorgan

    = z & !(x & y)
  ```

## Aufgabe 4

a)

## Aufgabe 5

a)

b)

c)

d)

e)
