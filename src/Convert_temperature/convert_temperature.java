package Convert_temperature;

import java.util.Scanner;

public class convert_temperature {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        double F;
        double C;
        int choice;

        do {
            System.out.println("Danh sách lựa chọn");
            System.out.println("1. Chuyển từ độ F sang độ C");
            System.out.println("2. Chuyển từ độ C sang độ F");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = value.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Điền vào độ F:");
                    F = value.nextDouble();
                    System.out.println("Chuyển đổi từ độ F sang độ C là: " + fToC(F) + " C");
                    break;
                case 2:
                    System.out.println("Điền vào độ C:");
                    C = value.nextDouble();
                    System.out.println("Chuyển đổi từ độ C sang độ F là: " + cToF(C) + " F");
                    break;
                case 3 :
                    System.exit(3);
            }

        }while (choice != 3);

    }
    public static double cToF (double C){
        double F =  (9.0 / 5) * C + 32;
        return F;
    }
    public static double fToC (double F){
        double C =  (5.0 / 9) * (F - 32);
        return C;
    }


}
