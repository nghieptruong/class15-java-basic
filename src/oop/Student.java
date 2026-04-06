package oop;

public class Student extends Person {

    //instance variable
    private String id;

    //khai bao 1 bien static
    //static variable
    public static String schoolName = "University ABC";

    //ham khoi tao: muc dinh khoi tao gia tri mac dinh cho thuoc tinh
    //ham khoi tao ko tham so
    public Student() {
        this.id = "000";
    }

    //Ham khoi tao co tham so (1 tham so)
    public Student(String id) {
        this.id = id;
    }

    @Override
    public void study() {
        System.out.println("Student is studying major subjects");
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a student");
    }

    //hàm setter
    public void setId(String id) {
        this.id = id;
    }

    //hàm getter
    public String getId() {
        return this.id;
    }

    @Override
    public void register() {
        System.out.println("Student registers major subjects");
    }
}
