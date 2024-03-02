package StepDef;

import Pages.p03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD08_WishlistStepDef {
    p03_HomePage p03=new p03_HomePage();
    @When("user clicks on the product wishlist icon")
    public void userClicksOnTheProductWishlistIcon() {
        p03.ClickOnTheProductWishlistIcon();
    }
    @And("user waits until msg disappear")
    public void userWaitsUntilMsgDisappear() {
        p03.WaitUtilMSgDisappear();
    }

    @Then("success message displayed with green background color")
    public void successMessageDisplayedWithGreenBackgroundColor() {
        p03.AssertTheDisplayedMsg();
        p03.CheckTheMsgColor();

    }

    @And("user goes to wishlist page")
    public void userGoesToWishlistPage() {
        p03.NavigatesToWishlist();
    }


    @Then("Verify that Qty value is bigger than one")
    public void verifyThatQtyValueIsBiggerThanOne() {
        p03.VerifyQtyValue();
    }


    }

