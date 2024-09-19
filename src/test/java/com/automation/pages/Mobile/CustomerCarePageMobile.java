package com.automation.pages.Mobile;

import com.automation.pages.Interfaces.CustomerCarePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomerCarePageMobile extends BasePageMobile implements CustomerCarePage {

    //---------------- Customer care verification -------------------------

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.ril.ajio:id/tab_icon'])[3]")
    WebElement accountMenuBtn;

    @FindBy(xpath = "//android.widget.ListView[@resource-id='com.ril.ajio:id/nonscroll_list_1']/android.view.ViewGroup[1]")
    WebElement customerCareOption;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id='com.ril.ajio:id/row_cc_faq_tv'])[1]")
    WebElement issueSelection;

    String topicSelectString = "//android.widget.TextView[@resource-id='com.ril.ajio:id/row_cc_faq_tv' and @text='%s FAQs']";

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ril.ajio:id/row_cc_faq_answer_tv']")
    WebElement finalMessage;

    public void customerCarePage(){
        accountMenuBtn.click();
        customerCareOption.click();
    }

    public void topicAndIssueSelection(String topic){
        String topicXpath = String.format(topicSelectString, topic);
        driver.findElement(By.xpath(topicXpath)).click();

        issueSelection.click();

    }

    public boolean verifyGetAssistanceMsg(){
        System.out.println(finalMessage.getText());
        return finalMessage.isDisplayed();
    }
}
