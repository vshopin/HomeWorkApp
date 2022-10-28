package lesson1;

import java.util.Scanner;

public class Task4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input = scanner.nextInt();
        checkNumber(input);
    }

    private static void checkNumber(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
