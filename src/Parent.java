public class Parent {
    String name;
    void display() {
        System.out.println("Super Class Is Running!");
    }
}
class Child extends Parent {
    int age;
    @Override
    void display() {
        System.out.println("Sub Class Running!");
    }
}
class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "LR";
        Child c = (Child) p;
        c.age = 20;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}