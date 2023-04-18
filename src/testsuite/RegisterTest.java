package testsuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends TopMenuTest
{
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully()
    {
        // verifing user is navigated to register page or not
        String expectedMessage = "Register";
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
        WebElement actualMessage = driver.findElement(By.xpath("//h1[text()='Register']"));
        String actualMessageText = actualMessage.getText();
        Assert.assertEquals("User is not navigated to registration page",expectedMessage,actualMessageText);
    }

    @Test

    public void userShouldRegisterAccountSuccessfully()
    {
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click(); // finding the register link and click on it

        driver.findElement(By.xpath("//input[@id='gender-female']")).click(); // finding the female radio button element and clicking
        driver.findElement(By.id("FirstName")).sendKeys("Akta"); // finding and entering the first name
        driver.findElement(By.id("LastName")).sendKeys("Patel"); // finding  and entering the last name

        Select day = new Select(driver.findElement(By.name("DateOfBirthDay"))); // finding DoBday dropdown and selecting the day
        day.selectByVisibleText("29");
        //day.selectByIndex(1);
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth"))); // finding Dobmonth dropdown and selecting the month
        month.selectByVisibleText("March");
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear"))); // finding Dobyear dropdown and selecting the year
        year.selectByValue("1990");
        driver.findElement(By.id("Email")).sendKeys("akta123456@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("akta123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("akta123456");
        driver.findElement(By.id("register-button")).click();
        // verifing user is logged in successfully or not by verifying the text displayed on the page
        String expectedMessge = "Your registration completed";
       WebElement actualMessage = driver.findElement(By.xpath("//div[text() = 'Your registration completed']"));
       String actualMessageText = actualMessage.getText();
       Assert.assertEquals("User is not registered successfully",expectedMessge,actualMessageText);
    }


}
