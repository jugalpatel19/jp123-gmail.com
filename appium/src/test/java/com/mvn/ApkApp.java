package com.mvn;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ApkApp extends BestTest {
	
	@Test
	public void app() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Action Bar")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Action Bar Mechanics")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
    	Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Action Bar Tabs")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("ADD NEW TABS")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("REMOVE LAST TABS")).click();
		Thread.sleep(2000);


		driver.findElement(AppiumBy.accessibilityId("TOGGLE TAB MODE")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("REMOVE ALL TABS")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
    	Thread.sleep(2000);
		
    	
    	driver.findElement(AppiumBy.accessibilityId("Action Bar Usage")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(AppiumBy.accessibilityId("Action Provider")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Settings Action Provider")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(AppiumBy.accessibilityId("Share Action Provider")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
    	Thread.sleep(2000);
    	
    	driver.findElement(AppiumBy.accessibilityId("Display Options")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("DISPLAY_HOME_AS_UP")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_HOME")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("DISPLAY_USE_LOGO")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_TITLE")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_CUSTOM")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("NAVIGATION")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("CYCLE CUSTOM VIEW GRAVITY")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
    	Thread.sleep(2000);
		

		


}
}