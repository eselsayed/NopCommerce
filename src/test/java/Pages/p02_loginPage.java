package Pages;

import StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.lang.ref.SoftReference;

public class p02_loginPage {
    SoftAssert S=new SoftAssert();

    //Email
    public void EnterEmail(String Email){
        Hooks.driver.findElement(By.id("Email")).sendKeys(Email);
    }
    //Password
    public void EnterPassword(String Password){
        Hooks.driver.findElement(By.id("Password")).sendKeys(Password);
    }

    //clickOnLoginBtn
    public void ClickOnLoginBtn(){
        Hooks.driver.findElement(By.className("login-button")).click();
    }
    //CheckCurrentUrl
    public void CheckCurrentUrl(){
        S.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }
    //loginToTheSystemSuccessfully
    public void loginToTheSystemSuccessfully(){
        boolean res=Hooks.driver.findElement(By.className("ico-account")).isDisplayed();
        S.assertTrue(res,"NotMatch");
        S.assertAll();
    }

    //UnsuccessfulLogin
    public void UnsuccessfulLogin(){
        boolean res= Hooks.driver.findElement(By.className("validation-summary-errors")).isDisplayed();
        S.assertTrue(res,"NotMatch");
        S.assertAll();
    }
    //CheckMsgColor
    public void CheckMsgColor(){
        String color=Hooks.driver.findElement(By.className("validation-summary-errors")).getCssValue("color");
        String hex = Color.fromString(color).asHex();
        S.assertEquals(hex,"#e4434b","Not Done");
        S.assertAll();
    }
}
