import java.util.Random;
import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//        }

//        int i = 0; // khởi tạo
//        while(i < 5) {
//            System.out.println("Hello");
//            i++; //tăng/giảm
//        }

        // do-while lap it nhat 1 lan ko can biet dung hay sai
        int i = 0;
        do {
            System.out.println("Hello");
            i++; //tăng/giảm
        } while(i < 5);

//        //Tao 1 doi tuong Random
//        Random rand = new Random();
//        int randomValue = rand.nextInt(1, 10); // random value --> 2
//
//        //Viết vòng lap while: neu nhap so doan == randomValue --> in ra "You Win!", nguoc lai in ra --> "Try Again!"
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so ban doan: ");
//        String input = sc.nextLine(); // nhap chuoi
//        int myNumber = Integer.parseInt(input); // chuyen chuoi nhap sang so
//        while(myNumber != randomValue) {
//            System.out.println("Try Again!");
//            System.out.println("Last system number: " + randomValue);
//            randomValue = rand.nextInt(1, 10); // he thong cap nhat gia tri moi
//            System.out.println("Nhap so ban doan: "); // nhac nguoi dung nhap lai
//            input = sc.nextLine(); // keu nguoi ta nhap lai
//            myNumber = Integer.parseInt(input); // chuyen chuoi nhap lai sang so
//        }
//        System.out.println("You Win!");

        // <:  5 - 2 = 3
        // <=: 5 - 2 + 1 = 4
//        for (int i = 2; i <= 5; i++) {
//            System.out.println("Hello");
//        }

        // >: 0 - 5 = |-5|
        // >=: 0 - 5 + (-1) = |-6|
//        for (int i = 5; i >= 0; i--) {
//            System.out.println("Hello" + i);
//        }

        System.out.println("End program");
    }
}
