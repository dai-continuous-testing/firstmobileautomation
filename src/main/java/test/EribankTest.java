package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileCapabilityType;


import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class used to automate Eribank app using Java/Appium.
 *
 *
 */
public class EribankTest {

    private DesiredCapabilities dc = new DesiredCapabilities();
    private AndroidDriver<AndroidElement> driver = null;

    private static final String APPIUM_SRV_URL = "http://localhost:4723/wd/hub";
    private static final String APP_PATH = "C:\\eribank.apk";
    private static final String DEVICE_NAME = "a3ae1c63";

    @BeforeTest
    public void setUp() throws MalformedURLException {

        dc.setCapability(MobileCapabilityType.APP, APP_PATH);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
        dc.setCapability("platformName","Android");
        dc.setCapability("deviceName", DEVICE_NAME);

        driver = new AndroidDriver<>(new URL(APPIUM_SRV_URL), dc);
    }

    @Test
    public void testEribankLogin() {
        By updateOKBy = By.xpath("//*[@text='OK']");
        if (driver.findElements(updateOKBy).size() > 0) {
            driver.findElement(By.xpath("//*[@text='OK']")).click();
        }
        By userElemBy = By.xpath("//*[@text='Username']");
        driver.findElement(userElemBy).sendKeys("company");
        driver.findElement(By.xpath("//*[@text='Password']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@text='Login']")).click();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
