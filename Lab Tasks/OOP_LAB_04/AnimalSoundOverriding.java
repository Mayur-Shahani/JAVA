package LAB_04_TASK;
class Dog
{
    void makeSound()
    {
        System.out.println("Woof Woof");
    }
}

class Cat extends Dog{
    void makeSound()
    {
        System.out.println("Meow Meow");
    }
}
public class AnimalSoundOverriding {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();

        Dog d1 = new Dog();
        d1.makeSound();

    }
}
