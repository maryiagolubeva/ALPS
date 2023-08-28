package services;

import pages.user.PersonalInfoPage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.$;

public class PersonalInfoPageService {

    PersonalInfoPage personalInfoPage = new PersonalInfoPage();

    public void editPersonalInfo(String firstname, String lastname){
        $(personalInfoPage.getFirstNameField()).clear();
        Logger.debug("'First name' field cleared");
        $(personalInfoPage.getFirstNameField()).sendKeys(firstname);
        Logger.debug(firstname + " name entered to 'First name' field");
        $(personalInfoPage.getLastNameField()).clear();
        Logger.debug("'Last name' field cleared");
        $(personalInfoPage.getLastNameField()).sendKeys(lastname);
        Logger.debug(lastname + " last name entered to 'Last name' field");
        $(personalInfoPage.getUpdateButton()).click();
        Logger.debug("'Update' button pressed");
        Logger.info("User personal info edited");
    }

    public void changePassword(String oldPassword, String newPassword){
        $(personalInfoPage.getOldPasswordField()).sendKeys(oldPassword);
        Logger.debug("Old password entered to 'Old password' field");
        $(personalInfoPage.getNewPasswordField()).sendKeys(newPassword);
        Logger.debug("New password entered to 'New password' field");
        $(personalInfoPage.getRepeatNewPasswordField()).sendKeys(newPassword);
        Logger.debug("New password entered to 'Repeat new password' field");
        $(personalInfoPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info("User password changed");
    }
}
