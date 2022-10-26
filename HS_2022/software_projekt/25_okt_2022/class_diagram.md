# :warning: Subject to change :warning:

:::mermaid
classDiagram
direction LR

class TextEditor {
  -HashMap~int, String~ paragraphs
  -Command commands
  -Scanner input

  +processUserInput() void
  +executeCommand(Command command) void

  +add(int id, String text) void
  +delete(int id) void
  +dummy(int id) void
  +exit() void
  +formatRaw() void
  +formatFix(int width) void
  +index() void
  +print() void
  +replace(int id) void

  +main(String[] args)$ void
}

class Command {
  <<Enum>>
  ADD
  DEL
  DUMMY
  EXIT
  FORMAT_RAW
  FORMAT_FIX
  INDEX
  PRINT
  REPLACE
}

TextEditor <.. Command
:::
