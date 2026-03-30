public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Start program");

        try {
            System.out.println(1 / 0); // lỗi chia bởi 0 --> quăng lỗi
        } catch (Exception e) {
            System.out.println("Khong dc phep chia cho 0 !");
        }

        System.out.println("See ya!");
        System.out.println("End Program!");
    }
}
