import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("What is browser to run ?");
        Scanner sc = new Scanner(System.in); // hàm cho phép nhập từ bàn phím
        String browser = sc.nextLine(); // nhập chuỗi

        System.out.println("Selected Browser: " + browser); // Selected Browser: Firefox

        //Nếu browser la chrome thi in ra "Run on chrome 146"
        //nguoc lai neu la firefox thi in ra "Run on firefox 138"
        //nguoc lai khong thoa dieu kien nao het thi in ra "Not Support !"

        // equals: so sánh 2 chuỗi
        // equalsIgnoreCase: so sánh 2 chuỗi không phân biệt hoa thường
//        if(browser.equalsIgnoreCase("chrome")) {
//            System.out.println("Run on chrome 146");
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            System.out.println("Run on firefox 138");
//        } else {
//            System.out.println("Not Support !");
//        }

        //toLowerCase(): chuyen tat ca ky tu hoa thanh ky tu thuong
//        switch (browser.toLowerCase()) {
//            case "chrome":
//                System.out.println("Run on chrome 146");
//                break;
//            case "firefox":
//                System.out.println("Run on firefox 138");
//                break;
//            default:
//                System.out.println("Not Support !");
//        }

        //Neu browser la Chrome, Firefox, Edge thi in ra "Run on Windows platform"
        //Nguoc lai neu browser la Safari thi in ra "Run on Mac platform"
        //Nguoc lai thi in ra "Not Support!"

//        if(browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("edge")) {
//            System.out.println("Run on Windows platform");
//        } else if (browser.equalsIgnoreCase("safari")) {
//            System.out.println("Run on Mac platform");
//        } else {
//            System.out.println("Not Support !");
//        }

        switch (browser.toLowerCase()) {
            case "chrome":
            case "firefox":
            case "edge":
                System.out.println("Run on Windows platform");
                break;
            case "safari":
                System.out.println("Run on Mac platform");
                break;
            default:
                System.out.println("Not Support !");
        }

    }
}
