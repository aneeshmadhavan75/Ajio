package com.automation.pages.Mobile;

import com.automation.pages.Interfaces.SingleProductPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingleProductPageMobile extends BasePageMobile implements SingleProductPage {

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.ril.ajio:id/add_to_cart_layout']")
    WebElement addToBagBtn;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    WebElement backBtn;


    public void addToCartModal(){
        for (int i = 0; i < 2; i++) {
            backBtn.click();
        }

    }

    public void addToCart() {

        addToBagBtn.click();
    }

    public void goToCart() {
        addToBagBtn.click();
    }


}
