package lesson1;

import java.util.Scanner;

public class Task6 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = scanner.next();
        printString(name);
    }
    private static void printString(String str) {
        System.out.println("Привет, " + str + "!");
    }
}
