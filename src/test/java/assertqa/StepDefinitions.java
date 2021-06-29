package assertqa;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wdWait = new WebDriverWait(driver,20);

//    @Before
//    public void init()
//    {
//        driver.manage().window().maximize();
//    }
//
//    @After
//    public void tearDown()
//    {
//        driver.quit();
//    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://assertqa.com/");
    }

    @When("I click on the CONTACT US button")
    public void iClickOnCONTACTUSButton() {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("contact-a")));
        WebElement contactUsBtn = driver.findElement(By.id("contact-a"));
        contactUsBtn.click();
//        driver.findElement(By.id("contact-a")).click();

//        KOJI JE BOLJI NACIN OD OVA DVA?
    }


//    @And("I enter {string}")
//    public void iEnter(String full_name) {
//        WebElement fullNameField = driver.findElement(By.id("input-name"));
//        fullNameField.sendKeys(full_name);
//    }
//
//    @And("I enter {string}")
//    public void iEnter(String email) {
//        WebElement emailField = driver.findElement(By.id("input-email"));
//        emailField.sendKeys(email);
//    }
//
//    @And("I enter {string}")
//    public void iEnter(String message) {
//        WebElement messageField = driver.findElement(By.id("input-message"));
//        messageField.sendKeys(message);
//    }

    @And("I enter {string} in Full Name field")
    public void iEnterInFullNameField(String full_name) {
        WebElement fullNameField = driver.findElement(By.id("input-name"));
        fullNameField.sendKeys(full_name);
    }

    @And("I enter {string} in Email field")
    public void iEnterInEmailField(String email) {
        WebElement emailField = driver.findElement(By.id("input-email"));
        emailField.sendKeys(email);
    }

    @And("I enter {string} in Message field")
    public void iEnterInMessageField(String message) {
        WebElement messageField = driver.findElement(By.id("input-message"));
        messageField.sendKeys(message);
    }

    @And("I click on the SEND MESSAGE button")
    public void iClickOnTheSENDMESSAGEButton() {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("contact-btn")));
//        WebElement sendMessageBtn = driver.findElement(By.className("contact-btn"));
//        sendMessageBtn.click();
        driver.findElement(By.className("contact-btn")).click();
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String answer) throws InterruptedException {
        try {
            wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("form-messages")));
            WebElement sentMsg = driver.findElement(By.id("form-messages"));

            wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-name")));
            WebElement invalidName = driver.findElement(By.className("error-name"));

            wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-mail")));
            WebElement invalidEmail = driver.findElement(By.className("error-mail"));

            wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("error-message")));
            WebElement emptyMsg = driver.findElement(By.className("error-message"));

                Assert.assertTrue(sentMsg.getText().contains(answer));
                Assert.assertTrue(invalidName.getText().contains(answer));
                Assert.assertTrue(invalidEmail.getText().contains(answer));
                Assert.assertTrue(emptyMsg.getText().contains(answer));

//        Assert.assertEquals(answer, sentMsg);
//        Assert.assertEquals(answer, invalidName);
//        Assert.assertEquals(answer, invalidEmail);
//        Assert.assertEquals(answer, emptyMsg);

//      Left for visual confirmation
            Thread.sleep(3000);
        }
        finally {
            driver.close();
            driver.quit();
        }
    }
}
