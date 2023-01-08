package Testing.Mobile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	AppiumDriver driver ;
	
	@BeforeClass
	  public void beforeClass() throws MalformedURLException {
		    DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion", "12.0");
			cap.setCapability("deviceName", "MyDevice");
			cap.setCapability("automationName", "UIAutomator2");
			cap.setCapability("appPackage","com.swaglabsmobileapp");
			cap.setCapability("appActivity","com.swaglabsmobileapp.SplashActivity");
		//   cap.setCapability("app","/Users/asad/Downloads/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

		    driver = new AndroidDriver(url, cap);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
	  driver.quit();
	 
}
}