package ru.sqrt.ptf.addressbook;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage("groups");
    selectGroup("selected[]");
    deleteSelectedGroups("delete");
    returnToGroupPage("group page");
  }

}
