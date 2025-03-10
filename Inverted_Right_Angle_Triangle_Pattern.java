public class Inverted_Right_Angle_Triangle_Pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j < i; j++ )
            {
               System.out.print(" ");
            }

            for(int k = 1; k <= (n - i + 1); k++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
