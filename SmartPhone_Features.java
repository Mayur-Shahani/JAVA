package Array;
interface MobileFeature{
    default void call()
    {
        System.out.println("Calling");
    }
}

interface MobileFeature2{
    default void sms()
    {
        System.out.println("SMS");
    }
}

class SmartPhone implements MobileFeature, MobileFeature2{

}
public class SmartPhone_Features {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.call();
        sm.sms();
    }
}
