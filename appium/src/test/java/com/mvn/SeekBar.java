package com.mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SeekBar extends BestTest {
	@Test
	public void seek() throws InterruptedException {
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
    	Thread.sleep(2000);
		
    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"
   			+".scrollIntoView(text(\"Seek Bar\"));")).click();
   			Thread.sleep(2000);
   			
   			WebElement slider=driver.findElement(By.id("io.appium.android.apis:id/seek"));

   			
   			new Actions(driver).clickAndHold(slider).moveByOffset(-30,-10).release().perform();
		
		
		
	}

}
