package Assignments;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class Assignment_2 extends BaseTest{
	
	@Test
	public void okCancelDialogWithLongMessg() throws MalformedURLException {
		String exptButText = "OK Cancel dialog with a long message";
		String exptDialogTitle = "Header title";
		
		configuration();
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		 String actulButtText = driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).getText();
		Assert.assertEquals(exptButText, actulButtText);
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
	
		String actulDialogTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(exptDialogTitle, actulDialogTitle);
		driver.findElement(By.id("android:id/button2")).click();
		
	}

}
