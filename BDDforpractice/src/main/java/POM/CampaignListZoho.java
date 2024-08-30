package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignListZoho {

	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newcamp;
	
public CampaignListZoho(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setNewCampaignZoho()
{
	newcamp.click();
}
}