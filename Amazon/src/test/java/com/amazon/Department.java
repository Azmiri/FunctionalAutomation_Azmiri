package com.amazon;

import baseApi.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by mamun on 5/13/2015.
 */
public class Department extends Base {
    @Test
    public void shopBy() throws InterruptedException {
       // List<String> list = getTextByCss("#nav-subnav .nav-a");
        //clickByCss("#nav-link-shopall.nav-line-2");
      //clickByXpath("//*[@id=\"nav-link-shopall\"]/span[2]/span");
        //*[@id="shopAllLinks"]/tbody/tr/td[3]/div[2]/ul/li[1]
        sleepFor(2);

        //Click on
        clickByCss("#nav-your-amazon");

        // Check point
        checkPoint("#ap_signin1a_pagelet_title>h1","101 STEP1");
       // screenShot();

//        if (driver.findElement(By.cssSelector("#ap_signin1a_pagelet_title>h1")).isDisplayed()){
//            print("Your Amazon.com link validated");}
//          //  write[][] ="passed"
//            else{
//            print("Your Amazon.com link not validated");
//        }



        sleepFor(1);
        driver.navigate().back();
        clickByCss("#nav-xshop > a:nth-child(2)");


//     {  clickByCss("#nav-shop #nav-link-shopall .nav-line-2");
                sleepFor(10);
        // Check point



        {
            String link01="Today's Deals";
          //  String link02=excel [3][4]

            clickByLinkText(link01);


           // clickByLinkText(link02);
            clickByCss("#nav-subnav > a.nav-a.nav-b");
            sleepFor(2);
            clickByCss("#nav-subnav > a:nth-child(2)");
            sleepFor(2);
            clickByCss("#nav-subnav > a:nth-child(3)");
            sleepFor(2);
            {clickByCss("<img class=\"\" src=\"http://g-ecx.images-amazon.com/images/G/01/goldbox/images/buttons/AddtoCart._V325260938_.png\" title=\"Add to cart\">");}
            sleepFor(1);
        }
        driver.navigate().back();
            clickByCss("#nav-subnav > a:nth-child(4)");
            sleepFor(2);
        clickByCss("#nav-subnav > a:nth-child(5)");
            sleepFor(2);
            clickByCss("#nav-subnav > a:nth-child(6)");
            sleepFor(2);
        }}
//driver.navigate().back();
//        clickByCss("#nav-xshop > a:nth-child(3)");
//        sleepFor(10);
//        driver.navigate().back();
//        clickByCss("#nav-xshop > a:nth-child(4)");
//
//sleepFor(10);
//        driver.navigate().back();
//        clickByCss("#nav-xshop > a:nth-child(5)");
//        sleepFor(10);
//        driver.navigate().back();
////        mouseHover("#nav-shop #nav-link-shopall .nav-line-2");
////       // sleepFor(1);
////        mouseHover("#nav-flyout-shopAll.nav-catFlyout.nav-flyout div.nav-template.nav-flyout-content.nav-tpl-itemList span.nav-hasPanel.nav-item span.nav-text");
////    }
//    }
//}