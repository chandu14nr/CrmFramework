package hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	@Before(order=1)
 public void openBrowser()
 {
	 driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.get("http://192.168.175.128:8080/crm/HomePage.do");
 }
	@Before(order=2)
 public void login()
 {
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
 }
	@After(order=2)
 public void logout()
 {
		driver.findElement(By.partialLinkText("Logout")).click();;
 }
	@After(order=1)
 public void closeBrowser()
 {
	 driver.quit();
 }
}
