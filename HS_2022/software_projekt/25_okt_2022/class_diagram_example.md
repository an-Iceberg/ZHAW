:::mermaid
classDiagram
direction TB

class Animal {
  +int age
  +String gender

  +isMammal() boolean
  +mate() void
}

class Duck {
  +String beakColor

  +swim(distance, direction) void
  +quack(loudness) void
}

class Fish {
  -int sizeInFeet

  -canEat() boolean
}

class Zebra {
  +boolean isWild

  +run(speed, direction, duration) void
}

class Square~Shape~ {
  -int id
  -List~int~ position
  -List~String~ messages
  +public field
  -private field
  #protected field
  ~package/internal field
  +String somePublicStaticField$

  +setPoints(List~int~ points)
  +getPoints() List~int~
  +setMessages(List~String~ messages)
  +getMessages() List~String~
  someAbstractMethod()*
  someStaticMethod()$
}

class Shape {
  <<interface>> Shape
  +int numberOfVertices
  +draw() void
}

class Color {
  <<enumeration>>
  RED
  BLUE
  GREEN
  WHITE
  BLACK
}

Animal <|-- Duck : Inheritance
Animal *-- Fish : Composition
Animal o-- Zebra : Aggregation
Shape <-- Animal : Associtaion
Shape -- Square : Link(solid)
Square <.. Zebra : Dependency
Color <|.. Animal : Realisation
Color .. Square : Link(dahsed)

%% This is a comment
:::
