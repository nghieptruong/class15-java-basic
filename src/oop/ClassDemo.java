package oop;

public class ClassDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //Truy cap thuoc tinh cua doi tuong person p
        System.out.println(p.name); // gan gia tri mac dinh --> null
        System.out.println(p.age); // // gan gia tri mac dinh --> 0
        System.out.println(p.address); // // gan gia tri mac dinh --> null

        p.name = "Tom";
        p.age = 30;
        p.address = "Street A";

        System.out.println("Sau khi gan gia tri");
        System.out.println(p.name); // Tom
        System.out.println(p.age);  // 30
        System.out.println(p.address); // Street A

    }
}
