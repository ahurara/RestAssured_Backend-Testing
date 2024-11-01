import org.example12.PageObjects.DemoQAFormPage;
import org.testng.annotations.*;

import static org.example12.drivers.WebDriverManager.*;

public class DemoQAPageObjectModelTestCase {

    DemoQAFormPage demoQAFormPage;

    @BeforeSuite
    public void setUp() {
        setUpWebDriver();
        maximizeWindow();
        demoQAFormPage = new DemoQAFormPage();
    }

    @BeforeTest
    public void setUpTest() {
        demoQAFormPage.navigateToDemoQAPage();
    }

    @Test
    public void TC01_Fill_Form_POM() throws InterruptedException {
        demoQAFormPage.fillFirstName();
        demoQAFormPage.fillLastName();
        demoQAFormPage.fillUserEmail();

//        WebElement genderMale = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
//        scrollToElement(genderMale);
//        genderMale.click();
//
//        WebElement userNumber = driver.findElement(By.id("userNumber"));
//        scrollToElement(userNumber);
//        userNumber.sendKeys("03002677522");
//
//        WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
//        scrollToElement(dobInput);
//        dobInput.sendKeys("07 Oct 2024");
//        dobInput.sendKeys(Keys.ENTER);
//
//        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
//        scrollToElement(subjectsInput);
//        subjectsInput.sendKeys("math");
//        subjectsInput.sendKeys(Keys.ENTER);
//
//        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
//        scrollToElement(hobbiesCheckbox);
//        Thread.sleep(1000);
//        hobbiesCheckbox.click();
//
//        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
//        Thread.sleep(2000);
//        uploadPicture.sendKeys("/Users/umair/IdeaProjects/example12/src/test/resources/48.jpeg");
//
//        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
//        scrollToElement(currentAddress);
//        currentAddress.sendKeys("xyz Karachi");
//
//        WebElement stateDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
//        scrollToElement(stateDropdown);
//        stateDropdown.click();
//        Thread.sleep(1000);
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.SPACE).perform();
//
//        WebElement cityDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
//        scrollToElement(cityDropdown);
//        cityDropdown.click();
//        Thread.sleep(1000);
//        actions.sendKeys(Keys.SPACE).perform();
//
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        scrollToElement(submitButton);
//        Thread.sleep(1000);
//        submitButton.sendKeys(Keys.ENTER);
    }

    @Test
    public void TC02_Fill_Form_POM() throws InterruptedException {
        demoQAFormPage.fillFirstName();
        demoQAFormPage.fillLastName();
        demoQAFormPage.fillUserEmail();
        demoQAFormPage.clickGender();
        demoQAFormPage.fillMobile();
        demoQAFormPage.fillDateTime();
        demoQAFormPage.fillSubject();
        demoQAFormPage.clickhobbies();
        demoQAFormPage.sendImg();
        demoQAFormPage.fillAddress();
        demoQAFormPage.clickState();
        demoQAFormPage.clickCity();
        demoQAFormPage.clickSubmit();

//        WebElement genderMale = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
//        scrollToElement(genderMale);
//        genderMale.click();
//
//        WebElement userNumber = driver.findElement(By.id("userNumber"));
//        scrollToElement(userNumber);
//        userNumber.sendKeys("03002677522");
//
//        WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
//        scrollToElement(dobInput);
//        dobInput.sendKeys("07 Oct 2024");
//        dobInput.sendKeys(Keys.ENTER);
//
//        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
//        scrollToElement(subjectsInput);
//        subjectsInput.sendKeys("math");
//        subjectsInput.sendKeys(Keys.ENTER);
//
//        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
//        scrollToElement(hobbiesCheckbox);
//        Thread.sleep(1000);
//        hobbiesCheckbox.click();
//
//        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
//        Thread.sleep(2000);
//        uploadPicture.sendKeys("/Users/umair/IdeaProjects/example12/src/test/resources/48.jpeg");
//
//        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
//        scrollToElement(currentAddress);
//        currentAddress.sendKeys("xyz Karachi");
//
//        WebElement stateDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
//        scrollToElement(stateDropdown);
//        stateDropdown.click();
//        Thread.sleep(1000);
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.SPACE).perform();
//
//        WebElement cityDropdown = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
//        scrollToElement(cityDropdown);
//        cityDropdown.click();
//        Thread.sleep(1000);
//        actions.sendKeys(Keys.SPACE).perform();
//
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        scrollToElement(submitButton);
//        Thread.sleep(1000);
//        submitButton.sendKeys(Keys.ENTER);
    }

    @Test
    public void TC03_Fill_Form_POM() throws InterruptedException {
        demoQAFormPage.fillFirstName();
        demoQAFormPage.fillLastName();
        demoQAFormPage.fillUserEmail();
    }

    @AfterTest
    public void TearDown() {

    }

    @AfterSuite
    public void tearDown() {

    }
}