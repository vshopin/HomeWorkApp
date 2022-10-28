package lesson1;

import java.util.Scanner;

public class Task2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 4 числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println(returnExpression(num1, num2, num3, num4));
    }
    private static int returnExpression(int a, int b, int c, int d) {
        if (d == 0) {
            return 0;
        }
        return a * (b + (c / d));
    }
}
