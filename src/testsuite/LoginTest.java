package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseurl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter the username
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
        //Enter the password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        //Click on Login button
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        //Verify the Dashboard text is displayed
        String expectedText="Reset Password";
        String actualText=driver.findElement(By.tagName("h6")).getText();
        System.out.println(expectedText);
        Assert.assertEquals("Verify reset password",expectedText,actualText);


    }
    @After
    public void tearDown() {
        closeBrowser();

    }
}




