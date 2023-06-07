package com.startainstitute.oop3.delivery;

public class DeliveryExample {

    public static void main(String[] args) {
        // Требуется сппроектировать структуру вариантов доставки для товара для оценки стоимости (калькулятор).
        // Доставка может быть с помощью авиа, ж/д, авто, а также вручную.
        // Метод выбирается в зависимости от веса пакета или расстояния.

        Package item = new Package(2, 10, 10, 10);
        DeliveryCalculator deliveryCalculator = new DeliveryCalculator();
        Location from = new Location("Berlin", "Germany");
        Location to = new Location("Paris", "France");

        double deliveryPrice = deliveryCalculator.getPrice(item, from, to);

        System.out.println(deliveryPrice);
    }
}
