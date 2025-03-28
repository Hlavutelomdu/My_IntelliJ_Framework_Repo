package Runner;

import PSM.Base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/serviceTerritory.feature", glue = "Pages", publish = true)

public class ServiceTerRunner extends Base{
}
