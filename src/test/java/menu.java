import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class menu{
    public static ChromeDriver driver;

    @Test
    public void testMenu(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://onliner.by");
        driver.findElement(By.xpath("//*[@id='navigation-sidebar']/div[2]/a")).click();

        WebElement catalog = driver.findElement(By.xpath("//*[@id='navigation-sidebar']/div[2]/div[2]/div[2]/ul[1]/li[2]/a[1]/span"));
        Assert.assertEquals(catalog.getText(), "Каталог");

        WebElement mainPage = driver.findElement(By.xpath("//*[@id='navigation-sidebar']/div[2]/div[2]/div[2]/ul[1]/li[1]/a/span"));
        Assert.assertEquals(mainPage.getText(), "Главная страница");

        WebElement news = driver.findElement(By.xpath("//*[@id='navigation-sidebar']/div[2]/div[2]/div[2]/ul[1]/li[3]/a/span"));
        Assert.assertEquals(news.getText(), "Новости");

        driver.quit();

    }

}