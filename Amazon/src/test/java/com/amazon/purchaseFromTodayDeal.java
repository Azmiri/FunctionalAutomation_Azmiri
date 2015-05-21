package com.amazon;

import baseApi.Base;
import org.testng.annotations.Test;

/**
 * Created by mamun on 5/13/2015.
 */
public class purchaseFromTodayDeal extends Base {
    @Test
    public void purchaseFromTodayDeal() throws InterruptedException {

        clickByCss("#nav-xshop > a:nth-child(2)");
        sleepFor(2);
       clickByCss("#dealActionButton > img");
        //#dealActionButton > img

        //<img class="" src="http://g-ecx.images-amazon.com/images/G/01/goldbox/images/buttons/SeeDeal._V325260938_.png" title="See Deal">
        sleepFor(3);
        clickByCss("#centercolatf > div.productList > div > table > tbody > tr > td > div > form > table:nth-child(4) > tbody > tr:nth-child(1) > td:nth-child(1) > input[type=\"checkbox\"]");
       //-native");   //  From this
        sleepFor(5);
        clickByCss("#centercolatf > div.productList > div > table > tbody > tr > td > div > form > table:nth-child(3) > tbody > tr > td:nth-child(2) > input[type=\"image\"]");
        sleepFor(5);
        clickByCss("#hlb-ptc-btn-native");
        sleepFor(5);
        typeAndEnterByCss("#ap_email", "azmiri_s@yahoo.com");
        sleepFor(5);
//        clickByCss("#ap_signin_create_radio");
//        sleepFor(4);
   typeAndEnterByCss("#ap_password", "azmiri123");
      sleepFor(15);
        clickByCss("#address-book-entry-0 > div.ship-to-this-address.a-button.a-button-primary.a-button-span12.a-spacing-medium > span > a");
        sleepFor(5);
//        clickByCss("#signInSubmit-input");
//        sleepFor(10);
    }
}
//        driver.navigate().back();
//        {
//            clickByCss("<img class=\"\" src=\"http://g-ecx.images-amazon.com/images/G/01/goldbox/images/buttons/AddtoCart._V325260938_.png\" title=\"Add to cart\">");
//            sleepFor(2);
//            driver.navigate().back();
//            {
//                clickByCss("//*[@id=\"hlb-ptc-btn-native\"]");
//              sleepFor(2);
//                driver.navigate().back();
//                {
//                    typeAndEnterByCss("<input id=\"ap_email\" name=\"email\" value=\"\" type=\"email\" size=\"30\" maxlength=\"128\" tabindex=\"1\" autocorrect=\"off\" autocapitalize=\"off\">", "Azmiri");
//                    sleepFor(3);
//                    driver.navigate().back();
//
//                }
//            }
//        }
//    }
//}