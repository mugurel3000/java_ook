package ru.sqrt.ptf.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.model.ContactData;

public class CreateNewContactTest extends TestBase {

  @Test
  public void testCreateNewContact() throws Exception {
    app.getNavigationHelper().gotoNewContactPage(By.linkText("add new"));
    app.getContactHelper().fillFieldNewContact(new ContactData("Max", "Margulet", "Sergeevici", "Mugurel", "mob", "OOK", "Socoleni", "moldova", "079398059"));
    app.getContactHelper().addNewContact("submit");
  }


}
