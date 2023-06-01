public class OverloadingDemo 
{
    //original
    public int sum(int a,int b)
    {
        return a+b;
    }

    //1st way to overload by changing parameter
    public int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    //2nd way to overload by changing return type(int-> double)
    public double sum(double a, double b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        OverloadingDemo od = new OverloadingDemo();
        System.out.println("1st method :"+od.sum(10,20));
        System.out.println("2nd method :"+od.sum(10,20,30));
        System.out.println("3rd method:"+od.sum(60,40));
    }
    
}
