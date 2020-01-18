package ru.sqrt.ptf.addressbook.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().selectGroup("selected[]");
  }

}
