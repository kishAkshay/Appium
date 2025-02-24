package Assignments;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class Assignment_6 extends BaseTest {
	
	@Test
	public void TestEntryDialog() throws MalformedURLException {
		
		String userName = "Akshay";
		String Password = "!@#123";
		configuration();
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
		driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys(userName);
		driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys(Password);
		driver.findElement(By.id("android:id/button1")).click();
		
		
		
	}

}
