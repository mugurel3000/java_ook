package ru.sqrt.ptf.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewContactTest extends TestBase {

  @Test
  public void testCreateNewContact() {
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().fillFieldNewContact(true);
    app.getContactHelper().addNewContact();
    app.getContactHelper().gotoHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before +1);
  }


}
