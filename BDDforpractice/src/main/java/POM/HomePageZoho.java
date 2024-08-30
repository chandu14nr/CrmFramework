package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageZoho{

	@FindBy(linkText="Campaigns")
	private WebElement camp;

	@FindBy(partialLinkText="Logout")
	private WebElement logout;

	public HomePageZoho(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setLogout()
	{
		logout.click();
	}
	public void setClick()
	{
		camp.click();
	}
}

