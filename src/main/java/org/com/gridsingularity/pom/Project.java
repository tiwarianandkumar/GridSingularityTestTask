package org.com.gridsingularity.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Project {

    private ChromeDriver driver;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/header/div[3]/button[2]/span")
    WebElement linkNewProject;

    @FindBy(xpath = "//*[@id='input-field-name']")
    WebElement inputProjectName;

    @FindBy(xpath = "//*[@id='textarea-field-nameTextArea']")
    WebElement textAreaProjectDescription;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/button/span")
    WebElement buttonAdd;

    @FindBy(xpath = "//*[@id='root']/div/div[2]/div[2]/div/div/section/div[1]/div[2]/button/span")
    WebElement linkNewSimulation;

    public Project(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public ChromeDriver getDriver() {
        return driver;
    }

    public WebElement getLinkNewProject() {
        return linkNewProject;
    }

    public WebElement getInputProjectName() {
        return inputProjectName;
    }

    public WebElement getTextAreaProjectDescription() {
        return textAreaProjectDescription;
    }

    public WebElement getButtonAdd() {
        return buttonAdd;
    }

    public WebElement getLinkNewSimulation() {
        return linkNewSimulation;
    }
}
