import java.util.Scanner;

public class CalcProgram {
    public static void main(String[] args) {
        //Viet 1 chuong trinh nhap 2 "so nguyen" va tinh phep cong cua 2 so roi in ra ket qua ( a + b = c)
        //Yeu cau: Nhap tu ban phim
        //Chuong trinh nhu sau:
        //Nhap so a:
        //Nhap so b:
        //Ket qua:

        Scanner sc = new Scanner(System.in); // khai bao 1 doi tuong Scanner de nhap tu ban phim

        System.out.println("Nhap so a: ");
        String inputa = sc.nextLine(); // Nhap chuoi --> luu vao 1 bien
        int a = Integer.parseInt(inputa); // Chuyen doi chuoi --> so nguyen

        System.out.println("Nhap so b: ");
        String inputb = sc.nextLine(); // Nhap chuoi --> luu vao 1 bien
        int b = Integer.parseInt(inputb); // Chuyen doi chuoi --> so nguyen

        System.out.println("Ket qua: ");
        int c = a + b;
        System.out.println(c);
    }
}
