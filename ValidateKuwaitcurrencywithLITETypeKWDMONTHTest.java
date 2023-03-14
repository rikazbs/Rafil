import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ValidateKuwaitcurrencywithLITETypeKWDMONTHTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void validateKuwaitcurrencywithLITETypeKWDMONTH() {
    driver.get("https://subscribe.stctv.com/sa-en");
    driver.manage().window().setSize(new Dimension(1054, 666));
    driver.findElement(By.cssSelector(".country-current:nth-child(1)")).click();
    driver.findElement(By.id("kw")).click();
    driver.findElement(By.id("lite-selection")).click();
    driver.findElement(By.id("btnChoosePaymentMethod")).click();
    driver.findElement(By.id("btnChooseAddons")).click();
  }
}
