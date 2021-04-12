package com.globant.espnTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logoutTest {
    @BeforeTest
    public void ValidateUserIsLoggedIn(){
        System.out.println("Se valida si la seccion está activa");
    }

    @Test
    public void logoutUser(){
        System.out.println("Usuario cierra Sesión");
    }
}
