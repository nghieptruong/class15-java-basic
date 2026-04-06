package oop;

public class ClassDemo {
    public static void main(String[] args) {
//        Person p = new Person();
        //Truy cap thuoc tinh cua doi tuong person p
        //Sau khi đóng gói bằng access modifier: private
        // loi: goi p.name --> ko truy cập dc thuoc tính của đối tượng p
        // Fix: truy cap qua phuong thuc public p.getName()
//        System.out.println(p.getName()); // gan gia tri mac dinh --> null
//        System.out.println(p.getAge()); // // gan gia tri mac dinh --> 0
//        System.out.println(p.getAddress()); // // gan gia tri mac dinh --> null

        // ở ngoài truy cập dc khi ko phai private, neu thuoc tinh private --> loi
//        p.name = "Tom"; // loi
//        p.age = 30; // loi
//        p.address = "Street A"; // loi
//        p.setName("Tom");
//        p.setAge(30);
//        p.setAddress("Street A");

//        System.out.println("Sau khi gan gia tri cho p: ");
//        System.out.println(p.getName()); // Tom
//        System.out.println(p.getAge());  // 30
//        System.out.println(p.getAddress()); // Street A

//        Person p2 = new Person();
//        p2.name = "Thomas";
//        p2.age = 40;
//        p2.address = "Street B";

//        System.out.println("Sau khi gan gia tri cho p2: ");
//        System.out.println(p2.name); // Thomas
//        System.out.println(p2.age);  // 40
//        System.out.println(p2.address); // Street B

        Student s = new Student();
        s.setName("Jen");
        s.setAge(20);
        s.setAddress("Street C");
        System.out.println("Sau khi gan gia tri cho student s: ");
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getAddress());

        System.out.println("In ra object student s: ");
        System.out.println(s); // oop.Student@2a84aee7 --> sau khi viet lai toString() --> Person{name='Jen', age=20, address='Street C'}

        //Ko muốn in ra noi dung cua function cua cha --> in ra cua student --> override (ghi đè phương thức kế thừa từ cha (whoAmI))
        s.whoAmI(); // I am a student

        System.out.println("Student s3 info: ");
        Student s3 = new Student();
        System.out.println(s.getId()); // mac dinh gan "000"
//        s3.setId("A100");

        //Person class đã biến đổi thành 'abstract' --> ko dc phép khởi tạo --> lỗi
//        Person p3 = new Person();
//        p3 = s3; // cha trỏ tới giá trị của con (Person p3 = s3 (Student)) --> upcasting
//        Person p4 = new Student(); // upcasting

//        p3.whoAmI(); // I am a student
//        String id = ((Student) p3).getId(); // ((Student) p3) --> downcasting --> ép kiểu về con để gọi dc function của con
//        System.out.println(id);

        System.out.println("Goi phuong thuc study() đã override");
        s3.study(); // Student is studying ...
        s3.register(); // Student registers ...

        //Khoi tao doi tuong Teacher
        Teacher t = new Teacher();
        t.study(); // Teacher is studying...
        t.register(); // Teacher registers ...

        System.out.println("Khoi tao student s4");
        //goi ham khoi tao 1 tham so
        Student s4 = new Student("S4_123");
        System.out.println(s4.getId()); // S4_123

        System.out.println("In ra bien static schoolName");
        System.out.println("s3 schoolName info: ");
        System.out.println(s3.schoolName); // University ABC
        System.out.println("s4 schoolName info: ");
        System.out.println(s4.schoolName); // University ABC

        System.out.println("Thay doi gia tri schoolName");
        s3.schoolName = "Unknown";
        System.out.println("Sau khi thay doi schoolName");
        System.out.println("s3 schoolName info: ");
        System.out.println(s3.schoolName); // Unknown
        System.out.println("s4 schoolName info: ");
        System.out.println(s4.schoolName); // Unknown

        System.out.println("static --> Goi bang <ten class>.<static variable>");
        System.out.println(Student.schoolName); // Unknown

        // Tom lai:
        // instance variable --> bat buoc phai new <class> --> doi tuong đó gọi
        // static variable --> ko can khoi tao doi tuong --> su dung ten Class de goi
    }
}
