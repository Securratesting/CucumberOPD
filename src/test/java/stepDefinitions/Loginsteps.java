 package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static driverutils.WebDriverUtils.*;

public class Loginsteps { 
	WebDriver cdriver;
	@Given("User navigated to URL")
	public void user_navigated_to_url() {
		cdriver= getDriver();
	    cdriver.get("https://opd-dev.azurewebsites.net");
	   
	    
	}
	
		
	


	@When("send the request")
	public void send_the_request() {
	   
	}
	@Then("validate the page")
	public void validate_the_page() {
	    
	}
}
