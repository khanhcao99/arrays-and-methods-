package Find_max_value_in_two_side_array;

import java.util.Scanner;

public class find_max_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("\n" + "Nhập vào giá trị index" + "[" + i + "]" + "[" + j + "]" + ": ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.printf("Array: " + "\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println("\n");
        }

        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
