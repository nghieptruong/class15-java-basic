package oop;

// Person là 1 abstract class (lớp truu tuong) đang implements từ interface Exam
public abstract class Person implements Exam {

    //Thuộc tính (attributes)
    //Encapsulation: đóng gói
    //  1. [hidden data] ko muốn bên ngoài truy cập thuộc tính của class này
    //  2. bên ngoài truy cập thông qua phương thức public (get, set)

    private String name;
    private int age;
    private String address;

    //phuong thuc abstract (phuong thuc truu tuong)
    public abstract void study();

    // phuong thuc getter
    public String getName() {
        return this.name;
    }

    // phuong thuc getter
    public int getAge() {
        return this.age;
    }

    // phuong thuc getter
    public String getAddress() {
        return this.address;
    }

    // phuong thuc setter
    public void setName(String name) {
        this.name = name;
    }

    // phuong thuc setter
    public void setAge(int age) {
        this.age = age;
    }

    // phuong thuc setter
    public void setAddress(String address) {
        this.address = address;
    }

    public void whoAmI() {
        System.out.println("I am a person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
