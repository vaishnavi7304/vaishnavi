class bank
{
    double fixedInterest = 10.00;
    void display()
    {
        System.out.println("Fixed interest of bank:"+fixedInterest);
    }
}
class SBI extends bank
{
    
    void display()
    {
        fixedInterest=9.80;
        System.out.println("Fixed Interest of SBI:"+fixedInterest);
        //System.out.println("SBI Interest :"+sbiInterest);
    }
}

class BOI extends bank
{

    void display()
    {
        fixedInterest=7.30;
        System.out.println("Fixed Interest of BOI:"+fixedInterest);
       // System.out.println("BOI Interest :"+boiInterest);
    }
}

class CANARA extends bank
{
    void display()
    {
        fixedInterest=8.60;
        System.out.println("Fixed Interest of CANARA:"+fixedInterest);
        //System.out.println("CANARA bank Interest :"+canarainterest);
    }
}

class HDFC extends bank
{
    void display()
    {
        fixedInterest=8.55;
        System.out.println("Fixed Interest of HDFC:"+fixedInterest);
        //System.out.println("HDFC Interest :"+hdfcInterest);
    }
}
public class OverridingDemo 
{
    public static void main(String args[]) 
    {
        OverridingDemo od = new OverridingDemo();
        bank b = new bank();
        b.display();
        System.out.println("\n");
        SBI s = new SBI();
        s.display();
        System.out.println("\n");
        BOI boi = new BOI();
        boi.display();
        System.out.println("\n");
        CANARA c = new CANARA();
        c.display();
        System.out.println("\n");
        HDFC h = new HDFC();
        h.display();

    }
}
