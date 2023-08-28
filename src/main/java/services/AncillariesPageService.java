package services;

import org.openqa.selenium.Keys;
import pages.setup.AncillariesPage;
import utils.Logger;

import static com.codeborne.selenide.Selenide.*;

public class AncillariesPageService {
    private AncillariesPage ancillariesPage = new AncillariesPage();

    public void addAncillaryCategory(String name){
        $(ancillariesPage.getAddAncillaryCategoryButton()).click();
        Logger.debug("'Add Ancillary Category' button pressed");
        $(ancillariesPage.getCategoryNameField()).sendKeys(name);
        Logger.debug(name + " name entered to 'Name' field");
        $(ancillariesPage.getSaveButton()).click();
        Logger.debug("'Save' button pressed");
        Logger.info(name + " ancillary category added");
    }

    public void editAncillaryCategory(){
       $$(ancillariesPage.getCategoryAncillaryElements()).last().click();
        Logger.debug("Last ancillary list element opened");
        $(ancillariesPage.getEditAncillaryCategoryButton()).click();
        Logger.debug("'Edit' button pressed");
        $(ancillariesPage.getCategoryNameField()).sendKeys(Keys.CONTROL + "A");
        Logger.debug("Name highlighted");
        $(ancillariesPage.getCategoryNameField()).sendKeys(Keys.BACK_SPACE);
        Logger.debug("Name deleted");
        Logger.info("Ancillary category edited to empty");
    }

    public void deleteAncillaryCategory(){
       $$(ancillariesPage.getCategoryAncillaryElements()).get(ancillariesPage.getCategoryAncillaryElements().size() - 1).scrollIntoView(false).click();
        Logger.debug("Last ancillary list element opened");
       $(ancillariesPage.getDeleteAncillaryCategoryButton()).click();
        Logger.debug("'Delete' button pressed");
       $(ancillariesPage.getCustomDeleteButton()).click();
        Logger.debug("'Delete' custom button pressed");
        Logger.info("Ancillary category deleted");
    }

}
