package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageZoho {

	@FindBy(id="userName")
	private WebElement untex;
	
	@FindBy(id="passWord")
	private WebElement pwtex;
	
public  LoginPageZoho(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setLogin(String un,String pwd)
{
	untex.sendKeys("rashmi@dell.com");
	pwtex.sendKeys("123456"+Keys.ENTER);
}
	
}
