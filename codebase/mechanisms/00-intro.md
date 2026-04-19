# Mechanisms

Let's go over what a mechanism is, and then we can make our first one!

## What is a Mechanism?

A mechanism is some part of the robot that has a specific function. One of the simplest examples of a mechanism is a claw. You might have a claw on the robot to grab game pieces, and in the code, you would have a `Claw` class that contains code to make the claw move.

All mechanisms go in the `hardware/mechanisms` folder in `teamcode`. This helps us keep organized so we can find our mechanisms easily. Let's continue with the claw example. Create a new file called `Claw.java` in the `hardware/mechanisms` folder. If any of the folders don't exist, make them. And if `Claw.java` already exists, delete it and make a new one. In Android Studio you make a file by right-clicking on the folder you want to put it in, then going to `New > File`, or `New > Directory` if you want to make a new folder.

## Claw Code

Copy and paste the following code into `Claw.java`:

```java
package org.firstinspires.ftc.teamcode.hardware.mechanisms;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.stuyfission.fissionlib.input.GamepadStatic;
import com.stuyfission.fissionlib.input.GamepadStatic.Input;
import com.stuyfission.fissionlib.util.Mechanism;

@Config
public class Claw extends Mechanism {

    private Servo servo;

    public static double OPEN_POS = 0.7;
    public static double CLOSE_POS = 0.5;

    public Claw(LinearOpMode opMode) {
        this.opMode = opMode;
    }

    @Override
    public void init(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "clawServo");

        open();
    }

    public void open() {
        servo.setPosition(OPEN_POS);
    }

    public void close() {
        servo.setPosition(CLOSE_POS);
    }

    @Override
    public void loop(Gamepad gamepad) {
        if (GamepadStatic.isButtonPressed(gamepad, Input.A)) { // Cross on PS4 controller
            open();
        } else if (GamepadStatic.isButtonPressed(gamepad, Input.X)) { // Square on PS4 controller
            close();
        }
    }
}
```

Let's go over the code line by line.

```java
package org.firstinspires.ftc.teamcode.hardware.mechanisms;
```
This line is something all our java files will need. It just lets java know where this file is. If it doesn't match the path of the file, you will get an error. It will always start with `org.firstinspires.ftc.teamcode`. In our case the rest of the path is `hardware.mechanisms` because the file is in the `hardware/mechanisms` folder.

The next few lines are import statements. They look like `import some.package.name.Class;`. They are used to get code from other files. The "package name" is whatever package the file you want to get code from is in, and the "Class" is whatever class you want from that file. If we wanted to use our `Claw` class in another file, we would need to import it with `import org.firstinspires.ftc.teamcode.hardware.mechanisms.Claw;`. Note how that is the same thing as the package name at the top of `Claw.java`, but with `.Claw` at the end.

```java
@Config
public class Claw extends Mechanism {
```

This is where we start the actual code for our claw. We are making a class called `Claw`, and it extends `Mechanism`. All our mechanisms will extend the `Mechanism` class. This gives us the `init` and `loop` functions (which we will take a look at soon). The other part of this code is `@Config`. We will see why this is important later when we get to FTC Dashboard, but for now know that you need to have `@Config` above the mechanism classes.

```java
    private Servo servo;

    public static double OPEN_POS = 0.7;
    public static double CLOSE_POS = 0.5;
```

Here are our variables that we will use in the claw class. The first one is a `Servo` that we call `servo` (`Servo` is the type, and `servo` is the name). `Servo` is a class from the base java library that all FTC teams use. We imported `Servo` at the top of the file. We use this variable to control the imaginary servo that moves our imaginary claw. If we had two servos controlling our claw, we would need two `Servo` variables. The next two variables are `OPEN_POS` and `CLOSE_POS`. These are the positions that the servo needs to be in to open and close the claw. For servos, the positions will always be `double`s between 0 and 1. The values of these variables will depend on how your claw is built, so you will need to change them to get your claw working. I picked 0.7 and 0.5 because I felt like it :) When you make your own mechanism, you should start with a guess, and then change the values until it works. These variables are `public` and `static` because we want to be able to change them from FTC Dashboard (again, we will get to that later). Just know that you should make all your position constants `public static`.

```java
    public Claw(LinearOpMode opMode) {
        this.opMode = opMode;
    }
```

This is the constructor for our `Claw` class. `Mechanism` constructors always need to take in a `LinearOpMode` and set `this.opMode`. The `opMode` is the TeleOp or Auto that is running the mechanism. You will understand OpModes better when we get to them, but for now just know that you need to have this constructor in all your mechanisms. If you want to add more parameters to the constructor, you can. Let's say if you had a mechanism that needs to know if it's on the red or blue alliance, you could add a parameter for that.

```java
    @Override
    public void init(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "clawServo");

        open();
    }
```

The `init` function is one of the two functions that we will be using from the `Mechanism` class. That's what the `@Override` means (the function came from the `Mechanism` class, and we are overriding it with our own code). The `init` function is where you put all the code that needs to run when you click the INIT button on the robot phone. This means stuff that we want to run once at the beginning of an op mode. In this case, we need to initialize our `servo` variable. To do that, we need to use the `HardwareMap`, which is basically a class that contains all the mappings from hardware names to where the hardware is plugged in to the Control Hub. You will learn how to set up the hardware map later. To get our servo from the hardware map, we use `hwMap.get(Servo.class, "clawServo")`. The first part, `Servo.class`, is just saying that we want to get a `Servo`. The second part, `"clawServo"`, is the name of the servo in the hardware map. For now you can put whatever you want here, but it's a good idea to make it descriptive enough so that you know what it is. It's also good convention to keep it camelCase (the same way you name variables). The last part of the `init` function is `open()`. This calls the `open` function which we will look at next. This just means that when we click INIT, the claw will start in the open position.

```java
    public void open() {
        servo.setPosition(OPEN_POS);
    }

    public void close() {
        servo.setPosition(CLOSE_POS);
    }
```

Now we get to the `open` (and `close`) functions. These are the functions that the rest of our code will use in order to actually open and close the claw. And they are very simple; opening the claw just means moving the servo to the `OPEN_POS` position, and closing the claw just means moving the servo to the `CLOSE_POS` position. To do that we just use the `setPosition` function from the `Servo` class.

```java
    @Override
    public void loop(Gamepad gamepad) {
        if (GamepadStatic.isButtonPressed(gamepad, Input.A)) { // Cross on PS4 controller
            open();
        } else if (GamepadStatic.isButtonPressed(gamepad, Input.X)) { // Square on PS4 controller
            close();
        }
    }
}
```

Lastly, we have the `loop` function. This is the second function that we get from the `Mechanism` class. The `loop` function runs continuously while the op mode is running. This is where you put code that needs to run over and over again. In the case of our claw, we want to be able to open and close it using buttons on the controller (it's called a gamepad in code). The code is pretty simple; we check if the `A` button (on an Xbox controller) is pressed, and if it is we call the `open` function. If `X` is pressed, we close the claw instead with `close()`. The `GamepadStatic.isButtonPressed` function just tells us if a certain button is pressed on the gamepad. The first parameter is the gamepad you want to check, and the second is the button. It will return `true` if the button is currently being held down on the controller.
