package com.automation.pages.Interfaces;

public interface CartPage {

    void tabSwitch();

    void sizeSelection(String size);

    boolean verifyItemAddedToBag();


    void couponSelection();

    boolean verifyCouponIsApplied();

    boolean getTextFromCartPage();

//------------------  product deletion functionality  ----------------------------------------

    void deleteBtnClick();


    boolean verifyProductIsRemoved();


//------------------------------quantity changing --------------------------------------------------

    void changeQuantityProcess();

    String updatedTextReturn();

    boolean verifyQuantityChange();

}
