import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonSearchResultPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.amazon.com/s?k=adidas&crid=35MPBE001LMM7&sprefix=%2Caps%2C460&ref=nb_sb_ss_recent_1_0_recent");

        //1.

        //2.

        //3.

        //4. Search
        By bySearch = By.xpath("//label[normalize-space()='Search Amazon']//parent::div");
        chromeDriver.findElement(bySearch);

        //5. Cart
        By byCart = By.xpath("//a[@id='nav-cart']");
        chromeDriver.findElement(byCart);

        //6.


        //7. Button 6
        By byButtonSix = By.xpath("//li[contains(@id,'men_shoe')]//button[@value='6']");
        chromeDriver.findElement(byButtonSix);

        //8.

        //9.


        //10.


        //11.


        //12. Checkbox Men
        By byCheckBoxMen = By.xpath("//span[normalize-space()='Men']/preceding::input[@type='checkbox']");
        chromeDriver.findElement(byCheckBoxMen);

        //13. Results
        By byResults = By.xpath("//span[contains(text(),'results')]");
        chromeDriver.findElement(byResults);

        //14.
    }
}
