package com.automation.steps;

import com.automation.pages.Interfaces.SingleProductPage;
import com.automation.pages.Mobile.SingleProductPageMobile;
import com.automation.pages.Web.CartPageWeb;
import com.automation.pages.Web.SingleProductPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SingleProductSteps {

    SingleProductPage singleProductPage;
    CartPageWeb cartPage;

    public SingleProductSteps() {

        if (ConfigReader.getConfigValue("platform.type").equals("web")) {
            singleProductPage = new SingleProductPageWeb();
            cartPage = new CartPageWeb();
        }
        else {
            singleProductPage = new SingleProductPageMobile();
        }

    }

//    @When("add to cart button is clicked")
//    public void addToCartButtonIsClicked() {
//
//
//        singleProductPage.addToCart();
//    }

    @Then("add the product to the cart")
    public void add_the_product_to_the_cart() {

        if (ConfigReader.getConfigValue("platform.type").equals("web")) {

            cartPage.tabSwitch();

        }
        singleProductPage.addToCart();

    }

    @Then("go to the cart page")
    public void go_to_the_cart_page() {

        singleProductPage.goToCart();

    }

    @And("open the add to bag modal")
    public void openTheAddToBagModal() {

        singleProductPage.addToCartModal();

    }
}
