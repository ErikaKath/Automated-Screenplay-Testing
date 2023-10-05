package com.co.bonbonite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/home.feature",
snippets = SnippetType.CAMELCASE,
glue = "com.co.bonbonite.stepsdefinitions")
public class HomeRunner {
}
