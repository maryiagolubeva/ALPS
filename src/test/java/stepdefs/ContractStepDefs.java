package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.common.HeaderBlock;
import pages.contracts.ContractPage;
import pages.contracts.ContractsPage;
import services.contract.ContractPageService;
import utils.Logger;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.url;

public class ContractStepDefs {
    ContractPage contractPage;
    ContractsPage contractsPage;
    ContractPageService contractPageService;
    HeaderBlock headerBlock;

    public ContractStepDefs(ContractPage contractPage, ContractsPage contractsPage,
                            ContractPageService contractPageService, HeaderBlock headerBlock) {
        this.contractPage = contractPage;
        this.contractsPage = contractsPage;
        this.contractPageService = contractPageService;
        this.headerBlock = headerBlock;
    }

    @When("open new contract page")
    public void openNewContractPage() {
        $(contractsPage.getNewContractButton()).click();
        Logger.debug("'New contract' button pressed");
        Logger.info("'New contract' page opened");
    }

    @And("add {string} to description")
    public void addDescription(String description) {
        sleep(1000);
        $(contractPage.getContractDescriptionField()).shouldBe(Condition.visible, Duration.ofSeconds(2));
        $(contractPage.getContractDescriptionField()).sendKeys(description);
        Logger.debug(description + " description entered to 'Description' field");
        Logger.info("Description entered to 'Description' field");
    }

    @And("select {string} {string} to net cost currency and public price currency")
    public void selectNetCostCurrencyAndPublicPriceCurrency(String netCost, String publicPrice) {
        $(contractPage.getNetCostCurrencyField()).click();
        if(netCost.equals("USD")){
            $(contractPage.getUsdNetCostCurrencyElement()).click();
            Logger.debug("'USD' selected for 'Net Cost' field");
        } else if(netCost.equals("SEK")){
            $(contractPage.getSekNetCostCurrencyElement()).click();
            Logger.debug("'SEK' selected for 'Net Cost' field");
        } else if(netCost.equals("NOK")){
            $(contractPage.getNokNetCostCurrencyElement()).click();
            Logger.debug("'NOK' selected for 'Net Cost' field");
        } else if(netCost.equals("GBP")){
            $(contractPage.getGbpNetCostCurrencyElement()).click();
            Logger.debug("'GBP' selected for 'Net Cost' field");
        } else if(netCost.equals("EUR")){
            $(contractPage.getEurNetCostCurrencyElement()).click();
            Logger.debug("'EUR' selected for 'Net Cost' field");
        } else if(netCost.equals("CHF")){
            $(contractPage.getChfNetCostCurrencyElement()).click();
            Logger.debug("'CHF' selected for 'Net Cost' field");
        } else if(netCost.equals("CAD")){
            $(contractPage.getCadNetCostCurrencyElement()).click();
            Logger.debug("'CAD' selected for 'Net Cost' field");
        } else if(netCost.equals("BGN")){
            $(contractPage.getBgnNetCostCurrencyElement()).click();
            Logger.debug("'BGN' selected for 'Net Cost' field");
        }

        $(contractPage.getPublicPriceCurrencyField()).click();
        if(publicPrice.equals("USD")){
            $(contractPage.getUsdPublicPriceElement()).click();
            Logger.debug("'USD' selected for 'Public Price' field");
        } else if(publicPrice.equals("SEK")){
            $(contractPage.getSekPublicPriceElement()).click();
            Logger.debug("'SEK' selected for 'Public Price' field");
        } else if(publicPrice.equals("NOK")){
            $(contractPage.getNokPublicPriceElement()).click();
            Logger.debug("'NOK' selected for 'Public Price' field");
        } else if(publicPrice.equals("GBP")){
            $(contractPage.getGbpPublicPriceElement()).click();
            Logger.debug("'GBP' selected for 'Public Price' field");
        } else if(publicPrice.equals("EUR")){
            $(contractPage.getEurPublicPriceElement()).click();
            Logger.debug("'EUR' selected for 'Public Price' field");
        } else if(publicPrice.equals("CHF")){
            $(contractPage.getChfPublicPriceElement()).click();
            Logger.debug("'CHF' selected for 'Public Price' field");
        } else if(publicPrice.equals("CAD")){
            $(contractPage.getCadPublicPriceElement()).click();
            Logger.debug("'CAD' selected for 'Public Price' field");
        } else if(publicPrice.equals("BGN")){
            $(contractPage.getBgnPublicPriceElement()).click();
            Logger.debug("'BGN' selected for 'Public Price' field");
        }
        Logger.info("Net cost & Public price currencies selected");

    }

    @And("select {string} supplier and {string} office")
    public void selectSupplier(String supplier, String office) {
        $(contractPage.getSupplierField()).click();
        Logger.debug("'Supplier' field pressed");
        $$(contractPage.getSuppliers()).find(Condition.exactText(supplier)).click();
        Logger.debug(supplier + " supplier selected for 'Supplier' field");

        //Page is refreshed after supplier selection, so I need a sleep() to wait this refresh
        sleep(4000);
        $(contractPage.getOfficeField()).click();
        Logger.debug("'Office' field pressed");
        $$(contractPage.getOffices()).find(Condition.exactText(office)).click();
        Logger.debug(office + " office selected for 'Office' field");
        Logger.info("Supplier selected");
    }

    @And("add {string} display name, {string} display description, {string} supplier's ancillary name")
    public void addAncillaryInfo(String displayName, String displayDescription, String suppliersAncillaryName) {
        $(contractPage.getDisplayNameField()).sendKeys(displayName);
        Logger.debug(displayName + " display name entered to 'Display name' field");
        $(contractPage.getDisplayDescriptionField()).sendKeys(displayDescription);
        Logger.debug(displayDescription + " display description entered to 'Display description' field");
        $(contractPage.getSuppliersAncillaryNameField()).sendKeys(suppliersAncillaryName);
        Logger.debug(suppliersAncillaryName + " suppliers ancillary name entered to 'Suppliers ancillary name' field");
        Logger.info("Ancillary info added");
    }


    @And("add {string} condition with operator {string} and parameter {string}")
    public void addConditionToAncillary(String condition, String operator, String parameter) {
        $(contractPage.getAddAncillaryConditionsButton()).click();
        Logger.debug("'Add ancillary conditions' button pressed");
        $(contractPage.getAncillaryConditionsFilterField()).click();
        Logger.debug("'Filter' field pressed");
        $$(contractPage.getAncillaryConditionsCollection()).find(Condition.exactText(condition)).click();
        Logger.debug(condition + " condition selected");
        $(contractPage.getAncillaryConditionsOperatorField()).click();
        Logger.debug("'Operator' field pressed");
       $$(contractPage.getAncillaryOperatorCollection()).find(Condition.exactText(operator)).click();
        Logger.debug(operator + " operator selected");
        $(contractPage.getAncillaryConditionsParameterField()).sendKeys(parameter);
        Logger.debug(parameter + " name entered to 'Parameter' field");
        Logger.info("Condition added to ancillary");
    }

    @And("add cost with {string} public price and {string} net cost")
    public void addPublicPriceNetCost(String publicPrice, String netCost) {
        $(contractPage.getAddCostsButton()).scrollIntoView(false).click();
        Logger.debug("'Add costs' button pressed");
        $$(contractPage.getAddCostConditionButtons()).get(0).click();
        Logger.debug("'Add costs conditions' button pressed");
        $(contractPage.getNetCostForSuppliedFields()).sendKeys(netCost);
        Logger.debug(netCost + " netCost entered to 'Net cost' field");
        $(contractPage.getPublicPriceForSuppliedFields()).sendKeys(publicPrice);
        Logger.debug(publicPrice + " public price entered to 'Public price' field");
        Logger.info("Public price & net cost added to ancillary");
    }

    @And("activate contract")
    public void activateContract() {
        $(contractPage.getActivateButton()).click();
        Logger.debug("'Activate' button pressed");
        $(contractPage.getCustomActivateButton()).scrollIntoView(false).click();
        Logger.debug("'Activate' custom button pressed");
        Logger.info("Contract activated");
    }

    @Then("contract is activated")
    public void contractActivated() {
        $(contractPage.getLabel()).shouldBe(Condition.exactText("On Sale"));
        Logger.debug("Contract changed status to 'On Sale'");
        Logger.info("Contract changed status to 'On Sale'");
        //sleep to show results
        sleep(3000);
    }

    @And("add {string} ancillary from {string}, {string}, {string}, {string}, {string}")
    public void addAncillary(String ancillary, String rootCategory, String category1,
                             String category2, String category3, String category4) {

        $(contractPage.getAddAncillaryButton()).click();
        Logger.debug("'Add ancillary' button pressed");
        contractPageService.selectAncillary(ancillary, rootCategory, category1, category2, category3, category4);
        Logger.info("Ancillary added to contract");
    }

    @And("add valid from {string} {string} {string}")
    public void addValidFromContract(String day, String month, String year) {
        $(contractPage.getFromDateField()).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(contractPage.getFromDateField()).click();
        Logger.debug("'From date' pressed");
        contractPageService.selectDate(day, month, year);
        Logger.info("Valid from added to contract");
    }

    @And("add valid to {string} {string} {string}")
    public void addValidToContract(String day, String month, String year) {
        $(contractPage.getToDateField()).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(contractPage.getToDateField()).doubleClick();
        Logger.debug("'To date' pressed");
        contractPageService.selectDate(day, month, year);
        Logger.info("Valid to added to contract");
    }

    @And("add supplied date from {string} {string} {string}")
    public void addSuppliedDateFrom(String day, String month, String year) {
        $(contractPage.getAddSuppliedButton()).shouldBe(Condition.visible, Duration.ofSeconds(5));
        $(contractPage.getAddSuppliedButton()).click();
        Logger.debug("'Add supplied' button pressed");
        $$(contractPage.getFromFields()).get(0).click();
        Logger.debug("'Supplied date from' pressed");
        contractPageService.selectDate(day, month, year);
        Logger.info("Supplied date from added to contract");
    }

    @And("add supplied date to {string} {string} {string}")
    public void addSuppliedDateTo(String day, String month, String year) {
        $$(contractPage.getToFields()).get(0).click();
        Logger.debug("'Supplied date to' pressed");
        contractPageService.selectDate(day, month, year);
        Logger.info("Supplied date to added to contract");
    }

    @Then("error message about required info is displayed")
    public void errorMessageAboutRequiredInfoDisplayed() {
        $(contractPage.getErrorRequiredContractInfo()).shouldBe(Condition.exactText("Error: set the required contract information"));
        Logger.debug("Error message about required fields displayed");
        Logger.info("Error message about required fields displayed");
    }

    @And("suspend contract")
    public void suspendContract() {
        $(contractPage.getOffOnContractSwitch()).scrollIntoView(false).click();
        Logger.debug("Contract suspended");
        Logger.info("Contract suspended");
    }

    @Then("contract is suspended")
    public void contractSuspended() {
        $(contractPage.getLabel()).shouldBe(Condition.exactText("Suspended"));
        Logger.debug("Contract changed status to suspended");
        Logger.info("Contract changed status to suspended");
    }

    @And("create contract new version")
    public void createContractNewVersion() {
        $(contractPage.getNewVersionButton()).scrollIntoView(false).click();
        Logger.debug("New version created");
        Logger.info("New version of contract created");
    }

    @Then("draft is created")
    public void draftCreated() {
        $(contractPage.getLabel()).shouldBe(Condition.exactText("Draft"));
        Logger.debug("Draft created");
        Logger.info("Contract draft created");
    }

    @And("delete contract")
    public void deleteContract() {
        $(contractPage.getDeleteContractButton()).click();
        Logger.debug("'Delete' button pressed");
        $(contractPage.getDeleteCustomButton()).scrollIntoView(false).click();
        Logger.debug("'Delete' custom button pressed");
        Logger.info("Contract deleted");
    }

    @Then("contract is deleted")
    public void contractDeleted() {
        $(contractsPage.getSearchButton()).shouldBe(Condition.visible, Duration.ofSeconds(5));
        assertEquals(url(),"https://crystalski.dev.musement.com/contracts" );
        Logger.debug("Contracts page opened");
        Logger.info("Contracts page opened");
    }

    @And("open contracts page")
    public void openContractsPage() {
        $(headerBlock.getContractsLink()).click();
        Logger.debug("'Contracts' link pressed");
        Logger.info("'Contracts' page opened");
    }

    @And("save contract")
    public void saveContract() {
        $(contractPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info("Contract saved");
    }
}
