package Assignments;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class Assignment_3 extends BaseTest {
	
	@Test
	public void okCancelDialogWithUltraLongMess() throws MalformedURLException{
		String expetButtText = "OK Cancel dialog with ultra long message";
		String expectBullText1 = "Something";
		
		configuration();
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		String actualButtText = driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).getText();
		Assert.assertEquals(expetButtText, actualButtText);
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
		String actualButtText1 = driver.findElement(By.id("android:id/button3")).getText();
		Assert.assertEquals(expectBullText1, actualButtText1);
		driver.findElement(By.id("android:id/button3")).click();
		
		
		
		
	}
}
