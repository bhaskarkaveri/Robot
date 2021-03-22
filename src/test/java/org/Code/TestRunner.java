package org.Code;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="D:\\base project\\RobotManager\\src\\test\\resources\\login\\feature\\login.feature",glue="org.Code",
dryRun=false,monochrome=true)
		public class TestRunner {

	}

