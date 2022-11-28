###### Diskrete Mathematik - Semesterwoche #10 - 21. November 2022

# Induktion

Türme von Hanoi

$x = 4 - x$

$x = 2$

---

$f(0) = 1$

$f(n + 1) = 2 \cdot f(n)$

$\Rightarrow \text{Induktionsannahme: } f(n) = 2^n \quad n \in \mathbb{N}$

$n = 0: \quad f(0) = 1 = 2^0$

$n \rightarrow n + 1: \quad \text{ zu zeigen: } f(n) = 2^n \implies f(n + 1) = 2^{n + 1}$

$f(n + 1) = 2 \cdot f(n) \stackrel{\text{Induktionsannahme}}{=} 2 \cdot 2^n = 2^{n + 1}$

$\square$

Step 1: Basisfall

Step 2: Induktionsannahme

Step 3: Unter der Induktionsannahme den Induktionsschritt beweisen
