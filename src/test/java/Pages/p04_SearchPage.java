package Pages;

import StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class p04_SearchPage {
    SoftAssert S=new SoftAssert();
    public void verifyThatItGoToSearchPage(){
        boolean Verify= Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=");
        S.assertEquals(Verify,true);
        S.assertAll();
    }

    public void countNumOfResultsAndVerifyThatItContainSearchWord(String ProductName){
         List<WebElement> result_text=Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a"));
        int NumOfElements=result_text.size();
         for (int i=0; i < NumOfElements; i++)
        {
            boolean resultText = result_text.get(i).getText().toLowerCase().contains(ProductName);
            S.assertEquals(resultText,true);
           // S.assertAll();
            System.out.println(resultText);
        }
        System.out.println("The Number of the result elements = "+NumOfElements);
    }

    public void ClickOnProductResult(){
        Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]")).click();
    }

    public void VerifyThatContainTheSameSKU(String ProductSKU){
       Boolean verify =  Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]")).getText().contains(ProductSKU);
        Assert.assertEquals(verify,true);

    }

}
