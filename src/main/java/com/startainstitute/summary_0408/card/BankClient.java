package com.startainstitute.summary_0408.card;

public class BankClient {

    //    private final BankCardGenerator bankCardGenerator; // ошибка
    private final String firstName;
    private final String lastName;
    private final BankCard bankCard;
    private final AccountBalance accountBalance;

//    public BankClient(String firstName, String lastName, BankCard bankCard, AccountBalance accountBalance) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.bankCard = bankCard;
//        this.accountBalance = accountBalance;
//    }

    public BankClient(String firstName, String lastName, BankCard bankCard, AccountBalance accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankCard = bankCard;
        this.accountBalance = accountBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }
}
