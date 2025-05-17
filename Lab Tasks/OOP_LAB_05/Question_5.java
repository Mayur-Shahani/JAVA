public class Question_5 {
    class Person {
        final String name; 
    
        Person(String name) {
            this.name = name;
        }
        void changeName(String newName) {
            // this.name = newName; //
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
        
        
3        
    }
}
