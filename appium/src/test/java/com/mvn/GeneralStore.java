package com.mvn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class GeneralStore extends BestTest {
	
	
	@Test
	public void store() throws InterruptedException {
		
     
	
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("jugal");
      Thread.sleep(2000);
		
   	driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
   	Thread.sleep(2000);
		
	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	Thread.sleep(2000);
		
    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"
	+".scrollIntoView(text(\"Bahamas\"));")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())"
    			+".scrollIntoView(text(\"Air Jordan 9 Retro\"));")).click();
    		    	Thread.sleep(2000);
    		    	
    	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
    	Thread.sleep(2000);
    	
    	
    	
    	
    	
		
		
	}

}
