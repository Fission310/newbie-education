# Inheritance

Let's go back to our Car class example. If we wanted to create a class for SUVs, we would have to copy many of the attributes and methods that also apply to Car (`drive()`, `speed`, `size`, etc.). Instead, since SUV is a __subclass__ of Car, we can make it __extend__ the Car class.

What could other subclasses of Car be? What about __superclasses__?

## Object

All classes in Java are derived from one class: Object, as illustrated in the following image:

[!object tree](http://journals.ecs.soton.ac.uk/java/tutorial/java/javaOO/images/classHierarchy_trans.gif)

The subclass inherits state and behavior in the form of variables and methods from its superclass. The subclass can use just the items inherited from its superclass as is, or the subclass can  __override__, or modify, it. So, as you drop down in the hierarchy, the classes become more and more specialized.

## Writing Subclasses

If you wanted to create a subclass named SUV of another class named Car, you could do

```java
class SUV extends Car {
    ...
}
```

This declares that SUV is a subclass of Car. It also implicitly declares that Car is the superclass of SUV. Remember that a subclass inherits variables and methods from its superclass, its superclass's superclass, and so on up the inheritance tree.

_A Java class can only have one superclass._

### What Member Variables does a Subclass Inherit?

Subclasses inherit:
- member variables declared as public or protected
- member variables declared with no access specifier as long as the subclass is in the same __package__ (directory) as the superclass

Subclasses don't inherit:
- a superclass's member variable if the subclass declares a member variable using the same name (the subclass's member variable is said to hide the member variable in the superclass)
- the superclass's private member variables

### Hiding Member Variables

As mentioned in the previous section, a superclass's member variables can be hidden by a subclass's member variables.

```java
class Car {
    int speed;

    ...
}

class SUV extends Car {
    double speed;

    ...
}
```

In this case, the `speed` member variable in SUV hides the `speed` member variable in Car.
