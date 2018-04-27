# Methods

## Functions

What is a function? Everyday mathematical operations, like addition and subtraction, are functions. Functions take in none, one, or many inputs; do something to the inputs; then __return__ the result of the operation (the output). In programming, we usually only return _one_ output.

Functions in java are called __methods__. Inside a method, you can do anything that you have been doing in your main method; you can make variables, loops, or operators, all to serve the purpose of doing something to an input and returning the result.

## Example

```java

public static void main( String[] args ) {
    foo( 1, 2, 3 );
    foo( 2, 1, 2 );
}

void foo( int a, int b, int c ) {
    for( int i = a; i < b; i++) {
       c += 1;
    }

    System.out.println(c);
}

```

What do you think is the output of this program (specifically, the functions with the specified inputs)? Then, run this example and see if your guesses were correct.

In other words, what are the results of these __calls__ to the function `foo`?
`foo( 1, 2, 3 )` => ?
`foo( 2, 1, 2 )` => ?

## How Methods Work

Let's examine the different parts of a method.

### Return Type

The __return type__ of a method is the data type of the output of a method.

```java
int sum( int a, int b ) {
    return a + b;
}
```

Notice, in the above function, the `int` keyword at the beginning of the method. This is the return type of the method. To actually return an output, the `return` keyword is used inside the method. __Note that the method will stop running once it reaches a `return` statement; any code in the method underneath the return will not run.__

Since the method adds two integers together, the output should also be an integer, which is why the return type is `int`.

Methods can also return no output. In this case, the return type should be `void`.

### Name

Like a variable, methods also have names. These names are used to access the method in your code.

### Parameters

Remember, methods are functions, and functions can take any number of inputs. These inputs are called __parameters__. Each parameter is a newly created variable, with the specified data type and name, that can be used in the method.

In the `sum` method, `a` and `b` are newly created variables, containing the values of the inputs, and are used inside the method body.

### Method Body

This is the code that your function uses to turn the inputs into the desired outputs. It begins after the opening curly brace and ends with the closing curly brace. Note that you do not need semicolons after a line that ends with a curly brace.

If your functions returns an output, your `return` statement should be here.

## Calling Methods

So you've learned how to create a method, but how do we actually use them? After all, defining any function is useless if you don't use the function to turn inputs into outputs.

To use a method, you need to __call__ it. When you call a method, you give it any necessary inputs it needs, and depending on if it outputs a value, it returns a certain value.

If you have a method with the __function header__ `int sum( int a, int b )`, you could call it by using `sum( 1, 3 );` What does this return (in other words, what is the output)?

What happens if you call a method with inputs that are not the correct specified type? For example, `sum( true, false );`?

## Practice

Create a method that has the following parameters: 2 integers and a boolean. If the boolean is true, return double the sum of the 2 integers. If boolean is false, return the sum of the 2 integers. To check your answer, call the method in your main method and print it (for example, `System.out.println( foo(5) );`).

Create a method that takes a parameter `int k`, and if more than half of the 10 consecutive numbers after k multiplied by 3 is greater than 20, then return the value of k, otherwise return k - 3.

## Visibility Modifiers

Visibility modifiers declare where methods can be accessed from. They go in front of the return type.

For example,

```java
public int sum( int a, int b ) {}
```

The visibility modifiers we'll focus on:

| Modifier    | Visibility                                             |
|-------------|--------------------------------------------------------|
| `public`    | Can be called by any java file                         |
| `private`   | Can only be called by the current java file            |
| no modifier | Can only be called by java files in the same directory |

While modifiers currently do not affect our programs, since they are contained to one file, modifiers will come in handy for larger projects.
