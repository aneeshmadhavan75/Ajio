package com.automation.pages.Web;

import com.automation.pages.Interfaces.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class CartPageWeb extends BasePageWeb implements CartPage {

    @FindBy(xpath = "//div[@class='ic-cart ']")
    WebElement cartIconButton;

    List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());


    String sizeXpath = "//div[@tabindex='0']/span[text()='%s']";



    @FindBy(xpath = "//section[@id='orderTotal']/span[@class='price-value bold-font']")
    WebElement totalPrice;

    @FindBy(xpath = "//ul/li[1]//p[@aria-label='Savings']//span")
    WebElement couponPrice;

    @FindBy(xpath = "//ul/li[1]//div[@class='detail-info']")
    WebElement couponSelect;

    @FindBy(xpath = "//button[@aria-label='Apply']")
    WebElement couponApplyBtn;

    @FindBy(xpath = "//button[text()='Proceed to shipping']")
    WebElement proceedToShippingButton;

    @FindBy(id = "error-tooltip")
    WebElement textInEmptyCartPage;

    @FindBy(xpath = "//div[@aria-label='Delete']")
    WebElement deleteBtn;

    @FindBy(xpath = "//div[@class='card-delete-button']/div[2]")
    WebElement deleteBtnInPopUp;

    @FindBy(xpath = "//div[@class=' empty-cart']/p")
    WebElement emptyCartText;

    @FindBy(xpath = "//div[@class='cartqty']")
    WebElement quantityChangeBtn;

    @FindBy(xpath = "//button[@class='increment button']")
    WebElement incrementBtn;

    @FindBy(id = "updateQuantity")
    WebElement quantityUpdateBtn;

    @FindBy(className = "counter")
    WebElement quantityValue;

    @FindBy(xpath = "//span[@aria-label='items']")
    WebElement myBagsItemsQuantity;


    public void tabSwitch() {
        driver.switchTo().window(windowHandles.getLast());
    }



    public void sizeSelection(String size) {
        String sizeStr = String.format(sizeXpath, size);
        driver.findElement(By.xpath(sizeStr)).click();
    }


    public boolean verifyItemAddedToBag() {
        clickElementByJS(cartIconButton);
        return proceedToShippingButton.isDisplayed();
    }


    public void couponSelection() {
        couponSelect.click();
        couponApplyBtn.click();
    }

    public boolean verifyCouponIsApplied(){
        String originalPriceStr = totalPrice.getText().substring(1).replace(",", "");
        System.out.println("original price str:" + originalPriceStr);
        String couponPriceStr = couponPrice.getText().substring(1);
        System.out.println("coupon price str:" + couponPriceStr);


        float finalPrice = Float.parseFloat(originalPriceStr) - Float.parseFloat(couponPriceStr);
        System.out.println("final Price:" + finalPrice);
//        Thread.sleep(3000);
        WebElement priceAfterCouponApplied = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='orderTotal']/span[@class='price-value bold-font']")));
        System.out.println("price after coupon is applied" + priceAfterCouponApplied.getText().replace(",", ""));

        return priceAfterCouponApplied.getText().replace(",", "").contains(Float.toString(finalPrice));
    }

    public boolean getTextFromCartPage() {
        return textInEmptyCartPage.isDisplayed();
    }

//------------------  product deletion functionality  ----------------------------------------

    public void deleteBtnClick() {

        deleteBtn.click();
        deleteBtnInPopUp.click();

    }


    public boolean verifyProductIsRemoved() {

        return emptyCartText.isDisplayed();

    }


//------------------------------quantity changing --------------------------------------------------

    private String updatedText;
    public void changeQuantityProcess(){
        quantityChangeBtn.click();
        incrementBtn.click();
        updatedText = quantityValue.getText();
        quantityUpdateBtn.click();
    }

    public String updatedTextReturn(){
        return updatedText;
    }

    public boolean verifyQuantityChange(){
        String myBagsQuantityStr = myBagsItemsQuantity.getText();
        System.out.println("Value inside parantheses : " + myBagsQuantityStr);
        System.out.println("after quantity incremented value:"+updatedText);
        return myBagsQuantityStr.contains(updatedTextReturn());
    }


}
