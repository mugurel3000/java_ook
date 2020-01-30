package ru.sqrt.ptf.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if (! app.getGroupHelper().isThereAGroup()) {
          app.getGroupHelper().createGroup();
    }
    app.getGroupHelper().selectGroup(before -1);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm();
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);
  }
}