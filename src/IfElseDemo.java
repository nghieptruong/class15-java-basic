import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
//        System.out.println("What is browser to run ?");
//        Scanner sc = new Scanner(System.in); // hàm cho phép nhập từ bàn phím
//        String browser = sc.nextLine(); // nhập chuỗi
//
//        System.out.println("Selected Browser: " + browser); // Selected Browser: Firefox
//
//        //Nếu browser la chrome thi in ra "Run on chrome 146"
//        //nguoc lai neu la firefox thi in ra "Run on firefox 138"
//        //nguoc lai khong thoa dieu kien nao het thi in ra "Not Support !"
//
//        // equals: so sánh 2 chuỗi
//        // equalsIgnoreCase: so sánh 2 chuỗi không phân biệt hoa thường
//        if(browser.equalsIgnoreCase("chrome")) {
//            System.out.println("Run on chrome 146");
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            System.out.println("Run on firefox 138");
//        } else {
//            System.out.println("Not Support !");
//        }

        System.out.println("----------------");
        // Câu hỏi phỏng van:Tai sao khong dung == de so sanh 2 chuoi ma lai dung equals (hoac equalsIgnoreCase) ?
        // khi dung == : đang so sánh 2 giá trị tham chiếu
        // khi dùng equals (hoac equalsIgnoreCase): đang so sánh 2 giá trị noi dung
        String s1 = "Hello";
        System.out.println(System.identityHashCode(s1));
        String s2 = "Hello";
        System.out.println(System.identityHashCode(s2));
        String s3 = "Hello123";
        System.out.println(System.identityHashCode(s3));
        String s4 = new String("Hello");
        System.out.println(System.identityHashCode(s4));
        String s5 = s4.intern();
        System.out.println(System.identityHashCode(s5));


        System.out.println(s1 == s2); // true --> 41359092 vs 41359092
        System.out.println(s1 == s3); // false --> 41359092 vs 149928006
        System.out.println(s1 == s4); // false --> 41359092 vs 713338599
        System.out.println(s1 == s5); // true --> 41359092 vs 41359092

        System.out.println("-----so sanh noi dung: equals----");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equals(s4)); // true
        System.out.println(s1.equals(s5)); // true


    }
}
