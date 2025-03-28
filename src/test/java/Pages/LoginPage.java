package Pages;

import PSM.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginPage extends Base {

    @When("Enter Username")
    public LoginPage enterUserName(){
        getDriver().findElement(By.id("username")).sendKeys("dilip@testleaf.com");
        return this;
    }

    @And("Enter Password")
    public LoginPage enterPassword(){
        getDriver().findElement(By.id("password")).sendKeys("Test@2025");
        return this;
    }

    @And("Click login button")
    public LoginPage clickLoginButton(){
        getDriver().findElement(By.id("Login")).click();
        return  this;
    }

    @Then("verify successful login")
    public void verify() {
        if (getDriver().getTitle().equalsIgnoreCase("Lightning Experience")) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Not Successful");
        }
    }
}
