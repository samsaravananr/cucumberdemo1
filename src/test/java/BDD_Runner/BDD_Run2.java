package BDD_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/BDD_Feature",
                      glue="BDD_Step",
                      tags = "@Release3 or @Release1")
public class BDD_Run2 
{
	
	

}
