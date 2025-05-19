 final class Math_Constants{
    void math()
    {
     final double e = 2.718;
     System.out.println(e);
    }
}

class AdvancedMath extends Math_Constants{
    //  Error: Cannot inherit from final 'Math_Constants'
// The class 'AdvancedMath' cannot extend 'Math_Constants' because it is declared final
   

}
public class FinalClassExample {
    public static void main(String[] args) {
        AdvancedMath a = new AdvancedMath();
        a.
    }
}


