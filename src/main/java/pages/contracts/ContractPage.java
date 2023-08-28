package pages.contracts;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class ContractPage {

    private final SelenideElement contractHeaderElement = $(By.xpath("//h2[text()='New Contract']"));

    private final SelenideElement backToContractsButton = $(By.xpath("//div[@class='contract page-wrapper']//a[text()='Contracts']"));

    private final SelenideElement duplicateButton = $(By.xpath("//div[@class='contract page-wrapper']//a[text()='Duplicate']"));

    //Contract details
    private final SelenideElement contractDescriptionField = $(By.xpath("//div[@class='col size-8']//div[@class='inputContent']//input"));

    private final SelenideElement fromDateField = $(By.xpath("//div[@class='col size-8']//div[@class='date']//label[text()='Valid from']/.."));

    private final SelenideElement toDateField = $(By.xpath("//div[@class='col size-8']//div[@class='date']//label[text()='Valid to']/.."));

    private final ElementsCollection calendarOpenMonthYearFields = $$(By.xpath("//section[@class='datePicker datePickerSeparated']//div[@class='selectors']//div[@class='input-select__content']//span"));

    private final ElementsCollection calendarMonthYearFields = $$(By.xpath("//section[@class='datePicker datePickerSeparated']//div[@class='selectors']//div[@class='content_container']//li"));

    private final ElementsCollection calendarDaysFields = $$(By.xpath("//div[@class='dates']//span"));

    //Currency

    private final SelenideElement netCostCurrencyField = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//div[@class='inputSelectContent focusable']"));

    private final SelenideElement usdNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='USD - Dollar']"));

    private final SelenideElement sekNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='SEK - Sek']"));

    private final SelenideElement nokNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='NOK - Nok']"));

    private final SelenideElement gbpNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='GBP - Gbp']"));

    private final SelenideElement eurNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='EUR - Euro']"));

    private final SelenideElement chfNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='CHF - Franco']"));

    private final SelenideElement cadNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='CAD - Cad']"));

    private final SelenideElement bgnNetCostCurrencyElement = $(By.xpath("//div[@class='col size-4']//div[@label='Net Costs Currency']//span[text()='BGN - Bgn']"));

    private final SelenideElement publicPriceCurrencyField = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//div[@class='inputSelectContent focusable']"));

    private final SelenideElement usdPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='USD - Dollar']"));

    private final SelenideElement sekPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='SEK - Sek']"));

    private final SelenideElement nokPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='NOK - Nok']"));

    private final SelenideElement gbpPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='GBP - Gbp']"));

    private final SelenideElement eurPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='EUR - Euro']"));

    private final SelenideElement chfPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='CHF - Franco']"));

    private final SelenideElement cadPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='CAD - Cad']"));

    private final SelenideElement bgnPublicPriceElement = $(By.xpath("//div[@class='col size-4']//div[@label='Public Price Currency']//span[text()='BGN - Bgn']"));

    //Supplier

    private final SelenideElement locationField = $(By.xpath("//div[@class=\"col size-4\"]//div[@class='inputContent']//input[@placeholder=\"Start typing\"]"));

    private final SelenideElement locationArrow = $(By.xpath("//div[@class=\"locationSelector compact\"]/span"));

    private ElementsCollection locations = $$(By.xpath("//div[@class='tree larger']/div//span"));

    private ElementsCollection locationsArrows = $$(By.xpath("//div[@class='tree larger']/div//span[@class='icon-space']"));

    private final SelenideElement supplierField = $(By.xpath("//div[@class='input-select']//span[text()=' Select Supplier ']"));

    private ElementsCollection suppliers = $$(By.xpath("//div[@class='content_container']//div[@class='scrollable ps ps--active-y']//li"));

    private final SelenideElement officeField = $(By.xpath("//div[@class='input-select']//span[text()=' Select Office ']"));

    private ElementsCollection offices = $$(By.xpath("//label[text()=' Office']/..//div[@class='content_container']//li"));

    //Condition

    private final SelenideElement addConditionsButton = $(By.xpath("//div[@id='contractConditions']//a[text()='Add Conditions']"));

    private final SelenideElement filterField = $(By.xpath("//div[@id='contractConditions']//div[@class='accordion__content']//div[@class='col size-3']//span[text()='Select Filter']"));

    private final SelenideElement operatorField = $(By.xpath("//div[@id='contractConditions']//div[@class='accordion__content']//div[@class='col size-3']//span[text()='Select Operator']"));

    private ElementsCollection filtersCollection = $$(By.xpath("//div[@id='contractConditions']//div[@class='customDropDown']//div[@class='scrollable ps']//li"));

    private ElementsCollection operatorsCollection = $$(By.xpath("//div[@id='ancillary-0-Conditions']//label[text()=\"Operator\"]/..//div[@class='customDropDown']//ul/li"));

    private final SelenideElement parameterField = $(By.xpath("//div[@id='contractConditions']//div[@class='accordion__content']//div[@class='col size-3']//span[text()=' Select Parameter ']"));

    private final SelenideElement parameterInput = $(By.xpath("//div[@id='contractConditions']//div[@class='dropdown-wrapper']//input[@placeholder='Start typing']"));

    private final SelenideElement clearInputData = $(By.xpath("//div[@id='contractConditions']//div[@class='input-select__dropdown']//a[text()='Clear']"));

    private ElementsCollection locationsParameters = $$(By.xpath("//div[@id='contractConditions']//div[@class='tree-row__container selectable']/div"));

    private ElementsCollection locationsArrowsParameters = $$(By.xpath("//div[@id='contractConditions']//div[@class='tree-row__container selectable']//span[@class='icon-space']"));

    private final SelenideElement duplicateConditionButton = $(By.xpath("//div[@id='contractConditions']//div[@class='col size-3']//a[text()='Duplicate']"));

    private final SelenideElement deleteConditionButton = $(By.xpath("//div[@id='contractConditions']//div[@class='col size-3']//a[text()='Delete']"));

    //Ancillaries

    private final SelenideElement addAncillaryButton = $(By.xpath("//a[text()='Add Ancillary']"));

    private final SelenideElement ancillaryBoxElement = $(By.xpath("//div[@class='box']"));

    private final SelenideElement ancillaryLableElement = $(By.xpath("//div[@class='ancillaryHeader']/div[2]/div[1]"));

    private final SelenideElement ancillarySwitchElement = $(By.xpath("//div[@class='ancillaryHeader']//div[@class='toggle__container toggle__active']"));

    private final SelenideElement duplicateAncillaryButton = $(By.xpath("//div[@class='ancillaryHeader']//a[text()='Duplicate']"));

    private final SelenideElement deleteAncillaryButton = $(By.xpath("//div[@class='ancillaryHeader']//a[text()='Delete']"));

    private final SelenideElement hideAncillaryArrow = $(By.xpath("//div[@class='box__header']//div[@class='toggle-icon']"));

    //Ancillary Attributes
    private final SelenideElement hideAttributesArrow = $(By.xpath("//div[@id='ancillary-0-Attributes']//div[@class='toggle-icon']"));

    private final SelenideElement searchAncillaryField = $(By.xpath("//div[@class='box__content']//div[@class='inputWrapper']//input[@placeholder='Search Ancillary']"));

    private final SelenideElement selectAncillaryArrow = $(By.xpath("//div[@class='box__content']//div[@class='ancillarySelector compact']//span/img"));

    private ElementsCollection categories = $$(By.xpath("//div[@class='tree larger']//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxNCIgaGVpZ2h0PSIxMiIgdmlld0JveD0iMCAwIDE0IDEyIj4KICAgIDxwYXRoIGZpbGw9IiM4NDMyOWIiIGQ9Ik0xLjE2MSAwaDIuNzFjLjM2NSAwIC43MS4xNzIuOTI5LjQ2NWwuNDY1LjYxOWMuMjE5LjI5Mi41NjMuNDY0LjkyOS40NjRoNi41OGMuNjQyIDAgMS4xNjEuNTIgMS4xNjEgMS4xNjJ2OC4xMjljMCAuNjQxLS41MiAxLjE2MS0xLjE2IDEuMTYxSDEuMTZDLjUyIDEyIDAgMTEuNDggMCAxMC44MzlWMS4xNkMwIC41Mi41MiAwIDEuMTYxIDB6Ii8+Cjwvc3ZnPgo=']/../span"));

    private ElementsCollection ancillaries = $$(By.xpath("//div[@class='tree larger']//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxMSIgaGVpZ2h0PSIxMiIgdmlld0JveD0iMCAwIDExIDEyIj4KICAgIDxwYXRoIGZpbGw9IiM3MkNBNzQiIGZpbGwtcnVsZT0iZXZlbm9kZCIgZD0iTS4yOCA4Ljk0M0MuMTI5IDIuMDYzIDQuNDg2IDEuNTI5IDEwLjUyNCAwYy0uNTM1IDUuMzUtMS42ODIgMTAuMDEzLTkuMDIgMTAuMjQyLS4xNTIuMzgyLS4zMDUuNzY0LS4zODEgMS4yMjMtLjIzLjkxNy0xLjM3Ni40NTktMS4wNy0uMjNDMS4zNSA3Ljg3NCAzLjU2NiA1LjM1IDYuMzk0IDMuMjFjMCAwLTQuMDUgMS45MTEtNi4xMTQgNS43MzN6Ii8+Cjwvc3ZnPgo=']/../span"));

    private ElementsCollection ancillariesArrows = $$(By.xpath("//div[@class='tree-row']//span[@class='icon-space']"));

    private final SelenideElement displayNameField = $(By.xpath("//div[@class='box__content']//div[@class='accordion__content']//label[text()='Display Name']/..//input\n"));

    private final SelenideElement displayDescriptionField = $(By.xpath("//div[@class='box__content']//div[@class='accordion__content']//label[text()='Display Description']/..//input\n"));

    private final SelenideElement suppliersAncillaryNameField = $(By.xpath("//div[@class='box__content']//div[@class='accordion__content']//label[text()=\"Supplier's Ancillary Name\"]/../div[@class='inputContent']//input"));

    private final SelenideElement salesChannelDropDownMenu = $(By.xpath("//div[@class='input-select input-select--multiple']/div[@class='input-select__content']/span"));

    private final SelenideElement checkSalesChannelsCheckbox = $(By.xpath("//a[text()='Check all items']"));

    private final SelenideElement uncheckSalesChannelsCheckbox = $(By.xpath("//a[text()='Uncheck all items']"));

    private final SelenideElement webChannelCheckbox = $(By.xpath("//li[text()='\n" + "              Web\n" + "            ']"));

    private final SelenideElement callCenterChannelCheckbox = $(By.xpath("//li[text()='\n" + "              Call Center\n" + "            ']"));

    private final SelenideElement ancillaryTypeDropDownMenu = $(By.xpath("//div[@label='Ancillary Type']"));

    private ElementsCollection ancillaryTypes = $$(By.xpath("//div[@class='input focusable select elevate']//li"));

    private final SelenideElement hasQuotasSwitchElement = $(By.xpath("//div[@class='toggle-container']/label[text()='Has Quotas']/..//div[@class='toggle']/div"));

    private final SelenideElement refundableSwitchElement = $(By.xpath("//div[@class='toggle-container']/label[text()='Refundable']/..//div[@class='toggle']/div"));

    private final SelenideElement includeInDepositSwitchElement = $(By.xpath("//div[@class='toggle-container']/label[text()='Include In Deposit']/..//div[@class='toggle']/div"));

    //Ancillary Supplied

    private final SelenideElement hideSuppliedArrow = $(By.xpath("//div[@id='ancillary-0-Supplied']//div[@class='toggle-icon']"));

    private final SelenideElement addSuppliedButton = $(By.xpath("//div[@class='accordion__header_actions']//a[text()='Add Supplied']"));

    private ElementsCollection fromFields = $$(By.xpath("//div[@id='ancillary-0-Supplied']//div[@class='supplied']//div[@class='date']/span/strong[text()='From:']"));

    private ElementsCollection toFields = $$(By.xpath("//div[@id='ancillary-0-Supplied']//div[@class='supplied']//div[@class='date']/span/strong[text()='To:']"));

    private ElementsCollection addSuppliedButtons = $$(By.xpath("//div[@id='ancillary-0-Supplied']//div[@class='supplied']//span[@class='rounded shadow']"));

    private ElementsCollection deleteSuppliedButtons = $$(By.xpath("//div[@id='ancillary-0-Supplied']//div[@class='supplied']//div[@class='focusable action'][2]/span"));

    //Ancillary Conditions

    private final SelenideElement hideConditionsArrow = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='toggle-icon']"));

    private final SelenideElement addAncillaryConditionsButton = $(By.xpath("//div[@id='ancillary-0-Conditions']//a[text()='Add Conditions']"));

    private final SelenideElement ancillaryConditionsFilterField = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='accordion__content']//div[@class='col size-3']//span[text()='Select Filter']"));

    private final SelenideElement ancillaryConditionsOperatorField = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='accordion__content']//div[@class='col size-3']//span[text()='Select Operator']"));

    private ElementsCollection ancillaryConditionsCollection = $$(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='customDropDown']//div[@class='scrollable ps ps--active-y']//li"));

    private ElementsCollection ancillaryOperatorCollection = $$(By.xpath("//div[@id='ancillary-0-Conditions']//div[@label='Operator']//div[@class='customDropDown']//li"));

    private final SelenideElement ancillaryConditionsParameterField = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='accordion__content']//div[@class='col size-3']//input[@placeholder='Insert number']"));

    private final SelenideElement ancillaryConditionsParameterInput = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='dropdown-wrapper']//input[@placeholder='Start typing']"));

    private final SelenideElement ancillaryConditionsClearInputData = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='input-select__dropdown']//a[text()='Clear']"));

    private ElementsCollection ancillaryConditionsLocationsParameters = $$(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='tree-row__container selectable']/div"));

    private ElementsCollection ancillaryConditionsLocationsArrowsParameters = $$(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='tree-row__container selectable']//span[@class='icon-space']"));

    private final SelenideElement duplicateAncillaryConditionButton = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='col size-3']//a[text()='Duplicate']"));

    private final SelenideElement deleteAncillaryConditionsButton = $(By.xpath("//div[@id='ancillary-0-Conditions']//div[@class='col size-3']//a[text()='Delete']"));

    //Ancillary Costs
    private final SelenideElement hideCostsArrow = $(By.xpath("//div[@id='ancillary-0-Costs']//div[@class='accordion__header']//div[@class='toggle-icon']"));

    private final SelenideElement addCostsButton = $(By.xpath("//a[text()='Add Costs']"));

    private ElementsCollection hideCostButtons = $$(By.xpath("//div[@id='ancillary-0-Costs']//div[@class='accordion__content']//div[@class='toggle-icon']"));

    private ElementsCollection costTitleInputs = $$(By.xpath("//div[@id='ancillary-0-Costs']//div[@class='accordion__content']//input[@placeholder='Cost title here']"));

    private ElementsCollection duplicateCostButtons = $$(By.xpath("//div[@id='ancillary-0-Costs']//div[@class='accordion__content']//a[text()='Duplicate']"));

    private ElementsCollection deleteCostButtons = $$(By.xpath("//div[@id='ancillary-0-Costs']//div[@class='accordion__content']//a[text()='Delete']"));

    //Ancillary Conditions for Cost

    private ElementsCollection addConditionsForCostButtons = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//a[text()='Add Conditions']"));

    private ElementsCollection conditionsForCostFilterFields = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='accordion__content']//div[@class='col size-3']//span[text()='Select Filter']"));

    private ElementsCollection conditionsForCostOperatorFields = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='accordion__content']//div[@class='col size-3']//span[text()='Select Operator']"));

    private ElementsCollection conditionsForCostCollection = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='customDropDown']//div[@class='scrollable ps ps--active-y']//li"));

    private ElementsCollection  conditionsForCostParameterFields = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='accordion__content']//div[@class='col size-3']//span[text()=' Select Parameter ']"));

    private final SelenideElement conditionsForCostParameterInput = $(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='dropdown-wrapper']//input[@placeholder='Start typing']"));

    private SelenideElement conditionsForCostClearInputData = $(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='input-select__dropdown']//a[text()='Clear']"));

    private ElementsCollection conditionsForCostParameters = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='tree-row__container selectable']/div"));

    private ElementsCollection conditionsForCostArrowsParameters = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='tree-row__container selectable']//span[@class='icon-space']"));

    private ElementsCollection duplicateConditionsForCostButtons = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='col size-3']//a[text()='Duplicate']"));

    private ElementsCollection deleteConditionsForCostButtons = $$(By.xpath("//div[@class='boxAncillaryCosts box flat border']//div[@class='col size-3']//a[text()='Delete']"));

    //Ancillary Cost Condition

    private ElementsCollection addCostConditionButtons = $$(By.xpath("//a[text()='Add Costs Condition']"));

    private ElementsCollection deleteCostConditionButtons = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@class='focusable action']//span[@class!='rounded shadow']"));

    private ElementsCollection hasDurationSwitchElements = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//label[text()='Has Duration']/../div/div"));

    private ElementsCollection availableToArrivalSwitchElements = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//label[text()='Available on arrival']/../div/div"));

    private ElementsCollection availableOnDepartureSwitchElements = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//label[text()='Available on departure']/../div/div"));

    private ElementsCollection availableAsPartOfOfferSwitchElements = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//label[text()='Only available as part of offer']/../div/div"));

    private ElementsCollection addSuppliedForCostConditionButtons = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//a[text()='Add Supplied']"));

    private ElementsCollection suppliedForCostConditionFromFields = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@class='supplied']//div[@class='date']/span/strong[text()='From:']"));

    private ElementsCollection suppliedForCostConditionToFields = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@class='supplied']//div[@class='date']/span/strong[text()='To:']"));

    private SelenideElement netCostForSuppliedFields = $(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@label='Net Cost']//input[@type='text']"));

    private SelenideElement publicPriceForSuppliedFields = $(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@class='input focusable number']//input[@type='text']"));

    private ElementsCollection netCostSelections = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@class='inputSelectContent focusable']"));

    private ElementsCollection netCostSelectionElements = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@class='customDropDown']//li"));

    private ElementsCollection netCostUpArrows = $$(By.xpath("//div[@class='accordion']//div[@class='number-controller']/div[@class='number-controller-up focusable']"));

    private ElementsCollection allStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='All']/..//label[@class='checkLabel']/span"));

    private ElementsCollection sundayStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='Sun']/..//label[@class='checkLabel']/span"));

    private ElementsCollection mondayStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='Mon']/..//label[@class='checkLabel']/span"));

    private ElementsCollection tuesdayStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='Tue']/..//label[@class='checkLabel']/span"));

    private ElementsCollection wednesdayStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='Wed']/..//label[@class='checkLabel']/span"));

    private ElementsCollection thursdayStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='Thu']/..//label[@class='checkLabel']/span"));

    private ElementsCollection fridayStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='Fri']/..//label[@class='checkLabel']/span"));

    private ElementsCollection saturdayStartDayOfWeeksCheckboxes = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//h5[text()='Sat']/..//label[@class='checkLabel']/span"));

    private ElementsCollection deleteSuppliedForCostConditionButtons = $$(By.xpath("//div[@class='accordion']//div[@class='costsContainerWrapper']//div[@class='actionsCol col size-1']//span"));

    private final SelenideElement saveButton = $(By.xpath("//span[text()='Save']"));

    private final SelenideElement activateButton = $(By.xpath("//span[text()='Activate']"));

    private final SelenideElement customActivateButton = $(By.xpath("//div[@class='dialog']//span[text()='Activate']"));

    private final SelenideElement newVersionButton = $(By.xpath("//span[text()='New Version']"));

    private final SelenideElement deleteContractButton = $(By.xpath("//a[text()='Delete Contract']"));

    private final SelenideElement deleteCustomButton = $(By.xpath("//span[text()='Delete']"));

    private final SelenideElement label = $(By.xpath("//div[@class='box__content']//div[@class='col size-4']//span[@class='text']"));

    private final SelenideElement errorRequiredContractInfo = $(By.xpath("//section//span[text()='Error: set the required contract information']"));

    private final SelenideElement leftMenuArrow = $(By.xpath("//div[@class='contractSideMenu']//div/img/.."));

    private final SelenideElement offOnContractSwitch = $(By.xpath("//div[@class='contract__title']/div[@class='contract-actions']/div/div/div/div"));

    public ContractPage() {
    }

}
