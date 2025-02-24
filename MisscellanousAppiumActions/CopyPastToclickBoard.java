package MisscellanousAppiumActions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class CopyPastToclickBoard extends BaseTest {
	@Test
	public void CopyPast () throws MalformedURLException {
		
		configuration();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.ListView[@resource-id='android:id/list']/android.widget.LinearLayout[2]/android.widget.RelativeLayout"
				)).click();
		//copy to click board -- past it to click board
		
		driver.setClipboardText("Akshay");
		
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.findElement(By.id("android:id/button1")).click();
		
		
		
		
		
	}

}
