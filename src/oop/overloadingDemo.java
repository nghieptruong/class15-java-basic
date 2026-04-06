package oop;

public class overloadingDemo {
    public static void main(String[] args) {
        //viet phuong thuc cong 2 so
        int result1 = add(1, 2);
        System.out.println(result1); // 3

        int result2 = add(1, 2, 3);
        System.out.println(result2); // 6

        double result3 = add(1, 2.5);
        System.out.println(result3); // 3.5

        double result4 = add(2.5, 1);
        System.out.println(result4);
    }
    // 3 functions này đang cùng 1 chức năng add
    // thay vi viet ra 3 functions co name khac nhau --> overloading lai function đang có (đa hình luc compile time)
    // Tinh chat overloading:
    //      1. Hàm phải cùng tên
    //      2. Chỉ Xet Tham số (khong quan tam kieu tra ve):
    //          2.1. Khác số lượng tham số
    //          2.2  Khác kieu tham so
    //          2.3  Khác vị trí tham số
    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static double add(int x, double y) {
        return x + y;
    }
    public static double add(double x, int y) {
        return x + y;
    }
}
