package ru.sqrt.ptf.addressbook.tests;

import org.testng.annotations.Test;
import ru.sqrt.ptf.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().initGroupModification("edit");
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupModification("update");
    app.getGroupHelper().returnToGroupPage("group page");
  }
}