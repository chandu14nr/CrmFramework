package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeLogin {
WebDriver driver;
	@Given("User Should be present in actitime login page")
	public void user_should_be_present_in_actitime_login_page() {
	    driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://online.actitime.com/asandeep");
	}

	@When("He enters username")
	public void he_enters_username() {
		driver.findElement(By.id("username")).sendKeys("admin");
	   
	}

	@And("he enters password")
	public void he_enters_password() {
		driver.findElement(By.name("pwd")).sendKeys("manager");
	   
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']"+Keys.ENTER));
	   	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println(driver.getTitle());
	    
	}
}
