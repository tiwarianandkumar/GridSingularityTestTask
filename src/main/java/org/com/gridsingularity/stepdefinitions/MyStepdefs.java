package org.com.gridsingularity.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.com.gridsingularity.pom.*;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    private ChromeDriver driver;
    private Login login;
    private SignUp signUp;
    private Home home;
    private Project project;
    private Simulation simulation;
    private String baseUrl = "https://www.d3a.io/login";

    public MyStepdefs()
    {
        String webdriverPath = "lib/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", webdriverPath);
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
        driver = new ChromeDriver(desiredCapabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    public Login getLogin() {
        if(login==null) {
            this.login = new Login(this.driver);
            return login;
        }
        return login;
    }

    public SignUp getSignUp() {
        if(signUp==null) {
            this.signUp = new SignUp(this.driver);
            return signUp;
        }
        return signUp;
    }

    public Home getHome() {
        if(home==null) {
            this.home = new Home(this.driver);
            return home;
        }
        return home;
    }

    public Project getProject() {
        if(project==null) {
            this.project = new Project(this.driver);
            return project;
        }
        return project;
    }

    public Simulation getSimulation() {
        if(simulation==null) {
            this.simulation = new Simulation(this.driver);
            return simulation;
        }
        return simulation;
    }

    public void openUrl()
    {
        driver.get(baseUrl);
    }

    @Given("^Test DAO is Up and Running$")
    public void testDAOIsUpAndRunning() {
        openUrl();
    }


    @When("^User click on the Link CreateNewAccount$")
    public void userClickOnTheLinkCreateNewAccount() {
     getSignUp().getLinkCreateNewAccount().click();
     driver.navigate().refresh();
    }

    @And("^User enters email as \"([^\"]*)\"$")
    public void userEntersEmailAs(String email) throws Throwable {
        WebDriverWait  wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(getSignUp().getInputEmail()));
        getSignUp().getInputEmail().sendKeys(email);
    }

    @And("^User enters name as \"([^\"]*)\"$")
    public void userEntersNameAs(String name) throws Throwable {
    getSignUp().getInputName().sendKeys(name);
    }

    @And("^User enters organization as \"([^\"]*)\"$")
    public void userEntersOrganizationAs(String organization) throws Throwable {
    getSignUp().getInputOrganisation().sendKeys(organization);
    }

    @And("^User enters password as \"([^\"]*)\"$")
    public void userEntersPasswordAs(String password) throws Throwable {
    getSignUp().getInputPassword().sendKeys(password);
    }

    @And("^Click on next button on sign up page$")
    public void clickOnNextButtonOnSignUpPage() {
    getSignUp().getButtonNext().click();
    }

    @Then("^User Should be signed up successfully$")
    public void userShouldBeSignedUpSuccessfully() {
    String expectedsuccessMessage = "Thank you. Please check your email to confirm your account.";
    String actualSuccessMessage = getSignUp().getSuccessMessage().getText();
    Assert.assertEquals(expectedsuccessMessage,actualSuccessMessage);
    }

    @When("^User enters email \"([^\"]*)\" on login page$")
    public void userEntersEmailOnLoginPage(String email) throws Throwable {
    getLogin().getInputEmail().sendKeys(email);
    }

    @And("^User enters password \"([^\"]*)\" on login page$")
    public void userEntersPasswordOnLoginPage(String password) throws Throwable {
    getLogin().getInputPassword().sendKeys(password);
    }

    @And("^Click on the Login button$")
    public void clickOnTheLoginButton() {
    getLogin().getButtonLogin().click();
    }

    @Then("^User should be logged in successfully$")
    public void userShouldBeLoggedInSuccessfully() {
        driver.navigate().refresh();
        String expectedHomePageText = "Home";
        String actualHomePageText = driver.findElementByXPath("//*[@id='root']/div/div[2]/header/h1").getText();
        Assert.assertEquals(expectedHomePageText,actualHomePageText);
    }

    @And("^User Click on Agree Checkbox$")
    public void userClickOnAgreeCheckbox() {
        getSignUp().getCheckBoxAgree().click();
    }


    @Given("^User is Logged in Successfully$")
    public void userIsLoggedInSuccessfully() throws IOException {
        Login page = getLogin().validateLogin("anandkumart.1993@gmail.com","Grid_SingularityTest001");
        String expectedHomePageText = "Home";
        String actualHomePageText = page.getDriver().findElementByXPath("//*[@id='root']/div/div[2]/header/h1").getText();
        Assert.assertEquals(expectedHomePageText,actualHomePageText);
    }

    @When("^User click on left side project link on home page$")
    public void userClickOnLeftSideProjectLinkOnHomePage() {

    }

    @And("^User click on new project link$")
    public void userClickOnNewProjectLink() {
    }

    @And("^User enters new project name as \"([^\"]*)\"$")
    public void userEntersNewProjectNameAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^User enters new project description as \"([^\"]*)\"$")
    public void userEntersNewProjectDescriptionAs(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^User click on add button for new project creation$")
    public void userClickOnAddButtonForNewProjectCreation() {
    }

    @Then("^Verify if the new Project is Created with the name \"([^\"]*)\"$")
    public void verifyIfTheNewProjectIsCreatedWithTheName(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
