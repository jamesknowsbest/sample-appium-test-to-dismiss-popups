package com.jamesknowsbest.www;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("deviceName", "Pixel XL");
    desiredCapabilities.setCapability("app", "C:\\Users\\james\\Desktop\\aws-device-farm-sample-app-for-android\\app\\build\\outputs\\apk\\app-debug.apk");
    desiredCapabilities.setCapability("platformVersion", "7.1.1");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
	  
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("ReferenceApp");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[8]");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
    if (el3.isDisplayed()){
    	el3.click();
    }else{
    	System.out.println("Permission is not displayed");
    }
    
    
    
//    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("ReferenceApp");
//    el1.click();
//    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[8]");
//    el2.click();
//    MobileElement el3 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_deny_button");
//    el3.click();

    
    
    
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

