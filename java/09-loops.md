# Loops

In programming, loops are used to perform a repeated task, usually with a slight tweak after every __iteration__ of the loop. Here's a visual representation of a loop.

![loop](http://cis.stvincent.edu/html/tutorials/swd/basic/control/repetition/img/for.gif)

There are two main types of loops that are common to all programming languages: `for` and `while`.

## For

For loops execute a block of code for a _specified_ and _known_ number of times.

Example
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

Output
```
0
1
2
3
4
```

Notice how there's three parts to the for loop.

```java
for (<var starting value>; <end condition>; <var change after iteration>) {
    // code goes here
}
```

The first part is where you assign a starting value to a variable, usually a newly declared one, like in the example above.

The second part is a conditional statement. Your for loop will continue to run until the end condition becomes false.

Finally, the third part is how your variable changes after each iteration, or each time it runs through the code contained inside. Your change should bring the variable closer to making the conditional statement false each time--otherwise your loop would run forever.

### Practice

Use a for loop to display the numbers from 0 to 25, inclusive.

If one of the numbers being displayed is a multiple of 5, then multiply that number by 2,and print the result.

## While

While loops are usually used to execute a block of code for an _unknown_ and _not predetermined_ number of times. However, they can also be used in lieu of a for loop: that is, they can be used to execute a block of code for a known number of times.

Example
```java
int count = 0;

while (count < 10) {
    System.out.println("Count: " + count);
    count++;
}
```

The while loop is simpler syntactically than the for loop; it only consists of a conditional statement that causes the while loop to stop when it becomes false, similar to the second part of the for loop.

### Practice

Use a while loop to display the numbers from 0 to 29, inclusive. If one of the numbers being displayed is a multiple of 7, then display it alongside text saying "I like java"

NOTES:
- The % operator can be used to get the remainder.
Ex: `4 % 5` = 4, `16 % 5` = 1, `10 % 5` = 0.
- The + operator can be used to concatenate strings.
Ex: `"hi" + " there"` => `"hi there"`

## More Practice

For more practice problems, visit [CodingBat](http://codingbat.com/java) and work on their problems. Practice makes perfect!
