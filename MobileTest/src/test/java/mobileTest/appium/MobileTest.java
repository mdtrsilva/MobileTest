package mobileTest.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class MobileTest extends BaseTest{
	
	
	static void start() {
		getInstance().start();
	}
	
	@Test
	public void setupApp() throws MalformedURLException{
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		
	}
	
	
	
	
	
	public static AppiumDriverLocalService getInstance() {
		
		String appiumJSPath="//usr//local//lib//node_modules//appium//build//lib//main.js";
		String nodePath="//usr//local//bin//node";
		
		AppiumServiceBuilder builder=new AppiumServiceBuilder();
		builder
			.withAppiumJS(new File(appiumJSPath))
			.usingDriverExecutable(new File(nodePath))
			.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
			//.usingAnyFreePort()
			.withIPAddress("127.0.0.1")
			.usingPort(4723)
			.withLogFile(new File("Appiumlog.txt"));
	
		return AppiumDriverLocalService.buildService(builder);
		
	}

}
