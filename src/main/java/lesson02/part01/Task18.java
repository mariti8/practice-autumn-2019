package lesson02.part01;

/**
 * Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
 * «Имя» получает «число1» через «число2» лет.
 * Пример: Коля получает 3000 через 5 лет.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Программа должна считывать данные с клавиатуры.
 * 3.	Выведенный текст должен содержать введенное имя.
 * 4.	Выведенный текст должен содержать введенное число1.
 * 5.	Выведенный текст должен содержать введенное число2.
 * 6.	Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.*;
import java.util.*;

public class Task18 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("введите имя: ");
        String name  = in.next();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите число1: ");
        int a1 = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите число2: ");
        int a2 = in.nextInt();
        System.out.println(name + " получает " + a1 + " через " + a2 + " лет");

    }
}
