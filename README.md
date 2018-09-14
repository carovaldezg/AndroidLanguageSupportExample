# LanguageSupportExample
This is a short example of how to add language support to your Android apps. In this example, you can see the code to support  English and Spanish in a small Nightwish content app.


![alt text](https://github.com/carovaldezg/LanguageSupportExample/blob/master/Captura%20de%20pantalla%202018-09-15%20a%20la(s)%2001.53.19.png)   ![alt text](https://github.com/carovaldezg/LanguageSupportExample/blob/master/Captura%20de%20pantalla%202018-09-15%20a%20la(s)%2001.53.59.png)

You can have all the languages you want to in the same app without much effort but there are specific steps for right to left languages (like arabic). For the purposes of this example, I used only left to right languages. The reason is simple: right to left need a new layout. 

### Step number 1: define your strings as you do usually (or must do!).

### Step number 2: for every language you must create new folders inside the values folder, one per every language you want to support.

Every folder name should be: values-b+language code

For spanish the folder name is: values-b+es

### Step number 3: create a file string.xml inside the folders you created.

Keep in mind that the string variables must have the same name in every file ;)

Android OS provides the mechanism to match the selected language with the created files. In case you need urls or any other
string that will be repeated, you define strings in the main string.xml file. As it is shown in the example. 

If the language selected in your device does not match any of the languages of your app, the values recognized by default are
the ones in the default strings.xml file.

For more information, you can visit the android developer website https://developer.android.com/training/basics/supporting-devices/languages

