package com.automation.pages.Mobile;

import com.automation.pages.Interfaces.ProductListingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListingPageMobile extends BasePageMobile implements ProductListingPage {

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Dismiss update dialog']")
    WebElement updateModalCloseBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/laTvAllow']")
    WebElement somePermissionContinueBtn;

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.ril.ajio:id/tab_icon'])[1]")
    WebElement bottomHomeBtn;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_row_prd_name_tv'])[2]")
    WebElement firstSearchedItem;

    @FindBy(xpath = "//android.widget.TextView[@text='SORT BY']")
    WebElement sortByText;

    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.ril.ajio:id/menu_cart_iv']")
    WebElement wishListButtonPopUp;


    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.ril.ajio:id/fahIvMenu']")
    WebElement burgerMenuButton;

    @FindBy(xpath = "(//android.view.ViewGroup[@resource-id='com.ril.ajio:id/row_category'])[3]")
    WebElement menCategoryMenu;

    @FindBy(xpath = "(//android.view.ViewGroup[@resource-id='com.ril.ajio:id/row_category'])[7]")
    WebElement topWearOption;

    @FindBy(xpath = "(//android.view.ViewGroup[@resource-id='com.ril.ajio:id/row_category'])[6]")
    WebElement jacketsOption;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_category_heading_tv']")
    WebElement styleTypeOption;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='com.ril.ajio:id/general_facet_value_row_tv'])[2]")
    WebElement bikerStyleType;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/filter_view_apply_filter_tv']")
    WebElement applyFilterBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/toolbar_subtitle_tv']")
    WebElement productCountInListingPage;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.ril.ajio:id/plp_filter_view']")
    WebElement filterMenuBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/facet_row_name_tv' and @text='Brands']")
    WebElement brandOptionMenu;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.ril.ajio:id/brand_facet_value_row_search_et']")
    WebElement searchFieldForBrand;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.ril.ajio:id/brand_facet_value_row_rv']/android.widget.LinearLayout")
    WebElement specificBrandOption;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_row_prd_name_tv']/ancestor::android.widget.LinearLayout)[5]")
    WebElement singleProductDiv;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_row_brand_tv']")
    WebElement brandName;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/toolbar_title_tv']")
    WebElement clothTypeHeading;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_row_prd_name_tv']")
    List<WebElement> nameOfCloth;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.ril.ajio:id/plp_product_rv']")
    WebElement wholeContainer;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_row_prd_name_tv'])[1]")
    WebElement productToAddToBag;

    @FindBy(xpath = "//div[@aria-label='View grid 5']")
    WebElement gridViewButton;

    String productListingPageName = "//div[@aria-label='%s']";

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/filterItem']")
    WebElement brandNameInListingPage;



    public boolean verifyUserOnItemsScreen() {
        return isPresent(sortByText);
    }

    public void clickOnFirstItem() {
        clickOnElementIfPresent(firstSearchedItem);
    }

    public void clickOnTheWishList() {
        wishListButtonPopUp.click();
    }

//---------------- category number verification ------------------------


    public void hoverFunctionality(String clothType) {

        burgerMenuButton.click();
        menCategoryMenu.click();
        topWearOption.click();
        jacketsOption.click();
    }

    String bikerTypeStr;

    public void categorySelection() {

        styleTypeOption.click();
        styleTypeOption.click();
        bikerTypeStr = bikerStyleType.getText();
        bikerStyleType.click();
        applyFilterBtn.click();

    }

    public String getTheNumber() {
        int startIndex = bikerTypeStr.indexOf('(');
        int endIndex = bikerTypeStr.indexOf(')');

        return bikerTypeStr.substring(startIndex + 1, endIndex);
    }

    public boolean verifyNumberOfProducts() {

        String numberOfProducts = productCountInListingPage.getText();
        System.out.println("listing page product count :" + numberOfProducts);
        System.out.println("number of the type inside bracket " + getTheNumber());
        return numberOfProducts.contains(getTheNumber());
    }


    // ----After clicking on certain rating, make sure product with that rating is displayed------------

    public void menuFromTheHeaderClicks() {

    }

    public void ratingSelectionMethod(String rating) {


    }

    boolean finalResult;

    public boolean verifyRatingOfProducts() {

        return true;
    }

//-------------------      verifying selected brand only displayed      -------------------------


    public void headerSectionMenuHovering() {
        clickOnElementIfPresent(updateModalCloseBtn);
        clickOnElementIfPresent(somePermissionContinueBtn);
        bottomHomeBtn.click();
        burgerMenuButton.click();
        menCategoryMenu.click();
        topWearOption.click();
        jacketsOption.click();

    }

    public void brandMenuHovering() {
        filterMenuBtn.click();
        filterMenuBtn.click();
        brandOptionMenu.click();
    }
    public void midScroll() {
        int startX = singleProductDiv.getLocation().getX();
        int width = singleProductDiv.getSize().getWidth();
        int startY = singleProductDiv.getLocation().getY();
        int height = singleProductDiv.getSize().getHeight();

        int startYWholeDiv = wholeContainer.getLocation().getY();


        scrollOrSwipe(startX+width/2, startY+height, startX+width/2, startYWholeDiv);
    }

    public void brandSelection(String brand) {

        searchFieldForBrand.sendKeys(brand);
        specificBrandOption.click();
        applyFilterBtn.click();

    }


    public boolean productListing() {
        return clothTypeHeading.isDisplayed();
    }

    //------list of products of particular type ------------------------------------------------
    public boolean productListingOfBrand(String brand) {

        return (brandNameInListingPage.getText()).equals(brand);
    }


    boolean brandNamesEqualityCheck;

    public boolean verifyProductBrand(String brand) {

        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                int ele = j+1;
                WebElement cloth = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.ril.ajio:id/plp_row_brand_tv'])["+ele+"]"));

                if((cloth.getText()).equalsIgnoreCase(brand)) {
                    System.out.println("Brand name:" + cloth.getText());
                    brandNamesEqualityCheck = true;
                }
            }

            midScroll();
        }
        return brandNamesEqualityCheck;
    }

//------------------------------- coupon verification -------------------------------------


    public void singleProductClick() {

        productToAddToBag.click();

    }

//------------------------------------- GRID VIEW PAGE --------------------------------------

    public void beautyMenuOptionClicks() {

    }

    public void gridViewBtnClicks() {


    }

    boolean finalResult2;

    public boolean verifyRowChanged() {

        return true;
    }

//-------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------------
    public boolean verifyUserOnShirtsPage() {
        return true;
    }

    public void selectTheHighestPrice(String sortType) {


    }

    public boolean checkItemPricesInDescendingOrder() {

        return true;
    }

    public boolean verifyItemsWithItemName(String itemName) {

        return true;
    }


    public boolean verifyAddToBagIsDisplayed() {
        return true;
    }

    public void clickOnAddToBag() {


    }


    public void fillTheMinAndMaxAmount(String min, String max) {

    }

    public boolean verifyThePriceBetweenMinAndMax() {

        return true;
    }

    public boolean verifyItemsAreShown() {
        return true;
    }


}
