package ru.sqrt.ptf.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {

 private WebDriver wd;

  public NavigationHelper(WebDriver wd) {
    this.wd = wd;
  }

  public void gotoGroupPage(String groups) {
    wd.findElement(By.linkText(groups)).click();
  }
}