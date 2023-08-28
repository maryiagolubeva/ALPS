package pages.login;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class LoginPage {

    private final SelenideElement emailField = $(By.xpath("//div[@class='input focusable text']//label[text()='Email']/..//input"));

    private final SelenideElement hiddenPasswordField = $(By.xpath("//label[text()='Password']/..//div[@class='inputContent']//input[@type=\"password\"]"));

    private final SelenideElement passwordField = $(By.xpath("//label[text()='Password']/..//div[@class='inputContent']//input[@type=\"text\"]"));

    private final SelenideElement loginButton = $(By.xpath("//span[text()='Login']"));

    private final SelenideElement errorMessage = $(By.xpath("//span[text()='Error: invalid credentials']"));

    private final SelenideElement hidePasswordIcon = $(By.xpath("//span[@class='password-icon']/img"));

    public LoginPage() {
    }

}
