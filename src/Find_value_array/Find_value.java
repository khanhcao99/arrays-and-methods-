package Find_value_array;

import java.util.Scanner;

public class Find_value {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        String[] nameStudent = {"khanh", "vu", "thang", "linh"};
        boolean check = true;
        System.out.println("Nhập tên bạn muốn tim kiếm:");
        String b = value.nextLine();
        for (int i = 0; i < nameStudent.length; i++) {
            if (nameStudent[i].equals(b)){
                check = true;
                break;
            }else {
                check = false;
            }
        }
        if (check){
            System.out.println("Tên bạn tìm kiếm có trong danh sách");
        }else {
            System.out.println("Tên bạn tìm kiếm không có trong danh sách");
        }
    }
}
