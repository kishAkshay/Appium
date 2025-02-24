package akshaymandekar;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LaunchTheApp extends BaseTest {

	@Test
	public void LaunchApp() throws MalformedURLException {
		configuration();
	
		driver.findElement(By.xpath(
				"//android.widget.TextView[@resource-id=\"glance.sample.standalone.xiaomi:id/title\" and @text=\"Highlights\"]"))
				.click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		driver.findElement(By.id("glance.sample.standalone.xiaomi:id/get_started")).click();

		driver.findElement(By.id("glance.sample.standalone.xiaomi:id/text_view_language_continue")).click();
		driver.findElement(By.id("glance.sample.standalone.xiaomi:id/text_view_value_props_continue")).click();
		driver.findElement(By.id("glance.sample.standalone.xiaomi:id/text_view_category_continue")).click();
		driver.findElement(By.xpath(
				"//android.widget.TextView[@resource-id=\"glance.sample.standalone.xiaomi:id/title\" and @text=\"Highlights\"]"))
				.click();
		driver.findElement(By.id("glance.sample.standalone.xiaomi:id/readMore")).click();
		String context = driver.getContext();
		System.out.println(context);	
		
		
		
		
		

	}
}
