package com.co.demoblanze.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/addproduct.feature",
snippets = SnippetType.CAMELCASE,
glue = "com.co.demoblanze.stepsdefinitions",
plugin = "pretty")
//tags = "@AddProduct")
public class ProductRunner {
}
