
public class FinalVariableExample {
    public static void main(String[] args) {
        
        final double pi = 3.14;
        System.out.println("The value of PI is : " +pi);

        pi = 3.20;    
        
        //Error: Cannot assign a new value to a final variable 'pi'
        // This line causes a compile-time error because 'pi' is declared as final.
        
       System.out.println(pi);
       
    }
}
