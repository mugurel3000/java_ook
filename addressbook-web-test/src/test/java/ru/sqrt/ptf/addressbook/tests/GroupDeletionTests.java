package ru.sqrt.ptf.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().deleteSelectedGroups("delete");
    app.getGroupHelper().returnToGroupPage("group page");
  }

}

