package services.contract;

import com.codeborne.selenide.Condition;
import pages.contracts.ContractPage;
import utils.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class ContractPageService {

    ContractPage contractPage = new ContractPage();

    public void selectAncillary(String ancillary, String rootCategory, String category1,
                                String category2, String category3, String category4){
        sleep(2000);
        $(contractPage.getSelectAncillaryArrow()).shouldBe(Condition.visible, Duration.ofSeconds(8000)).scrollIntoView(false).click();
        Logger.debug("Ancillary list opened");
        sleep(2000);
        if(!rootCategory.isEmpty()){
            $$(contractPage.getCategories()).find(Condition.exactText(rootCategory)).click();
            Logger.debug(rootCategory + " category opened");
        }
        if(!category1.isEmpty()){
            $$(contractPage.getCategories()).find(Condition.exactText(category1)).click();
            Logger.debug(category1 + " category opened");
        }
        if(!category2.isEmpty()){
            $$(contractPage.getCategories()).find(Condition.exactText(category2)).click();
            Logger.debug(category2 + " category opened");
        }
        if(!category3.isEmpty()){
            $$(contractPage.getCategories()).find(Condition.exactText(category3)).click();
            Logger.debug(category3 + " category opened");
        }
        if(!category4.isEmpty()){
            $$(contractPage.getCategories()).find(Condition.exactText(category4)).click();
            Logger.debug(category4 + " category opened");
        }
        $$(contractPage.getAncillaries()).find(Condition.exactText(ancillary)).click();
        Logger.debug(ancillary + " ancillary selected");

        Logger.info(ancillary + " ancillary selected");
    }


    public void selectDate(String day, String month, String year){
        $$(contractPage.getCalendarDaysFields()).find(Condition.exactText(day)).click();
        Logger.debug(day + " selected for current month");
        Logger.info(day + " selected for current month");
        sleep(3000);
    }


}
