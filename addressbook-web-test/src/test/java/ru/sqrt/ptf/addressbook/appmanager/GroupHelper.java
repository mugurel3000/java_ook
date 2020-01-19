package ru.sqrt.ptf.addressbook.appmanager;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import ru.sqrt.ptf.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {

    super(wd);
  }

  public void returnToGroupPage(String s) {
    click(By.linkText(s));
  }

  public void submitGroupCreation(String submit) {
    click(By.name(submit));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation(String s) {
    click(By.name(s));
  }

  public void deleteSelectedGroups(String delete) {
    click(By.name(delete));
  }

  public void selectGroup(String s) {
    click(By.name(s));
  }

  public void initGroupModification(String edit) {
    click(By.name(edit));
  }

  public void submitGroupModification(String update) {
    click(By.name(update));
  }
}
