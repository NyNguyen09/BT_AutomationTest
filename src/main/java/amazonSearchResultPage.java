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

        //1. Image
        By byImage = By.xpath("//img[contains(@alt,'Grand Court')]//parent::div");
        chromeDriver.findElement(byImage);

        //2. Cost
        By byCost  = By.xpath("//div[@aria-hidden='List: $70.00']");
        chromeDriver.findElement(byCost);

        //3. Discount
        By byDiscount = By.xpath("");
        chromeDriver.findElement(byDiscount);

        //4. Search
        By bySearch = By.xpath("//label[normalize-space()='Search Amazon']//parent::div");
        chromeDriver.findElement(bySearch);

        //5. Cart
        By byCart = By.xpath("//a[@id='nav-cart']");
        chromeDriver.findElement(byCart);

        //7. Button 6
        By byButtonSix = By.xpath("//li[contains(@id,'men_shoe')]//button[@value='6']");
        chromeDriver.findElement(byButtonSix);

        //8. Name
        By byName = By.xpath("//h2[contains(normalize-space(),'Grand Court')]");
        chromeDriver.findElement(byName);

        //9. Delivery
        By byDelivery = By.xpath("//h2[@aria-label='Men's Grand Court 2.0 Shoe']/ancestor::div[@data-component-type='s-search-result']//div[@data-cy='delivery-block']");
        chromeDriver.findElement(byDelivery);

        //10. Adidas
        By byAdidas = By.xpath("(//span[text()='adidas'])[1]");
        chromeDriver.findElement(byAdidas);

        //12. Checkbox Men
        By byCheckBoxMen = By.xpath("//span[normalize-space()='Men']/preceding::input[@type='checkbox']");
        chromeDriver.findElement(byCheckBoxMen);

        //13. Results
        By byResults = By.xpath("//span[contains(text(),'results')]");
        chromeDriver.findElement(byResults);

        chromeDriver.quit();
    }
}
