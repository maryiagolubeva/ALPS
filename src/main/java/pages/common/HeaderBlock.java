package pages.common;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Getter
public class HeaderBlock {

    private final SelenideElement logo = $(By.xpath("//header/img[@src='/_nuxt/img/logo.153c44f.svg']"));

    private final SelenideElement contractsLink = $(By.xpath("//header//a[text()='Contracts']"));

    private final SelenideElement priceRulesLink = $(By.xpath("//header//a[text()='Price Rules']"));

    private final SelenideElement offersLink = $(By.xpath("//header//a[text()='Offers & Bundles']"));

    private final SelenideElement setupMenuLink = $(By.xpath("//header//a[text()='Setup']"));

    private final SelenideElement ancillariesLink = $(By.xpath("//main[@class='inMenu']//a[text()='Ancillaries']"));

    private final SelenideElement carriersLink = $(By.xpath("//main[@class='inMenu']//a[text()='Carriers']"));

    private final SelenideElement currencyRateExchangesLink = $(By.xpath("//main[@class='inMenu']//a[text()='Currency Rate Exchanges']"));

    private final SelenideElement locationLink = $(By.xpath("//main[@class='inMenu']//a[text()='Location']"));

    private final SelenideElement suppliersLink = $(By.xpath("//main[@class='inMenu']//a[text()='Suppliers']"));

    private final SelenideElement welcomeLine = $(By.xpath("//header//aside//span"));

    private final SelenideElement avatar = $(By.xpath("//header//aside//img"));

    private final SelenideElement editUserInfoLink = $(By.xpath("//div[@class='user-info']"));

    private final SelenideElement nameLastnameLine = $(By.xpath("//div[@class='user-info']/h3"));

    private final SelenideElement reportsLink = $(By.xpath("//div[@class='actions']//a[text()='Reports']"));

    private final SelenideElement ordersLink = $(By.xpath("//div[@class='actions']//a[text()='Orders']"));

    private final SelenideElement usersLink = $(By.xpath("//div[@class='actions']//a[text()='Users']"));

    private final SelenideElement logoutLink = $(By.xpath("//div[@class='actions']//a[text()='Log out']"));

    public HeaderBlock() {
    }


}
