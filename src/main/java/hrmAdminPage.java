import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class hrmAdminPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //1. Admin
        By byLnkAdmin = By.xpath("//a[.//span[normalize-space()='Admin']]");
        chromeDriver.findElement(byLnkAdmin);

        //2. PIM
        By byLnkPIM = By.xpath("//a[.//span[normalize-space()='PIM']]");
        chromeDriver.findElement(byLnkPIM);

        //3. Leave
        By byLnkLeave = By.xpath("//a[.//span[normalize-space()='Leave']]");
        chromeDriver.findElement(byLnkLeave);

        //4. Username
        By byTxtSystemUsername = By.xpath("//label[normalize-space()='Username']/following::input[1]");
        chromeDriver.findElement(byTxtSystemUsername);

        //5. User Role
        By byUserRole = By.xpath("//label[normalize-space()='User Role']/following::div[3]");
        chromeDriver.findElement(byUserRole);

        //6. Role Admin
        By byOptionAdmin = By.xpath("//div[@role='option'][normalize-space()='Admin']");
        chromeDriver.findElement(byOptionAdmin);

        //7. Role ESS
        By byOptionESS = By.xpath("//div[@role='option'][normalize-space()='ESS']");
        chromeDriver.findElement(byOptionESS);

        //8. Employee name
        By byTxtEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
        chromeDriver.findElement(byTxtEmployeeName);

        //9. Button Reset
        By byBtnReset = By.xpath("//button[normalize-space()='Reset']");
        chromeDriver.findElement(byBtnReset);

        //10. Button Search
        By byBtnSearch = By.xpath("//button[normalize-space()='Search']");
        chromeDriver.findElement(byBtnSearch);

        //11. User Management
        By byUserManagement = By.xpath("//span[normalize-space()='User Management']/parent::li");
        chromeDriver.findElement(byUserManagement);

        //12. Username
        By byName = By.xpath("//div[@role='cell']//div[normalize-space()='FMLName']");
        chromeDriver.findElement(byName);

        //13. User Role
        By byRole = By.xpath("//div[@role='cell']//div[normalize-space()='ESS']");
        chromeDriver.findElement(byRole);

        //14. Delete
        By byBtnDelete = By.xpath("//button[i[contains(@class,'trash')]]");
        chromeDriver.findElement(byBtnDelete);

        //15. Pencil
        By byBtnPencil = By.xpath("//button[i[contains(@class,'pencil')]]");
        chromeDriver.findElement(byBtnPencil);

        //16. Header User Role
        By byHeaderUserRole = By.xpath("//div[@role='columnheader'][text()='User Role']");
        chromeDriver.findElement(byHeaderUserRole);

        //17. Header Employee Name
        By byHeaderEmployeeName = By.xpath("//div[@role='columnheader'][text()='Employee Name']");
        chromeDriver.findElement(byHeaderEmployeeName);

        //18. Header Admin/UserManagement
        By byHeaderAdmin = By.xpath("//h6[normalize-space()='Admin']");
        chromeDriver.findElement(byHeaderAdmin);

        By byHeaderUserManagement = By.xpath("//h6[normalize-space()='User Management']");
        chromeDriver.findElement(byHeaderUserManagement);

        //19. Button Left
        By byBtnLeft = By.xpath("//i[contains(@class,'bi-chevron-left')]/parent::button");
        chromeDriver.findElement(byBtnLeft);

        //20. Button Up
        By byBtnUp = By.xpath("//i[contains(@class,'bi-caret-up-fill')]/parent::button");
        chromeDriver.findElement(byBtnUp);

        chromeDriver.quit();
    }
}
