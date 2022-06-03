package Reverse_array;

import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("mảng ban đầu là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.printf("\n" + "mảng sau khi đảo ngược là: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }

}
