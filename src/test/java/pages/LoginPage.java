package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//a[contains(text(),'Login')]")
    private WebElement loginicon;

    @FindBy(xpath="//input[@name ='email']")
    private WebElement emailenter;

    @FindBy(xpath="//input[@name ='password']")
    private WebElement enterpassword;

    @FindBy(xpath="//button[@class='button submit-action']")
    private WebElement clicklogin;

    public void clickloginicon(){
        loginicon.click();
    }

    public void enteremailbox(String username){
        emailenter.sendKeys(username);
    }

    public void enterpasswordbox(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(enterpassword)).click();
        enterpassword.sendKeys(password);
    }

    public void clickloginbtn(){

        clicklogin.click();
    }

    public void loginfunction(String username,String password){
        clickloginicon();
        enteremailbox(username);
        enterpasswordbox(password);
        clickloginbtn();
    }
}
