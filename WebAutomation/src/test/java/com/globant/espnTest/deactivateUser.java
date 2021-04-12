package com.globant.espnTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class deactivateUser {
    @Test
    public void deactivateUser(){
        System.out.println("Se desactiva usuario");
    }

    @AfterSuite
    public void closeBrowser(){
        System.out.println("Se cierra Browser");
    }
}
