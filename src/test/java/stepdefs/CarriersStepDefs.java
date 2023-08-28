package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.common.HeaderBlock;
import pages.setup.CarriersPage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.*;

public class CarriersStepDefs {
    HeaderBlock headerBlock;
    CarriersPage carriersPage;

    public CarriersStepDefs(HeaderBlock headerBlock, CarriersPage carriersPage) {
        this.headerBlock = headerBlock;
        this.carriersPage = carriersPage;
    }

    @And("open carriers page")
    public void openCarriersPage() {
        $(headerBlock.getSetupMenuLink()).click();
        Logger.debug("'Setup' link pressed");
        $(headerBlock.getCarriersLink()).click();
        Logger.debug("'Carriers' link pressed");
        Logger.info("Carriers page opened");
    }

    @When("add new carrier with {string} {string}")
    public void addNewCarrier(String name, String externalMappingId) {
        $(carriersPage.getAddCarrierButton()).click();
        Logger.debug("'Add carrier' button pressed");
        $(carriersPage.getNameField()).sendKeys(name);
        Logger.debug(name + " name entered to 'Name' field");
        $(carriersPage.getExternalMappingIdField()).sendKeys(externalMappingId);
        Logger.debug(externalMappingId + " externalMappingId entered to 'External Mapping Id' field");
        $(carriersPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info("New carrier added");
    }

    @Then("carrier {string} is added")
    public void carrierNameAdded(String name) {
        $(carriersPage.getSuccessMessage()).shouldBe(Condition.exactText("Carrier saved successfully"));
        Logger.debug("Success message about carrier adding showed");
        Logger.info("Success message about carrier adding showed");
    }

    @Then("duplicated value error-message is displayed")
    public void duplicatedValueErrorMessageDisplayed() {
        $(carriersPage.getExternalMappingIdErrorMessage()).shouldBe(Condition.exactText("\n" + "    Duplicated value\n" +"  "));
        Logger.debug("Error message about existing External mapping Id showed under field");
        $(carriersPage.getErrorMessage()).shouldBe(Condition.exactText("Error: unable to save carrier!"));
        Logger.debug("Error message about carrier adding showed");
        Logger.info("Error message about carrier adding showed");
    }

    @And("suspend carrier")
    public void suspendCarrier() {
        $$(carriersPage.getCarrierStatusElements()).get(1).click();
        Logger.debug("Status for first carrier changed");
        Logger.info("Status for first carrier changed");
    }

    @Then("carrier is suspended")
    public void carrierSuspended() {
        $$(carriersPage.getCarrierStatusElements()).should().get(1).shouldBe(Condition.textCaseSensitive("Suspended"));
        Logger.debug("Carrier suspended");
        Logger.info("Carrier suspended");
    }
}
