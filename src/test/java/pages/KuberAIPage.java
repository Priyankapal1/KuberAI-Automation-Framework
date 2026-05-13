package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.WaitUtils;

public class KuberAIPage extends BaseTest {


    By questionBox =
            By.xpath("//textarea");

    By sendButton =
            By.xpath("//button[contains(@type,'submit')]");

    By aiResponse =
            By.xpath("(//div[contains(@class,'response')])[last()]");

    public void openKuberAI() {

        System.out.println("Kuber.AI Opened");
    }

    public void enterQuestion(String question) {

        WaitUtils.waitForElement(driver,
                questionBox)
                .sendKeys(question);
    }

    public void clickSend() {

        driver.findElement(sendButton).click();
    }

    public boolean validateResponse() {

        WebElement response =
                WaitUtils.waitForElement(driver,
                        aiResponse);

        String responseText = response.getText();

        System.out.println("AI Response: "
                + responseText);

        return !responseText.isEmpty();
    }
}
