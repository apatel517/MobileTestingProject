package Testing.Mobile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingWithInvalidInput extends BaseClass {

	
	
	
	@Test
    public void invalidusernameinput() {
	  driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys("invalidusername");
	  driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
	  String actualerrorText = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")).getText();
	  String expectederrorTest = "Username and password do not match any user in this service.";
	  System.out.println("Actual Error Text -" + actualerrorText);
	  Assert.assertEquals(actualerrorText, expectederrorTest);
}
 @Test
	 public void invalidpasswordinput() {
	 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys("standard_user");
	 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys("invalidpassword");
	 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
	 String actualerrorText = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")).getText();
	 String expectederrorTest = "Username and password do not match any user in this service.";
	 System.out.println("Actual Error Text -" + actualerrorText);
	 Assert.assertEquals(actualerrorText, expectederrorTest);
}

 @Test
	 public void invaliusernamepasswordinput() {
	 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")).sendKeys("invalidusername");
	 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")).sendKeys("invalidpassword");
	 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
	 String actualerrorText = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")).getText();
	 String expectederrorTest = "Username and password do not match any user in this service.";
	 System.out.println("Actual Error Text -" + actualerrorText);
	 Assert.assertEquals(actualerrorText, expectederrorTest);
}
 
 
}
