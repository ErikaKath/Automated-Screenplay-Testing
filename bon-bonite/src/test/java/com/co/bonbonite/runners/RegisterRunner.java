package com.co.bonbonite.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
glue = "com.co.bonbonite.stepsdefinitions",
snippets = SnippetType.CAMELCASE,
plugin = "pretty",
tags = "@RegisterSuccessful")
public class RegisterRunner {
}
