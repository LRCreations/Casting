public class Human {
    void printData() {
        System.out.println("Method Of Super Class!");
    }
}
class Man extends Human {
    @Override
    void printData() {
        System.out.println("Method Of Sub Class!");
    }
}
class Test {
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Man();
        h.printData();
        h1.printData();
    }
}