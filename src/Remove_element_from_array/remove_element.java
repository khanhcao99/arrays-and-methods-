package Remove_element_from_array;

import java.util.Scanner;

public class remove_element {
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

        System.out.printf("\n" + "Nhập vào phần tử cần xóa: ");
        int number = value.nextInt();
        int count = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] != number) {
                array[k] = array[k];
                count = k;
            } else if (array[k] == number) {
                array[k] = array[k + 1];
                count = k;
                break;
            }
        }
        for (int n = count + 1; n < array.length - 1; n++) {
            array[n] = array[n + 1];
        }
        System.out.printf("Mảng sau khi xóa phần tử: Array = [");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.print(array[j] + ", ");
        }
        System.out.print(array[array.length - 1] + "] ");
    }
}
