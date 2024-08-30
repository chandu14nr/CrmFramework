package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.it.Date;

public class CreateCampaignZoho {

	@FindBy(name="property(Campaign Name)")
	private WebElement cname;

	@FindBy(name="property(Start Date)")
	private WebElement psdate;

	@FindBy(name="property(Expected Revenue)")
	private WebElement prevenue;

	@FindBy(name="property(Actual Cost)")
	private WebElement pcost;

	@FindBy(name="property(Num sent)")
	private WebElement psent;

	@FindBy(name="property(Type)")
	private WebElement ptype;

	@FindBy(name="property(Status)")
	private WebElement pstatus;

	@FindBy(name="property(End Date)")
	private WebElement pedate;

	@FindBy(name="property(Budgeted Cost)")
	private WebElement pbcost;

	@FindBy(name="property(Expected Response)")
	private WebElement presponse;

	@FindBy(name="property(Description)")
	private WebElement pdesc;

	@FindBy(xpath="//input[@value='Save']")
	private WebElement save;

	public CreateCampaignZoho(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getCname()
	{
		return cname;
	}
	public WebElement getPsdate()
	{
		return psdate;	
	}
	public WebElement getPrevenue()
	{
		return prevenue;
	}
	public WebElement getPcost()
	{
		return pcost;
	}
	public WebElement getPsent()
	{
		return psent;
	}
	public WebElement getPedate()
	{
		return pedate;
	}
	public WebElement getPbcost()
	{
		return pbcost;
	}
	public WebElement getPresponse()
	{
		return presponse;
	}
	public WebElement getPdesc()
	{
		return pdesc;
	}
	public void setSave()
	{
		save.click();
	}
}
