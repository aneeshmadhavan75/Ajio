package com.automation.pages.Mobile;

import com.automation.pages.Interfaces.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePageMobile extends BasePageMobile implements HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='Allow']")
    WebElement allowBut;

    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.ril.ajio:id/fahIvMenu']")
    WebElement menuButton;




    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.ril.ajio:id/tab_icon'])[5]")
    WebElement bagIcon;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/bagEmptyHeaderTv']")
    WebElement bagText;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/llpsTvSearch']")
    WebElement searchFieldInput;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.ril.ajio:id/searchETV']")
    WebElement passInputText;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/toolbar_title_tv']")
    WebElement searchTextDisplay;

    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.ril.ajio:id/search_image']")
    WebElement searchButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_row_prd_name_tv']")
    List<WebElement> listOfItems;

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.ril.ajio:id/tab_icon'])[3]")
    WebElement accountButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.ril.ajio:id/searchETV']")
    WebElement actualSearchField;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/search_suggestion' and @text='Shirts For Men']")
    WebElement shirtsForMenOption;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Dismiss update dialog']")
    WebElement updatePopupCloseBtn;



    public void userOpenApplication() {
        clickOnElementIfPresent(allowBut);
    }

    public boolean verifyUserOnHomeScreen() {
        return isPresent(menuButton);
    }

    public void clickOnBag() {
        clickOnElementIfPresent(bagIcon);

    }

    public String getTheTextInsideTheBag() {
        return  bagText.getText();
    }

    public void searchWithItem(String item) {
        clickOnElementIfPresent(searchFieldInput);
        passInputText.sendKeys(item);
        clickOnElementIfPresent(searchButton);

    }

    public boolean verifyEachItemWithText(String itemText) {
        for (WebElement element : listOfItems){
            if(!element.getText().contains(itemText)){
                return false;
            }
        }
        return true;
    }

    public void clickOnAccount() {
        clickOnElementIfPresent(accountButton);
    }


    //-----------------

    public String verifyUserOnHomePage() {
        return "";
    }

    public void gotoBottomSection() {
    }

    public void clickOnSignInButton() {
    }


    public void enterMobileNumber(String mobileNumber) {
    }


    public void clickOnContinueButton() {
    }

    public boolean verifyErrorMessage(String errMessage) {
        return true;
    }

    public void clickOnAJioluxe() {

    }

    public String verifyUserOnAjioLuxePage() {
        return "";
    }


    public void clicksOnButton() {

    }

    public void clickOnCartButton() {

    }

    public boolean verifyTopSectionDisplayed() {
        return true;
    }

    public void clickOnFooterItem() {

    }

    public String verifyUserOnMensPage() {
        return "";
    }

    public void productSearchProcess(String product) {

        searchFieldInput.click();
//        clickOnElementIfPresent(updatePopupCloseBtn);
        actualSearchField.sendKeys(product);
        shirtsForMenOption.click();

    }


    public boolean validateTheMouseHoverIsWorking() {
        return true;
    }

    public void moveCursorToMenWebElement() {

    }

}
