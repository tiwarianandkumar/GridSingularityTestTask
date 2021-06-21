package org.com.gridsingularity.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.com.gridsingularity.pom.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    @After
    public void tearDown()
    {
        if(driver!=null) {
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
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
    public void userShouldBeSignedUpSuccessfully() throws IOException {
    String expectedsuccessMessage = "Thank you. Please check your email to confirm your account.";
    getSignUp().takeScreenShot();
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
    public void userShouldBeLoggedInSuccessfully() throws IOException {
        String expectedHomePageText = "Home";
        String actualHomePageText = driver.findElementByXPath("/html/body/div[1]/div/div[2]/header/h1").getText();
        getLogin().takeScreenShot();
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
        String actualHomePageText = page.getDriver().findElementByXPath("/html/body/div[1]/div/div[2]/header/h1").getText();
        Assert.assertEquals(expectedHomePageText,actualHomePageText);
    }

    @When("^User click on left side project link on home page$")
    public void userClickOnLeftSideProjectLinkOnHomePage() {
        getHome().getLinkProject().click();
    }

    @And("^User click on new project link$")
    public void userClickOnNewProjectLink() {
        getProject().getLinkNewProject().click();
    }

    @And("^User enters new project name as \"([^\"]*)\"$")
    public void userEntersNewProjectNameAs(String projectName) throws Throwable {
       getProject().getInputProjectName().sendKeys(projectName);
    }

    @And("^User enters new project description as \"([^\"]*)\"$")
    public void userEntersNewProjectDescriptionAs(String projectDescription) throws Throwable {
       getProject().getTextAreaProjectDescription().sendKeys(projectDescription);
    }

    @And("^User click on add button for new project creation$")
    public void userClickOnAddButtonForNewProjectCreation() {
        getProject().getButtonAdd().click();
    }

    @Then("^Verify if the new Project is Created with the name \"([^\"]*)\"$")
    public void verifyIfTheNewProjectIsCreatedWithTheName(String expectedProjectName) throws Throwable {
        String actualProjectName = getProject().getDriver().findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div/div/section/div[1]/div/div[1]/span/span").getText();
        Assert.assertEquals(expectedProjectName,actualProjectName);
    }


    @Then("^User click on the expand link for project \"([^\"]*)\"$")
    public void userClickOnTheExpandLinkForProject(String projectName) throws Throwable {
       getProject().getDriver().findElementByXPath("/html/body/div[1]/div/div[2]/div[2]/div/div/section/div[1]/div/div[1]/span/div/div").click();
    }

    @Then("^User click on new simulation link on project page$")
    public void userClickOnNewSimulationLinkOnProjectPage() {
        getProject().getLinkNewSimulation().click();
    }

    @And("^User enters simulation name as \"([^\"]*)\"$")
    public void userEntersSimulationNameAs(String simulationName) throws Throwable {
        getSimulation().getInputSimulationName().clear();
       getSimulation().getInputSimulationName().sendKeys(simulationName);
    }

    @And("^User enters simulation description as \"([^\"]*)\"$")
    public void userEntersSimulationDescriptionAs(String simulationDescription) throws Throwable {
        getSimulation().getTextAreaSimulationDescription().clear();
        getSimulation().getTextAreaSimulationDescription().sendKeys(simulationDescription);
    }

    @And("^User Select simulation project as \"([^\"]*)\"$")
    public void userSelectSimulationProjectAs(String simulationProject) throws Throwable {
       Select select = new Select(getSimulation().getSelectProject());
       select.selectByVisibleText(simulationProject);

    }

    @And("^User enters simulation start date as \"([^\"]*)\"$")
    public void userEntersSimulationStartDateAs(String simulationStartDate) throws Throwable {
        getSimulation().getInputStartDate().clear();
        getSimulation().getInputStartDate().sendKeys(simulationStartDate);
    }

    @And("^User enters simulation end date as \"([^\"]*)\"$")
    public void userEntersSimulationEndDateAs(String simulationEndDate) throws Throwable {
        getSimulation().getInputEndDate().clear();
        getSimulation().getInputEndDate().sendKeys(simulationEndDate);
    }

    @And("^User select simulation solar profile as \"([^\"]*)\"$")
    public void userSelectSimulationSolarProfileAs(String solarProfile) throws Throwable {
        Select select = new Select(getSimulation().getSelectSolarProfile());
        select.selectByVisibleText(solarProfile);
    }

    @And("^User select simulation spot market type as \"([^\"]*)\"$")
    public void userSelectSimulationSpotMarketTypeAs(String spotMarketTypeAs) throws Throwable {
        Select select =  new Select(getSimulation().getSelectSpotMarketType());
        select.selectByVisibleText(spotMarketTypeAs);
    }

    @And("^User enters simulation no of spot market as \"([^\"]*)\"$")
    public void userEntersSimulationNoOfSpotMarketAs(String noOfSpotMarket) throws Throwable {
        getSimulation().getInputNumberofSpotMarkets().clear();
        getSimulation().getInputNumberofSpotMarkets().sendKeys(noOfSpotMarket);
    }

    @And("^User enters simulation length of spot market as \"([^\"]*)\"$")
    public void userEntersSimulationLengthOfSpotMarketAs(String lengthOfSpotMarket) throws Throwable {
        getSimulation().getInputLengthOfSpotMarket().clear();
        getSimulation().getInputLengthOfSpotMarket().sendKeys(lengthOfSpotMarket);
    }

    @And("^User enters simulation trick length as \"([^\"]*)\"$")
    public void userEntersSimulationTrickLengthAs(String trickLength) throws Throwable {
       getSimulation().getInputTickLength().sendKeys(trickLength);
    }

    @And("^User select grid fees as \"([^\"]*)\"$")
    public void userSelectGridFeesAs(String gridFees) throws Throwable {
        Select select = new Select(getSimulation().getSelectGridFees());
        select.selectByVisibleText(gridFees);
    }

    @And("^User enters simulation Market slot real time duration as \"([^\"]*)\"$")
    public void userEntersSimulationMarketSlotRealTimeDurationAs(String marketSlotrealTimeDurationAs) throws Throwable {
      getSimulation().getInputMarketSlotRealTimeDuration().sendKeys(marketSlotrealTimeDurationAs);
    }

    @And("^User click on next button on simulation page$")
    public void userClickOnNextButtonOnSimulationPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getSimulation().getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(getSimulation().getButtonNext()));
        getSimulation().getButtonNext().click();
        Thread.sleep(3000);

    }

    @Then("^Verify if the new simulation has been created$")
    public void verifyIfTheNewSimulationHasBeenCreated() {
        String actualText = "Modelling";
        WebDriverWait wait = new WebDriverWait(getSimulation().getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(getSimulation().getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/header/h1"))));
        String expectedText =  getSimulation().getDriver().findElementByXPath("/html/body/div[1]/div/div[2]/header/h1").getText();
        Assert.assertEquals(actualText,expectedText);
    }
}
