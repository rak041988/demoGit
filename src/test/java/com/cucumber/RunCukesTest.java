package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/konda/workspace/cucumber/src/test/resources/login.feature",tags={"@smoke"},monochrome=true, dryRun=true,strict=true)
public class RunCukesTest {

}
