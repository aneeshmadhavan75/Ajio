package com.automation.pages.Interfaces;

public interface HomePage {

    //Mobile-------------------

    void userOpenApplication();

    boolean verifyUserOnHomeScreen();

    void clickOnBag();

    String getTheTextInsideTheBag();

    void searchWithItem(String item);

    boolean verifyEachItemWithText(String itemText);

    void clickOnAccount();

    // Only web

    void gotoBottomSection();

    void clickOnSignInButton();

    void enterMobileNumber(String mobileNumber);

    void clickOnContinueButton();

    boolean verifyErrorMessage(String errMessage);

    void clickOnAJioluxe();

    String verifyUserOnAjioLuxePage();

    void clicksOnButton();

    void clickOnCartButton();

    boolean verifyTopSectionDisplayed();

    void clickOnFooterItem();

    String verifyUserOnMensPage();

    void productSearchProcess(String product);

    boolean validateTheMouseHoverIsWorking();

    void moveCursorToMenWebElement();


}
