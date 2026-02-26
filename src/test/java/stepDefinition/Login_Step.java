package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static pages.BasePage.driver;

public class Login_Step {
    @Given("user on loginpage {string} and {string}")
    public void user_on_loginpage_and(String username, String password) {
        LoginPage lp = new LoginPage(driver);
        lp.loginfunction(username,password);
    }
    @When("user search a laptop")
    public void user_search_a_laptop() {
      System.out.println("chandu");
    }
    @Then("user select the laptop and add to cart")
    public void user_select_the_laptop_and_add_to_cart() {
        System.out.println("chandu");
    }

}
