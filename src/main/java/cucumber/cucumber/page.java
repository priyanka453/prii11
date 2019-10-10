package cucumber.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page {
 WebDriver driver;
 By username=By.name("userName");
 By password=By.name("password");
 By loginbutton=By.name("login");
 
 public page(WebDriver driver)
 {
	 this.driver=driver;
 }
 
 public void login(String uid,String pass)
 {
	 driver.findElement(username).sendKeys(uid);
	 driver.findElement(password).sendKeys(pass);
	 driver.findElement(loginbutton).click();
 }
}
