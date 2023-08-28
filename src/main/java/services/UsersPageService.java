package services;

import pages.user.NewUserPage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.$;

public class UsersPageService {
    NewUserPage newUserPage = new NewUserPage();

    public void fillNewUserInfo(String email, String firstname, String lastname, String password, String role){
        $(newUserPage.getEmailField()).sendKeys(email);
        Logger.debug(email + " email entered to 'Email' field");
        $(newUserPage.getFirstNameField()).sendKeys(firstname);
        Logger.debug(firstname + " first name entered to 'First name' field");
        $(newUserPage.getLastNameField()).sendKeys(lastname);
        Logger.debug(lastname + " last name entered to 'Last name' field");
        $(newUserPage.getPasswordField()).sendKeys(password);
        Logger.debug("Password entered to 'Password' field");
        $(newUserPage.getRoleDropDownMenu()).click();
        if(role.contains("Admin") || role.contains("admin")){
            $(newUserPage.getAdminListElement()).click();
            Logger.debug("Admin selected for 'Role' drop-down menu");
        } else if(role.contains("User") || role.contains("user")){
            $(newUserPage.getUserListElement()).click();
            Logger.debug("User selected for 'Role' drop-down menu");
        } else if(role.contains("Guest") || role.contains("guest")){
            $(newUserPage.getGuestListElement()).click();
            Logger.debug("Guest selected for 'Role' drop-down menu");
        }
        Logger.info("New user info filled");

    }
}
