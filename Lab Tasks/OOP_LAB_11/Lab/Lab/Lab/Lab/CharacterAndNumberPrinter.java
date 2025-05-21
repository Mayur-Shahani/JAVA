class NumberPrinter extends Thread{
    public void run()
    {
        for(int i = 0; i <= 4; i++)
        {
            System.out.println(i +1);
        }
    }
}

class CharacterPrinter extends Thread{
    public void run()
    {
        for(char c = 'a'; c < 'f'; c++)
        {
            System.out.println(c);
        }
    }
}
public class CharacterAndNumberPrinter {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        

        CharacterPrinter cp = new CharacterPrinter();
        cp.start();
        np.start();
    }
}
