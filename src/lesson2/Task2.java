package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = i * 3;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
