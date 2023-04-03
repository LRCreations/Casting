public class Animal {
    String name;
    void setName() {
        System.out.println("Elephant");
    }
}
class Fish extends Animal {
    String color;
    @Override
    void setName() {
        System.out.println("Blue Fish");
    }
}
class Run {
    public static void main(String[] args) {
        Animal a = new Fish();
        a.name = "Tuna";
        Fish f = new Fish();
        f.name = "Whale";
        f.color = "Black";
        System.out.println("Name : " + a.name);
        a.setName();
        System.out.println("Name : " + f.name);
        System.out.println("Color : " + f.color);
    }
}