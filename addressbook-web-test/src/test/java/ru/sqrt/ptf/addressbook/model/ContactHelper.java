package ru.sqrt.ptf.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.sqrt.ptf.addressbook.appmanager.HelperBase;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  private void fillFieldNewContact(ContactData contactData) {
    type(By.name("address"), contactData.getAddress());
    type(By.name("company"), contactData.getCompany());
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("home"), contactData.getHome());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("mobile"), contactData.getMobiletel());
    type(By.name("title"), contactData.getTitle());
  }

  public void fillFieldNewContact(boolean creation) {
    type(By.name("address"), "Socoleni");
    type(By.name("company"), "OOK");
    type(By.name("firstname"), "Max");
    type(By.name("home"), "moldova");
    type(By.name("lastname"), "Sergeevici");
    type(By.name("middlename"), "Margulet");
    type(By.name("nickname"), "Mugurel");
    type(By.name("mobile"), "079398059");
    type(By.name("title"), "mob");

    if (creation) {
      new Select(wd.findElement(By.name("new_group")));
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public void addNewContact() {
    click(By.name("submit"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));
  }

  public void editContact() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void updateContact() {
    click(By.name("update"));
  }

  public void gotoHomePage() {
    click(By.linkText("home page"));
  }

  public void alert() {
    wd.switchTo().alert().accept();
    wd.findElement(By.cssSelector("div.msgbox"));
  }

  public void createContact() {
    fillFieldNewContact(new ContactData("Max", "Margulet", "Sergeevici", "Mugurel", "mob", "OOK", "Socoleni", "moldova", "079398059", "test1"));
    addNewContact();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}
