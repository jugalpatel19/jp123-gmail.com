package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BestTest {
	public AndroidDriver driver;
	@BeforeTest
	
	public void test() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("jugal");
//	options.setApp("D:\\appium\\apk file\\apidemos-debug.apk");
    options.setApp("D:\\appium\\apk file\\General-Store.apk");
	 driver=new AndroidDriver
			(new URL("http://127.0.0.1:4723/"),options);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 Thread.sleep(2000);
	}
	 @AfterTest
	 public void teardown() throws InterruptedException {
		 
	 Thread.sleep(2000);
	 driver.quit();
	 
}
}



