package StepDef;

import Pages.p03_HomePage;
import Pages.p04_SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD04_Search {
     p03_HomePage p03=new p03_HomePage();
     p04_SearchPage p04=new p04_SearchPage();
    @Given("user go to search box and enter {string}")
    public void userGoToSearchBoxAndEnter(String ProductName) {
        p03.EnterProductNameInSearchBox(ProductName);
    }

    @And("User click on search Button")
    public void userClickOnSearchButton() {
        p03.ClickOnSearchButton();
    }


     @When("Go to search page")
     public void goToSearchPage() {
        p04.verifyThatItGoToSearchPage();
     }


    @Then("Count number of search and verify each result contains the {string}")
    public void countNumberOfSearchAndVerifyEachResultContainsThe(String ProductName) {
        p04.countNumOfResultsAndVerifyThatItContainSearchWord(ProductName);
    }

    @Then("User click on product Result")
    public void userClickOnProductResult() {
       p04.ClickOnProductResult();

    }

    @Then("make sure That product result contains the same {string}")
    public void makeSureThatProductResultContainsTheSame(String ProductSKU) {
        p04.VerifyThatContainTheSameSKU(ProductSKU);
    }
}
