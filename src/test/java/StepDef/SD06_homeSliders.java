package StepDef;

import Pages.p03_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD06_homeSliders {
    p03_HomePage p03=new p03_HomePage();
//FirstSlider
    @When("user clicks on first slider")
    public void userClicksOnFirstSlider() {
        p03.ClickOnFirstSlider();
    }

    @Then("user goes to the expected url {string}")
    public void userGoesToTheExpectedUrl(String url) {
        p03.GoToAnotherUrl(url);
    }

//Second slider
    @When("user clicks on Second slider")
    public void userClicksOnSecondSlider() {
        p03.ClickOnSecondSlider();
    }

}
