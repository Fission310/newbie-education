# Working with Java Files

## Creating a Java File

A Java file contains a program or part of a program. All java files must have a `.java` [extension](https://en.wikipedia.org/wiki/Filename_extension).

In terminal:
```bash
touch <file>.java
```
__Note__: `<>` (angle bracket notation) indicates that it should be replaced with the description on usage. For example, `<file>` should be replaced with a file name.

This creates a java file with the filename you specified. If you were to look at the contents of this file, you wouldn't see anything--`touch` creates only an empty file with a specified name.

## Opening a Java File

This step depends on the text editor you use. For `gedit` (only preinstalled on Linux), simply type `gedit <file>.java` into the terminal to open (and create if the file does not exist) a file with the specified name. For Macs and Windows, you may either install gedit or use a different editor.

## Compiling

Recall what [compiling](00-intro-to-computers.md#how-is-code-translated-into-software) is.

In terminal:
```bash
javac <file>.java
```

If there are any syntax (typing or formatting) errors with your code at this point, the compiler will give you an error, which tells you what's wrong and the line number that the error is coming from. These messages are useful for debugging your code.

Do you notice anything happening after you compile? (_Hint: Look in your current directory._) The compiler creates a `.class` file that will be used during execution.

## Executing

In terminal:
```bash
java <file>
```

If your program has output, you should see the output after running this command.
