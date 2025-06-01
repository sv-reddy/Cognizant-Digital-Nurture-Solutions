class Animal {
    void makeSound() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    @Override  void makeSound() {
        System.out.println("Barks");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
    }
}