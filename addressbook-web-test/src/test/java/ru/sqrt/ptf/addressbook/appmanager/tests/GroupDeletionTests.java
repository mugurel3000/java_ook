package ru.sqrt.ptf.addressbook.appmanager.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage("groups");
    app.selectGroup("selected[]");
    app.deleteSelectedGroups("delete");
    app.returnToGroupPage("group page");
  }

}

