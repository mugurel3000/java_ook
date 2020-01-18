package ru.sqrt.ptf.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.sqrt.ptf.addressbook.appmanager.HelperBase;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillFieldNewContact(ContactData contactData) {
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

  public void addNewContact(String s) {
    click(By.name(s));
  }
}
