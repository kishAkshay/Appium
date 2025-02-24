package akshaymandekar;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest {

	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException, InterruptedException {

		// there are some locators in appium like Xpath, id, accessibilityid, className,
		// androidUIAutomator
		configuration();
		//locate the element by accessibilityId
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		//locate the element by xpath //tab[@AN='AV']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		//locate the element by id 
		driver.findElement(By.id("android:id/checkbox")).click();
		//if there is no attribute to locate the element use xpath by tab name (//tab)
		//if you found multiple elements use group by index (//tab)[2]
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		//how to get the text from the popup
		String text = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(text, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Akshay Wifi");
		driver.findElement(By.id("android:id/button1")).click();
		
	
		
		
		

	}

}
