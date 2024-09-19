package com.automation.steps;

import com.automation.pages.Interfaces.CustomerCarePage;
import com.automation.pages.Mobile.CustomerCarePageMobile;
import com.automation.pages.Web.CustomerCarePageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CustomerCareSteps {

    CustomerCarePage customerCarePage;
//    HomePageMobile homePageMobile;

    public CustomerCareSteps(){
        String platform = ConfigReader.getConfigValue("platform.type");

        if(platform.equals("web")){
            customerCarePage = new CustomerCarePageWeb();
        }
        else {
            customerCarePage = new CustomerCarePageMobile();
//            homePageMobile = new HomePageMobile();
        }
    }

    @Then("user clicks on customer care option")
    public void user_clicks_on_customer_care_option() {
//        homePageMobile.userOpenApplication();
        customerCarePage.customerCarePage();

    }
    @When("user select topic {string} and issue")
    public void user_select_topic_and_issue(String topic) {

        customerCarePage.topicAndIssueSelection(ConfigReader.getConfigValue(topic));

    }
    @Then("verify message is displayed in the get assistance section")
    public void verify_message_is_displayed_in_the_get_assistance_section() {

        Assert.assertTrue(customerCarePage.verifyGetAssistanceMsg());

    }
}
