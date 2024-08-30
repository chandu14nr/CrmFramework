package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pom {

	public class Compaign {
		@FindBy(linkText="Campaigns")
		private WebElement cbtn;
		
		@FindBy(xpath="//input[@value='New Campaign']")
		private WebElement newcbtn;  
		
		@FindBy(name="property(Campaign Name)")
		private WebElement cbnName;
		
		@FindBy(name="property(Start Date)")
		private WebElement startdate;
		
		@FindBy(name="property(Expected Revenue)")
		private WebElement expRe;
		 
		@FindBy(name="property(Actual Cost)")
		private WebElement actC;
		
		@FindBy(name="property(Num sent)")
		private WebElement numS1;
		  
		@FindBy(name="property(Type)")
		private WebElement Property;
		
		@FindBy(name="property(Status)")
		private WebElement PropertyStatus;
		
		@FindBy(name="property(End Date)")
		private WebElement Enddate;
		 
		@FindBy(name="property(Budgeted Cost)")
		private WebElement BugCost;
		 
		@FindBy(name="property(Expected Response)")
		private WebElement ExpReva;
		
		@FindBy(name="property(Description)")
		private WebElement Descri;
		
		@FindBy(xpath="//input[@value='Save & New']")
		private WebElement Save;

	     public Compaign(WebDriver driver)
	     
	     {
	    	PageFactory.initElements(driver, this);
	     }
		public void setcampaign() throws InterruptedException
		{
			cbtn.click();
			newcbtn.click();
			Thread.sleep(1000);
		}
		public void setcampainName() throws InterruptedException
		{
			Thread.sleep(1000);
			cbnName.sendKeys("canon");
			startdate.sendKeys("07/13/2024");
			expRe.sendKeys("12000000");
			actC.sendKeys("1000000");
			numS1.sendKeys("120");
		}
		public void DropDown(String visibleText) throws InterruptedException
		{
			Thread.sleep(1000);
			Select s =new Select(Property);
			 
			s.selectByVisibleText(visibleText);
			
		}
		public void DropDown1(String visibleText2) throws InterruptedException
		{
			Thread.sleep(1000);
			Select s1 =new Select(PropertyStatus);
			s1.selectByVisibleText(visibleText2);
		}
		public void Enddate() throws InterruptedException
		{
			Thread.sleep(1000);
			Enddate.sendKeys("07/20/2024");
			Thread.sleep(1000);
			BugCost.sendKeys("200000");
			ExpReva.sendKeys("150");
			Descri.sendKeys("canon is the high pixel camera in the world");
			Save.click();
		}	
	}
}
