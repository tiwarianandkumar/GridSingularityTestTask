package org.com.gridsingularity.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Simulation {

    private ChromeDriver driver;

    @FindBy(xpath = "//*[@id='input-field-name']")
    WebElement inputSimulationName;

    @FindBy(xpath = "//*[@id='textarea-field-description']")
    WebElement textAreaSimulationDescription;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div[3]/div/div/select")
    WebElement selectProject;

    @FindBy(xpath = "//*[@id='input-field-startDate']")
    WebElement inputStartDate;

    @FindBy(xpath = "//*[@id='input-field-endDate']")
    WebElement inputEndDate;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/header/div[3]/button[2]/span")
    WebElement linkNewProject;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div[6]/div/div/select")
    WebElement selectSolarProfile;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div[7]/div/div/select")
    WebElement selectSpotMarketType;

    @FindBy(xpath = "//*[@id='input-field-marketCount']")
    WebElement inputNumberofSpotMarkets;

    @FindBy(xpath = "//*[@id='input-field-slotLengthMinutes']")
    WebElement inputLengthOfSpotMarket;

    @FindBy(xpath = "//*[@id=input-field-tickLengthSeconds']")
    WebElement inputTickLength;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div[11]/div/div/select']")
    WebElement selectGridFees;

    @FindBy(xpath = "//*[@id='input-field-slotLengthRealtimeSeconds']")
    WebElement inputMarketSlotRealTimeDuration;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div/div[2]/button")
    WebElement buttonNext;

    public Simulation(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public ChromeDriver getDriver() {
        return driver;
    }

    public WebElement getInputSimulationName() {
        return inputSimulationName;
    }

    public WebElement getTextAreaSimulationDescription() {
        return textAreaSimulationDescription;
    }

    public WebElement getSelectProject() {
        return selectProject;
    }

    public WebElement getInputStartDate() {
        return inputStartDate;
    }

    public WebElement getInputEndDate() {
        return inputEndDate;
    }

    public WebElement getLinkNewProject() {
        return linkNewProject;
    }

    public WebElement getSelectSolarProfile() {
        return selectSolarProfile;
    }

    public WebElement getSelectSpotMarketType() {
        return selectSpotMarketType;
    }

    public WebElement getInputNumberofSpotMarkets() {
        return inputNumberofSpotMarkets;
    }

    public WebElement getInputLengthOfSpotMarket() {
        return inputLengthOfSpotMarket;
    }

    public WebElement getInputTickLength() {
        return inputTickLength;
    }

    public WebElement getSelectGridFees() {
        return selectGridFees;
    }

    public WebElement getInputMarketSlotRealTimeDuration() {
        return inputMarketSlotRealTimeDuration;
    }

    public WebElement getButtonNext() {
        return buttonNext;
    }
}
