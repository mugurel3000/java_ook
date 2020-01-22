package ru.sqrt.ptf.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoNewContactPage(By.linkText("add new"));
      app.getContactHelper().createContact(new ContactData("Max", "Margulet", "Sergeevici", "Mugurel", "mob", "OOK", "Socoleni", "moldova", "079398059", "test1"));
      app.getContactHelper().gotoHomePage("home page");
    }
    app.getContactHelper().selectContact("selected[]");
    app.getContactHelper().deleteContact("//input[@value='Delete']");
    app.getContactHelper().alert();
  }
}
