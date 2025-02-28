package eCommerceApp;

import java.net.MalformedURLException;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class eCommerce_TC01 extends BaseTest {
	@Test(priority = 1)
	public void FillForm() {

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Akshay.M");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		// scroll the screen till element is displayed
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		/*
		 * To handle the toast message we can't inspect the toast message and we can't
		 * see the attributes also. so for the toast message developer force to user the
		 * tab name called "android.widget.Toast".by using this tag name we can handle
		 * the toast message and we can't get the text of the toast message by using
		 * getText() method there is attribute name developer use the in every toast
		 * message, called "name for that attribute name, attribute value is the toast
		 * text message. we can get the text by using that attribute.
		 * 
		 * String toastMessage =
		 * driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute(
		 * "name"); Assert.assertEquals(toastMessage, "Please enter your name");
		 */

	}
	@Test(priority = 2)
	public void AddProductToCart() {

		driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		List<WebElement> products = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));

		for (int i = 0; i < products.size(); i++) {
			String ProductName = products.get(i).getText();

			if (ProductName.equals("Jordan 6 Rings")) {
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	}

}
