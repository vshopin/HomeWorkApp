package lesson1;

import java.util.Scanner;

public class Task5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input = scanner.nextInt();
        System.out.println(checkNumber(input));
    }
    private static boolean checkNumber(int num) {
        return num <= 0;
    }
}
