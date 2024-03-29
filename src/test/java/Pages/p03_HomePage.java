package Pages;

import StepDef.Hooks;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

import java.util.Random;
import java.util.concurrent.TimeUnit;


import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class p03_HomePage {

    Actions action=new Actions(Hooks.driver);
    SoftAssert soft=new SoftAssert();
    public void ClickOnRegisterPage(){
         Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
    }
    public void ClickOnLoginPage(){
        Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]")).click();
    }
//
    public void EnterProductNameInSearchBox(String product){
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(product);
    }
    public void ClickOnSearchButton(){
        Hooks.driver.findElement(By.className("search-box-button")).click();
    }

    //ChooseCurrency
    public void ChooseCurrency(String currency){
        WebElement Currency=Hooks.driver.findElement(By.id("customerCurrency"));
        Select SelectCurrency=new Select(Currency);
        SelectCurrency.selectByVisibleText(currency);
    }

    ///CheckCurrencySymbol
    public void CheckCurrencySymbol(String Symbol){
        List<WebElement>Products=Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div/div/div[2]/div[3]/div[1]/span"));
        for (int i=0;i<Products.size();i++){
            boolean Prod=Products.get(i).getText().contains(Symbol);
            Assert.assertTrue(Prod,"Not have the same symbol");
            //==>/////the price of products displayed with dollar symbol
            String Prods=Products.get(i).getText();
            System.out.println(Prods);

        }
    }

    //////////
    ////HoverOnCategories
    public void HoverOnCategories() throws InterruptedException {
        List<WebElement>Categories =Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));
        int selectedCategory = (int) (Math.random() * 3);
        action.moveToElement(Categories.get(selectedCategory)).build().perform();
        ///////////////////
        List<WebElement>SubCategories =Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li["+(selectedCategory+1)+"]/ul/li"));
        int selectedSubCategory = (int) (Math.random() * 3);
        if(SubCategories.isEmpty()){
            Categories.get(selectedCategory).click();
        }else {
            SubCategories.get(selectedSubCategory).click();
        }
        Thread.sleep(5000);
        }

/*        ////SelectSubCategory
    public void SelectSubCategory() {
        List<WebElement>SubCategories =Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li/ul/li/a"));
        for (int i=0; i<SubCategories.size();i++) {
            System.out.println(SubCategories.get(i).getText());}
        int count = SubCategories.size();
        int min=0;
        int max = count-1;
        int selectedSubCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
        // action.moveToElement(SubCategories.get(selectedSubCategory)).build().perform();
        SubCategories.get(selectedSubCategory).click();
    }
*/


    //ClickOnFirstSlider
    public void ClickOnFirstSlider(){
        Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]")).click();
    }

    public void GoToAnotherUrl(String url){
        String URL= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(URL,url);
    }

    //ClickOnFirstSlider
    public void ClickOnSecondSlider(){
        Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]")).click();
    }


    //////////follow Us
    //ClickOnFaceBookLink
    public void ClickOnFacebookLink(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();
        ArrayList<String>Windows=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Windows.get(1));
    }

    public void ClickOnTwitterLink(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();
        ArrayList<String>Windows=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Windows.get(1));
    }
    public void ClickOnRssLink(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).click();
    }
    public void ClickOnYoutubeLink(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();
        ArrayList<String>Windows=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Windows.get(1));

    }


    public void BackToHomeTab(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        ArrayList<String>Windows=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Windows.get(1));
        Hooks.driver.close();
    }
    public void returnToHomeTab(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");

    }




    ///////////////Wishlist
    //ClickOnTheProductWishlistIcon
    public void ClickOnTheProductWishlistIcon() {
        List<WebElement> icons=Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div/div/div[2]/div[3]/div[2]/button[3]"));
        //List<WebElement> icons=Hooks.driver.findElements(By.className("add-to-wishlist-button"));
        icons.get(2).click();
//
    }
    public void WaitUtilMSgDisappear(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[style=\"display: block;\"]")));
    }
    public void AssertTheDisplayedMsg() {
        String msg = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        soft.assertTrue(msg.contains(" product has been added "), "Not Done 1");
        soft.assertAll();

    }
    //assert the msg background color
    public void CheckTheMsgColor(){
        String color=Hooks.driver.findElement(By.cssSelector("div[style=\"display: block;\"]")).getCssValue("background-color");
        //System.out.println(color);
        String hex = Color.fromString(color).asHex();
        soft.assertEquals(hex,"#4bb07a","Not Done 2");
        soft.assertAll();
    }

    ////NavigatesToWishlist
    public void NavigatesToWishlist(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")).click();
    }

    ////VerifyQtyValue
    public void VerifyQtyValue(){
       String res= Hooks.driver.findElement(By.cssSelector("input[name=\"itemquantity11219\"]")).getCssValue("value");
        System.out.println(res);
    }

    }
