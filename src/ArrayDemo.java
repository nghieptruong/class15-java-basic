public class ArrayDemo {
    public static void main(String[] args) {
        //khai bao 1 cai mang kieu so nguyen
        int[] intArrays = new int[5];
        System.out.println(intArrays[0]);
        System.out.println(intArrays[1]);
        System.out.println(intArrays[2]);

        intArrays[0] = 20;
        intArrays[1] = 30;
        intArrays[2] = 40;
        intArrays[3] = 50;
        intArrays[4] = 60;
        System.out.println("After assigning values into arrays:");
        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(intArrays[i]);
        }

        System.out.println("Tạo mảng chuỗi");
//        String[] strArrays = new String[4]; // khai bao nhung chưa khởi tạo
        String[] strArrays = {"Hello", "Java", "Tester", "Automation"}; // khai bao va khoi tao gia tri

        //khai bao mang boolean
        boolean[] booleanArrays = {true, false, true, false};

        //"Welcome to java course" --> ["Welcome", "to", "java", "course"]
        //split chuoi phan cach boi khoang trang thanh 1 mang chuoi các tu
//        String msg = "Welcome to java course";
//        String[] wordsArray = msg.split(" "); // tách chuỗi con dựa tren chuoi phan cách (" ")

        String msg = "Welcome,to,java,course";
        String[] wordsArray = msg.split(","); // tách chuỗi con dựa tren chuoi phan cách (",")
        System.out.println(wordsArray[0]);
        System.out.println(wordsArray[1]);
        System.out.println(wordsArray[2]);
        System.out.println(wordsArray[3]);

    }
}
