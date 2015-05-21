package com.amazon;

import baseApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mamun on 4/22/2015.
 */
public class AmazonHome extends Base {

    @Test
    public void HomePageOfAmazon() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        {
            typeAndEnterByCss("#twotabsearchtextbox", " book");

            sleepFor(4);
            // sleepFor(4);
            // clickByXpath(".//*[@id='nav-subnav']/a[2]");
            // List<WebElement> bookNavBar= getWebElements("#nav-subnuv . nav-a");
            // for(WebElement element : bookNavBar)
            // element.click();
            List<String> list = getTextByCss("#nav-subnav .nav-a");
            // List<WebElement> list = driver.findElements(By.cssSelector("#nav-subnuv . nav-a"));
            displayText(list);
            // List<WebElement> bookNavBar= getWebElements("#nav-subnuv . nav-a");
            // clickByXpath(".//*[@id='nav-subnav']/a[2]");
            // for(WebElement element : bookNavBar)
            // clickByCss();

//driver.findElement(By.linkText(list.get(i))).click();
// bookNavBar = getWebElements("#nav-subnav .nav-a");
            for (int i = 1; i < list.size(); i++) {
                driver.findElement(By.linkText(list.get(i))).click();
                // clickByText(list.get(i));

                //public void sleepFor(String) {

            }

        }


        sleepFor(4);
    }




    }


//  This is change from amazon
