package StepDef;

import Pages.p02_loginPage;
import Pages.p03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD02_loginStepDef {
    p03_HomePage p03=new p03_HomePage();
    p02_loginPage p02=new p02_loginPage();
    @Given("user go to login page")
    public void userGoToLoginPage() {
        p03.ClickOnLoginPage();
    }

    @And("user login with valid email {string} and {string}")
    public void userLoginWithValidEmailAnd(String email, String password) {
        p02.EnterEmail(email);
        p02.EnterPassword(password);
    }

    @When("user press on login button")
    public void userPressOnLoginButton() {
        p02.ClickOnLoginBtn();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        p02.loginToTheSystemSuccessfully();
        p02.CheckCurrentUrl();
    }




    ///////////Scenario2
    @And("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String Email, String Password) {
        p02.EnterEmail(Email);
        p02.EnterPassword(Password);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        p02.UnsuccessfulLogin();
        p02.CheckMsgColor();
    }

}
