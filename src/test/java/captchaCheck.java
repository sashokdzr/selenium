import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class captchaCheck {
        public static ChromeDriver driver;
        String login = "sashok2008-88@mail.ru";
        String password = "12345";

        @Test
        public void testMenu() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://onliner.by");
            // Open menu
            driver.findElement(By.xpath("//*[@id='navigation-sidebar']/div[2]/a")).click();
            // Press "enter" button
            driver.findElement(By.xpath("//*[@id='navigation-sidebar']/div[2]/div[2]/div[3]/div/div/a")).click();
            //input login from String login
            driver.findElement(By.xpath("//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input")).sendKeys(login);
            //input password from String password
            driver.findElement(By.xpath("//*[@id='auth-container']/div/div[2]/div/form/div[2]/div/div/div/div/input")).sendKeys(password);
            //press "enter" button
            driver.findElement(By.xpath("//*[@id='auth-container']/div/div[2]/div/form/div[3]/button")).click();
            //compare the results
            Assert.assertEquals(driver.findElement(By.className("auth-form__title auth-form__title_base auth-form__title_condensed-other")).getText(), "Помогите нам улучшить безопасность");
            driver.quit();

        }

    }
