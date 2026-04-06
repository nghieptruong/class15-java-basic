package oop;

public class Teacher extends Person {

    @Override
    public void study() {
        System.out.println("Teacher is studing education methods");
    }

    @Override
    public void register() {
        System.out.println("Teacher registers IT certificates exam");
    }
}
