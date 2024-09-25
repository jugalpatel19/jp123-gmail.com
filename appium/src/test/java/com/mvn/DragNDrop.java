package com.mvn;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;


public class DragNDrop extends BestTest{
	
	@Test

	public void drag() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	    Thread.sleep(3000);
	    
	   dragndrop(source);
			   
			   String msg= driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
			   
			   assertEquals(msg,"Dropped!");
			   
		}
	
}
