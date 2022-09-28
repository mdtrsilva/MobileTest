package mobileTest.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	
	
	AndroidDriver driver;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("PIXELPHONE");
		options.setApp("//Users//tharindu//git//MobileTest//MobileTest//src//test//java//resources//ApiDemos-debug.apk");
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		driver.close();
	}

}
