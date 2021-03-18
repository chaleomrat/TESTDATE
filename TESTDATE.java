import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TESTDATE {
  @Test
  void testdata1() {
    WebDriver driver = null;
    String browser = "firefox";
    if (browser.equalsIgnoreCase("firefox")) {

      System.setProperty("webdriver.gecko.driver", "C:\\Users\\sometimes\\Desktop\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
    driver.get("http://localhost:8080/Date/");
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'March']")).click();
    }
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("day")).sendKeys("02");
    driver.findElement(By.id("submit")).click();
    String result = driver.findElement(By.id("result")).getText();
    assertEquals("Tuesday", result);
    driver.close();
  }

  @Test
  // pass
  void testdata2() {
    WebDriver driver = null;
    String browser = "firefox";
    if (browser.equalsIgnoreCase("firefox")) {

      System.setProperty("webdriver.gecko.driver", "C:\\Users\\sometimes\\Desktop\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
    driver.get("http://localhost:8080/Date/");
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'June']")).click();
    }
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("day")).sendKeys("15");
    driver.findElement(By.id("submit")).click();
    String result = driver.findElement(By.id("result")).getText();
    assertEquals("Tuesday", result);
    driver.close();
  }

  @Test
  // pass
  void testdata3() {
    WebDriver driver = null;
    String browser = "firefox";
    if (browser.equalsIgnoreCase("firefox")) {

      System.setProperty("webdriver.gecko.driver", "C:\\Users\\sometimes\\Desktop\\geckodriver.exe");
      driver = new FirefoxDriver();
    }
    driver.get("http://localhost:8080/Date/");
    driver.findElement(By.id("month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("month"));
      dropdown.findElement(By.xpath("//option[. = 'June']")).click();
    }
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("day")).sendKeys("13");
    driver.findElement(By.id("submit")).click();
    String result = driver.findElement(By.id("result")).getText();
    assertEquals("Sunday", result);
    driver.close();
  }

};