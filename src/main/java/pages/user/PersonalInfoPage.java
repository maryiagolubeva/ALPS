package pages.user;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class PersonalInfoPage {

    private final SelenideElement nameLastNameH1Element = $(By.xpath("//div[@class='row']//h1"));

    private final SelenideElement emailElement = $(By.xpath("//div[@class='row']//span"));

    private final SelenideElement firstNameField = $(By.xpath("//div[@class='box__content']//label[text()='First Name']/..//input"));

    private final SelenideElement lastNameField = $(By.xpath("//div[@class='box__content']//label[text()='Last Name']/..//input"));

    private final SelenideElement passwordField = $(By.xpath("//div[@class='box__content']//label[text()='Password']/..//input"));

    private final SelenideElement changePasswordLink = $(By.xpath("//div[@class='box__content']//a[text()='Change password']"));

    private final SelenideElement updateButton = $(By.xpath("//span[@class='customButtonContent']"));

    private final SelenideElement changePasswordDialog = $(By.xpath("//h1[text()='Change Password']/../../.."));

    private final SelenideElement crossDialogButton = $(By.xpath("//div[@class='modal-header']/img"));

    private final SelenideElement oldPasswordField = $(By.xpath("//label[text()='\n" + "                  Old Password\n" + "                ']/../..//div[@class='col size-8']//input"));

    private final SelenideElement newPasswordField = $(By.xpath("//label[text()='\n" + "                  New Password\n" + "                ']/../..//div[@class='col size-8']//input"));

    private final SelenideElement repeatNewPasswordField = $(By.xpath("//label[text()='\n" +  "                  Repeat New Password\n" + "                ']/../..//div[@class='col size-8']//input"));

    private final SelenideElement saveButton = $(By.xpath("//span[text()='Save']/../.."));

    private final SelenideElement hideRepeatNewPasswordIcon = $(By.xpath("//label[text()='\n" + "                  Repeat New Password\n" + "                ']/../..//img"));

    private final SelenideElement hideNewPasswordIcon = $(By.xpath("//label[text()='\n" + "                  New Password\n" + "                ']/../..//img"));

    private final SelenideElement invalidOldPasswordErrorMessage = $(By.xpath("//label[text()='\n" + "                  Old Password\n" +  "                ']/../..//div[@class='errorMessage']"));

    private final SelenideElement lastNameIsRequiredErrorMessage = $(By.xpath("//div[@class='box__content']//label[text()='Last Name']/..//div[@class='errorMessage']"));

    private final SelenideElement firstNameIsRequiredErrorMessage = $(By.xpath("//div[@class='box__content']//label[text()='First Name']/..//div[@class='errorMessage']"));

    public PersonalInfoPage() {
    }
}
