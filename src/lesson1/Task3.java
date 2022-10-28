package lesson1;

import java.util.Scanner;

public class Task3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 2 числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(checkSum(num1, num2));
    }

    private static boolean checkSum(int a, int b) {
        int sum = a +b;
        return sum >= 10 && sum <= 20;
    }
}
