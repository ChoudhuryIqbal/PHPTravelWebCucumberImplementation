/**
 * 
 */
package com.phptravel.cucumber.PhpTravelCucumber.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;

/**
 * @author choudhuryIqbal
 *
 */
@CucumberOptions(features="src\\main\\java\\Features",glue= {"src\\main\\java\\com\\phptravel\\cucumber\\PhpTravelCucumber\\stepDef\\"},plugin= {"html:target/cucumber-html-report"
		,"json:target/cucumber.json","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml"} )
@RunWith(Cucumber.class)
public class TestRunner {




}
