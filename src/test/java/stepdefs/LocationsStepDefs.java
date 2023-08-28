package stepdefs;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.common.HeaderBlock;
import pages.setup.LocationsPage;
import utils.Logger;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LocationsStepDefs {

    LocationsPage locationsPage;
    HeaderBlock headerBlock;

    public LocationsStepDefs(LocationsPage locationsPage, HeaderBlock headerBlock) {
        this.locationsPage = locationsPage;
        this.headerBlock = headerBlock;
    }

    @When("open locations page")
    public void openLocationsPage() {
        $(headerBlock.getSetupMenuLink()).click();
        Logger.debug("'Setup' link pressed");
        $(headerBlock.getLocationLink()).click();
        Logger.debug("'Location' link pressed");
        Logger.info("'Location' page opened");
    }

    @And("add location with {string} {string}")
    public void addLocation(String name, String externalMappingId) {
        $(locationsPage.getAddRootLocationButton()).click();
        Logger.debug("'Add root location' button pressed");
        $(locationsPage.getRootLocationNameField()).sendKeys(name);
        Logger.debug(name + " name entered to 'Name' field");
        $(locationsPage.getExternalMappingIdRootLocationField()).sendKeys(externalMappingId);
        Logger.debug(externalMappingId + " id entered to 'External mapping Id' field");
        $(locationsPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info("Location added");
    }

    @Then("location {string} is added")
    public void locationAdded(String name) {
        $(locationsPage.getSuccessMessage()).shouldBe(Condition.exactText("Location saved successfully"));
        Logger.debug("Success message about location adding displayed");
        $$(locationsPage.getLocationElements()).should(CollectionCondition.containExactTextsCaseSensitive(name));
        Logger.debug(name + " added to the locations list");
    }
}
