package Testing.Mobile;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class validInputsandCheckout  extends BaseClass  {

	@Test
	
	 public void addTocart() throws InterruptedException {

	     driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
	     driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")).click();
		
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.TextView")).click();
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]")).sendKeys("Asad");
		 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]")).sendKeys("Patel");
		 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")).sendKeys("60659");
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]")).click();
		
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()"+".description(\"test-CHECKOUT: OVERVIEW\")).scrollIntoView("
		 		+ "new UiSelector().description(\"test-FINISH\"));")).click();
   }
		 
	@Test 
	public void orderconfirmation() {
		String actualorderconfirmationmsg = driver.findElement(By.xpath("//android.widget.TextView[@text=\"THANK YOU FOR YOU ORDER\"]\n"
		 		+ "")).getText();
		System.out.println(actualorderconfirmationmsg);
		String expectedconfirmationmsg = "THANK YOU FOR YOU ORDER";
		Assert.assertEquals(actualorderconfirmationmsg, expectedconfirmationmsg);
		
   }
}
