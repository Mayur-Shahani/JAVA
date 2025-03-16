class Car{
    private int speed;

    void setSpeed(int speed)
    {
       this.speed = speed;
    }

    int getSpeed()
    {
        return speed;
    }
}



public class Q2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(56);

        System.out.println("Speed is : " + c.getSpeed());
    }
}
