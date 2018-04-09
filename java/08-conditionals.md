# Conditionals

In the last lesson, we learned about the different operators in java. We'll be focusing on one specific type of operator in this lesson, logical operators.

Logical operators deal with _comparing_ values and _result_ in a true or false value.

## Detour

If you are unfamiliar with logic, review the following examples to get a sense of how the AND/OR/NOT operators work.

AND only results in `true` if both inputs are true.
- `3 > 5 && 5 > 3` is `false`
- `5 == 5 && 3 < 5` is `true`

OR results in `false` if either input is true.
- `3 < 4 && 3 == 4` is `true`
- `2 != 2 && 3 == 4` is `false`
- `1 < 2 && 3 < 4` is `true`

NOT negates an input; `true` becomes `false` and vice versa
- `! (2 < 3)` is `false`

Notice how the comparison operators (`==`, `<`, `>`, etc.) also result in booleans. So both logical and comparison operators result in booleans.

## Practice (credit FRC SE)

What is each variable equal to, or what does the code print out?

0. `String b = “hi” - “i”;`

```java
boolean coach = true;
boolean mentor = false;
```
1. `System.out.println(coach && mentor);`
2. `System.out.println(coach || mentor);`
3. `boolean beepboop = 5 >= 5;`
4. `boolean c = (5*3) >= 100;`
5. `boolean j = 39 > 8 && 100 <= 90+20;`
6. `boolean m= 420 == 90 || (89 != 57 + 32);`
7. `boolean m = (90 == 90);`
8. `boolean p = (100 == (190 - 90)) || (70 > 1);`
9. `boolean j = !(90 >= 101 && 694 != 694);`
10. `boolean a = 39 < 10;`

### Answers (don't peek)

0) Error, 1) False, 2) True, 3) True, 4) False, 5) True, 6) False, 7) True, 8) True, 9) True, 10) False

## If only...

So evaluating statements is great and all, but where can we apply this in our code?

Enter the __if statement__.

If statements make decisions in your code based on a logical operation.

Let's look at the following sentence.

"If there are more than 5 fruit, we can make a fruit smoothie."

Notice how the second part ("we can make a fruit smoothie") only applies if the first part is true.

### Syntax

```java
if (<boolean statement>) {
    // code runs here if boolean statement is true
}
```

Example
```java
if (fruits > 5) {
    System.out.println("Fruit smoothie!");
}
```

### else/else if

Else is an extension of the if statement. If you would like different outputs based on multiple separate criteria, you might use `else if` and `else`.

### Syntax

```java
if (<boolean>) {
    // runs only if true
} else if (<boolean>) {
    // runs only if above was not true and this is true
} else if (<boolean>) {
    // runs only if above was not true and this is true
} else {
    // runs only if none of the above was true
}
```

You can have as many `else if`s as you want (including none). However, you can only have 1 or 0 `else`s.

### Practice

Write a program that:

1. contains a variable named 'grade' with a value between 1-100 (can be anything you want)
2. depending on the value of the variable, prints out a message that accurately reflects the grade

For example, if the grade is below a 65, you might print out "You fail!". If it was 100, you might print out "Success!"
