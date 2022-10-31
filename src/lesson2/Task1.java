package lesson2;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            }else {
                a[i] = 1;
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
