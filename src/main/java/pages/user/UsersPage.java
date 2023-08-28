package pages.user;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import java.util.Collection;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class UsersPage {

    private final SelenideElement newUserLink = $(By.xpath("//a[text()='New user']"));

    private ElementsCollection userInfo = $$(By.xpath("//div[@class='col size-3']//div[@class='defaultCell']//span"));

    private ElementsCollection userRoles = $$(By.xpath("//div[@class='defaultCell blue']//span"));

    private ElementsCollection editButtons = $$(By.xpath("//a[text()='Edit']"));

    //Pagination elements

    private final SelenideElement numericSelectElement = $(By.xpath("//div[@class='numeric-select']"));

    private final ElementsCollection paginationElements = $$(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']"));

    private SelenideElement activePaginationElement = $(By.xpath("//div[@class='customTablePagination']//div[@class='pagination']/label[@class='active']"));

    private final ElementsCollection paginationArrows = $$(By.xpath("//div[@class='pagination__action']"));

    public UsersPage() {
    }

}
