package com.startainstitute.oop2.qa;

public interface LoginPage {

    void enterUsername(String username);

    void enterPassword(String password);

    // true if success
    boolean submit();
}
