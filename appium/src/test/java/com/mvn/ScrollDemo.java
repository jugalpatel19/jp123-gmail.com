package com.mvn;

import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BestTest {
	@Test
	public void scroll() throws InterruptedException {
		
//		driver.findElement(AppiumBy.accessibilityId("Views")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"
//		+".scrollIntoView(text(\"WebView\"));")).click();
//		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Bouncing Balls")).click();
		Thread.sleep(2000);
	}

}
