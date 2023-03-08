package io.tpd.springbootcucumber.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@Slf4j
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"pretty", "html:target/cucumber/bagbasics"},
        extraGlue = "io.tpd.springbootcucumber.bagcommons")
public class BagCucumberIntegrationTest {

}
