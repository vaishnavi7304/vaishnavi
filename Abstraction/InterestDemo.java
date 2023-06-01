package Abstraction;
abstract class Interest
{
    double fixedrate;
    abstract void bankInterest();
}

class BOI extends Interest
{
    @Override
    void bankInterest() 
    {
        fixedrate=8.56;
        System.out.println("BOI INTEREST :"+fixedrate);
    }
}

class HDFC extends Interest
{
    @Override
    void bankInterest() 
    {
        fixedrate=6.74;
        System.out.println("HDFC INTEREST :"+fixedrate);
    }
}

class SBI extends Interest
{

    @Override
    void bankInterest() 
    {
        fixedrate=9.88;
        System.out.println("SBI INTEREST :"+fixedrate);
        
    }
    
}
public class InterestDemo 
{
    public static void main(String args[]) 
    {
        Interest i = new SBI();
        i.bankInterest();
    }
}
