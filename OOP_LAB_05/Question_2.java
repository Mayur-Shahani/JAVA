class Animal{
    final void makeSound()
    {
        System.out.println("Animals Make Sounds");
    }
}

class Dog extends Animal{
    void makeSound() // cannot override the final method from Animal.
    {
        System.out.println("Animal Can't Make Sound");
    }

}
public class Question_2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound1();    

        Animal a = new Animal();
        a.makeSound();
    }
}
