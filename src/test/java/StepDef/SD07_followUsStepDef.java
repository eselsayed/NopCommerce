package StepDef;

import Pages.p03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD07_followUsStepDef {
    p03_HomePage p03=new p03_HomePage();
    @And("user clicks on facebook icon")
    public void userClicksOnFacebookIcon() {
        p03.ClickOnFacebookLink();
    }


    @Then("user close current tab and get back to homePage")
    public void userCloseCurrentTabAndGetBackToHomePage() {
        p03.BackToHomeTab();
    }

    @And("user clicks on twitter icon")
    public void userClicksOnTwitterIcon() {
        p03.ClickOnTwitterLink();
    }

    @And("user clicks on rss icon")
    public void userClicksOnRssIcon() {
        p03.ClickOnRssLink();
    }

    @And("user clicks on youtube icon")
    public void userClicksOnYoutubeIcon() {
        p03.ClickOnYoutubeLink();
    }

    @Then("user close current tab and get return to homePage")
    public void userCloseCurrentTabAndGetReturnToHomePage() {
        p03.returnToHomeTab();
    }
}
