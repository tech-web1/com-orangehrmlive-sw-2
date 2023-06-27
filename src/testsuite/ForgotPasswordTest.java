package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Click on the Forgot password link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();



    }
    @After
    public void close(){
        closeBrowser();
    }
}
