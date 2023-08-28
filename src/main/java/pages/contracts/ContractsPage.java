package pages.contracts;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.Collection;

import static com.codeborne.selenide.Selenide.*;

@Getter
public class ContractsPage {
    //Search block

    private final SelenideElement searchButton = $(By.xpath("//span[text()='Search']"));

    private final SelenideElement clearFiltersButton = $(By.xpath("//a[text()='Clear filters']"));

    private final SelenideElement newContractButton = $(By.xpath("//span[@class='rounded shadow']/a"));

    private final SelenideElement fromDateField = $(By.xpath("//span/strong[text()='From:']"));

    private final SelenideElement toDateField = $(By.xpath("//span/strong[text()='To:']"));

    private final SelenideElement locationField = $(By.xpath("//div[@class=\"col size-4\"]//div[@class='inputContent']//input[@placeholder=\"Start typing\"]"));

    private final SelenideElement locationArrow = $(By.xpath("//div[@class=\"locationSelector compact\"]/span"));

    private ElementsCollection locations = $$(By.xpath("//div[@class='tree larger']/div//span"));

    private ElementsCollection locationsArrows = $$(By.xpath("//div[@class='tree larger']/div//span[@class='icon-space']"));

    private final SelenideElement statusField = $(By.xpath("//span[text()='Select Status']"));

    private final SelenideElement onSaleStatusField = $(By.xpath("//div[@class='customDropDown']//span[text()='On Sale']"));

    private final SelenideElement suspendedStatusField = $(By.xpath("//div[@class='customDropDown']//span[text()='Suspended']"));

    private final SelenideElement contractsField = $(By.xpath("//div[@class=\"col size-8\"]//div[@class='inputContent']//input[@placeholder=\"Start typing\"]"));

    //Contracts table

    private final SelenideElement liveTab = $(By.xpath("//div[@class='row']//li[@class='active']"));

    private final SelenideElement draftTab = $(By.xpath("//div[@class='row']//li[contains(text(), 'DRAFT')]"));

    private final SelenideElement expiredTab = $(By.xpath("//div[@class='row']//li[contains(text(), 'EXPIRED')]"));

    private final SelenideElement descriptionSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Description')]"));

    private final SelenideElement validFromSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Valid From')]"));

    private final SelenideElement validToSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Valid To')]"));

    private final SelenideElement selectAllContractsCheckbox = $(By.xpath("//span[@class=\"checkControl focusable blueStyle crystal\"]"));

    private final ElementsCollection selectContractCheckboxes = $$(By.xpath("//span[@class=\"checkControl focusable blueStyle\"]"));

    private final ElementsCollection expandContractDataArrows = $$(By.xpath("//span[@class=\"toggle\"]"));

    private final ElementsCollection contractDescriptions = $$(By.xpath("//div[@class='actions']//div[@class='focusable action']/span/a"));

    private final ElementsCollection validFromElements = $$(By.xpath("//div[@class='col size-2'][1]//div[@class='defaultCell center']"));

    private final ElementsCollection validToElements = $$(By.xpath("//div[@class='col size-2'][2]//div[@class='defaultCell center']"));

    private final ElementsCollection editButtons = $$(By.xpath("//div[@class='actions simple']"));

    private final SelenideElement copySelectedButton = $(By.xpath("//a[text()='Copy Selected']"));

    //Pagination elements

    private final SelenideElement numericSelectElement = $(By.xpath("//div[@class='numeric-select']"));

    private final ElementsCollection paginationElements = $$(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']"));

    private SelenideElement activePaginationElement = $(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']/label[@class='active']"));

    private final ElementsCollection paginationArrows = $$(By.xpath("//div[@class='pagination__action']"));

    private final SelenideElement emailField = $(By.xpath("//div[@class='inputContent']//div[@class='inputText focusable']/input[@type=\"text\"]"));

    private final SelenideElement passwordField = $(By.xpath("//div[@class='inputContent']//div[@class='inputText focusable']/input[@type=\"password\"]"));

    private final SelenideElement loginButton = $(By.xpath("//span[text()='Login']"));

    public ContractsPage() {
    }

}
