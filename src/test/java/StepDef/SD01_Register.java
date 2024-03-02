package StepDef;

import Pages.P01_RegisterPage;
import Pages.p03_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SD01_Register {
    //Objects
    P01_RegisterPage p01=new P01_RegisterPage();
    p03_HomePage p03=new p03_HomePage();


    //Step Definition
    @Given("user go to register page")
    public void userGoToRegisterPage(){
           p03.ClickOnRegisterPage();
     }

    @And("user select gender type {string}")
    public void userSelectGenderType(String Gender) {
         p01.SelectGender(Gender);
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String First, String Last) {
         p01.EnterFirstName(First);
         p01.EnterLastName(Last);
    }

    @And("user enter date of birth {string} {string} {string}")
    public void userEnterDateOfBirth(String Day, String Month, String Year) {
        p01.SelectDay(Day);
        p01.SelectMonth(Month);
        p01.SelectYear(Year);
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
         p01.EnterEmail(email);
    }

    @And("user fills Password fields {string}")
    public void userFillsPasswordFields(String password) {
         p01.enterPassword(password);
         p01.enterConfirmPassword(password);
    }

    @When("user clicks on register button")
    public void userClicksOnRegisterButton() {
         p01.ClickOnRegisterBtn();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
         p01.CheckRegisterSuccessMsg();
    }



}
