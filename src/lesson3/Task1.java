package lesson3;

import java.util.Scanner;

public class Task1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Ваша задача угадать число c трех попыток");
            for (int i = 9; i <= 9; i++) {
                playLevel(i);
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            int answer = scanner.nextInt();
            if (answer == 0) {
                scanner.close();
                break;
            }
        }
    }

    private static void playLevel(int range){
        int number = (int)(Math.random() * range);
        for (int j = 0; j <= 2; j++){

            System.out.println("Угадайте число от 0 до " + range);

            if (!scanner.hasNextInt()) {
                System.out.println("Было введено не числовое значение");
                scanner.nextLine();
                continue;
            }

            int input_number = scanner.nextInt();
            if (j == 2) {
                System.out.println("Вы проиграли.");
                break;
            }
            if (input_number == number){
                System.out.println("Вы угадали.");
                System.out.println("Вы выиграли!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
