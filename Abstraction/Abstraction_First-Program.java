package Abstraction;
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    public void sound()
    {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal{
    public void sound()
    {
        System.out.println("Meow Meow");
    }
}

class Lion extends Animal{
    public void sound()
    {
        System.out.println("Roar!");
    }
}

class Abstraction_First_Program{
    public static void main(String[] args)
    {
        Animal d = new Dog();
        Animal e = new Cat();
        Animal f = new Lion();
        d.sound();
        e.sound();
        f.sound();
    }
}