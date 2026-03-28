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

        System.out.println("------Toan Tu Logic--------");
        boolean isPassed = true;
        boolean isSmokeSuite = true;
        boolean isRun = true;
        boolean result1 = isPassed && isSmokeSuite && isRun; // toan tu hoặc
        System.out.println(result1); // ???

        System.out.println("-------Mix đieu kien-----------");
        //toan tu && co do uu tien hon toan tu ||
        boolean isPassed2 = false;
        boolean isSmokeSuite2 = true;
        boolean isRun2 = false;
        boolean result2 = isPassed2 && isSmokeSuite2 || isRun2; // toan tu mix dieu kien
        // false && true || false
        //       false   || false
        //               false
        System.out.println(result2); // false

        boolean result3 = isPassed2 || isSmokeSuite2 && isRun2;
        //                   false  ||    true      &&  false
        //                                      false
        //                   false  ||          false
        //                          false
        System.out.println(result3); // false

        isPassed2 = false;
        isSmokeSuite2 = true;
        isRun2 = true;
        boolean result4 = isPassed2 || isSmokeSuite2 && isRun2;
        //                   false  ||    true      &&  true
        //                                      true
        //                   false  ||          true
        //                          true
        System.out.println(result4); // true

        // () dau ngoac uu tien
        boolean result5 = (isPassed2 || isSmokeSuite2) && isRun2;
        System.out.println(result5); // true

        System.out.println("----------Toan tu phu dinh------------");
        boolean isStatus = true;
        // nếu isStatus = true --> in ra "Test case passed"
        // ngược lại  --> in ra "Test case failed"
        //cach 1
//        if(isStatus == true) {
//            System.out.println("Test case passed");
//        } else {
//            System.out.println("Test case failed");
//        }

        // viet gon cua isStatus == true
        //cach 2
//        if(isStatus) {
//            System.out.println("Test case passed");
//        } else {
//            System.out.println("Test case failed");
//        }

        //muon dua doan test passed lên phía trên vẫn chạy đúng logic
        //cach 3
//        if(isStatus == false) {
//            System.out.println("Test case failed");
//        } else {
//            System.out.println("Test case passed");
//        }

        //cach 4: dung phep toan phu dinh (!), viet ngan gon cua isStatus == false
        if(!isStatus) {
            System.out.println("Test case failed");
        } else {
            System.out.println("Test case passed");
        }

        System.out.println("--------------------------");
        System.out.println(!true); // ???
        System.out.println(!false); // ???

        System.out.println("----------Toan tu tang giam-----------");
        // ++, --
        int k = 1;
//        k = k + 1; // viet tat k += 1
        k++; // dung 1 minh --> tu dong tang k lên 1 và gan lai cho k --> goi postfix (hậu tố) --> tăng sau
        System.out.println(k); // 2
        ++k; // dung 1 minh --> tu dong tang k lên 1 và gan lai cho k --> gọi prefix (tiền tố) --> tăng trước
        System.out.println(k); // 3

        System.out.println("----------------------------------------");
        //Vay khác nhau giua k++ va ++k ??? (trong phong van)
        //postfix (++ phía sau): Buoc 1: thực hiện toán tử khác (toan tu phia truoc no) truoc tien, sau do lam Buoc 2: "tăng sau"
        //prefix (++ phía truoc): Buoc 1: thực hiện "tăng trước", sau do lam Buoc 2: thực hiện toán tử khác (toan tu phia truoc no)
        int e = 1;
//        int f = e++; // B1: gán trước --> int f = e (1), B2: tăng sau --> e = e + 1 = 2
//        System.out.println(f); // f = 1
//        System.out.println(e); // e = 2

        int f = ++e; // B1: e = e + 1 (1 + 1 --> e = 2), B2: gán --> int f = e (lúc này e = 2) --> f = 2
        System.out.println(f); // f = 2
        System.out.println(e); // e = 2

        System.out.println("----------------");
        int v = 5;
        int g = 6;
//        int p = v + ++g; // B1: g tang trươc (g = 7), B2: toan + --> int p = v + 7 = 5 + 7 = 12
//        System.out.println(p); // p = 12
//        System.out.println(g); // g = 7

        // cach khuyen dung
        g++; // g = g + 1 (hoặc g += 1)
        int p = v + g;
        System.out.println(p); // 12


    }
}
