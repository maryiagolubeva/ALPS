package stepdefs;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.common.HeaderBlock;
import pages.contracts.ContractPage;
import pages.contracts.ContractsPage;
import pages.setup.suppliers.AddSupplierPage;
import pages.setup.suppliers.EditSupplierPage;
import pages.setup.suppliers.SuppliersPage;
import services.SuppliersPageService;
import utils.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class SuppliersStepDefs {
    SuppliersPage suppliersPage;
    AddSupplierPage addSupplierPage;
    EditSupplierPage editSupplierPage;
    HeaderBlock headerBlock;
    SuppliersPageService suppliersPageService;
    ContractPage contractPage;
    ContractsPage contractsPage;

    public SuppliersStepDefs(SuppliersPage suppliersPage, AddSupplierPage addSupplierPage,
                             EditSupplierPage editSupplierPage, HeaderBlock headerBlock,
                             SuppliersPageService suppliersPageService, ContractPage contractPage,
                             ContractsPage contractsPage) {
        this.suppliersPage = suppliersPage;
        this.addSupplierPage = addSupplierPage;
        this.editSupplierPage = editSupplierPage;
        this.headerBlock = headerBlock;
        this.suppliersPageService = suppliersPageService;
        this.contractPage = contractPage;
        this.contractsPage = contractsPage;
    }

    @When("open suppliers page")
    public void openSuppliersPage() {
        $(headerBlock.getSetupMenuLink()).click();
        Logger.debug("'Setup' link pressed");
        $(headerBlock.getSuppliersLink()).click();
        Logger.debug("'Suppliers' link pressed");
        Logger.info("'Suppliers' page opened");
    }

    @And("add new supplier {string}")
    public void addNewSupplier(String name) {
        $(suppliersPage.getAddSupplierButton()).click();
        Logger.debug("'Add supplier' button pressed");
        $(addSupplierPage.getSupplierNameField()).sendKeys(name);
        Logger.debug(name + " name entered to 'Name' field");
        $(addSupplierPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info("New supplier added");
    }

    @And("add new office {string} with {string} {string} {string} {string}")
    public void addNewOffice(String name, String address, String contactName,
                             String contactPhone, String contactEmail) {
        suppliersPageService.addNewOfficeToSupplier(name, address, contactName, contactPhone, contactEmail);
    }

    @Then("office {string} is added")
    public void officeAdded(String name) {
        sleep(2000);
        $$(editSupplierPage.getOfficesCollection()).should(CollectionCondition.containExactTextsCaseSensitive(name));
        Logger.debug(name + " office added to offices list");
        Logger.info("New office added to supplier");
    }

    @And("deactivate {string} supplier")
    public void deactivateSupplier(String name) {
        sleep(1000);
        $$(suppliersPage.getSupplierNameFields()).find(Condition.exactText(name)).click();
        Logger.debug(name + " supplier deactivated");
       $(editSupplierPage.getActiveSwitch()).click();
       Logger.debug("'Active' button pressed");
        Logger.info("Supplier deactivated");
    }

    @Then("supplier {string} is deactivated")
    public void supplierDeactivated(String name) {
        $(headerBlock.getContractsLink()).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(headerBlock.getContractsLink()).click();
        Logger.debug("'Contracts' link pressed");
        $(contractsPage.getNewContractButton()).click();
        Logger.debug("'New contract' button pressed");
        $(contractPage.getSupplierField()).click();
        Logger.debug("'Supplier' field pressed");
        $$(contractPage.getSuppliers()).find(Condition.exactText(name)).shouldNotBe(Condition.exist);
        Logger.debug(name + " supplier not displayed in suppliers list");
    }
}
