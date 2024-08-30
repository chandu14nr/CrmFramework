package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCampaign {
WebDriver driver=hooks.BaseClass.driver;
	@Given("User should be present on CRM home page")
	public void user_should_be_present_on_crm_home_page() {
		System.out.println(driver.getTitle());
	}

	@When("He clicks on campaign module")
	public void he_clicks_on_campaign_module() {
		driver.findElement(By.linkText("Campaigns")).click();
	}

	@Then("Campaign page should be displayed")
	public void campaign_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	}

	@And("he clicks on new Campaign button")
	public void he_clicks_on_new_campaign_button() {
		driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
	}

	@Then("Create campaign should be displayed")
	public void create_campaign_should_be_displayed() {
		System.out.println(driver.getTitle());
	}

	@And("he enters campaign name")
	public void he_enters_campaign_name() {
		driver.findElement(By.name("property(Campaign Name)")).sendKeys("thor car");
	}

	@And("He enters the start date as {string}")
	public void he_enters_the_start_date_as(String string) {
		driver.findElement(By.name("property(Start Date)")).sendKeys("07/07/2024");
	}

	@Then("He enters expected revenue as {string},{string} as actual cost")
	public void he_enters_expected_revenue_as_as_actual_cost(String string, String string2) {
		driver.findElement(By.name("property(Expected Revenue)")).sendKeys("3600000");
		driver.findElement(By.name("property(Actual Cost)")).sendKeys("3000000");
	}

	@And("He entrs num sent")
	public void he_entrs_num_sent() {
		driver.findElement(By.name("property(Num sent)")).sendKeys("20");
	}

	@And("Selects type,status Dropdown")
	public void selects_type_status_dropdown() {
		WebElement items = driver.findElement(By.name("property(Type)"));
		Select s=new Select(items);
		s.selectByVisibleText("Advertisement");
		WebElement status= driver.findElement(By.name("property(Status)"));
		Select s1=new Select(status);
		s1.selectByVisibleText("Active");
	}

	@Then("He enters the end date as {string}")
	public void he_enters_the_end_date_as(String string) {
		driver.findElement(By.name("property(End Date)")).sendKeys("07/15/2024");
	}

	@And("He enters budgeted cost as {string},expected revenue as {string}")
	public void he_enters_budgeted_cost_as_expected_revenue_as(String string, String string2) {
		driver.findElement(By.name("property(Budgeted Cost)")).sendKeys("1000000");
		driver.findElement(By.name("property(Expected Response)")).sendKeys("100");
	}

	@When("He enters the description as {string}")
	public void he_enters_the_description_as(String string) {
		driver.findElement(By.name("property(Description)")).sendKeys("thor is a excelent car");
	}

	@And("He clicks on save button")
	public void he_clicks_on_save_button() {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

	@Then("Created campaign should be displayed")
	public void created_campaign_should_be_displayed() {
		System.out.println(driver.getTitle());
	}
}
