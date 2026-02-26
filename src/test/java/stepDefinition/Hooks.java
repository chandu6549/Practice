package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static pages.BasePage.OpenUrl;
import static pages.BasePage.driver;

public class Hooks {
     @Before
    public void setup(Scenario scenario) {
            OpenUrl();

    }
    @After
    public void teardown(){
        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }
}



