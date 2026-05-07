import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class airbnbHomePage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //1. logo
        By byLogo = By.xpath("//span[normalize-space()='CyberSoft']");
        chromeDriver.findElement(byLogo);
        //2. Home
        By byHome = By.xpath("//a[normalize-space()='Home']");
        chromeDriver.findElement(byHome);

        //3. About
        By byAbout = By.xpath("//a[normalize-space()='About']");
        chromeDriver.findElement(byAbout);

        //4. User
        By byUser = By.xpath("//button[img]");
        chromeDriver.findElement(byUser);

        //5. Địa điểm
        By byLocation = By.xpath("//p[normalize-space()='Địa điểm']//parent::div");
        chromeDriver.findElement(byLocation);

        //6. Check in - check out
        By byDate = By.xpath("//p[contains(.,'–')]");
        chromeDriver.findElement(byDate);

        //7. Thêm khách
        By byThemKhach = By.xpath("//p[normalize-space()='Thêm khách']//parent::div");
        chromeDriver.findElement(byThemKhach);

        //8. Button tăng
        By byUp = By.xpath("//div[normalize-space()='+']//parent::button");
        chromeDriver.findElement(byUp);

        //9. Button giảm
        By byDown = By.xpath("//div[normalize-space()='-']//parent::button");
        chromeDriver.findElement(byDown);
        //10. Hồ Chí Minh
        By byHoChiMinh = By.xpath("//a[contains(@href,'ho-chi-minh')]");
        chromeDriver.findElement(byHoChiMinh);

        //11. Cần Thơ
        By byCanTho = By.xpath("//h2[normalize-space()='Cần Thơ']");
        chromeDriver.findElement(byCanTho);

        //12. Loại nơi ở
        By byLoaiNoiO = By.xpath("//button[normalize-space()='Loại nơi ở']");
        chromeDriver.findElement(byLoaiNoiO);

        //13. Giá
        By byGia = By.xpath("//button[normalize-space()='Giá']");
        chromeDriver.findElement(byGia);

        //14. Giờ lái xe
        By byTime = By.xpath("//p[contains(.,'6.5')]");
        chromeDriver.findElement(byTime);

        chromeDriver.quit();

    }
}
