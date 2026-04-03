# Setting Up

Before we can begin learning how to program robots, we first need the tools to program with. The most important tool is our code editor or IDE (integrated development environment), because that's where we write all our code. When learning java you might've used Visual Studio Code or IntelliJ, but for FTC we will be using Android Studio. Why? Android Studio is designed to work with Android apps, which is perfect for our purposes; the control hub (the "computer" on the robot) runs on Android, so we need an IDE that can work with Android apps.

## Android Studio Installation

Download the latest version of [Android Studio](https://developer.android.com/studio/). Install with the default settings through the installation wizard.

After installation, you should reach a home menu with buttons like "Start a new project" and "Import existing project". Do not select anything and go on to the next part of this lesson.

## Git Installation and GitHub Account

To get the code for our robot, we will be using Git, a version control system. Git allows us to keep track of changes to our code and collaborate with others. We will also be using GitHub, a platform for hosting Git repositories.

First create a [GitHub account](https://github.com) if you don't have one already. Then download and install [Git](https://git-scm.com/downloads). If you are having any trouble installing anything ask someone on the team :)

The last step is to link your computer to your GitHub account. This is so that you can save your code to GitHub and collaborate with other teammates. You can do this by following [these](https://docs.github.com/en/authentication/connecting-to-github-with-ssh) instructions.

## Getting the Current FTC Code

Now it's time to get access to some code! First we have to get the FTC Robot Controller app from GitHub. This is the app that runs on the control hub and controls the robot. All teams use basically the same version of this code, and it's available on [GitHub](https://github.com/FIRST-Tech-Challenge/FtcRobotController). To get it, follow these steps:
1. Open up your terminal (if you don't know what is a terminal is, you should watch a basic tutorial).
1. Navigate to the folder where you want to save the code. You can do this with the `cd` command. For example, if you want to save it in your documents, you can do `cd ~/Documents`.
1. Now clone (make a copy on your computer) the FTC Robot Controller app like this: `git clone git@github.com:FIRST-Tech-Challenge/FtcRobotController.git`. Don't close your terminal yet!

The other bit of the code that we want to get from GitHub is our current robot code. This is the part that actually controls *our* robot which shouldn't be confused with the FTC Robot Controller app. That's just a template.
1. Find the current year's GitHub repository from our [team's GitHub](https://github.com/Fission310/)
1. Click the green "Code" button, click on SSH, and copy the link. It should be something like `git@github.com:Fission310/<something>.git`
1. Go back to your terminal and navigate to where the robot code is stored. `cd FtcRobotController/TeamCode/src/main/java/org/firstinspires/ftc/` If you type `ls` you should see a folder called `teamcode`. This is where all the code for our robot will go.
1. Let's first delete the existing code in that folder. You can do this with `rm -rf teamcode/`.
1. The last step is to clone our robot code into that folder. Do this with `git clone <link you copied from GitHub> teamcode`. This will clone the code into the `teamcode` folder.

Now everything is set up!
