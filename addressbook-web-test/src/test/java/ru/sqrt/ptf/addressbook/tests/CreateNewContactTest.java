package ru.sqrt.ptf.addressbook.tests;

import org.testng.annotations.Test;

public class CreateNewContactTest extends TestBase {

  @Test
  public void testCreateNewContact() {
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().fillFieldNewContact(true);
    app.getContactHelper().addNewContact();
  }


}
