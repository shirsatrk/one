package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/main/java/com/features",
	glue="src/main/java/com/strpdef",
	plugin= "html:test-output",
	dryRun=true
		
		
)

public class Runner {

}
//changeddddd
//again
