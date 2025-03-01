public class Inverted_Half_Pyramid_With_Numbers {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5-i+1; j++)
            {
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}
