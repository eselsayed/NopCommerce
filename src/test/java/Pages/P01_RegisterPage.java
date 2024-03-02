package Pages;

import StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class P01_RegisterPage {

    //Gender
    public void SelectGender(String Gender) {
//        if (Gender.equals("male")) {
//            Hooks.driver.findElement(By.id("gender-male")).click();
//        } else if(Gender.equals("female")){
//            Hooks.driver.findElement(By.id("gender-female")).click();
//        }
        Hooks.driver.findElement(By.id("gender-"+Gender)).click();
    }

    //FirstName
    public void EnterFirstName(String FirstName){
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(FirstName);
    }
    //LastName
    public void EnterLastName(String LastName){
        Hooks.driver.findElement(By.id("LastName")).sendKeys(LastName);
    }


    //DateOfBirth
    public void SelectDay(String day){
        Select Day =new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        Day.selectByVisibleText(day);
    }

    public void SelectMonth(String month){
        Select Month =new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        Month.selectByVisibleText(month);
    }
    public void SelectYear(String year){
        Select Year =new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        Year.selectByVisibleText(year);
    }

    /// Email
    public void EnterEmail(String email){
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
    }

    //Password
    public void enterPassword(String Password){
        Hooks.driver.findElement(By.id("Password")).sendKeys(Password);
    }
    //confirm
    public void enterConfirmPassword(String Password){
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(Password);
    }

    //ClickOnRegisterBtn
    public void ClickOnRegisterBtn(){
        Hooks.driver.findElement(By.id("register-button")).click();
    }

    //CheckRegisterSuccessMsg
    public void CheckRegisterSuccessMsg(){
        boolean Result=Hooks.driver.findElement(By.className("result")).isDisplayed();
        SoftAssert S=new SoftAssert();
        S.assertTrue(Result);
        S.assertEquals(Hooks.driver.findElement(By.className("result")).getText(),"Your registration completed");
        S.assertAll();
    }
}
