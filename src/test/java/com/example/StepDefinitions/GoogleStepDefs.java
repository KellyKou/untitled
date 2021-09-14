package com.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleStepDefs {
    WebDriver driver;
    @Given("^Launch Google Home Page$")
    public void launchGoogle(){

        driver.get("https://google.com");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }

    @Given("Open Facebook Page")
    public void openFacebookPage() {
        driver.get("https://my.service.nsw.gov.au/MyServiceNSW/index?_ga=2.151016505.1255793074.1602550391-182022651.1598841189#/rms/freeRegoCheck/details");

    }
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    //@After
    //public void teardown(){
        //driver.quit();
    //}

    @Given("Launch NswPage")
    public void launchNswPage() {
        driver.get("https://my.service.nsw.gov.au/MyServiceNSW/index?_ga=2.151016505.1255793074.1602550391-182022651.1598841189#/rms/freeRegoCheck/details");

    }

    @And("^User enters (.*)$")
    public void userEntersPlateNumber(String plateNumber) {

        driver.findElement(By.xpath("//input[@id='formly_2_input_plateNumber_0']")).sendKeys(plateNumber);
    }

    @And("User tick the checkbox")
    public void userTickTheCheckbox() {
        driver.findElement(By.xpath("//input[@id='formly_2_checkbox-label-with-action_termsAndConditions_1']")).click();
    }

    @When("User click on Next")
    public void userClickOnNext() {
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
    }

    @Then("User is redirected to Plate result page")
    public void userIsRedirectedToPlateResultPage() {
        Assert.assertEquals(driver.getTitle(), "Registration check");
    }
}
