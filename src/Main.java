import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray(int number, int bound) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound) + bound;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Представьте, что вы работаете в компании и помогаете коллегам разбираться с рабочими вопросами. К вам обращаются сотрудники из бухгалтерии. Каждый день месяца, включая выходные, компания тратит некую сумму. Суммы записываются в бухгалтерскую книгу по дням. В книге 30 записей разных чисел, которые разнятся от 100 000 до 200 000. Создайте модель бухгалтерской книги — массив из случайных чисел от 100 000 до 200 000. На основе этого массива решите задачи.\n");
        System.out.println("Задача 1: Бухгалтеры попросили посчитать сумму всех выплат за месяц.\n" + "Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».");

        int[] arr = generateRandomArray(30, 100_000);
        System.out.println("Записи из бухгалтерской книги: " + Arrays.toString(arr));

        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.\n");
    }

    public static void task2() {
        System.out.println("Задача 2: Также бухгалтерия попросила найти минимальную и максимальную трату за день.\n" + "Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».");
        int[] arr = generateRandomArray(30, 100_000);
        System.out.println("Записи из бухгалтерской книги: " + Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];
        for (int current : arr) {
            if (min > current) {
                min = current;
            } else if (max < current) {
                max = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей».\n");
    }

    public static void task3() {
        System.out.println("Задача 3: Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.\n" + "Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».\n" + "Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.");
        int[] arr = generateRandomArray(30, 100_000);
        System.out.println("Записи из бухгалтерской книги: " + Arrays.toString(arr));

        float sum = 0;
        for (int j : arr) {
            sum += j;
        }

        float averageSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей\n");
    }

    public static void task4() {
        System.out.println("Задача 4: В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].\n" + "Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int i = reverseFullName.length - 1;
        while (i >= 0) {
            char a = reverseFullName[i];
            System.out.print(a);
            i--;
        }
    }
}