# Scanner

So far we've dealt with printing things to see the output of a program. What if we want user input as well?

Enter Scanner.

Copy the following program into a file called `Echo.java`. Compile and run, and type something in and press enter/return (to exit, press CTRL-C). What do you see?

```java
import java.util.Scanner;

public class Echo {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        while( sc.hasNext() ) {
            System.out.println( sc.next() );
        }
    }

}
```

Let's break down the code in the main method.

```java
Scanner sc = new Scanner(System.in);
```
We'll look more into this in the next lesson, but for now, this stores a Scanner in the variable `sc`. You can do things to the Scanner by using `sc` in the following lines of code.

```java
while( sc.hasNext() ) {}
```
`sc.hasNext()` is a method that checks the Scanner to see if there's user input. If there is user input, this returns true. Otherwise, it __blocks__; the program is paused until there is user input.

```java
System.out.println( sc.next() );
```
`sc.next()` returns the user input that is entered into the program.

## Practice

With this knowledge, create a program that, given String user inputs, should print out the length of the String. (To get the length of a String, use the String method `.length()`. For example, `thisIsAString.length()`.)
