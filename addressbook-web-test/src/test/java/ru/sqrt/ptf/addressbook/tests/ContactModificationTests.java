package ru.sqrt.ptf.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoNewContactPage();
      app.getContactHelper().createContact();
      app.getContactHelper().gotoHomePage();
    }
    app.getContactHelper().editContact();
    app.getContactHelper().fillFieldNewContact( false);
    app.getContactHelper().updateContact();
    app.getContactHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }
}