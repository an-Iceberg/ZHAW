###### Information und Codierung - Semesterwoche #12 - 6. Dezember 2022

# Lineare Blockcodes

Matrixmultiplikation

$$
\begin{bmatrix}
  7 & 3 \\
  2 & 1 \\
  2 & 2
\end{bmatrix}
$$

$$
\begin{bmatrix}
  7 & 3 & 1 & 0 \\
  2 & 1 & 7 & 2 \\
\end{bmatrix}
$$

## Generatormatrix

Beispiel:

$$
G_h =
\begin{bmatrix}
  1 & 1 & 0 & 1 & 0 & 0 & 0 \\
  0 & 1 & 1 & 0 & 1 & 0 & 0 \\
  1 & 1 & 1 & 0 & 0 & 1 & 0 \\
  1 & 0 & 1 & 0 & 0 & 0 & 1 \\
\end{bmatrix}
$$

Das Nutzwort $1010$ wird nun mit der Generatormatrix multipliziert, woraus ein lineares Codewort entsteht.

$$
1010 \times G_h = 0011010
$$

Das generierte Codewort wird nun fehlerhaft oder fehlerfrei übertragen.

## Paritätsprüfmatrix und Syndrom

Um eine Prüfmatrix zu erhalten, wird die Paritätsmatrix transponiert und an der anderen Seite wieder angehängt.

$$
H_h =
\begin{bmatrix}
  1 & 0 & 0 & 1 & 0 & 1 & 1 \\
  0 & 1 & 0 & 1 & 1 & 1 & 0 \\
  0 & 0 & 1 & 0 & 1 & 1 & 1 \\
\end{bmatrix}
$$

Um ein Syndrom berechnen zu können, wird die Prüfmatrix transponiert.

$$
H_h^T =
\begin{bmatrix}
  1 & 0 & 0 \\
  0 & 1 & 0 \\
  0 & 0 & 1 \\
  1 & 1 & 0 \\
  0 & 1 & 1 \\
  1 & 1 & 1 \\
  1 & 0 & 1 \\
\end{bmatrix}
$$

Das übertragene Codewort wird nun mit $H_h^T$ multipliziert, um ein Syndrom zu erhalten. Wenn das Syndrom 0 ist, wurde das Codewort fehlerfrei übertragen.

$$
0011010 \times H_h^T = 000
$$

# Hamming Codes
