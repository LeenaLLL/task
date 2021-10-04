package com.task.pages;

import com.task.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "#inputEmail")
    public WebElement emailInput;

    @FindBy(css = "#inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMessage;

    public void login(String username,String password){
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }
}
