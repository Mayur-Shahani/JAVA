public class FinalFieldExample {
    class Person {
        final String name; 
    
        Person(String name) {
            this.name = name;
        }
        void changeName(String newName) {
            
             //  Error: cannot assign a value to final variable 'name'
            // this.name = newName; 
             // This line will cause compile-time error because 'name' is final
        }
    
        void display() {
            System.out.println("Name: " + name);
        }
    }
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Mayur");
        p1.display();
        
        
        
        p1.changeName("Shahani"); 
    }
}
        
        

