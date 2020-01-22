package ru.sqrt.ptf.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import ru.sqrt.ptf.addressbook.model.ContactHelper;
import org.openqa.selenium.remote.*;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  public WebDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private String browser;

  public ApplicationManager(String env) {

    this.browser = env;
  }

  public void init() {
    if (browser.toLowerCase().trim() == BrowserType.FIREFOX) {
      wd = new FirefoxDriver();
    } else if (browser.toLowerCase().trim() == BrowserType.CHROME) {
      wd = new ChromeDriver();
    } else if (browser.toLowerCase().trim() == BrowserType.IE) {
      wd = new InternetExplorerDriver();
    }

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login("user", "pass", By.xpath("//input[@value='Login']"), "admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

}