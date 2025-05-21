class SimplePrinter extends Thread{
    public void run()
    {
        for(int i = 0; i <= 4; i++)
        {
            try {
               Thread.sleep(1000);
            } catch (Exception e) {
                
            }
             System.out.println("Hello From Thread");
        }
    }
}
public class SimplePrinterThread {
    public static void main(String[] args) {
        SimplePrinter sc = new SimplePrinter();
        sc.start();
    }
    
}
