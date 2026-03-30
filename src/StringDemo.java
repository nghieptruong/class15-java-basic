public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        char[] charArrays = s.toCharArray(); // chuyển đổi chuỗi sang 1 mảng các ký tự
        System.out.println(charArrays[0]); // in ra ky tu dau tien (index = 0)
        System.out.println(charArrays[1]); // in ra ky tu ở index 1

        //in ra độ dài của chuỗi
        System.out.println(s.length());

        //in ra ky tu cuoi cung
        int len = s.length(); // len = 5
        System.out.println(charArrays[len - 1]); // lấy index = 5 - 1 = 4

        System.out.println("-----------------------");
        //in ra từng ký tự
        for (int i = 0; i < charArrays.length; i++) {
            System.out.println(charArrays[i]);
        }

        //đếm số lan xuat hien cua ky tu 'l' trong chuoi "Hello"
        //Ket qua: 2
        int count = 0;
        for (int i = 0; i < charArrays.length; i++) {
            if(charArrays[i] == 'l') {
                count++;
            }
        }
        System.out.println("Count: " + count);

        System.out.println("------------------------------");
        // chuyen doi ky tu thuong
        System.out.println(s.toLowerCase());

        // chuyen sang ky tu hoa
        System.out.println(s.toUpperCase());

        //lay chuỗi con
        //cach 1: vong lap char array
        String result = "";
        for (int i = 1; i < charArrays.length; i++) {
            result = result + charArrays[i];
        }
        System.out.println("Result Substring: "  + result);

        //cach 2: substring()
        System.out.println(s.substring(1));

        System.out.println(s.substring(1, 3)); // el

    }
}
