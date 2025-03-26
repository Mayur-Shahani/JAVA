public class Question_1 {
    public static void main(String[] args) {
        final double pi = 3.14;
        System.out.println("The value of PI is : " +pi);
       pi = 3.20;
       System.out.println(pi);
        //The final local variable pi can not be assigned. It must be blank not using a compound assignment.
    }
}
