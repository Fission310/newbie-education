# Code Overview

Now it's time to take a look at the code!

## How to Get to Teamcode

On the left side of Android Studio you should see a bunch of folders. Navigate to `TeamCode > src > main > java > org > firstinspires > ftc > teamcode` (I know thats a lot of folders, but that's how all android projects are). This is where all the code for the robot goes. We call this folder `teamcode`. Like I said earlier, everything else is general code that gets everything running, but doesn't tell the robot what to do. That's what `teamcode` is for.

Inside `teamcode` you should see folders like `hardware`, and `opmode`. One important thing to note is the difference between `TeamCode` and `teamcode`. `TeamCode` is one of the base folders that came with the FTC Robot Controller, and `teamcode` is the name of the folder where all the robot code goes. If you see `lib` and `src`, but not `hardware` and `opmode`, then you are in `TeamCode` and not `teamcode`. Make sure you are in the right folder!

## Hardware

Since I've mentioned the `hardware` and `opmode` folders a few times, let's take a look at them. Open up the `hardware` folder. Inside you should see a bunch of java files. There is one file per mechanism on the robot. For example, all FTC robots have a drive train, so there is a `Drivetrain.java` file. If the robot has a claw, there will be a `Claw.java` file. Each of these files contains code that tells the robot how to use that mechanism. For example, the `Drivetrain.java` file contains code that tells the robot how to move forward, backward, turn, etc.

## OpModes

Now open up the `opmode` folder. This is where we are going to use the `hardware` files! Inside you should see `auton` and `teleop` folders. An Op Mode is short for Operational Mode. In FTC, there are two types of Op Modes: Autonomous and TeleOp (Teleoperation). Autonomous (auton or auto for short) is when the robot moves by itself for the first 30 seconds of the match. TeleOp is everything after that, where the driver(s) control the robot. So, we put all out auton code in `auton`, and teleop code in `teleop`. Usually we will just have one teleop, but sometimes we will want different autons depending on where we choose to start the robot in a match. If there are a bunch of autons, it might be a good idea to put them in seperate folders inside `auton` based on what side of the field or what starting color they are for.

Inside each of the autons, we get to use the hardware classes. For example, in our main teleop, we might want the claw to close when the driver presses X. In that case we can use the `close` method from `Claw.java` to close the claw!

## RoadRunner

The last few folders are used for [RoadRunner](https://learnroadrunner.com/introduction.html). We will get into more about RoadRunner later, but it's essentially a library (bunch of code that some smart people wrote to make our lives easier) that helps us move our drive train in a precise way. `util` contains a bunch of code that RoadRunner needs to work, and `trajectorysequence` contains the code that we will use to make the robot follow a path.

We won't be changing the code in `util` and `trajectorysequence`, but we will change the code in the other folder that RoadRunner uses: `drive`. Inside `drive` there are a few files that we use to tell RoadRunner how our drive train works. Different robots have different sized drive trains, so we need to tell RoadRunner how our drive train is set up so it knows how to move it. Then there is also the `opmode` folder inside `drive`. As you might've guessed, `opmode` contains opmodes! These are mostly used to test our drive train, and some will be used to get the values we need to put in the other files in `drive`. We won't need to change these opmodes, but it's good to know where they are and what they do.
