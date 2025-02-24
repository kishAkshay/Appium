package Assignments;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class Assignment_5 extends BaseTest {
	@Test
	public void SingleChoiceList() throws MalformedURLException {

		configuration();
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		List<WebElement> options = driver.findElements(By.id("android:id/text1"));

		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if (text.equals("Traffic")) {
				options.get(i).click();
				@Nullable
				String value = options.get(i).getAttribute("checked");

				boolean b = Boolean.parseBoolean(value);
				Assert.assertTrue(b);
				break;
			}
		}
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
	}

}
