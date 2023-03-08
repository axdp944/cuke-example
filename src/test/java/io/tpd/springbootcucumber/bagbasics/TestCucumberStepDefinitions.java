package io.tpd.springbootcucumber.bagbasics;

import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class TestCucumberStepDefinitions {

    @Autowired @Qualifier("myBean")
    private String myBean;

    @Given("a test")
    public void a_test() {
        log.info("step 1");
    }

    @Given("I should be able to inject a bean into my tests step defs")
    public void another_test() {
        log.info("step 2");
        log.info("myBean = {}", myBean );
        assertThat(myBean).isEqualTo("this is the string that should get injected");
    }

}
