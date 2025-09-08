package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

WebDriver driver;
	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("I open the login page")
	public void i_open_the_login_page() {
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList")).click();
	}

	
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		WebElement username = driver.findElement(By.id("ap_email_login"));
		username.sendKeys("anurag.das.crhs@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Anurag@2003");
		
	}
	
	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	@Then("I should be navigated to the home page")
	public void i_should_be_navigated_to_the_home_page() {
		if(driver.findElement(By.id("nav-search-submit-button")).isDisplayed()) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
		}
	}
}
