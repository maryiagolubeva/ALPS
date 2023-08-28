package pages.setup;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class AncillariesPage {

    private final SelenideElement addAncillaryCategoryButton = $(By.xpath("//a[text()='Add Ancillary Category']"));

    private final SelenideElement categoryNameField = $(By.xpath("//div[@class='folderEditorContainer']//div[@class='input focusable text']//label[text()='Name']/..//input"));

    private final SelenideElement saveButton = $(By.xpath("//a[text()='Save']"));

    private final SelenideElement disabledSaveButton = $(By.xpath("//span[@class='disabled rounded']"));

    private final SelenideElement cancelButton = $(By.xpath("//a[text()='Cancel']"));

    private final SelenideElement editAncillaryCategoryButton = $(By.xpath("//a[text()='Edit']"));

    private final SelenideElement deleteAncillaryCategoryButton = $(By.xpath("//a[text()='Delete']"));

    private final SelenideElement customDeleteButton = $(By.xpath("//button[@class='customButton delete']"));

    private final SelenideElement customNoButton = $(By.xpath("//button[@class='customButton textOnly']"));

    private final SelenideElement searchField = $(By.xpath("//input[@placeholder='Start typing']"));

    private ElementsCollection categoryAncillaryElements  = $$(By.xpath("//div[@class='tree larger']//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxNCIgaGVpZ2h0PSIxMiIgdmlld0JveD0iMCAwIDE0IDEyIj4KICAgIDxwYXRoIGZpbGw9IiM4NDMyOWIiIGQ9Ik0xLjE2MSAwaDIuNzFjLjM2NSAwIC43MS4xNzIuOTI5LjQ2NWwuNDY1LjYxOWMuMjE5LjI5Mi41NjMuNDY0LjkyOS40NjRoNi41OGMuNjQyIDAgMS4xNjEuNTIgMS4xNjEgMS4xNjJ2OC4xMjljMCAuNjQxLS41MiAxLjE2MS0xLjE2IDEuMTYxSDEuMTZDLjUyIDEyIDAgMTEuNDggMCAxMC44MzlWMS4xNkMwIC41Mi41MiAwIDEuMTYxIDB6Ii8+Cjwvc3ZnPgo=']/../span"));

    private ElementsCollection ancillaries = $$(By.xpath("//div[@class='tree larger']//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxMSIgaGVpZ2h0PSIxMiIgdmlld0JveD0iMCAwIDExIDEyIj4KICAgIDxwYXRoIGZpbGw9IiM3MkNBNzQiIGZpbGwtcnVsZT0iZXZlbm9kZCIgZD0iTS4yOCA4Ljk0M0MuMTI5IDIuMDYzIDQuNDg2IDEuNTI5IDEwLjUyNCAwYy0uNTM1IDUuMzUtMS42ODIgMTAuMDEzLTkuMDIgMTAuMjQyLS4xNTIuMzgyLS4zMDUuNzY0LS4zODEgMS4yMjMtLjIzLjkxNy0xLjM3Ni40NTktMS4wNy0uMjNDMS4zNSA3Ljg3NCAzLjU2NiA1LjM1IDYuMzk0IDMuMjFjMCAwLTQuMDUgMS45MTEtNi4xMTQgNS43MzN6Ii8+Cjwvc3ZnPgo=']/../span"));

    private final SelenideElement addChildButton = $(By.xpath("//a[text()='Add Child']"));

    private final SelenideElement childNameField = $(By.xpath("//div[@class='childEditorContainer']//div[@class='input focusable text']//label[text()='Name']/..//input"));

    private final SelenideElement selectionChildTypeField = $(By.xpath("//div[@class='childEditorContainer']//div[@label='Selection Type']"));

    private final SelenideElement perPersonType = $(By.xpath("//div[@class='childEditorContainer']//div[@class='customDropDown']//span[text()='Per Person']"));

    private final SelenideElement perBookingType = $(By.xpath("//div[@class='childEditorContainer']//div[@class='customDropDown']//span[text()='Per Booking']"));

    private final SelenideElement ancillaryCategoryRadiobutton = $(By.xpath("//div[@type='radio-box']//label[@for='ac1']/..//span[@class='radioLabel focusable']"));

    private final SelenideElement ancillaryRadiobutton = $(By.xpath("//div[@type='radio-box']//label[@for='ac2']/..//span[@class='radioLabel focusable']"));

    private final SelenideElement atolProtectedCheckbox = $(By.xpath("//div[@class='childEditorContainer']//div[@class='inputCheckBoxGroup focusable']//label[@for='atolProtected']//span[@class='checkControl focusable']"));

    private final SelenideElement manifestCheckbox = $(By.xpath("//div[@class='childEditorContainer']//div[@class='inputCheckBoxGroup focusable']//label[@for='manifest']//span[@class='checkControl focusable']"));

    private final SelenideElement showHeightCheckbox = $(By.xpath("//div[@class='childEditorContainer']//div[@class='inputCheckBoxGroup focusable']//label[@for='showHeight']//span[@class='checkControl focusable']"));

    private final SelenideElement showShoeSizeCheckbox = $(By.xpath("//div[@class='childEditorContainer']//div[@class='inputCheckBoxGroup focusable']//label[@for='showShoeSize']//span[@class='checkControl focusable']"));

    private final SelenideElement showSkiGradeCheckbox = $(By.xpath("//div[@class='childEditorContainer']//div[@class='inputCheckBoxGroup focusable']//label[@for='showSkiGrade']//span[@class='checkControl focusable']"));

    private final SelenideElement errorMessage = $(By.xpath("//p[text()='You cannot delete this ancillary because it is contained in some contracts.']"));

    private final SelenideElement closeErrorMessageButton = $(By.xpath("//div[@class='modal-header']/img"));

    private final SelenideElement successMessage = $(By.xpath("//section//span[text()='category saved successfully.']"));

    private final SelenideElement successDeleteMessage = $(By.xpath("//header/section/div/span"));

    public AncillariesPage() {
    }

}
