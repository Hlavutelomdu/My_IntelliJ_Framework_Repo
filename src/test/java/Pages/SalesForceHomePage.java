package Pages;

import PSM.Base;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SalesForceHomePage extends Base {
    @When("Navigate to Service territory")
    public SalesForceHomePage createServiceTerritory() throws InterruptedException {
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("//div[@class= 'slds-icon-waffle']")).click();

        Thread.sleep(5000);
        getDriver().findElement(By.xpath("//button[normalize-space()='View All']")).click();

        Thread.sleep(5000);
        WebElement Search = getDriver().findElement(By.xpath("//div[@type='search']"));
        Search.sendKeys("Service Territories");

        Thread.sleep(5000);
        WebElement SerTer = getDriver().findElement(By.xpath("//mark[contains(text(),'Service Territories')]"));
        SerTer.click();
        Thread.sleep(5000);

        return this;
    }
}
