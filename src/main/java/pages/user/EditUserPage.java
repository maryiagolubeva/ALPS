package pages.user;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class EditUserPage {

    private final SelenideElement backToUsersButton = $(By.xpath("//span[text()='Users']"));

    private final SelenideElement emailField = $(By.xpath("//div[@class='box__content']//label[text()='Email']/../..//input"));

    private final SelenideElement firstNameField = $(By.xpath("//div[@class='box__content']//label[text()='Firstname']/../..//input"));

    private final SelenideElement lastNameField = $(By.xpath("//div[@class='box__content']//label[text()='Lastname']/../..//input"));

    private final SelenideElement passwordField = $(By.xpath("//div[@class='box__content']//label[text()='Password']/../..//input"));

    private final SelenideElement roleDropDownMenu = $(By.xpath("//div[@class='box__content']//label[text()='Role']/../..//div[@class='inputSelectContent focusable']"));

    private final SelenideElement generatePasswordButton = $(By.xpath("//a[text()='Generate password']"));

    private final SelenideElement disableCheckbox = $(By.xpath("//span[text()='Disable']/../span[@class='checkControl focusable']"));

    private final SelenideElement saveButton = $(By.xpath("//span[text()='Save']"));

    private final SelenideElement emailErrorMessage = $(By.xpath("//div[@class='box__content']//label[text()='Email']/../..//div[@class='errorMessage']"));

    private final SelenideElement passwordErrorMessage = $(By.xpath("//div[@class='box__content']//label[text()='Password']/../..//div[@class='errorMessage']"));

    private final SelenideElement adminCollectionElement = $(By.xpath("//div[@class='customDropDown']//li/span[text()='Admin']"));

    private final SelenideElement userCollectionElement = $(By.xpath("//div[@class='customDropDown']//li/span[text()='User']"));

    private final SelenideElement guestCollectionElement = $(By.xpath("//div[@class='customDropDown']//li/span[text()='Guest']"));

    private final SelenideElement successMessage = $(By.xpath("//section//span[text()='User updated']"));

    public EditUserPage() {
    }

}
