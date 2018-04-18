# Classes

Let's start out with some guiding questions.

- What is a car?
- What properties do all cars have?
- What can all cars do?

Car
| Properties     | Actions |
|----------------|---------|
| color          | drive   |
| speed          | turn    |
| num wheels     | brake   |
| num passengers | honk    |
| ...            | ...     |

## Make it Classy

A __class__ defines the properties (what something is) and the methods (what something does) of an __Object__. In other words, an __Object__ is a thing with two characteristics, properties and behavior, and classes are templates used to create these objects.

In the above example, the Car object had properties such as color, speed, etc., and behaviors of drive, turn, etc. Let's write a class to create __instances__, unique copies of a class, of Cars.

```java
public class Car {
    int size;

    // ...
}
```

We can use this class as a blueprint to create different instances of Cars. This example shows how you can define properties, or __attributes__ of classes; `size` is an attribute of a Car.

```java
public class Car {
    int size;
    int speed;

    public Car (int a, int b) {
        size = a;
        speed = b;
        openDoor();
    }

    public void openDoor() {
        // code...
    }
}
```

What are the attributes of this class? What are the actions (aka methods)?

In the above example, there is also a __constructor__.

The role of a constructor is to specify the attributes of an instance of an object when it is first created.

The constructor always has the same name as the class, in this case `Car`.
