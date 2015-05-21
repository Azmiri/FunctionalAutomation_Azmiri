package com.amazon;

import baseApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mamun on 5/17/2015.
 */
public class SearchBabyItem extends Base {

    @Test
    public void babyCloth() throws InterreuptedExceptions, InterruptedException {
        System.out.println(driver.getCurrentUrl());
        typeAndEnterByCss("#twotabsearchtextbox", "baby");
        sleepFor(2);
        List<String> list = getTextByCss("#nav-subnav .nav-a");
        // List<WebElement> list=driver.findElements(By.cssSelector("#nav-subnav .nav-a"));//#nav-subnav > a.nav-a.nav-b
        // sleepFor(4);
        displayText(list);
        //  clickByXpath("//*[@id=\"nav-subnav\"]/a[2]");
        for (int i = 0; i < list.size(); i++) {
            driver.findElement(By.linkText(list.get(i))).click();
        }
sleepFor(3);
    }
}
