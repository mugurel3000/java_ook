package ru.sqrt.ptf.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.model.ContactData;

import java.util.List;

public class CreateNewContactTest extends TestBase {

  @Test
  public void testCreateNewContact() {
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getNavigationHelper().gotoNewContactPage();
    app.getContactHelper().fillFieldNewContact(true);
    app.getContactHelper().addNewContact();
    app.getContactHelper().gotoHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() +1);
  }


}
