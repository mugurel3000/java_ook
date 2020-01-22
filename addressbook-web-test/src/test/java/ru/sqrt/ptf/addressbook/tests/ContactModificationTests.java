package ru.sqrt.ptf.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoNewContactPage(By.linkText("add new"));
      app.getContactHelper().createContact(new ContactData("Max", "Margulet", "Sergeevici", "Mugurel", "mob", "OOK", "Socoleni", "moldova", "079398059", "test1"));
    }
    app.getContactHelper().gotoHomePage("home page");
    app.getContactHelper().editContact("//img[@alt='Edit']");
    app.getContactHelper().fillFieldNewContact(new ContactData("Max", "Margulet", "Sergeevici", "Mugurel", "mob", "OOK", "Socoleni", "moldova", "079398059", null), false);
    app.getContactHelper().updateContact("update");
    app.getContactHelper().gotoHomePage("home page");
  }
}