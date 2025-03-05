class light{
    private boolean isOn ;

void turnOn()
{
    isOn = true;
    System.out.println("Your Bulb is On");
}

void turnOff()
{
    isOn = false;
    System.out.println("Your bulb is off");
}

void showStatus()
{
    if(isOn)
    {
        System.out.println("Bulb is on");
    }
    else
    {
        System.out.println("Bulb is off");
    }
   }
}
public class Light_Bulb {
    public static void main(String[] args) {
        light l = new light();
        l.turnOn();
        l.turnOff();
        l.showStatus();
    }
}
