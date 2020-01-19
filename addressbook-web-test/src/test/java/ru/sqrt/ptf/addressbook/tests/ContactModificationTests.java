package ru.sqrt.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getContactHelper().editContact("//img[@alt='Edit']");
    app.getContactHelper().fillFieldNewContact(new ContactData("Max", "Margulet", "Sergeevici", "Mugurel", "mob", "OOK", "Socoleni", "moldova", "079398059"));
    app.getContactHelper().updateContact("update");
    app.getContactHelper().gotoHomePage("home page");
  }
}