package mybdcrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Features99", glue="bdcstepdefinitions", tags= {"@Regression"})
//@CucumberOptions(features="Features99", glue="bdcstepdefinitions", tags= {"@Sanity"})
//@CucumberOptions(features="C:\\Users\\preethi.thyagarajan\\Preethi_Cucumber_Demo1\\Features99\\BDC_Demo_01.feature", glue="bdcstepdefinitions",
        // plugin= {"pretty","html:target/cucumber-html-report",
		//"json:target/SriniDemo-JSON-report"}, tags= {"@Sanity"})
@CucumberOptions(features="C:\\Users\\preethi.thyagarajan\\Preethi_Cucumber_Demo1\\Features99\\BDC_Demo_05.feature", glue="bdcstepdefinitions")
//@CucumberOptions(features="Features99", glue="bdcstepdefinitions", tags= {"@Regression,@Sanity"})
public class BDCrunner {

}
