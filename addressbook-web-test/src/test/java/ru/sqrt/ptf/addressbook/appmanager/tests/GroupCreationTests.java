package ru.sqrt.ptf.addressbook.appmanager.tests;

import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.appmanager.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation("submit");
    app.getGroupHelper().returnToGroupPage("group page");
  }

}
