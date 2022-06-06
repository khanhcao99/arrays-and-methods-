package Find_min_value;

import java.util.Scanner;

public class min_value {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("nhập vào size của mảng:");
        int size = value.nextInt();
        int [] array = new int[size];
        System.out.println("Nhập vào giá trị của từng thành phần trong mảng");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Giá trị Element " + (i+1) + ": ");
            array[i] = value.nextInt();
        }

        System.out.printf("array= [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.print(array[array.length-1] + "]");

        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min){
                min = array[j];
            }
        }
        System.out.printf("\n" + "Giá trị nhỏ nhất trong mảng: " + min);
    }
}
