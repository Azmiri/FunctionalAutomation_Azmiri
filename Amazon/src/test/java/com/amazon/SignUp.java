package com.amazon;

import baseApi.Base;

import baseApi.Base;
import org.testng.annotations.Test;

/**
 * Created by mamun on 4/30/2015.
 */
public class SignUp extends Base {


        @Test
        public void signIn() throws InterruptedException {
            sleepFor(2);
            clickByCss("#nav-tools #nav-link-yourAccount .nav-line-1");


            clickByCss(".nav-action-inner");
            sleepFor(4);
        }
    }


