package pages.setup;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class CarriersPage {

    private final SelenideElement addCarrierButton = $(By.xpath("//a[text()='Add carrier']"));

    private final SelenideElement searchField = $(By.xpath("//input[@placeholder='Start typing']"));

    private static ElementsCollection carrierNameFields = $$(By.xpath("//div[@class='col size-5']//input"));

    private ElementsCollection carrierNameErrorMessageFields = $$(By.xpath("//div[@class='col size-5']//div[@class='errorMessage']"));

    private ElementsCollection externalMapIdFields = $$(By.xpath("//div[@class='col size-4']//input"));

    private ElementsCollection externalMapIdErrorMessageFields = $$(By.xpath("//div[@class='col size-4']//div[@class='errorMessage']"));

    private ElementsCollection carrierStatusElements = $$(By.xpath("//div[@type='toggle']//span"));

    private ElementsCollection editButtons = $$(By.xpath("//a[text()='Edit']"));

    private ElementsCollection saveButtons = $$(By.xpath("//a[text()='Save']"));

    private ElementsCollection deleteButtons = $$(By.xpath("//a[text()='Delete']"));

    private final SelenideElement newCarrierDialog = $(By.xpath("//h1[text()='New Carrier']/../.."));

    private final SelenideElement crossDialogButton = $(By.xpath("//div[@class='modal-header']/img"));

    private final SelenideElement nameField = $(By.xpath("//label[text()='Name']/../..//input"));

    private final SelenideElement externalMappingIdField = $(By.xpath("//label[text()='External Mapping ID']/../..//input"));

    private final SelenideElement saveButton = $(By.xpath("//span[text()='Save']/../.."));

    private final SelenideElement nameErrorMessage = $(By.xpath("//label[text()='Name']/../..//div[@class='errorMessage']"));

    private final SelenideElement externalMappingIdErrorMessage = $(By.xpath("//label[text()='External Mapping ID']/../..//div[@class='errorMessage']"));

    private final SelenideElement successMessage = $(By.xpath("//section//span[text()='Carrier saved successfully']"));

    private final SelenideElement errorMessage = $(By.xpath("//section//span[text()='Error: unable to save carrier!']"));

    //Pagination elements

    private final SelenideElement numericSelectElement = $(By.xpath("//div[@class='numeric-select']"));

    private final ElementsCollection paginationElements = $$(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']"));

    private SelenideElement activePaginationElement = $(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']/label[@class='active']"));

    private final ElementsCollection paginationArrows = $$(By.xpath("//div[@class='pagination__action']"));

    public CarriersPage() {
    }

}
