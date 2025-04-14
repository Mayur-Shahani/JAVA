package Array;
class temp{
    void celToFah()
    {
        double cel[] = {34.5,67.5};
        for(int i = 0; i < cel.length; i++)
        {
            cel[i] = (cel[i] * 9/5) + 3;
            System.out.println("The" + (i+1) +  " converted temp is : " + cel[i]);
        }
    }
}
public class ConvertCelToFahrenhiet {
    public static void main(String[] args)
    {
        temp t = new temp();
        t.celToFah();

    }
    
}
