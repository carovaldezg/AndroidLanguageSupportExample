# LanguageSupportExample
This is a short example of how to add language support to Android apps. This example has support for English and Spanish.


You can have all the languages you want to in the same app without much effort. 


![alt text](https://github.com/carovaldezg/LanguageSupportExample/blob/master/Captura%20de%20pantalla%202018-09-15%20a%20la(s)%2001.53.19.png)   ![alt text](https://github.com/carovaldezg/LanguageSupportExample/blob/master/Captura%20de%20pantalla%202018-09-15%20a%20la(s)%2001.53.59.png)



In this example I cover only left to right languages.

Step number 1: define your strings as you do usually (or must do!).

Step number 2: for every language you must create new folders inside the values folder, one per every language you want to support.
Every folder name should be: values-b+<language>

For spanish the folder name is: values-b+es

Keep in mind that the string variables must have the same name in every file ;)

Android OS provides the mechanism to match the selected language with the created files. In case you need urls or any other
string that will be repeated, you define strings in the main string.xml file. As it is shown in the example. 

If the language selected in your device does not match any of the languages of your app, the values recognized by default are
the ones in the default strings.xml file.


