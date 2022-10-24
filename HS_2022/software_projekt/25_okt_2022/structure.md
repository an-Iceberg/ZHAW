:::mermaid
classDiagram
direction LR

class Text {
  -HashMap~int, String~ absaetze
  -Commands commands
  -Scanner input

  +getAbsatzByID(int id) String
}

class Commands {
  -List~String~ commands
}

Text o-- Commands : Composition
:::
