public class OperatorDemo {
    public static void main(String[] args) {
        //Bai toan: Nhap so n. Kiem tra n la so chan hay le?
        //Goi y: neu la so le thi so du !=0, neu la so chan thi so du == 0
        // Dung phep toan chia du
        int n = 4; // so chan
        int result = n % 2;
        System.out.println(result);

        System.out.println("-------------------");
        int x = 1;
        int y = 1;
        int z = x + y;
        System.out.println(z);

        System.out.println("-------------------");
        int a = 1;
        int b = 2;
        int c = a / b; // chia so nguyen
        System.out.println(c); // 0

        System.out.println("-------------------");
        //float va double
        double i = 1;
        double j = 2;
        double l = i / j; // chia so thuc --> phai dung kieu double
        System.out.println(l); // 0.5

        System.out.println("-----Toan Tu Gan-------");
        a = 3; // gan lai gia tri
        System.out.println(a); // 3

        a += 2; // viet tat cua bieu thuc a = a + 2
        System.out.println(a); // 5

        a -= 1; // viet tat cua bieu thuc a = a - 1;
        System.out.println(a); // 4

        //Tuong tu cho a *= 2 (nghia la a = a * 2)
        //Tuong tu cho a /= 2 (nghia la a = a / 2)
        //Tuong tu cho a %= 2 (nghia la a = a % 2)

        System.out.println("------Toan Tu So Sanh--------");
        a = 0; // 1 dau = la phep toan gan
        boolean isEqual = a == 0; // 2 dau == la phep toan so sanh
        System.out.println(isEqual); // true

        //Ngoai ra: >, <, >=, <=, !=
        System.out.println(a != 0); // false
    }
}
