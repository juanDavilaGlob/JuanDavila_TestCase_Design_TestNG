package com.globant.espnTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginTest {

    @BeforeSuite
    public void openBrowser(){
        System.out.println("Se abre en browser en el link https://www.espn.com/?src=com&adblock=true");
    }

    @Test
    public void loginUser(){
        System.out.println("Usuario inicia Sesión");
    }
}
