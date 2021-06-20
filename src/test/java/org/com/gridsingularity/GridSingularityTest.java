package org.com.gridsingularity;

import org.com.gridsingularity.pom.Login;
import org.com.gridsingularity.pom.SignUp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class GridSingularityTest
{
   private ChromeDriver driver;
   private SignUp signUp;
   private Login login;

   @Before
   public void setUp()
   {
       String webdriverPath = "lib/chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", webdriverPath);
       DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
       desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
       driver = new ChromeDriver(desiredCapabilities);
       driver.manage().window().maximize();

   }

   @After
   public void tearDown()
   {
       driver.quit();
   }

    @Test
    public void testSignUp() throws IOException {
        driver.get("https://www.d3a.io/login");
        signUp = new SignUp(this.driver);
        SignUp page = signUp.validateSignUp("anandkumart.1993@gmail.com","Anandkumar T","ITC","Grid_SingularityTest001");
        page.takeScreenShot();
        String expectedsuccessMessage = "Thank you. Please check your email to confirm your account.";
        String actualSuccessMessage = page.getSuccessMessage().getText();
        Assert.assertEquals(expectedsuccessMessage,actualSuccessMessage);
    }

    @Test
    public void testLogin() throws IOException {
        driver.get("https://www.d3a.io/login");
        login = new Login(this.driver);
        Login page = login.validateLogin("anandkumart.1993@gmail.com","Grid_SingularityTest001");
        page.takeScreenShot();
        page.getDriver().navigate().refresh();
        String expectedHomePageText = "Home";
        String actualHomePageText = page.getDriver().findElementByXPath("//*[@id='root']/div/div[2]/header/h1").getText();
        Assert.assertEquals(expectedHomePageText,actualHomePageText);
    }

}
