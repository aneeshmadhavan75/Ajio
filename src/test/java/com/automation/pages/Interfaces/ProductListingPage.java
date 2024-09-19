package com.automation.pages.Interfaces;

public interface ProductListingPage {


    //---------------- category number verification ------------------------

    void hoverFunctionality(String topic);

    void categorySelection();

    String getTheNumber();

    boolean verifyNumberOfProducts();

    //------------rating------------------

    void menuFromTheHeaderClicks();

    void ratingSelectionMethod(String rating);

    boolean verifyRatingOfProducts();

    //-------------------      verifying selected brand only displayed      -------------------------

    void headerSectionMenuHovering();

    void brandMenuHovering();

    void brandSelection(String brand);

    boolean productListing();

    boolean productListingOfBrand(String brand);

    boolean verifyProductBrand(String brand);

    //------------------------------- coupon verification -------------------------------------

    void singleProductClick();

    //------------------------------------- GRID VIEW PAGE --------------------------------------

    void beautyMenuOptionClicks();

    void gridViewBtnClicks();

    boolean verifyRowChanged();

    //--------------------------------------------------------------------------------------

    boolean verifyUserOnShirtsPage();

    void selectTheHighestPrice(String sortType);

    boolean checkItemPricesInDescendingOrder();

    boolean verifyItemsWithItemName(String itemName);

    void clickOnFirstItem();

    boolean verifyAddToBagIsDisplayed();

    void clickOnAddToBag();

    void fillTheMinAndMaxAmount(String min, String max);

    boolean verifyThePriceBetweenMinAndMax();

    boolean verifyItemsAreShown();

    boolean verifyUserOnItemsScreen();

    void clickOnTheWishList();
}
