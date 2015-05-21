package com.amazon;

import baseApi.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mamun on 5/12/2015.
 */
public class ShopByDep extends Base {

    @Test
    public void shopBy() throws InterruptedException {

       // clickByCss("#nav-xshop > a:nth-child(3)");
//clickByCss("#nav-xshop .nav-a");

        sleepFor(1);
        //Assign list information to links List
      // List<WebElement> links = driver.findElements(By.xpath(".//*[@id='default-p_30345789-bd']/ul[1]/li"));

        List<String> text=  getStringArraybyXpath(".//*[@id='default-p_30345789-bd']/ul[1]/li");

        //Creat String Arraylist text
       // List<String> text = new ArrayList<String>();

//
//        //convert webelement value to String using for lop
//        for(WebElement st:links){
//            text.add(st.getText());
//        }

        // now we have string  aray list text that contains all the value of list


        for (int i = 1; i<text.size(); i++){
            System.out.println(text.get(i));
        }



        for ( int j =1; j <text.size(); j++){
            clickByXpath(".//*[@id='default-p_30345789-bd']/ul[1]/li["+j+"]/a/span");
            sleepFor(5);
            driver.navigate().back();
        }



      //  System.out.println(driver.getCurrentUrl());
//        {
//            clickByCss(" #nav-subnav .nav-a.nav-b");
//        }
//         sleepFor(1);
////
//            // sleepFor(2);
//           List<String> list = getTextByCss("##nav-your-amazon .nav-a");
//
//        displayText(list);
//          for (int i = 1; i < list.size(); i++) {
//              driver.findElement(By.linkText(list.get(i))).click();
//          }
//        }
////                //clickByCss("#nav-shop #nav-link-shopall .nav-line-2");
//              sleepFor(1);
////                //clickByCss("nav-arrow . nav-hasPanel nav-item nav-active");
////                // clickByCss("#nav-template nav-flyout-content nav-tpl-itemList #nav-hasPanel nav-item.nav-text");
////
//////clickByCss("#siteDirectory #siteDirectoryHeading.shopAllLinks");
////                //  clickByCss("#siteDirectory #shopAllLinks .popover-grouping");
////       List<String> list = getTextByCss("#nav-template nav-flyout-content nav-tpl-itemList.nav-subcats");
//                //sleepFor(2);
//

            }
        }

