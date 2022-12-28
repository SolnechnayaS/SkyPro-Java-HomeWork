import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {

        System.out.println("Задача 1. Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате. Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.");
        String firstName = "Ivan ";  // для хранения имени.
        String middleName = "Ivanovich "; // для хранения отчества.
        String lastName = "Ivanov"; // для хранения фамилии.
        String fullName = firstName + middleName + lastName; //для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2\n" +
                "Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).\n" +
                "Напишите программу, которая изменит написание Ф. И. О. сотрудника с \"Ivanov Ivan Ivanovich\" на полностью заглавные буквы.\n" +
                "В качестве строки с исходными данными используйте строку fullName.\n" +
                "Результат программы выведите в консоль в формате: \"Данные ФИО сотрудника для заполнения отчета — …\"");
        System.out.println();
        String firstName = "Ivan ";  // для хранения имени.
        String middleName = "Ivanovich "; // для хранения отчества.
        String lastName = "Ivanov"; // для хранения фамилии.
        String fullName = firstName + middleName + lastName; //для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3.\n" +
                "Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».\n" +
                "В качестве исходных данных используйте строку fullName и данные в ней — \"Иванов Семён Семёнович\".\n" +
                "Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».");
        System.out.println();
        String firstName = "Семён ";  // для хранения имени.
        String middleName = "Семёнович"; // для хранения отчества.
        String lastName = "Иванов "; // для хранения фамилии.
        String fullName = lastName + firstName + middleName;

        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
    }
}
