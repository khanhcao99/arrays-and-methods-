package Merge_array;

import java.util.Scanner;

public class merge_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào chiều dài mảng 1: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];
        System.out.printf("Nhập vào giá trị từng phần tử của mảng 1: " + "\n");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập vào giá trị index " + i + ": ");
            array1[i] = input.nextInt();
        }
        System.out.printf("\n" + "Array1 = [");
        for (int j = 0; j < array1.length - 1; j++) {
            System.out.print(array1[j] + ", ");
        }
        System.out.print(array1[array1.length - 1] + "] " + "\n");

        System.out.printf("Nhập vào chiều dài mảng 2: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        System.out.printf("Nhập vào giá trị từng phần tử của mảng 2: " + "\n");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập vào giá trị index " + i + ": ");
            array2[i] = input.nextInt();
        }
        System.out.printf("\n" + "Array2 = [");
        for (int j = 0; j < array2.length - 1; j++) {
            System.out.print(array2[j] + ", ");
        }
        System.out.print(array2[array2.length - 1] + "] ");
        int[] array3 = new int[size1 + size2];
        for (int n = 0; n < array1.length; n++) {
             array3[n] = array1[n];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i]= array2[i] ;
        }
        System.out.printf("\n" + "Array3 = [");
        for (int j = 0; j < array3.length - 1; j++) {
            System.out.print(array3[j] + ", ");
        }
        System.out.print(array3[array3.length - 1] + "] ");
    }
}
