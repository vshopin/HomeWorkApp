package lesson2;

import java.util.Arrays;

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
//        a[i] (a[i] == 1) ? 0 : 1; тернарный if else в одну строку
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
        System.out.println(Arrays.toString(a));
    }
}
