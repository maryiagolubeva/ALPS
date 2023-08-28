package pages.setup.suppliers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
@Getter
public class SuppliersPage {

    private final SelenideElement addSupplierButton = $(By.xpath("//a[text()='Add supplier']"));

    private final SelenideElement searchField = $(By.xpath("//input[@placeholder='Start typing']"));

    private final SelenideElement selectLocationField = $(By.xpath("//input[@placeholder='Select Location']"));

    private final SelenideElement selectLocationArrow = $(By.xpath("//div[@class='locationSelector compact']//img"));

    private ElementsCollection locationElements = $$(By.xpath("//div[@class='tree larger']//span"));

    private ElementsCollection supplierNameFields = $$(By.xpath("//div[@class='col size-9']//div[@class='defaultCell']//span"));

    private ElementsCollection supplierOfficeFields = $$(By.xpath("//div[@class='defaultCell center']//span"));

    private final SelenideElement supplierSortingElement = $(By.xpath("//span[text()='Supplier']"));

    private final SelenideElement statusSortingElement = $(By.xpath("//span[text()='Status']"));

    //Pagination elements

    private final SelenideElement numericSelectElement = $(By.xpath("//div[@class='numeric-select']"));

    private final ElementsCollection paginationElements = $$(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']"));

    private SelenideElement activePaginationElement = $(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']/label[@class='active']"));

    private final ElementsCollection paginationArrows = $$(By.xpath("//div[@class='pagination__action']"));

    public SuppliersPage() {
    }


}
