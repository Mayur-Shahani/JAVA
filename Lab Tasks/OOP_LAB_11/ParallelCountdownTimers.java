class MultipleTimers{
    public void run()
    {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
           
        }
        System.out.println("Message From First Thread : ");
        System.out.println("First Times Up");
    }

     public void run1()
    {
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
           
        }
        System.out.println("Message From Second Thread : ");
        System.out.println("Second Times Up");
    }

     public void run2()
    {
        try {
            Thread.sleep(6000);
        } catch (Exception e) {
           
        }
        System.out.println("Message From Third Thread : ");
        System.out.println("Third Times Up");
    }
}
public class ParallelCountdownTimers {
    public static void main(String[] args) {
        MultipleTimers mp = new MultipleTimers();
        mp.run();
        mp.run1();
        mp.run2();
    }
}
