package amazonSteps;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/featureFiles/amazon.feature"
		,glue={"amazonSteps"}
		)

public class amazonTestRunner extends AbstractTestNGCucumberTests{

}