package MisscellanousAppiumActions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;

public class LandScapeMode extends BaseTest {

	@Test
	public void RotateScreen () throws MalformedURLException {
		
		configuration();
		
		
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		DeviceRotation landScape = new DeviceRotation(0, 0, 90);
		driver.rotate(landScape);
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.ListView[@resource-id='android:id/list']/android.widget.LinearLayout[2]/android.widget.RelativeLayout"
)).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("Akshay");
		driver.findElement(By.id("android:id/button1")).click();
		DeviceRotation potarate = new DeviceRotation(0, 0, 0);
		driver.rotate(potarate);
		
		
	}

}
