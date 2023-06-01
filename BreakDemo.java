
public class BreakDemo 
{
    public static void main(String args[]) 
    {
        //continue
        int i;
        for(i=1;i<=10;i++)
        {
        if(i==6)
             continue;
        System.out.println(i);
        }
        //break
        int j;
        for(j=1;j<=10;j++)
        {
            if(j==7)
            break;
            System.out.println(j);
        }
        
    }
    
}
