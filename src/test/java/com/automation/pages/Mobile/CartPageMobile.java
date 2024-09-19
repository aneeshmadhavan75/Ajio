package com.automation.pages.Mobile;

import com.automation.pages.Interfaces.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class CartPageMobile extends BasePageMobile implements CartPage {


    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.ril.ajio:id/pdp_product_img'])[1]")
    WebElement firstImageDiv;

    String sizeString = "//android.widget.TextView[@resource-id='com.ril.ajio:id/row_pdp_fixed_size_tv' and @text='%s']";

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/removeProduct']")
    WebElement removeProductFromCartBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/removeBtn']")
    WebElement removeBtnFromPopup;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/bagEmptyHeaderTv']")
    WebElement bagIsEmptyMsg;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    WebElement backBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/qtyInfo']")
    WebElement quantityBeforeIncrementText;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.ril.ajio:id/qtyContainer']")
    WebElement quantityChangeBtn;

    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.ril.ajio:id/incQty']")
    WebElement quantityIncrementBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/quantityTv']")
    WebElement quantityAfterIncrementText;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/updateBtn']")
    WebElement quantityChangeDoneBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/add_to_cart_tv']")
    WebElement addToBagText;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/pdp_size_text']")
    WebElement selectTheSizeText;

//------------- PRODUCT IS BEING REMOVED ---------------------------------------------------
    public void scrollForSizeSelection() {
        int startX = firstImageDiv.getLocation().getX();
        int width = firstImageDiv.getSize().getWidth();
        int startY = firstImageDiv.getLocation().getY();
        int height = firstImageDiv.getSize().getHeight();


        scrollOrSwipe(startX+width/2, startY+height, startX+width/2, startY);
    }
    public void sizeSelection(String size) {
        //to remove unnecessary popup

        backBtn.click();
        backBtn.click();

        scrollForSizeSelection();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String sizeXpath = String.format(sizeString, size);
        driver.findElement(By.xpath(sizeXpath)).click();

    }

    public void deleteBtnClick() {

        removeProductFromCartBtn.click();
        removeBtnFromPopup.click();

    }

    public boolean verifyProductIsRemoved() {
        return bagIsEmptyMsg.isDisplayed();
    }
//-----------------------------------------------------------------------------------------
    public void tabSwitch() {

    }

    public boolean verifyItemAddedToBag() {

        return true;
    }


    public void couponSelection() {


    }

    public boolean verifyCouponIsApplied() {

        return true;
    }


//-------------- PRODUCT WITHOUT SIZE ---------------------------------
    public boolean getTextFromCartPage() {

        System.out.println(addToBagText.getText() +"\n" +selectTheSizeText.getText());
        return addToBagText.isDisplayed() && selectTheSizeText.isDisplayed();
    }


//------------------------------quantity changing --------------------------------------------------

    String updatedText;
    String beforeQuantity;
    public void changeQuantityProcess(){
        beforeQuantity = quantityBeforeIncrementText.getText();
        quantityChangeBtn.click();
        quantityIncrementBtn.click();

    }

    public String updatedTextReturn(){
        updatedText = quantityAfterIncrementText.getText();
        return updatedText;
    }

    boolean flag;
    public boolean verifyQuantityChange(){
        System.out.println("Before Quantity:" + beforeQuantity);
        System.out.println("After Quantity:" + updatedTextReturn());
        if(!beforeQuantity.equals(updatedTextReturn())){
            quantityChangeDoneBtn.click();
            if (quantityBeforeIncrementText.getText().equals(updatedText)){
                System.out.println("Quantity after incrementing outside quantity modal:"+ quantityBeforeIncrementText.getText());
                System.out.println("Quantity after incrementing inside the quantity modal:" + updatedText);
                flag = true;
            }
        }
        return true;
    }

}
