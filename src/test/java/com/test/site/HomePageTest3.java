package com.test.site;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.appium.manager.BaseTest;


public class HomePageTest3 extends BaseTest{


	@Test
	public void testMethodOne_3() {
		
		System.out.println("ThreadName: " + Thread.currentThread().getName() + Thread.currentThread().getStackTrace()[1].getClassName());
		waitForElement(By.id("com.android2.calculator3:id/cling_dismiss"), 30);
		driver.findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		driver.findElement(By.id("com.android2.calculator3:id/digit42")).click();
		driver.findElement(By.id("com.android2.calculator3:id/minus")).click();
		driver.findElement(By.id("com.android2.calculator3:id/digit9")).click();
		driver.findElement(By.id("com.android2.calculator3:id/equal")).click();
		//driver.close();
	}
}