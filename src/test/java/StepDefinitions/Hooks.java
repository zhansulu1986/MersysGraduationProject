package StepDefinitions;

import Utilities.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class Hooks {
    @Before
    public void beforeScenario() {

    }
    @After
    public void afterScenario() {
        BasicDriver.quitDriver();
    }

    }
