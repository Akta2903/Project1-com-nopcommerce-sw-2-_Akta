package testsuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends LoginTest
{
    String baseUrl = "https://demo.nopcommerce.com/";

//    @Before
//
//    public void setBaseUrl()
//    {
//        setUp();
//    }

    @Test

    public void userShouldNavigateToComputerPageSuccessfully()
    {
       //verifing user is navigated to computer page by verifing the text displayed on the screen
        String expectedMessage = "Computers";

        // finding the computer tab and clicking on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualMessageText = actualMessage.getText();
       Assert.assertEquals("User is not navigated to computer page",expectedMessage,actualMessageText);


    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        //verifing user is navigated to Electronics page by verifing the text displayed on the screen
        String expectedMessage = "Electronics";

        // finding the Electronics tab and clicking on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Electronics page",expectedMessage,actualMessageText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessful()
    {
        //verifing user is navigated to Apparel page by verifing the text displayed on the screen
        String expectedMessage = "Apparel";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']")).click(); // finding the apparel tab and clicking on it
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Apparel page",expectedMessage,actualMessageText);
    }

    @Test

    public void userShouldNavigateToDigitalDownloadsPageSuccessful()
    {
        //verifing user is navigated to Digital downloads page by verifing the text displayed on the screen
        String expectedMessage = "Digital downloads";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']")).click(); // // finding the digital downloads tab and clicking on it
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Digital downloads page",expectedMessage,actualMessageText);
    }

    @Test

    public void userShouldNavigateToBooksPageSuccessfully()
    {
        //verifing user is navigated to Books page by verifing the text displayed on the screen
        String expectedMessage = "Books";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']")).click(); //finding the Books tab and clicking on it
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Books page",expectedMessage,actualMessageText);
    }
    @Test

    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        //verifing user is navigated to Jwelary page by verifing the text displayed on the screen
        String expectedMessage = "Jewelry";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']")).click();  // finding the Jwelry tab and clicking on it
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Jewelry page",expectedMessage,actualMessageText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessful()
    {
        //verifing user is navigated to Gift cards by verifing the text displayed on the screen
        String expectedMessage = "Gift Cards";
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']")).click(); // finding the Gift card tab and clicking on it
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to Gift Cards page",expectedMessage,actualMessageText);
    }

}
