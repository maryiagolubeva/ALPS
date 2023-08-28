package services;

import pages.setup.suppliers.EditSupplierPage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.*;

public class SuppliersPageService {
    EditSupplierPage editSupplierPage = new EditSupplierPage();

    public void addNewOfficeToSupplier(String name, String address, String contactName,
                                       String contactPhone, String contactEmail){
        $(editSupplierPage.getAddOfficesButton()).click();
        Logger.debug("'Add Offices' button pressed");
        $(editSupplierPage.getOfficeNameField()).sendKeys(name);
        Logger.debug(name + " name entered to 'Name' field");
        $(editSupplierPage.getAddressField()).sendKeys(address);
        Logger.debug(address + " address entered to 'Address' field");
        $(editSupplierPage.getContactNameField()).sendKeys(contactName);
        Logger.debug(contactName + " contact name entered to 'Contact name' field");
        $(editSupplierPage.getContactPhoneField()).sendKeys(contactPhone);
        Logger.debug(contactPhone + " contact phone entered to 'Contact Phone' field");
        $(editSupplierPage.getContactEmailField()).sendKeys(contactEmail);
        Logger.debug(contactEmail + " contact email entered to 'Contact Email' field");
        $(editSupplierPage.getSelectLocationArrow()).click();
        Logger.debug("'Select location' arrow pressed");
        $$(editSupplierPage.getLocationElements()).get(1).click();
        Logger.debug("First location selected");
        $(editSupplierPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info("New office added to supplier");
    }
}
