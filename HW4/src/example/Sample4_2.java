package example;

public class Sample4_2 
{
    public static void main(String[] args)
    {
        RacingCar0 rccar1 = new RacingCar0(1234, 20.5, 5);
    }
}

class Car0
{
    private int num;
    private double gas;

    public Car0()
    {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public Car0(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }
    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar0 extends Car0
{
    private int course;
    public RacingCar0()
    {
        course = 0;
        System.out.println("生產了賽車");
    }

    public RacingCar0(int n, double g, int c)
    {
        super(n, g);
        course = c;
        System.out.println("生產了編號為" + course + "的賽車");
    }
    public void setCourse(int c)
    {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }
}
