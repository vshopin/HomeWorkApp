package lesson1;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(returnExpression(4, 6, 8, 10));
    }

    static int returnExpression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}
