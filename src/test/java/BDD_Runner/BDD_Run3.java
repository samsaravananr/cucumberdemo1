package BDD_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/BDD_Feature",
                      glue="BDD_Step",
                      tags = "@Release2",
                      dryRun = true,
                      plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})
public class BDD_Run3 
{
	
	

}
