package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ticTacToe {

    private static final char DOT_EMPTY = '*';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static char[][] map;
    private static final int SIZE = 3;
//    private static final int DOTS_TO_WIN = 3;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        prepareGame();
        playGame();
        System.out.println("Игра закончена!");

    }

    private static void prepareGame() {
        initMap();
        printMap();
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил искусственный интелект!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    // метод проверки на ничью
    private static boolean isMapFull() {
        for (char[] row : map) {
            for (char cell : row) {
                if (cell == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkLanes(char symbol) {
        boolean cols, rows;
        for (int col = 0; col < SIZE; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < SIZE; row++) {
                cols &= (map[col][row] == symbol);
                rows &= (map[row][col] == symbol);
            }

            // Это условие после каждой проверки колонки и столбца
            // позволяет остановить дальнейшее выполнение, без проверки
            // всех остальных столбцов и строк.
            if (cols || rows) return true;
        }

        return false;
    }

    private static boolean checkDiagonal(char symbol) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < SIZE; i++) {
            toright &= (map[i][i] == symbol);
            toleft &= (map[SIZE - i - 1][i] == symbol);
        }

        return toright || toleft;
    }

    // метод проверки победы
    private static boolean checkWin(char symbol) {

        return checkLanes(symbol) || checkDiagonal(symbol);
    }

    // метод хода компьютера
    private static void aiTurn() {
        int rowIndex, colIndex;
        do {
            rowIndex = random.nextInt(SIZE);
            colIndex = random.nextInt(SIZE);
        } while (!isCellValid(rowIndex, colIndex));

        map[rowIndex][colIndex] = DOT_O;
    }

    // метод хода игрока человека
    private static void humanTurn() {
        int rowIndex = -1, colIndex = -1;
        do {
            System.out.println("Введите координаты в формате <номер строки> <номер колонки>");
            String[] StringData = scanner.nextLine().split(" ");
            if (StringData.length != 2) {
                continue;
            }
            try {
                rowIndex = Integer.parseInt(StringData[0]) - 1;
                colIndex = Integer.parseInt(StringData[1]) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Были введены не корректные данные!");
            }

        } while (!isCellValid(rowIndex, colIndex));
        map[rowIndex][colIndex] = DOT_X;
    }

    // проверка что игрок вводит валидные значения полей для хода
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private static boolean isCellValid(int rowIndex, int colIndex) {
        if (rowIndex < 0 || rowIndex >= SIZE || colIndex < 0 || colIndex >= SIZE) {
            return false;
        }

        return map[rowIndex][colIndex] == DOT_EMPTY;
    }

    // метод вывода на экран игрового поля
    private static void printMap() {
        printColumnNumber();
        printRows();
        System.out.println();
    }

    // печатаем на экране строки с разметкой игрового поля
    private static void printRows() {
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    // печатаем на экран нумерацию колонок игрового поля
    private static void printColumnNumber() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // заполняем массив звездочками для разметки игрового поля
    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (char[] chars : map) {
            Arrays.fill(chars, DOT_EMPTY);
        }
    }
}
