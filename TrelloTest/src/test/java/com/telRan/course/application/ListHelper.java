package com.telRan.course.application;

import com.telRan.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListHelper extends HelperBase{

    public ListHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void clickAddList() {
        click(By.cssSelector("span.placeholder.js-open-add-list"));
    }

    public void enterNewListName(ListData listData) {
        type(By.cssSelector("input.list-name-input"),listData.getListName());
//        wd.findElement(By.cssSelector("input.list-name-input")).click();
//        wd.findElement(By.cssSelector("input.list-name-input")).clear();
//        wd.findElement(By.cssSelector("input.list-name-input")).sendKeys(listData.getListName());
    }

    public void clickSaveListButton() {
        click(By.cssSelector("input.primary.mod-list-add-button.js-save-edit"));
    }


    public void findList() {
        wd.findElement(By.xpath("//textarea[@aria-label='123']")).findElement(By.xpath("..")).click();
    }

    public void fillRenameListTitle(ListData listData) {
        type(By.xpath("//textarea[@aria-label='123']"),listData.getListName());
//        wd.findElement(By.xpath("//textarea[@aria-label='123']")).click();
//        wd.findElement(By.xpath("//textarea[@aria-label='123']")).clear();
//        wd.findElement(By.xpath("//textarea[@aria-label='123']")).sendKeys(listData.getListName());
    }

    public void openListMenu() {
        wd.findElement(By.xpath("//textarea[@aria-label='123']"))
                .findElement(By.cssSelector("a.list-header-extras-menu.dark-hover.js-open-list-menu"))
                .findElement(By.xpath("..")).click();

    }

    public void cliclArchiveThisList() {
        click(By.cssSelector("a.js-close-list"));

    }

    public int getListCount() {
        return wd.findElements(By.cssSelector("div.list.js-list-content")).size();
    }

    public void clickListSpareSpace() {
        click(By.cssSelector("div.board-header.u-clearfix.js-board-header"));
    }
}
