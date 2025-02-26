package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstStepDef {

    //selenieum Object
    WebDriver driver;

    @Given("^User need to be on facebook login page$")
    public void user_need_to_be_on_facebook_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\workplace\\cucumberSetup\\chromedriver-win64\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
    }

    @When("^User enters user first name$")
    public void user_enters_user_first_name() {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("David");
        //driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("David");
    }

    @Then("^User checks user first name is present$")
    public void user_checks_user_first_name_is_present() {
        String usernameActuel = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
        Assert.assertEquals("David", usernameActuel);
    }
}
