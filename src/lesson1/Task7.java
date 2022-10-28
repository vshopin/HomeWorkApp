package lesson1;

import java.util.Scanner;

public class Task7 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int year = scanner.nextInt();
        highYear(year);
    }

    private static void highYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
