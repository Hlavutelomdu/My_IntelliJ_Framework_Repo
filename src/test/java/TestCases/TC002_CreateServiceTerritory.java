package TestCases;

import PSM.Base;
import Pages.LoginPage;
import Pages.SalesForceHomePage;
import Pages.ServiceTerritoryPage;
import org.testng.annotations.Test;

public class TC002_CreateServiceTerritory  extends Base {
    @Test
    public void login() throws InterruptedException {
    LoginPage Login = new LoginPage();
    SalesForceHomePage salesForceHomePage = new SalesForceHomePage();
    ServiceTerritoryPage serviceTerritoryPage = new ServiceTerritoryPage();

    Login.enterUserName().enterPassword().clickLoginButton().verify();

    salesForceHomePage.createServiceTerritory();

    serviceTerritoryPage.clickNewBtn().enterName().selectOperatingHours().activeField()
         .EnterCity().EnterState().EnterCountry().EnterPostalZipCode().clickSave().verify();

    }
}
