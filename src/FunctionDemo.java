public class FunctionDemo {
    public static void main(String[] args) {
        // viet 1 ham tinh tong 2 so nguyen
        int number1 = 10;
        int number2 = 4;
        int sum = calcSum(number1, number2);
        System.out.println(sum);
        sayHello(); // ham nay ko co gia tri tra ve
        System.out.println("End Program");
    }
    // can tra ve gia tri kieu int (can return)
    public static int calcSum(int x, int y) {
        int result = x + y;
        return result;
    }
    // void la ko can gia tri tra ve (ko can return)
    public static void sayHello() {
        System.out.println("Hello");
    }
}
