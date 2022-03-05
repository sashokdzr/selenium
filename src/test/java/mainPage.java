import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mainPage {
    public static ChromeDriver driver;

    @Test
    public void testTitle(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://onliner.by");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Onliner");
        driver.quit();
    }
}
