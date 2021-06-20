package org.com.gridsingularity.pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Login {

    private ChromeDriver driver;

    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@id='root']/main/div[2]/div/div/div/form/div[3]/button/span")
    WebElement buttonLogin;

    public Login(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public ChromeDriver getDriver() {
        return driver;
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonLogin() {
        return buttonLogin;
    }

    public void takeScreenShot() throws IOException {
        File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
        LocalDateTime localDateTime = LocalDateTime.now();
        String filePath = "images/screenshot/Test" + localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".png";
        FileUtils.copyFile(screenShotFile, new File(filePath));
    }

    public Login validateLogin(String email,String password)
    {
        this.inputEmail.sendKeys(email);
        this.inputPassword.sendKeys(password);
        this.buttonLogin.click();
        return this;
    }

}
