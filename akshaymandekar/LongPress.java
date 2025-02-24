package akshaymandekar;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest {

	@Test
	public void LongPressGusture() throws MalformedURLException, InterruptedException {

		// TODO Auto-generated method stub
		configuration();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		// there is a web site for appium github gestures
		// https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		LongPressAction(ele);
		String text = driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(text, "Sample menu");
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());

		Thread.sleep(2000);

		tearDown();

	}

}
