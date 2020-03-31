# Mobile Automation basics using Java/Appium

This project demonstrates Mobile Automation using Java and Appium in IntelliJ IDE.
Project is associated with the Blog  # Complete Guide to Android Automation at link - <>

This example will cover:

Basic Test case creation using Java/TestNG framework using Appium Library/Appium Server.

### Getting Started

1. Clone this git repository

	```
	git clone
	```

2. Start Appium Server using Appium Desktop installed in your PC.
   The project expects the Appium Server to run on localhost:4723. If you run the server to different host and port. Please change the code.

3. Download the Eribank application using URL : https://experitest.s3.amazonaws.com/eribank.apk to c:\\  (The code uses the Application from c:\\ (in windows). Please change the code in case you   change the download location)

4. Modify following variables in the code if necessary
   Open EribankTest.java and modify static variables if necessary,
    Appium Server listening host and port
      * public static final String APPIUM_SRV_URL = "http://localhost:4723/wd/hub";
    Path of the Eribank application (in case downloaded location is different)
      * public static final String APP_PATH = "C:\\eribank.apk";
    Device name (After excecuting adb devices. See "Android device recognition" in the blogs)
      * public static final String DEVICE_NAME = "a3ae1c63";
5. Please follow the section "Executing the Test" in the blog.
