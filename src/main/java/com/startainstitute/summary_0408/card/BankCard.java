package com.startainstitute.summary_0408.card;

import java.util.Random;

/*
Level 1: Создать класс Банковская карта В этом классе должны быть поля: Данные карты, Валюта, Статус Все что с
большой буквы это классы Сделать класс ГенераторДанныхБанковчкойКарты который будет возвращать Данные
Карты Данные карты давайте будет просто Стринга Данные карты должны быть стрингой вида 12345678123456780000999
Первые 16 цифр это номер Потом дата месяцгод Потом си Ви Ви код Создать класс Клиент у которого есть
Имя и Карта и баланс Создать класс Хранилище где в мапе будут храниться минимум 25 Клиентов Ключ это Клиент а
значение его баланс Написать в хранилище 10 методов которые на вход получают Мапу + может ещё какой параметр а
на выходе делают следующее

Выводять всех клиентов у которых определенный статус карты Группируют по балансу у кого больше или меньше какой
то суммы Средний баланс по клиентам Выводят только номера карт всех клиентов в формате имя номер Выводят всех
клиентов в у кого закончился срок действия карт Сортируют по балансу Группируют у кого закончился срок карт
а у кого не Если захотите придумайте какой нить крутой метод сами Level 2:
 */
public class BankCard {
    //
    private final Currency currency;
    private final CardStatus cardStatus;
    private final CardDetails number;

//    public static BankCard ofEncodedData(String encodedData) {
//        return new BankCard();
//    }
//
//    public static BankCard fromGenerator(BankCardGenerator generator) {
//        return new BankCard();
//    }

    private BankCard(Currency currency, CardStatus cardStatus, CardDetails number) {
        this.currency = currency;
        this.cardStatus = cardStatus;
        this.number = number;
    }

    // Лучше всего так не делать, потому что сложно передавать параметры и таких методов может быть много
    public static BankCard generateRandomCard(Random random) {
        return null;
    }

    public Currency getCurrency() {
        return currency;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public CardDetails getNumber() {
        return number;
    }
}
