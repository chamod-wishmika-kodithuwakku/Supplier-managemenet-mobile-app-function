package com.example.todoapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    //checking the login insert method in AddNewTask class
    @Test
    public void checkLogin(){

        assertEquals(true, AddNewTask.insert("ABC","1234"));
    }

    //Testing SupLogin method in MainActivity class
    @Test
    public void CheckSupplierLogin(){

        assertEquals(false, MainActivity.SupLogin("ABC","ck@gmail.com"));
    }

    //Testing calc method in MainActivity2 class
    @Test
    public void Calculate(){

        assertEquals(true, MainActivity2.calc(3,15));
    }


    //Testing calc checkSplashActivity in SplashActivity class
    @Test
    public void CheckSplashActivityWorking(){

        assertEquals("SplashActivity class is working", SplashActivity.checkSplashActivity());
    }

    @Test
    public void checkdb(){

        DBHelper dbHelper = null;

        assertEquals(true, dbHelper.insertData("chamod","1234"));
    }


    @Test
    public void checkUserName(){

        DBHelper dbHelper = null;

        assertEquals(true, dbHelper.checkusername("kasun"));
    }


    @Test
    public void checkusernamepassword(){

        DBHelper dbHelper = null;

        assertEquals(true, dbHelper.checkusernamepassword("sam","1234"));
    }

}


