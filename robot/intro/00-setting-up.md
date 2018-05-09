# Setting Up

Before we can begin learning how to program robots, we first need the tools to program with. We will be using Android Studio as our IDE. Why? Android Studio is designed to work with Android apps, which is perfect for our purposes; the code that we write to program our robot resides in an app.

This app is our "Robot Controller" app. It connects to the electronics on the robot to control the robot (you can think of it as the "brain" of the robot). It connects via Wifi Direct to a separate app, the "Driver Station" app, to get input from the joysticks connected to the Driver Station.

## Android Studio Installation

Download the latest version of [Android Studio](https://developer.android.com/studio/). Install with the default settings through the installation wizard.

After installation, you should reach a home menu with buttons like "Start a new project" and "Import existing project". Do not select anything and go on to the next part of this lesson.

## Getting the FTC App

As mentioned above, we need a "Robot Controller" app to control our robot. This app can be found on [GitHub](https://github.com/ftctechnh/ftc_app), and we can download a copy and edit it to write our own code.

Once downloaded, unzip the files if necessary and select the "Open an Existing Android Studio project" option on the Android Studio menu. Find the folder you just downloaded and select it. Android Studio should open the project. On the left sidebar, you can see the structure of the app you just downloaded.

## Android SDK Manager

Before you can upload code to the phones, you will need to make sure you have the versions of Android corresponding to the phones downloaded in Android Studio. Open the Android SDK Manager and install __Android 4.4.2 (API 19)__ and __Android SDK Build-tools (rev: 21.1.2)__, as well as any Android version the phones are using.
