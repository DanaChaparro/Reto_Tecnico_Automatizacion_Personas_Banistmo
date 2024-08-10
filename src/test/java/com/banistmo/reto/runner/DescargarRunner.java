package com.banistmo.reto.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/descargar.feature",
        tags = "@descargar",
        glue = {"com.banistmo.reto.stepdefinition", "com.banistmo.reto"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class DescargarRunner {
}
