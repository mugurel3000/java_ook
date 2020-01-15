package ru.sqrt.ptf.addressbook.appmanager.tests;

import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.appmanager.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage("groups");
    app.initGroupCreation("new");
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation("submit");
    app.returnToGroupPage("group page");
  }

}
