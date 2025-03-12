package Inheritance_Types;
class Animal{
    void makeSound()
    {
        System.out.println("Woof woof .....");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("Bark Bark .....");
    }
    
}
public class Single_Inheritance{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        d1.bark();
    }
    
}
