package services;

import pages.login.LoginPage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageService {
    private LoginPage loginPage = new LoginPage();

    public LoginPageService() {
    }

    public void login(String email, String password){
        $(loginPage.getEmailField()).scrollIntoView(false).sendKeys(email);
        Logger.debug(email + " email entered to 'Email' field");
        $(loginPage.getHiddenPasswordField()).sendKeys(password);
        Logger.debug("Password entered to 'Password' field");
        $(loginPage.getLoginButton()).click();
        Logger.debug("'Login' button pressed");
        Logger.info("User login to application");
    }
}
