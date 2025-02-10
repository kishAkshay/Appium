package akshaymandekar;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {

	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File ("//usr//local//lib//node_modules//appium"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		service.start();
		
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("Pixel 8a API 35");
		option.setApp("/Users/akshay.mandekar/eclipse-workspace/Appium/src/test/java/resources/com.aptoide.android.aptoidegames_1.7.0-318_minAPI26(arm64-v8a,armeabi-v7a,x86,x86_64)(nodpi)_apkmirror.com.apk");
		URL url = new URL("http://127.0.0.1:4723");

		AndroidDriver driver = new AndroidDriver(url, option);
		
		service.stop();
	}

}
