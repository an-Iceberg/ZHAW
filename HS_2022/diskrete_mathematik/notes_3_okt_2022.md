# Diskrete Mathematik - 3 Oktober 2022

## Literale

Atomare oder negiert atomare Formel

p, !q, T

## NNF, DNF, KNF

KNF --(Distribution)-> DNF

DNF --(Distribution)-> KNF

Beispiel:

DNF -> KNF:

F = (p & q) # (z & y) | Distribution

F = ((p & q) # z) & ((p & q) # y) | Distribution

F = (z # p) & (z # q) & (y # p) & (y # q)

KNF -> DNF

F = (p # q) & (z # y) | Distribution

F = ((p # q) & z) # ((p # q) & y) | Distribution

F = (z & p) # (z & q) # (y & p) # (y & q)

## Mengen

A = B <=> Ax(x e A <=> x e B)

{x} = {x,x}

{x,y} = {y,x}

### Teilmengen

A = B <=> A teilm B & B teilm A
