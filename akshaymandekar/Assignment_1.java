package akshaymandekar;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Assignment_1 extends BaseTest {
	
	@Test
	public void okCancelDialogWithMessg() throws MalformedURLException {
		
		String expectedmesg = "Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.";
		String exptButText = "OK Cancel dialog with a message";
		configuration();
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		String actulButText = driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).getText();
		Assert.assertEquals(exptButText, actulButText);
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		String actualmesg = driver.findElement(By.id("android:id/alertTitle")).getText();
		driver.findElement(By.id("android:id/button1")).click();
		Assert.assertEquals(expectedmesg, actualmesg);
		}
	

}
