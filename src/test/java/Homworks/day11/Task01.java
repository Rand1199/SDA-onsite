package Homworks.day11;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utility.TestBase;

import java.util.Set;

public class Task01 extends TestBase {
    @Test
    public void test() {
        //Go to URL:https://facebook.com/
        driver.get("https://facebook.com/");

        //Print all the cookies.
        Set<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();


        for (org.openqa.selenium.Cookie w: cookies){
            System.out.println(w);
        }
        //Get Cookie.
        org.openqa.selenium.Cookie fr = driver.manage().getCookieNamed("fr");
        System.out.println("fr = " + fr);
        System.out.println("------------------------------");

        System.out.println("fr.getValue() = " + fr.getValue()); // value of the cookie
        System.out.println("------------------------------");
        //Find the total number of cookies.
        int sizeCookies = cookies.size();
        System.out.println("sizeCookies = " + sizeCookies);
        System.out.println("------------------------------");

        //Add Cookie.
        org.openqa.selenium.Cookie newCookie = new org.openqa.selenium.Cookie("animal","cat");
        driver.manage().addCookie(newCookie);
        driver.manage().getCookies().forEach(t-> System.out.println(t));
        System.out.println("------------------------------");

        //Edit Cookie.

        //Delete Cookie.
        driver.manage().deleteCookie(fr);
        driver.manage().deleteCookieNamed("animal");
        driver.manage().getCookies().forEach(System.out::println);
        System.out.println("------------------------------");


        //Delete All Cookies.
        driver.manage().deleteAllCookies();
        driver.manage().getCookies().forEach(System.out::println);
        System.out.println("end here...");
    }
}
