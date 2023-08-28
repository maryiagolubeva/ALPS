package stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.common.HeaderBlock;
import pages.login.LoginPage;
import services.LoginPageService;
import utils.Logger;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class AuthorizationStepDefs {

    LoginPageService loginPageService;
    LoginPage loginPage;
    HeaderBlock headerBlock;

    public AuthorizationStepDefs() {
        this.loginPageService = new LoginPageService();
        this.loginPage = new LoginPage();
        this.headerBlock = new HeaderBlock();
    }

    @Given("login page opened")
    public void browserStarted() {
        open("https://crystalski.dev.musement.com/");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        Configuration.browserSize = "1980x1000";
        Logger.debug("Browser started");
        Logger.info("Browser started");
    }

    @Then("contracts page is opened")
    public void contractsPageOpened() {
        url().contains("https://crystalski.dev.musement.com/contracts");
        Logger.debug("Contracts page opened");
        Logger.info("Contracts page opened");
    }

    @Then("invalid login error-message is displayed")
    public void errorMessageDisplayed() {
        $(loginPage.getErrorMessage()).shouldBe(Condition.exist);
        Logger.debug("Error message about incorrect login showed");
        Logger.info("Error message about incorrect login showed");
    }

    @And("view password")
    public void viewPassword() {
        $(loginPage.getHidePasswordIcon()).click();
        Logger.debug("'View' icon pressed");
        Logger.info("Password opened for view");
    }

    @Then("password is displayed")
    public void passwordDisplayed() {
        $(loginPage.getPasswordField()).shouldBe(Condition.exist);
        Logger.debug("Password displayed");
        Logger.info("Password displayed");
    }

    @And("perform logout")
    public void performLogout() {
        $(headerBlock.getAvatar()).click();
        Logger.debug("'Avatar' icon pressed");
        $(headerBlock.getLogoutLink()).click();
        Logger.debug("'Logout' link pressed");
        Logger.info("User logged out");
    }

    @Then("login page is displayed")
    public void loginPageDisplayed() {
        url().contains("https://crystalski.qual.musement.com/login");
        Logger.debug("Login page displayed");
        Logger.info("Login page displayed");
    }


    @Then("users page is available")
    public void usersPageIsAvailable(){
        $(headerBlock.getAvatar()).click();
        Logger.debug("'Avatar' icon pressed");
        $(headerBlock.getUsersLink()).shouldBe(Condition.exist);
        Logger.debug("'Users' link displayed");
        Logger.info("User page is available");
    }


    @Then("users page is not available")
    public void usersPageIsNotAvailable() {
        $(headerBlock.getAvatar()).click();
        Logger.debug("'Avatar' icon pressed");
        $(headerBlock.getUsersLink()).shouldNotBe(Condition.exist);
        Logger.debug("'Users' link not displayed");
        $(headerBlock.getReportsLink()).shouldNotBe(Condition.exist);
        Logger.debug("'Reports' link not displayed");
        Logger.info("User page is not available");
    }

    @And("perform login with {string} {string}")
    public void performLoginWithEmailPassword(String email, String password) {
        loginPageService.login(email, password);
    }

    @When("enter password {string}")
    public void enterPassword(String password) {
        $(loginPage.getHiddenPasswordField()).sendKeys(password);
        Logger.debug("Password entered to 'Password' field");
        Logger.info("Password entered to 'Password' field");
    }
}
