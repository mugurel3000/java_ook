package ru.sqrt.ptf.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OOKtestproba {
  private WebDriver dw;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    dw = new FirefoxDriver();
    dw.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testOOKtestproba() throws Exception {
    dw.get("https://otkritkiok.ru/");
    dw.findElement(By.cssSelector("svg.navigation__icon > path")).click();
    dw.findElement(By.linkText("День ангела")).click();
    dw.findElement(By.linkText("Вадим")).click();
    dw.findElement(By.xpath("//img[@alt='Открытка открытка день имени вадим']")).click();
    dw.findElement(By.cssSelector("svg.footer__logo")).click();
    dw.findElement(By.xpath("//div[7]/div/div/div[2]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    dw.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      dw.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      dw.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
