package spring_introduction;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat been is created");
    }

    public void say() {
        System.out.println("Meow-Meow");
    }
}
