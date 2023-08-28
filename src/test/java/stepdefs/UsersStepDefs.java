package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.common.HeaderBlock;
import pages.user.EditUserPage;
import pages.user.NewUserPage;
import pages.user.PersonalInfoPage;
import pages.user.UsersPage;
import services.UsersPageService;
import services.PersonalInfoPageService;
import utils.Logger;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class UsersStepDefs {
    HeaderBlock headerBlock;
    UsersPage usersPage;
    NewUserPage newUserPage;
    EditUserPage editUserPage;
    UsersPageService newUserPageService;
    PersonalInfoPage personalInfoPage;
    PersonalInfoPageService personalInfoPageService;

    public UsersStepDefs(HeaderBlock headerBlock, UsersPage usersPage, NewUserPage newUserPage,
                         UsersPageService newUserPageService, EditUserPage editUserPage,
                         PersonalInfoPageService personalInfoPageService, PersonalInfoPage personalInfoPage) {
        this.headerBlock = headerBlock;
        this.usersPage = usersPage;
        this.newUserPage = newUserPage;
        this.newUserPageService = newUserPageService;
        this.editUserPage = editUserPage;
        this.personalInfoPageService = personalInfoPageService;
        this.personalInfoPage = personalInfoPage;
    }

    @And("admin register user with {string} {string} {string} {string} {string}")
    public void adminRegisterUser(String email, String firstname, String lastname,
                                  String password, String role) {
        $(usersPage.getNewUserLink()).click();
        Logger.debug("'New user' link pressed");
        newUserPageService.fillNewUserInfo(email,firstname, lastname, password, role);
        $(newUserPage.getRegisterButton()).click();
        Logger.debug("'Register' button pressed");
        $(newUserPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        sleep(1000);
        if($(editUserPage.getDisableCheckbox()).scrollIntoView(false).isSelected()){
            $(editUserPage.getDisableCheckbox()).click();
            Logger.debug("'Disable' checkbox inactivated");
        }
        Logger.info("Admin registered user");
    }

    @Then("success message is displayed")
    public void successMessageDisplayed() {
        $(newUserPage.getSuccessMessage()).shouldBe(Condition.exist);
        Logger.debug("Success message displayed");
        Logger.info("Success message displayed");
    }

    @And("disable checkbox is appeared")
    public void disableCheckboxAppeared() {
        $(editUserPage.getDisableCheckbox()).shouldBe(Condition.exist);
        Logger.debug("'Disable' checkbox appeared");
        Logger.info("'Disable' checkbox appeared");
    }

    @And("open users page")
    public void openUsersPage() {
        $(headerBlock.getAvatar()).click();
        Logger.debug("'Avatar' icon pressed");
        $(headerBlock.getUsersLink()).click();
        Logger.debug("'Users' link pressed");
        Logger.info("'Users' page opened");
    }

    @And("come back to users page")
    public void comeBackToUsersPage() {
        $(editUserPage.getBackToUsersButton()).click();
        Logger.debug("'Back to users' button pressed");
        Logger.info("'Users' page opened");
    }

    @Then("error message under email field is displayed")
    public void errorMessageUnderEmailFieldDisplayed() {
        $(newUserPage.getEmailErrorMessage()).shouldBe(Condition.exactText("\n" +  "    User with this email already exists\n" + "  "));
        Logger.debug("Error message under email field displayed");
        Logger.info("Error message under email field displayed");
    }

    @And("disable user")
    public void disableUser() {
        $(editUserPage.getDisableCheckbox()).click();
        Logger.debug("'Disable' checkbox activated");
        Logger.info("'Disable' checkbox activated");
    }

    @And("open personal info page")
    public void openPersonalInfoPage() {
        $(headerBlock.getAvatar()).click();
        Logger.debug("'Avatar' icon pressed");
        $(headerBlock.getEditUserInfoLink()).click();
        Logger.debug("'Edit user info' link pressed");
        Logger.info("'Personal user info' page opened");
    }

    @And("edit personal info to {string} {string}")
    public void editPersonalInfo(String firstname, String lastname) {
        personalInfoPageService.editPersonalInfo(firstname, lastname);
    }

    @Then("personal user info changed to {string} {string}")
    public void personalUserInfoChanged(String firstname, String lastname) {
        $(personalInfoPage.getNameLastNameH1Element()).shouldBe(Condition.exactText(firstname + " " + lastname));
        Logger.debug("First name changed to " + firstname + ", last name changed to " + lastname + " on user info page");
        $(headerBlock.getWelcomeLine()).shouldBe(Condition.exactText("Welcome, " + firstname));
        Logger.debug("First name changed to " + firstname + " near avatar");
        $(headerBlock.getAvatar()).click();
        Logger.debug("'Avatar' icon pressed");
        $(headerBlock.getNameLastnameLine()).shouldBe(Condition.exactText(firstname + " " + lastname));
        Logger.debug("First name changed to " + firstname + ", last name changed to " + lastname + " on menu block");
    }

    @And("open change password dialog")
    public void openChangePasswordDialog() {
        $(personalInfoPage.getChangePasswordLink()).click();
        Logger.debug("'Change password' button pressed");
        Logger.info("'Change password' dialog opened");
    }

    @And("change password with {string} {string}")
    public void changePasswordWithIncorrectOldPassword(String oldPassword, String newPassword) {
        personalInfoPageService.changePassword(oldPassword, newPassword);
    }

    @Then("error message under old password field is displayed")
    public void errorMessageUnderOldPasswordFieldDisplayed() {
        $(personalInfoPage.getInvalidOldPasswordErrorMessage()).shouldBe(Condition.exactText("\n" +"    Invalid value\n" +"  "));
        Logger.debug("Error message under old password field displayed");
        Logger.info("Error message under old password field displayed");
    }

    @And("change role to {string}")
    public void changeRole(String role) {
        $(editUserPage.getRoleDropDownMenu()).click();
        Logger.debug("'Role' drop down menu opened");
        if(role.contains("Admin") || role.contains("admin")){
            $(editUserPage.getAdminCollectionElement()).click();
            Logger.debug("'Admin' selected");
        } else if(role.contains("User") || role.contains("user")){
            $(editUserPage.getUserCollectionElement()).click();
            Logger.debug("'User' selected");
        } else if(role.contains("Guest") || role.contains("guest")){
            $(editUserPage.getGuestCollectionElement()).click();
            Logger.debug("'Guest' selected");
        }
        Logger.info("Role changed");
    }

    @Then("role changed to {string}")
    public void roleChanged(String role) {
        $(editUserPage.getRoleDropDownMenu()).shouldBe(Condition.exactText(role));
        Logger.debug("Role changed to " + role);
    }

    @And("admin register user with {string} {string} {string} {string} {string} with error")
    public void adminRegisterUserWithError(String email, String firstname, String lastname,
                                           String password, String role) {
        $(usersPage.getNewUserLink()).click();
        Logger.debug("'New user' button pressed");
        newUserPageService.fillNewUserInfo(email,firstname, lastname, password, role);
        $(newUserPage.getRegisterButton()).click();
        Logger.debug("'Register' button pressed");
        $(newUserPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info("Admin registered user");
    }
}
