public class FirstScript {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        //1. khai bao 1 bien kieu so nguyen: java co 4 kieu so nguyen (byte, short, int, long) --> kieu du lieu co ban (primitive type)
        int x = 1; // khai bao va gan gia tri la 1
        System.out.println(Integer.MIN_VALUE); // in ra min value
        System.out.println(Integer.MAX_VALUE); // in ra max value
        System.out.println(x); // 1

        byte y = 2;
        System.out.println(y);

        short z = 3;
        System.out.println(z);

        long m = 4;
        System.out.println(m);

        //Kieu so thuc (double, float)
        float f = 1.5f;
        double d = 1.5;

        //2. khai bao kieu chuoi (object/class) --> immutable (ko thay doi)
        String s = "Hello";

        //3. khai bao kieu logic true/false
        boolean isAdult = true;
        boolean isChildren = false;

        //4. Kieu ky tu (char)
        char c = 'a';

    }
}
