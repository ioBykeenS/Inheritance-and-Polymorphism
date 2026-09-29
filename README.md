# Inheritance and Polymorphism

Name: Halis Ibrahim Kumala Chandra

NIM: F1D02410049

A Java program demonstrating **Encapsulation, Inheritance, and
Polymorphism** using geometric shapes: `Shape`, `Square`, `Circle`, and
`Cylinder`.

## Class Structure

```
Shape (parent)
├── Square
└── Circle
    └── Cylinder
```

  -----------------------------------------------------------------------
  File                                Description
  ----------------------------------- -----------------------------------
  `Shape.java`                        Parent class containing the `color`
                                      attribute, getter/setter methods,
                                      and `printInfo()`.

  `Square.java`                       Extends `Shape`. Contains a `side`
                                      attribute and calculates the square
                                      area.

  `Circle.java`                       Extends `Shape`. Contains a
                                      `radius` attribute and calculates
                                      the circle area.

  `Cylinder.java`                     Extends `Circle`. Adds a `height`
                                      attribute and calculates the
                                      cylinder volume.

  `Main.java`                         Main program that creates the
                                      objects and demonstrates
                                      polymorphism.
  -----------------------------------------------------------------------

## OOP Concepts Demonstrated

### 1. Encapsulation

The classes keep their data in fields and provide getter and setter
methods to access or modify that data.

For example, `Shape` stores the color and provides:

``` java
public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}
```

`Square`, `Circle`, and `Cylinder` similarly provide getter and setter
methods for their own attributes.

### 2. Inheritance

Inheritance is demonstrated using the `extends` keyword.

`Square` and `Circle` inherit from `Shape`:

``` java
public class Square extends Shape
```

``` java
public class Circle extends Shape
```

`Cylinder` demonstrates multilevel inheritance by extending `Circle`:

``` java
public class Cylinder extends Circle
```

Therefore, `Cylinder` inherits the properties and methods available
through `Circle` and `Shape`.

### 3. Polymorphism

Polymorphism is demonstrated by storing different shape objects in a
`Shape` array:

``` java
Shape[] shapes = { shape, square, circle, cylinder };

for (Shape s : shapes) {
    s.printInfo();
}
```

Each subclass overrides `printInfo()`. When `printInfo()` is called
through a `Shape` reference, Java executes the implementation belonging
to the actual object.

The overridden methods are:

``` java
@Override
public void printInfo() {
    System.out.println("Square colored " + getColor() + ", area = " + calculateArea());
}
```

``` java
@Override
public void printInfo() {
    System.out.println("Circle colored " + getColor() + ", area = " + calculateArea());
}
```

``` java
@Override
public void printInfo() {
    System.out.println("Cylinder colored " + getColor() + ", volume = " + calculateVolume());
}
```

## Calculations

### Square

The area is calculated using:

``` text
Area = side × side
```

For a side length of `5`:

``` text
Area = 5 × 5 = 25.0
```

### Circle

The area is calculated using:

``` text
Area = π × radius²
```

For a radius of `12`:

``` text
Area ≈ 452.3893421169302
```

### Cylinder

The volume is calculated using the circle's area multiplied by the
height:

``` text
Volume = Circle Area × height
```

For a radius of `12` and height of `3`:

``` text
Volume ≈ 1357.1680263507906
```
