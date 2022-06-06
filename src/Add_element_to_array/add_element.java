package Add_element_to_array;

import java.util.Scanner;

public class add_element {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.printf("Nhập vào size của mảng: ");
        int index = value.nextInt();
        int[] array = new int[index];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị index " + i + ": ");
            array[i] = value.nextInt();
        }
        System.out.printf("Array = [");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.print(array[j] + ", ");
        }
        System.out.print(array[array.length - 1] + "] ");

        System.out.printf("\n" + "Nhập vào phần tử cần thêm: ");
        int number = value.nextInt();
        System.out.printf("\n" + "Nhập vào vị trí index muốn thêm: ");
        int dex = value.nextInt();

        if (dex <= -1 || dex > array.length - 1) {
            System.out.printf("Không chèn được phần tử vào mảng");
        } else {
            for (int k = array.length - 1; -1 < k; k--) {
                if (k != dex) {
                    array[k] = array[k - 1];
                } else if (k == dex) {
                    array[k] = number;
                    break;
                }
            }
        }
        System.out.printf("Mảng sau khi thêm phần tử: Array = [");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.print(array[j] + ", ");
        }
        System.out.print(array[array.length - 1] + "] ");
    }
}
