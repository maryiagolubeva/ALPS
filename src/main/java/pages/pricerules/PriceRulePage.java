package pages.pricerules;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class PriceRulePage {

    private final SelenideElement fromDateField = $(By.xpath("//div[@class='col size-8']//div[@class='date']//label[text()='Valid from']/.."));

    private final SelenideElement toDateField = $(By.xpath("//div[@class='col size-8']//div[@class='date']//label[text()='Valid to']/.."));

    private final SelenideElement nameField = $(By.xpath("//div[@class='col size-4']//label[@class='mandatory']/../div[@class='inputContent']//input"));

    private final SelenideElement currencyField = $(By.xpath("//div[@class='col size-3']//div[@label='Currency']//span"));

    private final SelenideElement gbpCurrencyElement = $(By.xpath("//div[@class='col size-3']//div[@class='customDropDown']//li/span[text()='GBP - Gbp']"));

    private final SelenideElement eurCurrencyElement = $(By.xpath("//div[@class='col size-3']//div[@class='customDropDown']//li/span[text()='EUR - Euro']"));

    private final SelenideElement salesChannelField = $(By.xpath("//div[@class='col size-3']//div[@label='Sales Channel']//span"));

    private final SelenideElement webSalesChannelCheckbox = $(By.xpath("//div[@class='col size-3']//div[@label='Sales Channel']//span[text()='Web']/..//span[@type='checkbox']"));

    private final SelenideElement selectAllSalesChannel = $(By.xpath("//a[text()=\"Select all\"]"));

    private final SelenideElement clearSalesChannel = $(By.xpath("//a[text()=\"clear\"]"));

    private final SelenideElement contactCenterSalesChannelCheckbox = $(By.xpath("//div[@class='col size-3']//div[@label='Sales Channel']//span[text()='Call Center']/..//span[@type='checkbox']"));

    private final SelenideElement rulePriorityInput = $(By.xpath("//div[@class=\"col size-2\"]//label[text()='Rule Priority']/..//input"));

    private final SelenideElement rulePriorityUpArrow = $(By.xpath("//div[@class=\"col size-2\"]//div[@class='number-controller-up  focusable']"));

    private final SelenideElement rulePriorityDownArrow = $(By.xpath("//div[@class=\"col size-2\"]//div[@class='number-controller-down focusable']"));

    private final SelenideElement netCostRadioButton = $(By.xpath("//label[@for=\"netCost\"]/span[@class='radioControl focusable']"));

    private final SelenideElement publicPriceRadioButton = $(By.xpath("//label[@for=\"publicCost\"]/span[@class='radioControl focusable']"));

    private final SelenideElement markupAmountInput = $(By.xpath("//div[@class=\"col size-3\"]//div[@label='Markup Amount']/..//input"));

    private final SelenideElement markupAmountUpArrow = $(By.xpath("//div[@class=\"col size-3\"]//div[@label='Markup Amount']/..//div[@class='number-controller-up focusable']"));

    private final SelenideElement markupAmountDownArrow = $(By.xpath("//div[@class=\"col size-3\"]//div[@label='Markup Amount']/..//div[@class='number-controller-down focusable']"));

    private final SelenideElement markupAmountMenu = $(By.xpath("//div[@class=\"col size-3\"]//div[@label='Markup Amount']//div[@class='inputSelect focusable']"));

    private final SelenideElement markupAmountFixed = $(By.xpath("//div[@class=\"col size-3\"]//div[@label='Markup Amount']//div[@class='scrollable ps']//span[text()='Fixed']"));

    private final SelenideElement markupAmountPercent = $(By.xpath("//div[@class=\"col size-3\"]//div[@label='Markup Amount']//div[@class='scrollable ps']//span[text()='%']"));

    private final SelenideElement minimumMarginInput = $(By.xpath("//div[@class=\"col size-3\"]//label[text()='Min Margin']/..//input"));

    private final SelenideElement minimumMarginUp = $(By.xpath("//div[@class=\"col size-3\"]//label[text()='Min Margin']/..//div[@class='number-controller-up focusable']"));

    private final SelenideElement minimumMarginDown = $(By.xpath("//div[@class=\"col size-3\"]//label[text()='Min Margin']/..//div[@class='number-controller-down focusable']"));

    public PriceRulePage() {
    }
}
