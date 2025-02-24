package akshaymandekar;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class BaseTest {

	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	public void configuration() throws MalformedURLException {

		service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		//service.start();

		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Pixel 8a API 35");
		option.setApp("/Users/akshay.mandekar/eclipse-workspace/Appium/src/test/java/resources/ApiDemos-debug.apk");
		URL url = new URL("http://127.0.0.1:4723");
		driver =new AndroidDriver(url, option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	public void LongPressAction(WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public void swipeAction(WebElement element, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				(((RemoteWebElement) element).getId()), "direction", direction, "percent", 0.25));
	}

	public void DragDropActions(WebElement ele, int x, int y) {

		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "endX", x, "endY", y));
	}

	public void tearDown() {
		driver.quit();
		service.stop();
	}

}
