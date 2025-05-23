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
        Animal a = new Dog();
        Animal b = new Cat();
        Animal c = new Lion();
        a.sound();
        b.sound();
        c.sound();
    }
}
