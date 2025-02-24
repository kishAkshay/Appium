package MisscellanousAppiumActions;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import akshaymandekar.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class HandlingMobileNaigationAndKeyBoardButton extends BaseTest {
	@Test
	public void MobileNaigationAndKeyBoardButton() throws MalformedURLException, InterruptedException {
		//if we want to perform mobile navigation buttons and key board button like back,home there is a class called KeyEvent 
		configuration();
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("Akshay Wifi");
		//after entering the text in text box performing the keyboard enter button so cursor come to next line
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("android:id/edit")).sendKeys("krishna");
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		//performing the device back button 
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElement(AppiumBy.accessibilityId("4. Default values")).click();
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
		
		
		
		
		
		
		
	}

	
	

}
