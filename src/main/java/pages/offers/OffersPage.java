package pages.offers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.Collection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class OffersPage {

    //Search block

    private final SelenideElement searchButton = $(By.xpath("//span[text()='Search']"));

    private final SelenideElement clearFiltersButton = $(By.xpath("//a[text()='Clear filters']"));

    private final SelenideElement newOfferButton = $(By.xpath("//span[@class='rounded shadow']/a"));

    private final SelenideElement fromDateField = $(By.xpath("//span/strong[text()='From:']"));

    private final SelenideElement toDateField = $(By.xpath("//span/strong[text()='To:']"));

    private final SelenideElement supplierField = $(By.xpath("//div[@class=\"col size-4\"]//label[text()='Supplier']/..//input[@placeholder=\"Start typing\"]"));

    private final SelenideElement supplierElements = $(By.xpath("//div[@class=\"col size-4\"]//label[text()='Supplier']/..//div[@class='customDropDown']//span"));

    private final SelenideElement supplierCrossButton = $(By.xpath("    private final SelenideElement supplierElements = $(By.xpath(\"//div[@class=\\\"col size-4\\\"]//label[text()='Supplier']/..//div[@class='customDropDown']//span\"));\n"));

    private final SelenideElement locationField = $(By.xpath("//div[@class=\"col size-4\"]//label[text()='Location']/..//input[@placeholder=\"Start typing\"]"));

    private final SelenideElement typeField = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Type']"));

    private final SelenideElement allTypeField = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Type']//div[@class=\"customDropDown\"]//span[text()='All']"));

    private final SelenideElement offerTypeField = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Type']//div[@class=\"customDropDown\"]//span[text()='Offer']"));

    private final SelenideElement bundleTypeField = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Type']//div[@class=\"customDropDown\"]//span[text()='Bundle']"));

    private final SelenideElement hasQuotasField = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Has Quotas']"));

    private final SelenideElement allHasQuotasElement = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Has Quotas']//div[@class=\"customDropDown\"]//span[text()='All']"));

    private final SelenideElement yesHasQuotasElement = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Has Quotas']//div[@class=\"customDropDown\"]//span[text()='Yes']"));

    private final SelenideElement noHasQuotasElement = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Has Quotas']//div[@class=\"customDropDown\"]//span[text()='No']"));

    private final SelenideElement marketableField = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Marketable']"));

    private final SelenideElement allMarketableElement = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Marketable']//div[@class=\"customDropDown\"]//span[text()='All']"));

    private final SelenideElement yesMarketableElement = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Marketable']//div[@class=\"customDropDown\"]//span[text()='Yes']"));

    private final SelenideElement noMarketableElement = $(By.xpath("//div[@class=\"col size-4\"]//div[@label='Marketable']//div[@class=\"customDropDown\"]//span[text()='No']"));

    private final SelenideElement offersBundlesField = $(By.xpath("//div[@class=\"col size-8\"]//div[@label='Offers/Bundles']//input[@placeholder=\"Start typing\"]"));

    private final SelenideElement locationArrow = $(By.xpath("//div[@class=\"locationSelector compact\"]/span"));

    private ElementsCollection locations = $$(By.xpath("//div[@class='tree larger']/div//span"));

    private ElementsCollection locationsArrows = $$(By.xpath("//div[@class='tree larger']/div//span[@class='icon-space']"));

    //Offers table

    private final SelenideElement liveTab = $(By.xpath("//div[@class='row']//li[@class='active']"));

    private final SelenideElement draftTab = $(By.xpath("//div[@class='row']//li[contains(text(), 'DRAFT')]"));

    private final SelenideElement expiredTab = $(By.xpath("//div[@class='row']//li[contains(text(), 'EXPIRED')]"));

    private final SelenideElement nameSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Name')]"));

    private final SelenideElement typeSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Type')]"));

    private final SelenideElement descriptionSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Description')]"));

    private final SelenideElement validFromSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Valid From')]"));

    private final SelenideElement validToSortingElement = $(By.xpath("//div[@class='table-header-row row expandable-col']//span[contains(text(), 'Valid To')]"));

    private final ElementsCollection expandOfferDataArrows = $$(By.xpath("//span[@class=\"toggle\"]"));

    private final ElementsCollection offerNames = $$(By.xpath("//div[@class='actions']//div[@class='focusable action']/span/a"));

    private final ElementsCollection offerDescriptions = $$(By.xpath("//div[@class='col size-4'][1]//div[@class='defaultCell']"));

    private final ElementsCollection validFromElements = $$(By.xpath("//div[@class='col size-2']//div[@class='defaultCell']"));

    private final ElementsCollection validToElements = $$(By.xpath("//div[@class='col size-1']//div[@class='defaultCell']"));

    private final ElementsCollection editButtons = $$(By.xpath("//a[text()='Edit']"));

    private final ElementsCollection expireButtons = $$(By.xpath("//div[@class='col size-1']//span[2]//div[@class='focusable action']/span/img"));

    //Pagination elements

    private final SelenideElement numericSelectElement = $(By.xpath("//div[@class='numeric-select']"));

    private final ElementsCollection paginationElements = $$(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']"));

    private SelenideElement activePaginationElement = $(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']/label[@class='active']"));

    private final ElementsCollection paginationArrows = $$(By.xpath("//div[@class='pagination__action']"));

    public OffersPage() {
    }

}
