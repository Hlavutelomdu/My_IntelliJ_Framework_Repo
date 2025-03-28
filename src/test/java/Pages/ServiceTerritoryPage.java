package Pages;

import PSM.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ServiceTerritoryPage extends Base {

    @When("Click New button")
    public ServiceTerritoryPage clickNewBtn(){
        getDriver().findElement(By.xpath("//div[@title='New']")).click();
        return this;
    }

    @And("Enter Name")
    public ServiceTerritoryPage enterName() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@name = 'Name']")).sendKeys("Advocate");
        Thread.sleep(5000);
        return this;
    }

    @And("select operating hours")
    public ServiceTerritoryPage selectOperatingHours() throws InterruptedException {
        WebElement OP = getDriver().findElement(By.xpath("(//input[@type='text'])[3]"));
        OP.click();
        Thread.sleep(3000);
        OP.sendKeys(Keys.ENTER);

        return this;
    }

    @And("click active field")
    public ServiceTerritoryPage clickActive() throws InterruptedException {
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("//input[@name='IsActive']")).click();

        return this;
    }

    public ServiceTerritoryPage activeField() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//input[@part='checkbox']")).click();
        return this;
    }

    @And("Enter City")
    public ServiceTerritoryPage EnterCity() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Pretoria");

        return this;
    }

    @And("Enter State")
    public ServiceTerritoryPage EnterState() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Gauteng");
        Thread.sleep(3000);

        return this;
    }

    @And("Enter Country")
    public ServiceTerritoryPage EnterCountry() throws InterruptedException {
        getDriver().findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("South Africa");

        return this;
    }

    @And("Enter Postal Zip Code")
    public ServiceTerritoryPage EnterPostalZipCode() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("0037");

        return this;
    }

    @And("Click save button")
    public ServiceTerritoryPage clickSave() throws InterruptedException {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

        return this;
    }

    @Then("Verify if the territory is created")
    public ServiceTerritoryPage verify() throws InterruptedException {
        Thread.sleep(5000);

        WebElement ver = getDriver().findElement(By.xpath("(//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small lst-temp-slds-lineHeight uiOutputText'])[1]"));
        if (ver.isDisplayed()){
            System.out.println("Successful creation");
        }else {
            System.out.println("Creation Not Successful");
        }
        return this;
    }

}
