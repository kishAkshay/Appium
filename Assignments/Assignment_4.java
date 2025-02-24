package Assignments;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class Assignment_4 extends BaseTest {

	@Test
	public void ListDialog() throws MalformedURLException {
		
		String[] expectList = {"Command one","Command two","Command three","Command four"};
		configuration();
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		List<WebElement> actualList = driver.findElements(By.id("android:id/text1"));
		List expectArrayList = Arrays.asList(expectList);
		
		for (int i = 0; i < actualList.size(); i++) {
			String text = actualList.get(i).getText();
			System.out.println(text);
			
			if (expectArrayList.contains(text)) {
				Assert.assertTrue(true);
			}else {
				Assert.assertFalse(false);
			}
			
		}
	}
}
