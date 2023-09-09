class Animal{

    void eat(){
        System.out.println("animal is eating....");
    }
}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("dog is eating....");
    }
}
public class DynamicBindingDemo {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }

}
