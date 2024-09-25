package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BestTest {
	public AndroidDriver driver;
	@BeforeTest
	
	public void test() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("jugal");
	options.setApp("D:\\appium\\apk file\\apidemos-debug.apk");
//    options.setApp("D:\\appium\\apk file\\General-Store.apk");
	
	 driver=new AndroidDriver
			(new URL("http://127.0.0.1:4723/"),options);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 Thread.sleep(2000);
	}
	public void dragndrop(WebElement source) {
	 ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 619,
			    "endY", 560
			));
	}
	public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	
	
	
	 @AfterTest
	 public void teardown() throws InterruptedException {
		 
	 Thread.sleep(2000);
	 driver.quit();
	 
}
}



