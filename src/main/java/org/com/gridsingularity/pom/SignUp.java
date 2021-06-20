package org.com.gridsingularity.pom;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SignUp {
    private ChromeDriver driver;

    @FindBy(linkText = "Create new account")
    WebElement linkCreateNewAccount;

    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@name='name']")
    WebElement inputName;

    @FindBy(xpath = "//input[@name='organisation']")
    WebElement inputOrganisation;

    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//div[@id='checkbox-agree']")
    WebElement checkBoxAgree;

    @FindBy(xpath = "//button/a[contains(text(),'Next')]")
    WebElement buttonNext;

    @FindBy(xpath = "//*[@id='root']/main/div[2]/div/div/div[2]/section/div[1]/div/div[2]/div")
    WebElement successMessage;

    public SignUp(ChromeDriver driver) {
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

    public WebElement getLinkCreateNewAccount() {
        return linkCreateNewAccount;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputOrganisation() {
        return inputOrganisation;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getCheckBoxAgree() {
        return checkBoxAgree;
    }

    public WebElement getButtonNext() {
        return buttonNext;
    }

    public void takeScreenShot() throws IOException {
        File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
        LocalDateTime localDateTime = LocalDateTime.now();
        String filePath = "images/screenshot/Test" + localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".png";
        FileUtils.copyFile(screenShotFile, new File(filePath));
    }

    public SignUp validateSignUp(String email,String name,String organisation,String password)
    {
       linkCreateNewAccount.click();
       this.inputEmail.sendKeys(email);
       this.inputName.sendKeys(name);
       this.inputOrganisation.sendKeys(organisation);
       this.inputPassword.sendKeys(password);
       this.checkBoxAgree.click();
       this.buttonNext.click();
       return this;
    }






}
