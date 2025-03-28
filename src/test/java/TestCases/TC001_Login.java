package TestCases;

import PSM.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC001_Login extends Base {
    @Test
    public void login(){
        LoginPage Login = new LoginPage();
        Login.enterUserName().enterPassword().clickLoginButton().verify();
    }
}
