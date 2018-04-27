# Classes

Let's start out with some guiding questions.

- What is a car?
- What properties do all cars have?
- What can all cars do?

### Car

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

## Creating Instances of Objects

By themselves, classes do not do anything. Remember, they are only the blueprints that define objects. In order to use classes, we need to create instances of that class.

We can do so using the `new` keyword.

Continuing with the above class example,
```java
Car toyota = new Car(5, 3);
```

This creates a Car, named `toyota`, that has a `size` of 5 and a `speed` of 3. The `size` and `speed` are set because the constructor for Car is run when a Car is created; `size` is set to the first input, `5`, and `speed` is set to the second input, `b`.

The syntax for creating an instance for any class is
```java
Class name = new Class(<inputs if there are>);
```

## What Are You?

To get an attribute from an object or to make an instance of an object do something, we use the dot notation.

To get the speed of the Car instance we just created, we would do something like:
```java
int x = toyota.speed;
```

To drive it:
```java
toyota.drive();
```

In general, dot notation looks like:
```java
<object name>.<variable or method name>;
```

## Remember?

Remember Scanner? Unknown to you, we were creating Scanner objects and using them in our code.

```java
Scanner sc = new Scanner(System.in);
```

## Writing a Class

Remember the "hello world" programs we wrote in the beginning of this course? You were actually creating a class that did nothing but print "Hello world!". The same rules for those programs apply to our classes: your filename must match the class name, your main method runs the code, and everything else is used by the main method to run the code.

```java
public class Car {

    public int speed;  // visibility modifiers can be attached to attributes!
    private int size;

    public Car(int a, int b) { // constructors should always be public--why?
        speed = a;
        size = b;
    }

    // method of the Car class
    public void drive() {
        speed++;
    }

    // this is the code that runs
    public static void main( String[] args ) {
        Car toyota = new Car(3, 5);
        toyota.drive();
        System.out.println(toyota.speed);
    }

}
```

What is the output of this program?

Note that not all classes have to have a main method. Only classes that you intend to run should have a main method. This may not make much sense now, but we'll return to this idea in our next project.

## Why Classes

Let's say you're writing a application that has a similar GUI with different content on every page. Wouldn't it be a waste of time and resources to write the code to draw the GUI for every single page? Instead, if you had a Page class with attributes for where buttons/text should go, and methods that keep track of user clicks, you could save yourself a lot of time.

Especially for large projects, creating classes can save you a lot of time. We will examine this in our next project.

## Practice

Write a class `Computer` that contains the following attributes: `size`, `weight`, `model`, and `isFast` with the appropriate data types. It should also contain the following methods: `upgrade(x)`, which should decrease the size and weight by `x`; `downgrade(x)`, which should increase the size and weight by `x`; and `toggleQuantumState()`, which should change `isFast` to the opposite of `isFast`. All of the attributes should be set when an instance is created (cough sounds like a job for a constructor cough).

Then, in a main method, create an instance of your computer called `machine`. Give it a `size` of `2`, `weight` of `3.5`, `model` of `"dell"`, and `isFast` to `false`.

Call the machine's `upgrade` method with an input of 5, and call `toggleQuantumState()`. Print out all of the `machine`'s attributes. Are they as you expected? Sample code is the assets directory of this course.

## More on Constructors

There's two different types of constructors...

### Default

The default constructor takes no arguments. If your class does not include a contructor, _a blank default constructor will be included automatically_. However, you can also specify a default constructor:

```java
public Car() { //no arguments
    size = 1;
    speed = 1;
    //...
}
```

and this could be called like such

```java
Car toyota = new Car(); //no arguments!
```

What are the attributes of this Car, created using the default constructor?

### Overloaded

The other type of constructor is called the overloaded constructor. It takes arguments, and we've already seen an example in the above Car class example. Overloaded constructors are not included by default--it's up to you to specify the number and types of arguments, and to make sure that the right number of arguments are passed when you're creating an instance.

```java
public Car(int a, int b, int c, int d) {
    size = a;
    speed = b;
}
```

can be called like

```java
Car toyota = new Car(3, 5, 3, 2);
```

## String

Let's take a closer look at the `String` data type. Why is it capitalized while the other __primitive__ data types are lowercase? Turns out, `String` is not a primitive type. It's a class, and _all classes are capitalized_.

But if String is a class, then why don't we create Strings using the `new` keyword, like we do with other classes?

Let's try it out.

```java
String test = new String("abcde");
System.out.println(test);
```

What do you see? Is it what you expect?

Truth of the matter is, String is a class like all the classe we've been writing. It is, however, special in that you can create instances of them like primitives (`String s = "hi"` is perfectly valid). It has become so ingrained in everyday use that this is simply a special feature built into Java. It's an exception to the rule.

---

If you've gone through everything above in a single sitting, please take a break at this point.

## Multi-File Programs

So far we've only covered single-file programs: programs that contain all the code in one file. However, Java makes it easy for us to organize our code into separate files. After all, you wouldn't want code that makes instances of Cars to be in the same file as code that makes Airplanes, right?

Looking off the `Car` class we wrote above, all the attributes and methods define what a car is and what it does--except for the main method, which creates an instance of Car. Let's move this main method to another file so that we'll have two files: `Car.java`, which defines a Car, and `Main.java`, which actually creates a Car and runs the program. __Remember that not all Java classes have to have main methods!__

`Main.java`:
```java
public class Main {

    public static void main( String[] args } {
        Car toyota = new Car(3, 5);
        toyota.drive();
        System.out.println(toyota.speed);
    }

}
```

Now compile and run `Main.java`. What do you see?

### Visibility Modifiers

We briefly touched on [this](10-methods.md#visibility-modifiers) in the methods lesson. Take a moment to go back and review. Since we're dealing with multiple files, it's important to keep in mind which visibility modifiers you want to use for classes, methods, and attributes.

Look at the `Main.java` example above. What would have happened if the `speed` attribute of `Car` had been private instead of public? If it had no modifier? What about `drive()`? Make a guess, then try it out.
