package pages.setup.suppliers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.Collection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
@Getter
public class EditSupplierPage {

    private final SelenideElement supplierNameField = $(By.xpath("//label[text()='Supplier Name']/..//input"));

    private final SelenideElement allowCheckbox = $(By.xpath("//span[@class='checkControl focusable']"));

    private final SelenideElement activeSwitch = $(By.xpath("//label[text()='Active']/../div[@class='toggle']/div"));

    private final SelenideElement addOfficesButton = $(By.xpath("//a[text()='Add Offices']"));

    private final SelenideElement officeNameField = $(By.xpath("//div[@class='officeEditor']//label[text()='Office Name']/..//input"));

    private final SelenideElement locationField = $(By.xpath("//div[@class='officeEditor']//label[text()='Location']/..//input"));

    private final SelenideElement addressField = $(By.xpath("//div[@class='officeEditor']//label[text()='Address']/..//input"));

    private final SelenideElement contactNameField = $(By.xpath("//div[@class='officeEditor']//label[text()='Contact Name']/..//input"));

    private final SelenideElement contactPhoneField = $(By.xpath("//div[@class='officeEditor']//label[text()='Contact Phone']/..//input"));

    private final SelenideElement contactEmailField = $(By.xpath("//div[@class='officeEditor']//label[text()='Contact Email']/..//input"));

    private final SelenideElement saveButton = $(By.xpath("//a[text()='Save']"));

    private final SelenideElement cancelButton = $(By.xpath("//a[text()='Cancel']"));

    private ElementsCollection contractsCollection = $$(By.xpath("//div[@class='col size-6']//h2[text()='\n" + "          Contracts\n" +  "        ']/../..//p"));

    private ElementsCollection officesCollection = $$(By.xpath("//div[@class='col size-6']//h2[text()='\n" +
            "          Offices\n" +
            "        ']/../..//li/span"));

    private ElementsCollection locationElements = $$(By.xpath("//div[@class='tree larger']/div//span"));

    private final SelenideElement selectLocationArrow = $(By.xpath("//div[@class='locationSelector compact']//img"));

    private final SelenideElement backToSupplierButton = $(By.xpath("//span[text()='Back to supplier']"));

    public EditSupplierPage() {
    }


}
