# Serie 6: Folgen und Reihen

## 1.

### a)

q = 3/2 / 2 = 0.75

s = 2  / (1 - 0.75) = 8

<u class="solution">s = 8</u>

### b)
q = -3/2 / 2 = -0.75

s = 2 / (1 + 0.75) = 1.142857...

<u class="solution">s = 1.142857...</u>

### c)

q = 0.99 / 1 = 0.99

s = 1 / (1 - 0.99) = 100

<u class="solution">s = 100</u>

### d)

q = -0.99 / 1 = -0.99

s = 1 / (1 + 0.99) ~= 0.5

<u class="solution">s ~= 0.5</u>

## 2.

### a)

a(1) = 5, a(2) = -55/12

q = -55/12 / 5 = -55/12  1/5 = -11/12

s = 5 / (1 + 11/12) = 5 / 23/12 ~= 2.6

<u class="solution">s ~= 2.6</u>

### b)

a(1) = 3, a(2) = 3  4/5 = 2.4

q = 2.4 / 3 = 0.8

s = 3 / (1 - 0.8) = 15

<u class="solution">s = 15</u>

## 3.

a(1) = 10

s = 6 = 10 / (1 - q) |  (1 - q)

-> 6  (1 - q) = 10

-> 6 - 6q = 10 | - 6

-> -6q = 4 | (-1)

-> 6q = -4 | /6

-> <u>q = -4/6 = -2/3</u>

a(2) = 10  -2/3 = -20/3

a(3) = -20/3  -2/3 = 40/9

a(4) = 40/9  -2/3 = -80/27

<u class="solution">a(2) = -20/3</u>

<u class="solution">a(3) = 40/9</u>

<u class="solution">a(4) = -80/27</u>

## 4.

a(1) = 4

s = 12

12 = 4 / (1 - q) |  (1 - q)

12 - 12q = 4 | -12

-12q = -8 | (-1)

12q = 8 | /12

<u class="solution">q = 2/3</u>

## 5.

> n-te Partialsumme:
>
> s(n) = A  (1 - q<sup>n</sup>) / (1 - q)

### a)

> q = 0.8
>
> s = 1 / (1 - 0.8) = 5
>
> e = 10<sup>-3</sup> = 0.00'1
>
> s = s - e = 4.999

4.999 = 1 * (1 - 0.8<sup>n</sup>) / (1 - 0.8) | * (1 - 0.8)

→ 0.99'98 = 1 - 0.8<sup>n</sup> | + 0.8<sup>n</sup>, - 0.99'98

→ 0.8<sup>n</sup> = 0.00'02 | log

→ log<sub>0.8</sub>(0.00'02) = n

→ <u class="solution">n = 38</u>

### b)

> q = 0.9
>
> s = 1 / (1 - 0.9) = 10
>
> e = 10<sup>-6</sup> = 0.00'0001
>
> s = s - e = 9.99'999

9.99'999 = 1 * (1 - 0.9<sup>n</sup>) / (1 - 0.9) | * 0.1

→ 0.99'999'9 = 1 - 0.9<sup>n</sup> | + 0.9<sup>n</sup>, - 0.99'999'9

→ 0.9<sup>n</sup> = 0.00'000'1 | log

→ log<sub>0.9</sub>(0.00'000'1) = n

→ <u class="solution">n = 131</u>

### c)

> q = 0.1
>
> s = 1 / (1 - 0.1) = 1.11...
>
> e = 10<sup>-6</sup> = 0.00'0001
>
> s = s - e = 1.11'110'11...

1.11'110'11... = 1 * (1 - 0.1<sup>n</sup>) / (1 - 0.1) | * 0.9

→ 099'999'099... = 1 - 0.1<sup>n</sup> | + 0.1<sup>n</sup>, - 099'999'099...

→ 0.1<sup>n</sup> = 0.00'000'9 | log

→ log<sub>0.1</sub>(0.00'000'9) = n

→ <u class="solution">n = 5</u>

## 6.

> ∑<sup>∞</sup><sub>k=1</sub> a<sub>k</sub> = 0.444...

### a)

<u class="solution">q = 0.1</u>

<u class="solution">a(1) = 0.4</u>

<u class="solution">a(2) = 0.04</u>

<u class="solution">a(3) = 0.00'4</u>

### b)

lim<sub>n→∞</sub> s<sub>n</sub> = 0.4 / 1 - 0.1 = 0.44...

<u class="solution">s = 0.44...</u>

### c)

Keine Ahnung.

<style>
  u.solution {
    text-decoration-style: double;
    background-color: indigo;
    border-radius: 99px;
    padding: 0 10px;
  }
</style>
