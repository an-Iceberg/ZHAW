# :warning: Subject to change :warning:

:::mermaid
classDiagram
direction LR

class Editor {
  -HashMap~int, String~ paragraphs
  -Text text
  -Output output
  -Interaction interaction

  +format() void
  +dummy() void
  +del() void
  +exit() void

  +main(String[] args)$ void
}

class Text {
  +add() void
  +remove() void
  +replace() void
}

class Interaction {
  -Scanner console

  +promptString() String
  +promptInteger() int
  +promptCommand() String
}

class Output {
  -int columnWidth

  +print() void
  +index() void
}

Editor <.. Text
Editor <.. Interaction
Editor <.. Output
:::
