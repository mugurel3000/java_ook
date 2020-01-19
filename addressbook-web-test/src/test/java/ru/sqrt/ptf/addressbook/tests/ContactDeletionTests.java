package ru.sqrt.ptf.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getContactHelper().selectContact("selected[]");
    app.getContactHelper().deleteContact("//input[@value='Delete']");
    app.getContactHelper().alert();
  }
}
