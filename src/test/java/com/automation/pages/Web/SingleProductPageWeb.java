package com.automation.pages.Web;

import com.automation.pages.Interfaces.SingleProductPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingleProductPageWeb extends BasePageWeb implements SingleProductPage {

    @FindBy(xpath = "//div[@role='button' and @class='btn-gold']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//span[text()='GO TO BAG']")
    WebElement goToCartBtn;

    public void addToCartModal(){

    }
    public void goToCart() {
        waitForElementToBeClickable(goToCartBtn);
        goToCartBtn.click();
    }

    public void addToCart() {
        addToCartBtn.click();
    }
}
