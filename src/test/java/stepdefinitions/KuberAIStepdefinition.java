package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.testng.Assert;

import base.BaseTest;
import pages.KuberAIPage;

public class KuberAIStepdefinition extends BaseTest {

    KuberAIPage page;

    @Before
    public void setup() {

        initialization();

        page = new KuberAIPage();
    }

    @Given("User launches Simplify Money application")
    public void user_launches_application() {

        System.out.println("Application launched successfully");
    }

    @When("User opens Kuber.AI Deep Think Mode")
    public void user_opens_kuber_ai() {

        page.openKuberAI();
    }

    @When("User enters a financial question")
    public void user_enters_financial_question() {

        page.enterQuestion(
                "How do I ensure my financial future is secure?");
    }

    @When("User clicks on Send button")
    public void user_clicks_send_button() {

        page.clickSend();
    }

    @Then("AI response should be displayed successfully")
    public void ai_response_should_be_displayed() {

        Assert.assertTrue(page.validateResponse());
    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}