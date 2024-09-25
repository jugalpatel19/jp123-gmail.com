package com.mvn;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongpressAction extends BestTest {
	
	@Test
	
	public void press() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("android:id/text1")).click();
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
	    longPressAction(source);
		Thread.sleep(3000);
		
		 String msg= driver.findElement(By.id("android:id/title")).getText();
		 assertEquals(msg, "Sample menu");
		
	}

}
