package Array;
class Sum{
    double add()
    {
        double num[][] ={ {5,6,7},{3,6,9} };
        double sum = 0;
        for(int i = 0; i < num.length; i++)
        {
            for(int j = 0; j < num[i].length; j++)
            {
                sum += num[i][j];
               
            }
        }
        return sum;
    }
}
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Sum s = new Sum();
        double res = s.add();
       System.out.println(res);
    }
}
