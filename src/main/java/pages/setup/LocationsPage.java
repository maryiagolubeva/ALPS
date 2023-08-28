package pages.setup;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class LocationsPage {

    private final SelenideElement addRootLocationButton = $(By.xpath("//a[text()='Add Root Location']"));

    private final SelenideElement rootLocationNameField = $(By.xpath("//h2[text()='\n" + "        New Root Location\n" + "      ']/..//label[text()='Name']/..//input"));

    private final SelenideElement externalMappingIdRootLocationField = $(By.xpath("//h2[text()='\n" +  "        New Root Location\n" + "      ']/..//label[text()='External Mapping ID']/..//input"));

    private final SelenideElement saveButton = $(By.xpath("//a[text()='Save']"));

    private final SelenideElement cancelButton = $(By.xpath("//a[text()='Cancel']"));

    private final SelenideElement editRootLocationButton = $(By.xpath("//a[text()='Edit']"));

    private final SelenideElement deleteRootLocationButton = $(By.xpath("//a[text()='Delete']"));

    private final SelenideElement customDeleteButton = $(By.xpath("//button[@class='customButton delete']"));

    private final SelenideElement customNoButton = $(By.xpath("//button[@class='customButton textOnly']"));

    private final SelenideElement searchField = $(By.xpath("//input[@placeholder='Start typing']"));

    private ElementsCollection locationElements = $$(By.xpath("//div[@class='tree larger']//span"));

    private final SelenideElement addChildButton = $(By.xpath("//a[text()='Add Child']"));

    private final SelenideElement childNameField = $(By.xpath("//h3[text()='New Child']/..//label[text()='Name']/..//input"));

    private final SelenideElement childExternalMappingIdField = $(By.xpath("//h3[text()='New Child']/..//label[text()='External Mapping ID']/..//input"));

    private final SelenideElement locationCheckbox = $(By.xpath("//span[text()='Location']/../span[@class='radioControl focusable']"));

    private final SelenideElement accommodationCheckbox = $(By.xpath("//span[text()='Accommodation']/../span[@class='radioControl focusable']"));

    private final SelenideElement errorMessage = $(By.xpath("//p[text()='You cannot delete this lecation because it is contained in some contracts or offers or it contains accomodation inserted inside some contracts or offers.']"));

    private final SelenideElement closeErrorMessageButton = $(By.xpath("//div[@class='modal-header']/img"));

    private final SelenideElement successMessage = $(By.xpath("//section//span[text()='Location saved successfully']"));

    public LocationsPage() {
    }

}
