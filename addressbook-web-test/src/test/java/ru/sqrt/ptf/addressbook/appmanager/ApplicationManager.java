package ru.sqrt.ptf.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.sqrt.ptf.addressbook.appmanager.model.GroupData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  private WebDriver wd;

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login("user", "pass", By.xpath("//input[@value='Login']"), "admin", "secret");
  }

  private void login(String user, String pass, By xpath, String username, String password) {
    wd.findElement(By.name(user)).clear();
    wd.findElement(By.name(user)).sendKeys(username);
    wd.findElement(By.name(pass)).click();
    wd.findElement(By.name(pass)).clear();
    wd.findElement(By.name(pass)).sendKeys(password);
    wd.findElement(xpath).click();
  }

  public void returnToGroupPage(String s) {
    wd.findElement(By.linkText(s)).click();
  }

  public void submitGroupCreation(String submit) {
    wd.findElement(By.name(submit)).click();
  }

  public void fillGroupForm(GroupData groupData) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation(String s) {
    wd.findElement(By.name(s)).click();
  }

  public void gotoGroupPage(String groups) {
    wd.findElement(By.linkText(groups)).click();
  }

  public void stop() {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void deleteSelectedGroups(String delete) {
    wd.findElement(By.name(delete)).click();
  }

  public void selectGroup(String s) {
    wd.findElement(By.name(s)).click();
  }
}
