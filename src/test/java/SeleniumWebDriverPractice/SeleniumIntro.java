package SeleniumWebDriverPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumIntro {

        @Test
        public void demoSelenium1() throws InterruptedException {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://www.google.com/");
            WebElement searchInputField = driver.findElement(By.name("q"));
            searchInputField.sendKeys("Iphone");
            Thread.sleep(3000);
            searchInputField.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            WebElement appleText = driver.findElement(By.tagName("h3"));
            String expectedAppleIphoneText = "iPhone - Apple";
            Assert.assertEquals(appleText.getText(), expectedAppleIphoneText);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            System.out.println();
            driver.close();
            driver.quit();
        }

        @Test
        public void demo2() throws InterruptedException {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://demoqa.com/text-box");
            Thread.sleep(1000);

            //Заполнение полей
            WebElement FullName = driver.findElement(By.id("userName"));
            FullName.sendKeys("Chadaev Erlan");
            Thread.sleep(1000);
            WebElement Email = driver.findElement(By.id("userEmail"));
            Email.sendKeys("bekowa123@gmail.com");
            Thread.sleep(1000);
            WebElement CurrentAddress = driver.findElement(By.id("currentAddress"));
            CurrentAddress.sendKeys("Bishkek");
            Thread.sleep(1000);
            WebElement PermanentAddress = driver.findElement(By.id("permanentAddress"));
            PermanentAddress.sendKeys("Karakol");
            Thread.sleep(1000);





            // Клик по Submit
            WebElement SubmitButton = driver.findElement(By.id("submit"));
            SubmitButton.click();
            Thread.sleep(1000);

            // Прокрутка вниз
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
            Thread.sleep(3000);

            // Есть сравнения
            String expectedFullName = "Name:Chadaev Erlan";
            String expectedEmail = "Email:bekowa123@gmail.com";
            String expectedCurrentAddress = "Current Address :Bishkek";
            String expectedPermanentAddress = "Permananet Address :Karakol";

            System.out.println(FullName.getText());



            //Получение элементов из рамки
            WebElement actualFrame = driver.findElement(By.id("output"));

            //Получение элементов из полей
            WebElement actualFullName = driver.findElement(By.id("name"));
            WebElement actualEmail = driver.findElement(By.id("email"));
            WebElement actualCurrentAddress = actualFrame.findElement(By.id("currentAddress"));
            WebElement actualPermanentAddress = actualFrame.findElement(By.id("permanentAddress"));

            // Тесты
            Assert.assertEquals(actualFullName.getText(),expectedFullName);
            Assert.assertEquals(actualEmail.getText(),expectedEmail);
            Assert.assertEquals(actualCurrentAddress.getText(),expectedCurrentAddress);
            Assert.assertEquals(actualPermanentAddress.getText(),expectedPermanentAddress);


            driver.quit();

        }





}
