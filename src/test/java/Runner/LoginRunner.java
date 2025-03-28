package Runner;

import PSM.Base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/Login.feature", glue = "Pages", publish = true)

public class LoginRunner extends Base {
}
