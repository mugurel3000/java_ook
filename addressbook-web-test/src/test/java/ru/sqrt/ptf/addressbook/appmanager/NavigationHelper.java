package ru.sqrt.ptf.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage(String groups) {
    click(By.linkText(groups));
  }

  public void gotoNewContactPage(By groups) {
    click(By.linkText("add new"));
  }
}