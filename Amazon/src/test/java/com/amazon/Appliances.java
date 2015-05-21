package com.amazon;

import baseApi.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mamun on 5/18/2015.
 */
public class Appliances extends Base {
    @Test
    public void HomePageOfAmazon() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());

        {
            typeAndEnterByCss("#twotabsearchtextbox", " Appliances");

            sleepFor(2);

            List<String> list = getTextByCss("#nav-subnav .nav-a");
            // List<WebElement> list = driver.findElements(By.cssSelector("#nav-subnuv . nav-a"));
            displayText(list);
            for (int i = 1; i < list.size(); i++) {
                driver.findElement(By.linkText(list.get(i))).click();
            }
            sleepFor(3);

        }
    }
}
