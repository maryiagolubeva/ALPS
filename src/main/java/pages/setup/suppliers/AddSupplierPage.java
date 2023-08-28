package pages.setup.suppliers;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
@Getter
public class AddSupplierPage {

    private final SelenideElement supplierNameField = $(By.xpath("//label[text()='Supplier Name']/..//input"));

    private final SelenideElement saveButton = $(By.xpath("//a[text()='Save']"));

    private final SelenideElement backToSupplierButton = $(By.xpath("//span[text()='Back to supplier']"));

    public AddSupplierPage() {
    }

}
