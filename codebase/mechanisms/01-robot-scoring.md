# Robot.java and Scoring.java

In this section we will learn about the other two files in the `hardware` directory: `Robot.java` and `Scoring.java`.

## Scoring.java

One of the two files in the `hardware` directory is `Scoring.java`. This file is used to contain all the logic for scoring points. It is specifically used to coordinate the mechanisms that are used to score points. For example many games require the robot to have vertical movement. Often a mechanism that is used are vertical slides. So we might have a mechanism called `Slides.java` that contains logic for moving the slides up and down. This could be used alongside our `Claw.java` mechanism to both pick up and score game elements.

Here's an example of how we might use the `Slides` and `Claw` mechanisms in our `Scoring.java` file:

```java
package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.stuyfission.fissionlib.input.GamepadStatic;
import com.stuyfission.fissionlib.input.GamepadStatic.Input;
import com.stuyfission.fissionlib.util.Mechanism;
import org.firstinspires.ftc.teamcode.hardware.mechanisms.Claw;
import org.firstinspires.ftc.teamcode.hardware.mechanisms.Slides;

public class Scoring extends Mechanism {

    private Claw claw = new Claw(opMode);
    private Slides slides = new Slides(opMode);

    private enum State {
        INTAKING,
        SCORING,
    }

    private State state = State.INTAKING;

    public Scoring(LinearOpMode opMode) {
        this.opMode = opMode;
    }

    @Override
    public void init(HardwareMap hwMap) {
        claw.init(hwMap);
        slides.init(hwMap);
    }

    @Override
    public void loop(Gamepad gamepad) {
        switch (state) {
            case INTAKING:
                // user controls the claw
                claw.loop(gamepad);

                // when a game element is grabbed, we want to move the slides up to get ready to score
                if (GamepadStatic.isButtonPressed(gamepad, Input.Y)) { // Triangle on PS4 controller
                    slides.up();
                    state = State.SCORING;
                }
                break;
            case SCORING:
                // release the game element and move the slides down to get ready to intake another game element
                if (GamepadStatic.isButtonPressed(gamepad, Input.A)) { // X on PS4 controller
                    claw.open();
                    slides.down();
                    state = State.INTAKING;
                }
                break;
        }
    }
}
```

Note how similar this is to our `Claw.java` example. `Scoring` is also a `Mechanism` so that we can have the same `init` and `loop` methods. Our scoring sequence is made up of a claw and slides, so those will be variables in our class. The constructor is the same, and in the init method we just call the init methods for the claw and slides. The main difference is that we now have a state variable that keeps track of whether we are intaking a game element or scoring it. The state variable is an [enum](https://www.w3schools.com/java/java_enums.asp) that can be either `INTAKING` or `SCORING`. In `loop`, we check the state variable to see if we want to run the logic for intaking or scoring. This setup with `state` is a versatile way to have different logic for different parts of the game. This way you can also use a single button for different actions.

## Robot.java

The other file in the `hardware` directory is `Robot.java`. This file is used to contain all the logic for the robot as a whole.

Here's an example `Robot.java` file that uses our `Scoring` mechanism and a `Drivetrain` mechanism (which we will create later):

```java
package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.stuyfission.fissionlib.util.Mechanism;
import org.firstinspires.ftc.teamcode.hardware.Scoring;
import org.firstinspires.ftc.teamcode.hardware.mechanisms.Drivetrain;

public class Robot extends Mechanism {

    private Drivetrain drivetrain = new Drivetrain(opMode);
    private Scoring scoring = new Scoring(opMode);

    public Robot(LinearOpMode opMode) {
        this.opMode = opMode;
    }

    @Override
    public void init(HardwareMap hwMap) {
        drivetrain.init(hwMap);
        scoring.init(hwMap);
    }

    @Override
    public void loop(Gamepad gamepad) {
        drivetrain.loop(gamepad);
        scoring.loop(gamepad);
    }
}
```

This `Robot` class is fairly simple. It just glues together the `Scoring` mechanism and the rest of the non-scoring mechanisms (in this case just the `Drivetrain`). In `init`, we call the init methods for both the drivetrain and scoring. In `loop`, we call the loop methods for both the drivetrain and scoring.
