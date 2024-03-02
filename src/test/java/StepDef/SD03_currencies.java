package StepDef;

import Pages.p03_HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD03_currencies {
    p03_HomePage p03=new p03_HomePage();

    @Given("user navigates to home page")
    public void userNavigatesToHomePage() {
        System.out.println("User in the home Page");
    }

    @When("user choose {string} currency")
    public void userChooseCurrency(String Currency) {
        p03.ChooseCurrency(Currency);
    }

    @Then("displayed products with {string} symbol")
    public void displayedProductsWithSymbol(String symbol) {
        p03.CheckCurrencySymbol(symbol);
    }
}
