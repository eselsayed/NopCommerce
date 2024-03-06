package StepDef;

import Pages.p03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD05_hoverCategories {
    p03_HomePage p03=new p03_HomePage();
    @Given("user select random one of the three main categories and hover on it")
    public void userSelectRandomOneOfTheThreeMainCategoriesAndHoverOnIt() throws InterruptedException {
        p03.HoverOnCategories();
    }

    @When("user select random one of the three sub categories")
    public void userSelectRandomOneOfTheThreeSubCategories() throws InterruptedException {
        p03.SelectSubCategory();
    }

    @And("Get the text of sub category page")
    public void getTheTextOfSubCategoryPage() {

    }

    @Then("verify that sub-category title is the same")
    public void verifyThatSubCategoryTitleIsTheSame() {
    }
}
