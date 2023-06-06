package com.startainstitute.oop2.qa;

public class LoginPageTest {

    public static void main(String[] args) {

    }

    private void testLoginPage(LoginPage loginPage) {
        loginPage.enterUsername("Anton");
        loginPage.enterPassword("1234");
        boolean success = loginPage.submit();
        if (!success) {
            System.out.println("Failed test");
        }
    }
}
