package com.automation.steps;

import com.automation.pages.Interfaces.HomePage;
import com.automation.pages.Mobile.HomePageMobile;
import com.automation.pages.Web.HomePageWeb;
import com.automation.utils.ConfigReader;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeStep {
    HomePage homePage = new HomePageWeb();

    public HomeStep(){

        if (ConfigReader.getConfigValue("platform.type").equals("web")){
            homePage = new HomePageWeb();
        }
        else {
            homePage = new HomePageMobile();
        }
    }



    @Given("user open the application")
    public void user_open_the_application() {
        homePage.userOpenApplication();
    }

    @Then("validate user on home page")
    public void validate_user_on_home_page() {
        Assert.assertEquals("https://www.ajio.com/", homePage.verifyUserOnHomeScreen());
    }

    @When("user click on the signInButton")
    public void userClickOnTheSignInButton() {
        homePage.clickOnSignInButton();
    }

    @And("enter the mobile number {string}")
    public void enterTheMobileNumber(String mobileNumber) {
        homePage.enterMobileNumber(mobileNumber);
    }

    @And("click on continue button")
    public void clickOnContinueButton() {
        homePage.clickOnContinueButton();

    }

    @Then("verify the error message is shown below")
    public void verifyTheErrorMessageIsShownBelow(String errMessage) {
        Assert.assertTrue(homePage.verifyErrorMessage(errMessage));
        ReportManager.log("Invalid Phone Number");
        ReportManager.attachScreenshot();
    }

    @When("user click on the visit ajioluxe tab")
    public void userClickOnTheVisitAjioluxeTab() {
        homePage.clickOnAJioluxe();
    }

    @Then("verify user on ajioluxe page")
    public void verifyUserOnAjioluxePage() {
        Assert.assertEquals("https://luxe.ajio.com/", homePage.verifyUserOnAjioLuxePage());
    }


    @When("user search with {string}")
    public void userSearchWith(String item) {
        homePage.searchWithItem(item);
    }


    @When("user click on the cart button")
    public void userClickOnTheCartButton() {
        homePage.clickOnCartButton();

    }

    @When("go to footer and click on the men")
    public void goToFooterAndClickOnThe() {
        homePage.clickOnFooterItem();
    }

    @Then("validate user on mens page")
    public void validateUserOnMensPage() {
        Assert.assertEquals("https://www.ajio.com/shop/men", homePage.verifyUserOnMensPage());
    }

    @When("move the cursor to the men web element")
    public void moveTheCursorToTheMenWebElement() {
        homePage.moveCursorToMenWebElement();
    }

    @Then("verify mouse hover is working or not")
    public void verifyMouseHoverIsWorkingOrNot() {
        Assert.assertTrue(homePage.validateTheMouseHoverIsWorking());
    }

    //---------------------GOING TO THE TOP FUNCTION --------------------------------------------
    @Given("user opens the website")
    public void user_opens_the_website() {

        homePage.userOpenApplication();
//        homePage.userOpenApplication();


    }

    @Given("user navigates to the bottom of the page")
    public void user_navigates_to_the_bottom_of_the_page() {

        homePage.gotoBottomSection();

    }

    @When("user clicks on the goto top arrow button")
    public void user_clicks_on_the_goto_top_arrow_button() {
        homePage.clicksOnButton();

    }

    @Then("user must reach the top of the page")
    public void user_must_reach_the_top_of_the_page() {
        Assert.assertTrue(homePage.verifyTopSectionDisplayed());
    }
//--------------------------------- coupon verification -------------------------------------

    @Then("user search for a product {string} in the search input field")
    public void userSearchForAProductInTheSearchInputField(String product) {
        homePage.productSearchProcess(ConfigReader.getConfigValue(product));
    }
//--------------------------------------------------------------------------------------------


    // MOBILE

    @Given("user open the application in mobile")
    public void userOpenTheApplicationInMobile() {
        homePage.userOpenApplication();
    }


    @Then("verify user on home screen")
    public void verifyUserOnHomeScreen() {
        Assert.assertTrue(homePage.verifyUserOnHomeScreen());
    }



    @When("user click on the bag button")
    public void userClickOnTheBagButton() {
        homePage.clickOnBag();
    }

    @Then("verify the bag is empty")
    public void verifyTheBagIsEmpty() {
        Assert.assertEquals("Your Bag is Empty!", homePage.getTheTextInsideTheBag());
    }

    @When("search with {string} in search bar")
    public void searchWithInSearchBar(String item) {
        homePage.searchWithItem(item);
    }

    @Then("verify each item with {string} in title of the item")
    public void verifyEachItemWithInTitleOfTheItem(String itemText) {
        Assert.assertTrue(homePage.verifyEachItemWithText(itemText));


    }


    @When("click on the account")
    public void clickOnTheAccount() {
        homePage.clickOnAccount();
    }
}
