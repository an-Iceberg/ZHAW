# Bewertung TicTacToe - Team 03 - Rocket
## 🥇 Erreichte Punkte: 8.5/10.00

👫 Marosi Andras (marcosand); Kunz Felix (kunfel01); Seca Gonçalves Hugo (goncahug); Kovinthapillai S. Nagenthan 
(kovins.n)


## Allgemeine Anforderungen (all-or-nothing) 

> Voraussetzung für Punkterteilung: Die Applikation ist lauffähig. 


## Entwicklung 


👨‍🏫  Entwicklung: 6: (0-6): 5

> je 0-2 Punkte (oder Abzüge): 
> - Das Spiel besitzt die geforderte Funktionalität (Abzüge:  Ende nicht erkannt, Spielfeld nicht ausgedruckt, Sprachumschaltung nicht bei jedem Zug vorhanden, Illegale Züge nicht erkannt, Grundfunktionalität des Spiels (z.B. Spielregeln) fehlt, die Aufgabe ist nicht gelöst)
> - Sie halten die Vorgaben hinsichtlich einsetzbarer 
Konstrukte (z.B. Einsatz von Arrays) und Clean Code (siehe Anhang) ein 
> - Sie haben eine sinnvolle Aufteilung in Klassen 
und Klassendefinitionen gefunden (Kopplung, Kohäsion, Zuständigkeit, etc.)

* Spiel funktioniert sehr gut. Es besitzt die das meiste der geforderten Funktionalität.
  * Schöne Ausgabe. Gute und flüssige Benutzerführung. 
  * Die Sprache kann nicht bei jedem Zug gewechselt werden (nur bei jedem Spiel) __(-0.5)__

* Die Vorgaben betreffend erlaubter Konstrukte wurde eingehalten.
  * Vereinfachte Versionen von Map, Locale, ... wurden mit erlaubten Mitteln umgesetzt.
* Clean Code Regeln eingehalten
  * Code ist aufgeräumt (Strukturiert, eingerückt, kein toter Code, keine unnötigen Kommentare, keine Magic-Numbers)
  * Namensgebung ist grösstenteils sinnvoll
    * Methoden sollten aussagekräftige Namen haben. In der Regel ist enthalten Sie ein Verb (Tätigkeit)
        * greet -> printGreeting
        * playerWon -> printWinner
        * draw -> printDraw
  * Methodengestaltung könnte noch verbessert werden __(-0.25)__
    * GameLogic.start() ist sehr lang und sollte in mehrere Methoden aufgeteilt werden (statt Kommentare)
      (prepareMatch, playerTurn, checkWinnerOrDraw)
    * mainGame Loop sollte mit Bedingung verlassen werden checkWinnerOrDraw() und nicht mit break.
  * Klassen haben grösstenteils Verhalten
    * Sowohl Message, wie auch Field haben nahezu kein Verhalten, sondern sind reine Containerklassen. 
      Dies ist bedingt durch die Nachbildung nicht erlaubter Elemente.
    * Die reine PlayingField-Logik (z.B. feststellen ungültiger Züge) könnte im PlayingField resp. Field sichergestellt 
      werden.
      Dies wird im Moment im IO überprüft, wo es eigentlich nicht hin gehört.
  * Klassenoberfläche ist grösstenteils minimal __(-0.25)__
    * Datenfelder sind private. 
    * Enthält public Methode, die private sein könnten
        * checkWinner
    * Keine unnötigen getter- und setter
  * Vernünftiger Einsatz von Datenfeldern (Datenfeld oder lokaleVariable)
    * Der Scanner in IO wird jedes Mal neu erstellt. Es könnte ein gemeinsamer Scanner verwendet werden.

* Sinnvolle Aufteilung von Klassen und Klassendefinitionen
  * Grundsätzlich gute Aufteilung in PlayingField, GameLogic und Ein/Ausgabe (IO)
  * Keine überflüssigen Klassen 
    * Locale und Message bilden Map und Properties nach. Ist mit den gegebenen Anforderungen legitim.
    * Field hat relativ wenig Funktionalität und diese könnte in PlayingField implementiert werden.
      Das zeigt sich auch daran, dass getField immer nur im Zusammenhang mit get/setMark verwendet wird. 
      Könnte direkt als getFieldMark, setFieldMark umgesetzt werden.
    * Main-Klasse nur für eine main-Methode ist wenig sinnvoll. 
      Besser direkt in die Hauptklasse GameLogic einbauen (evtl. sollte diese dann anders benannt werden)


## Vorgehen und Dokumentation
👨‍🏫  Doku: 4: (0-4): 3.5

> je 0-2 Punkte (oder Abzüge): 
> - Funktionalität ist im Code oder anderweitig dokumentiert.
> - Alle Gruppenmitglieder haben Code beigetragen und auf GitHub eingechecked. (Check durch GitHub Log)

* Dokumentation mittels JavaDoc und Infos in README __(-0.5)__
  * Klassen und Methoden haben einen JavaDoc-Kommentar 
    * Auch die Main-Klasse sollte, wenn vorhanden, dokumentiert sein.
    * Teilweise etwas kurz und ungenau. z.B.
        * getMark: was für Werte können im Rückgabe enthalten sein?
        * gameLogic.start
        * checkWinner: Was wird zurückgegeben, wenn kein Gewinner?
    * Teilweise fehlen die @param oder @return Beschreibungen. z.B.
      * printField
    * getter und Setter sollten auch eine Beschreibung erhalten und nicht nur @param und @return Beschreibungen (z.B.
      PlayingField, getConstellation)
    * Die Klassen sollten etwas ausführlicher dokumentiert sein. 
      * Vor allem die Hauptklasse. Wie wird die Klasse verwendet (das Spiel initialisiert und gestartet wird).
      * Field: z.B. was für Werte kann das Field enthalten
      * PlayingField ist sehr gut
* Alle Teammitglieder haben beigetragen
  * Achten Sie darauf, dass sie jeweils die gleichen username's verwenden
  * Herr Kovinthapillai hat relativ wenig beigetragen.
```
Inserts and Deletes in the commits for *.java *.fxml *.md *.adoc *.properties files

      Author (commits)  Insert   Del
        an-Iceberg (22):   544   185
              Hugo (20):   857   662
        Felix Kunz (11):   244    41
Kovinthapillai S. Nagenthan (kovins.n) (5):    85    29
    Hugo Gonçalves (1):     1     0


```


# Anhang

Folgende Vorgaben zu Clean Code werden angeschaut:  

* Code ist aufgeräumt (PROG1 Kapitel 3: Objektinteraktion, Kapitel 6:Bibliotheksklassen)
* Sinnvolle Namensgebung (PROG1 Kapitel 1: Objekte und Klassen)
* Methodengestaltung (PROG1 Kapitel 3: Objektinteraktion, Kapitel 6, Bibliotheksklassen)
* Klassen haben Verhalten (PROG1 Kapitel 3: Objektinteraktion)
* Klassenoberfläche ist minimal (PROG1 Kapitel 3: Objektinteraktion, Kapitel 10: Vererbung)
* Vernünftiger Einsatz von Feldern (PROG1 Kapitel 3: Objektinteraktion)
* Javadoc (PROG1 Kapitel 2: Klassendefinitionen)
