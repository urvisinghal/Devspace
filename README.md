# Devspace
App for Charge Up
# Egg &mdash; the Applicasa Sample App for 	Android

This is a sample app provided to show developers what Applicasa looks like in action, and help them see a real example of integrating Applicasa into their applications.

## About Applicasa

Applicasa is a Mobile Game Management Platform that provides developers a series of frameworks and a custom SDK for iOS and Android platforms that provide extensive support for In-App Purchases, Promotions, Analytics, and a customizable backend datastore. You can find out more information at [the Applicasa website](http://applicasa.com).

## About Egg

Egg is an imagined game that shows common scenarios and code samples that developers can learn from and emulate in their own applications.

### What New (24.10.2013):
1. Custom events for monetization.
2. More Ad networks to the monetization section.
3. Send delayed push messages
4. Bug Fix
 
## Raise Custom events:
```
Sample app Introduces the variety of Ad networks, All you need to do is:

A. Go to MainActivity.

B. Set the value of the parameter "customEvent" from the list stated in the activity.

C. Build & Run, and press on the "Raise Promotions" button
```

### What New:
1. Implementation of Android's New In app Billing (ver 3)

### What You Will Find in Egg:
1. Integrating the Applicasa SDK and frameworks for Android
2. Implementing Applicasa's extensive In-App Purchasing support
  * Virtual Currency support &mdash; whereby users use IAP to purchase in-game currency
  * Virtual Goods support &mdash; whereby users use in-game currency to buy virtual items
  * User Inventory &mdash; whereby users can see the virtual items they've purchased
3. Implementing User handling via Applicasa's SDK and Facebook
  * Register new users
  * Login/Logout via Applicasa
  * Login/Logout via Facebook
4. Implementing Promotion handling via Applicasa's Promotion framework
  * Easy-to-use promotions that are triggered by events that happen inside your game
5. Implementing Push Messages 
  * Send user to users push message

## Getting Started

### Clone the Repository

As usual, you get started by cloning the project to your local machine:

```
$ git://github.com/Applicasa/Sample-App---Android.git
```

## Prerequisites
1. Add the facebook library to your worksapce 
```
https://developers.facebook.com/docs/android/
```


### Open and Run Project in eclipse

Now that you have cloned the repo:

1. open the project up in Eclipse.

2. Go to the project and link it with the Facebook library

3. Import the SupersonicAds to your workspace. 
**NOTE:** Not needed, SupersonicAds jar was added directly to the libs folder for you convenience. 

  A. File -> Import -> "Existing Projects into your workspace"
  
  B. Go to the path where you cloned the Repo: (repoFolder)\AdNetwork\SSA_production-sdk
  
  C. Link "AppVille" with the SupersonicAds SDK
	

4. Click on the project name "AppVilleEgg" -> "Android Tools" -> "Add Support library"

At this point, you *should* be able to build and run the project in the Android device or emulator.

if you are facing issues see the Help section "Having Trouble?"


### Making Test IAP Purchases

Because this is a sandboxed app, we have added Android's static In app product item. (The only item with an avatar image)

**NOTE:** You can also **download** the App from [Google Play](https://play.google.com/store/apps/details?id=com.appvilleegg)

## Android Version Targeting

Egg is currently built to work with Android API 15(Ice Cream Sandwich). **However**, Egg's minimum SDK support is 10(Gingerbread).

## Other Remarks
... (58 lines left)
