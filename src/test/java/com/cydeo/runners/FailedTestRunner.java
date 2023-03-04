package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "com/cydeo/step_definitions",
        features = "@target/rerun.txt"//********different feature file is executed
)
public class FailedTestRunner {


}
