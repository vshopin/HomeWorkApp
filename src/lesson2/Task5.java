package lesson2;

public class Task5 {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2, 11, 20, 5, 2, 4, 8, 9, 15};
        int max = 0;
        int min = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
