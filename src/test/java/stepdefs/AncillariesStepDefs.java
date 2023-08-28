package stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.setup.AncillariesPage;
import pages.common.HeaderBlock;
import services.AncillariesPageService;
import utils.Logger;

import static com.codeborne.selenide.Selenide.*;

public class AncillariesStepDefs {
    HeaderBlock headerBlock;
    AncillariesPage ancillariesPage;
    AncillariesPageService ancillariesPageService;

    public AncillariesStepDefs() {
        this.headerBlock = new HeaderBlock();
        this.ancillariesPage = new AncillariesPage();
        this.ancillariesPageService = new AncillariesPageService();
    }

    @And("open ancillaries page")
    public void openAncillariesPage() {
        $(headerBlock.getSetupMenuLink()).click();
        Logger.debug("'Setup' link pressed");
        $(headerBlock.getAncillariesLink()).click();
        Logger.debug("'Ancillaries' link pressed");
        Logger.info("Ancillaries page opened");
    }

    @Then("category {string} is added successfully")
    public void categoryAddedSuccessfully(String name) {
        $(ancillariesPage.getSuccessMessage()).shouldBe(Condition.exist);
        Logger.debug("Success message about category adding showed");
        $$(ancillariesPage.getCategoryAncillaryElements()).get(ancillariesPage.getCategoryAncillaryElements().size() - 1).scrollIntoView(false).text().contains(name);
        Logger.debug(name + " added to the end of the ancillaries list");
        Logger.info("Ancillary category added successfully");
    }

    @When("add {string} ancillary category")
    public void addAncillaryCategory(String name) {
        ancillariesPageService.addAncillaryCategory(name);
    }

    @And("edit ancillary category with empty field")
    public void editAncillaryCategoryWithEmptyField() {
        ancillariesPageService.editAncillaryCategory();
    }

    @Then("save button is disabled")
    public void saveButtonDisabled() {
        $(ancillariesPage.getDisabledSaveButton()).shouldBe(Condition.exist);
        Logger.debug("Disabled save button showed");
        Logger.info("Disabled save button showed");
    }

    @And("delete ancillary category")
    public void deleteAncillaryCategory() {
        ancillariesPageService.deleteAncillaryCategory();
    }

    @Then("successful deletion {string} message is displayed")
    public void successfulDeletionMessageDisplayed(String name) {
        $(ancillariesPage.getSuccessDeleteMessage()).shouldBe(Condition.exactText(name + " deleted successfully"));
        Logger.debug("Success message about category deleting showed");
        Logger.info("Success message about category deleting showed");
    }

    @And("add {string} ancillary")
    public void addAncillaryForContractAncillary(String name) {
        sleep(2000);
        $(ancillariesPage.getAddChildButton()).click();
        Logger.debug("'Add child' button pressed");
        $(ancillariesPage.getAncillaryRadiobutton()).click();
        Logger.debug("'Ancillary' radiobutton selected");
        $(ancillariesPage.getChildNameField()).sendKeys(name);
        Logger.debug(name + " name entered to 'Name' field");
        $(ancillariesPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info(name + " ancillary added");
    }

    @Then("unable delete ancillary error message")
    public void unableDeleteAncillaryErrorMessage() {
        $(ancillariesPage.getErrorMessage()).shouldBe(Condition.exactText("You cannot delete this ancillary because it is contained in some contracts."));
        Logger.debug("Error message about category deleting showed");
        Logger.info("Error message about category deleting showed");
    }

    @And("delete {string} ancillary from {string}, {string}, {string}, {string}, {string}")
    public void deleteAncillary(String ancillary, String rootCategory, String category1,
                                String category2, String category3, String category4) {
        $(headerBlock.getSetupMenuLink()).click();
        Logger.debug("'Setup' link pressed");
        $(headerBlock.getAncillariesLink()).click();
        Logger.debug("'Ancillaries' link pressed");
        if(!rootCategory.isEmpty()){
            $$(ancillariesPage.getCategoryAncillaryElements()).find(Condition.exactText(rootCategory)).click();
            Logger.debug(rootCategory + " category opened");
        }
        if(!category1.isEmpty()){
            $$(ancillariesPage.getCategoryAncillaryElements()).find(Condition.exactText(category1)).click();
            Logger.debug(category1 + " category opened");
        }
        if(!category2.isEmpty()){
            $$(ancillariesPage.getCategoryAncillaryElements()).find(Condition.exactText(category2)).click();
            Logger.debug(category2 + " category opened");
        }
        if(!category3.isEmpty()){
            $$(ancillariesPage.getCategoryAncillaryElements()).find(Condition.exactText(category3)).click();
            Logger.debug(category3 + " category opened");
        }
        if(!category4.isEmpty()){
            $$(ancillariesPage.getCategoryAncillaryElements()).find(Condition.exactText(category4)).click();
            Logger.debug(category4 + " category opened");
        }
        $$(ancillariesPage.getAncillaries()).find(Condition.exactText(ancillary)).scrollIntoView(false).click();
        Logger.debug(ancillary + " ancillary opened");
        $(ancillariesPage.getDeleteAncillaryCategoryButton()).click();
        Logger.debug("'Delete' button pressed");
        Logger.info(ancillary + " ancillary deleted");

    }
}
