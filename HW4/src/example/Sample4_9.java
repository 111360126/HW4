package example;

public class Sample4_9 
{
    public static void main(String[] args)
    {
        Car7[] cars;
        cars = new Car7[2];
        
        cars[0] = new Car7();
        cars[1] = new RacingCar7();
        
        for(int i = 0; i < cars.length; i++)
        {
            Class cl = cars[i].getClass();
            System.out.println("第" + (i+1) + "個物件的類別是" + cl);
        }
    }
}

class Car7
{
    protected int num;
    protected double gas;

    public Car7()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}

class RacingCar7 extends Car7
{
    public RacingCar7()
    {
        System.out.println("生產了賽車");
    }
}
