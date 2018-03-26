# Hello World!

Before we start... a bit of [trivia](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program).

## Writing Your First Program

Copy and paste the following code into a new java file named `HelloWorld.java`. Save, exit, compile, and run/execute. What do you see?

```java
public class HelloWorld {
    public static void main( String[] args ) {
        System.out.println("Hello world!");
    }
}
```

If you have successfully compiled and run your program, you should see something like:

![hello-world](assets/hello_world.png)

If you're having trouble with this part, check out the section below for potential messups or download [this](assets/HelloWorld.java) file.

### Important Notes

So what does all this code mean?

### Mystery #1

```java
public class HelloWorld {
    // code goes here
}
```

All java files must begin with `public class <File>`. Notice a similarity between the word after `class` in the above code block and the file name you were instructed to use? That's right, they're the same. The `<File>` part of the first line __MUST__ be the same as the filename without the `.java` extension. In other words, if the filename was `foo.java`, the first line has to be `public class foo {`. Ignore the `public class` for now, we'll get back to that in a later lesson.

There is a [convention](https://en.wikipedia.org/wiki/Coding_conventions) in java to use CamelCased filenames, which means that your `<File>` subsequently has to be CamelCased. CamelCasing refers to the CapitalizationOfTheFirstLetterOfEveryWordWithoutSpaces.

Follow conventions and don't be this guy:

![bad-code](https://s3.amazonaws.com/codementor_content/2015-Aug-week2/confusedfry.png)

_Related_: Seeing this error?

![filename-error](filename_error.png)

Make sure the filename and `<File>` are the same.

### Mystery #2

Looking at the code inside the outermost set of curly braces:

```java
    public static void main( String[] args ) {
        // all of your code should go here
    }
```
