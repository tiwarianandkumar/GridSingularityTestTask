package org.com.gridsingularity.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

    private ChromeDriver driver;

    @FindBy(xpath = "//*[@id='icon_projects']/path")
    WebElement linkProject;


    public Home(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ChromeDriver getDriver() {
        return driver;
    }

    public WebElement getLinkProject() {
        return linkProject;
    }
}
