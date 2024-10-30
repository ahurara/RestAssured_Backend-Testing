package org.example12.PageObjects;

import org.example12.Enums.DemoQAEnums;
import org.example12.constants.FrameworkPathConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.example12.ConfigLoaders.JsonUtils.getValue;
import static org.example12.PageObjects.DemoQAFormPageLocators.*;
import static org.example12.PageObjects.DemoQAFormPageTestData.*;
import static org.example12.Utilities.Utility.scrollToElement;
import static org.example12.drivers.WebDriverManager.getWebDriver;

public class DemoQAFormPage {

    public void navigateToDemoQAPage() {
        getWebDriver().get(getValue(DemoQAEnums.URL, FrameworkPathConstants.TEST_DATA_FILE_PATH));
    }

    public void fillFirstName(){
        WebElement firstName = getWebDriver().findElement(By.id(firstNameLocator));
        scrollToElement(firstName);
        firstName.sendKeys(firstNameTestData);
    }

    public void fillLastName(){
        WebElement lastName = getWebDriver().findElement(By.id(lastNameLocator));
        scrollToElement(lastName);
        lastName.sendKeys(lastNameTestData);
    }

    public void fillUserEmail(){
        WebElement userEmail = getWebDriver().findElement(By.id(emailLocator));
        scrollToElement(userEmail);
        userEmail.sendKeys(emailTestData);
    }

    public void clickGender(){
        WebElement gender = getWebDriver().findElement(By.cssSelector(DemoQAFormPageLocators.gender));
        scrollToElement(gender);
        gender.click();
    }

    public void fillMobile(){
        WebElement mobile = getWebDriver().findElement(By.id(phoneNumberLocator));
        scrollToElement(mobile);
        mobile.sendKeys(phoneNumberTestData);
    }

    public void fillDateTime(){
        WebElement dateTime = getWebDriver().findElement(By.id(dateOfBirthLocator));
        scrollToElement(dateTime);
        dateTime.click();
        dateTime.sendKeys(Keys.ENTER);
    }

    public void fillSubject(){
        WebElement subject = getWebDriver().findElement(By.id(subjectLocator));
        scrollToElement(subject);
        subject.sendKeys(subjectTestData);
        subject.sendKeys(Keys.ENTER);
    }

    public void clickhobbies() throws InterruptedException {
        WebElement hobbies = getWebDriver().findElement(By.xpath(sportsLocator));
        scrollToElement(hobbies);
        hobbies.click();
    }
    public void sendImg(){
        WebElement img = getWebDriver().findElement(By.id(uploadPictureLocator));
        scrollToElement(img);
        img.sendKeys("D:\\example12\\src\\test\\resources\\48.jpeg");
    }

    public void fillAddress(){
        WebElement address = getWebDriver().findElement(By.id(currentAddressLocator));
        scrollToElement(address);
        address.sendKeys(currentAddressTestData);
        address.sendKeys(Keys.ENTER);
    }

    public void clickState() {


        WebElement state = getWebDriver().findElement(By.xpath(selectStateLocator));
        scrollToElement(state);
        state.click();

        try {
            // Sleep to wait for the element to become interactable, though it's better to use explicit waits
            Thread.sleep(1000);

            // Corrected: Pass WebDriver to Actions, not WebElement
            Actions actions = new Actions(getWebDriver());

            // Send SPACE key to the element
            actions.moveToElement(state).sendKeys(Keys.SPACE).perform();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


    public void clickCity(){

        WebElement city = getWebDriver().findElement(By.xpath(selectCityLocator));
        scrollToElement(city);
        city.click();

        try {
            // Sleep to wait for the element to become interactable, though it's better to use explicit waits
            Thread.sleep(1000);

            // Corrected: Pass WebDriver to Actions, not WebElement
            Actions actions = new Actions(getWebDriver());

            // Send SPACE key to the element
            actions.moveToElement(city).sendKeys(Keys.SPACE).perform();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void clickSubmit() {
        WebElement submit = getWebDriver().findElement(By.id(submitBtnLocator));
        scrollToElement(submit);
        submit.click();
    }









}
