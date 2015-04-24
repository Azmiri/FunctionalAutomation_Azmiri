package com.amazon;

import baseApi.Base;
import org.testng.annotations.Test;

/**
 * Created by mamun on 4/22/2015.
 */
public class AmazonHome extends Base {

    @Test
    public void HomePageOfAmazon(){
        System.out.println(driver.getCurrentUrl());
    }
}
