package com.startainstitute.oop4.orders;


public class OrdersProcessing {


    /*
    Задание:
    Вы разрабатываете систему для управления заказами в интернет-магазине.
    У каждого заказа есть определенный статус и тип оплаты.

    Требуется:

    Создайте перечисление "OrderStatus" со значениями "NEW", "PROCESSING", "SHIPPED" и "DELIVERED".
    Создайте перечисление "PaymentType" со значениями "CREDIT_CARD", "PAYPAL" и "CASH_ON_DELIVERY".
    Создайте интерфейс "Order" с методами "getStatus()", "getPaymentType()" и getPrice(),
    которые будут возвращать соответствующие значения.

    Создайте класс "OnlineOrder" и "OfflineOrder" реализующий интерфейс "Order" и имеющий приватные поля для хранения статуса и типа оплаты.

    Создайте класс "ReportPrinter" с методом  void printReport(Order[] orders) печатающий на экран агрегированные значения:
    1) сумму всех заказов
    2) количество заказов с OrderStatus = DELIVERED
    3) количество заказов с PaymentType = CREDIT_CARD

     */

    public static void main(String[] args) {

    }
}
