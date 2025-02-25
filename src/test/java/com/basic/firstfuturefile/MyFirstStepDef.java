package com.basic.firstfuturefile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFirstStepDef {

    //selenieum Object
    WebDriver driver;

    @Given("^User need to be on facebook login page$")
    public void user_need_to_be_on_facebook_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\cucumberSetup\\chromedriver-win64\\cchromedriver.exe");
        driver.get("https://www.facebook.com/");
    }

    @When("^User enters user first name$")
    public void user_enters_user_first_name() {
        driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("David");
    }

    @Then("^User checks user first name is present$")
    public void user_checks_user_first_name_is_present() {
        String usernameActuel = driver.findElement(By.xpath("//input[@id='u_0_1']")).getAttribute("value");
        Assert.assertEquals("David", usernameActuel);
    }
}
