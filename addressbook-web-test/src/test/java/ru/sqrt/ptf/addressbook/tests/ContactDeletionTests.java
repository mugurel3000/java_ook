package ru.sqrt.ptf.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    int before = app.getContactHelper().getContactCount();
    if (!app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoNewContactPage();
      app.getContactHelper().createContact();
      app.getContactHelper().gotoHomePage();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().alert();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before -1);
  }
}
