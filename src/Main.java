import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1: ");
        int year = 2021;
        determineLeapYear(year);
        System.out.println();

        System.out.println("Задача №2: ");
        byte os = 1;
        int currentYear = LocalDate.now().getYear();
        defineApplication(os, currentYear);
        System.out.println();

        System.out.println("Задача №3: ");
        int deliveryDistance = 95;
        calculateDeliveryDays(deliveryDistance);
    }

    public static void determineLeapYear(int year) {
        boolean yearDividedFour = year % 4 == 0;
        boolean yearDividedOneHundred = year % 100 == 0;
        boolean yearDividedFourHundred = year % 400 == 0;

        if (yearDividedFour) {

            if (yearDividedFourHundred) {
                System.out.println(year + " - это високосный год");
            } else if (yearDividedOneHundred) {
                System.out.println(year + " - это невисокосный год");
            } else {
                System.out.println(year + " - это високосный год");
            }

        } else {
            System.out.println(year + " - это невисокосный год");
        }
    }

    public static void defineApplication(int os, int currentYear) {

        if (currentYear >= 2015) {
            switch (os) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Такая операционная система не поддерживается");
            }
        } else {
            switch (os) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Такая операционная система не поддерживается");
            }
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance) {

        int notDeliveryDistance = 100;
        int deliveryDistanceOne = 20;
        int deliveryDistanceTwo = 60;

        int deliveryDayOne = 1;
        int deliveryDayTwo = deliveryDayOne + 1;
        int deliveryDayThree = deliveryDayOne + 2;

        if (deliveryDistance <= notDeliveryDistance) {
            if (deliveryDistance < deliveryDistanceOne) {
                System.out.println("Мы доставим Ваш заказ в течение " + deliveryDayOne + " дня");
            } else if (deliveryDistance < deliveryDistanceTwo) {
                System.out.println("Мы доставим Ваш заказ в течение " + deliveryDayTwo + " дней");
            } else {
                System.out.println("Мы доставим Ваш заказ в течение " + deliveryDayThree + " дней");
            }
        } else {
            System.out.println(deliveryDistance + " км находится за пределами нашей зоны доставки, мы не сможем доставить заказ");
        }

    }
}