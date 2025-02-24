package akshaymandekar;

import java.lang.module.Configuration;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {

	private WebElement element;

	@Test
	public void ScrollDemoTest() throws MalformedURLException {

		configuration();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		WebElement elements = driver.findElement(AppiumBy.accessibilityId("Lists"));

		// scroll the screen till element is displayed
		// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Lists\"));"));

		// scroll the screen by using co-ordinate

		/*
		 * boolean canScrollMore; do {
		 * 
		 * canScrollMore = (Boolean) ((JavascriptExecutor)
		 * driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		 * 
		 * 
		 * "left", 100, "top", 100, "width", 200, "height", 200, "direction", "down",
		 * "percent", 1.0
		 * 
		 * 
		 * ));
		 * 
		 * } while (canScrollMore);
		 */

	}

}
