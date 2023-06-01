public class WhileDemo 
{
    public static void main(String args[]) 
    {
        int i=0;
        while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println("This is even no.:"+i);
            }
            else
            {
                System.out.println("This is odd no.:"+i);
            }
            i=i+1;
        }
        //DoWhile loop
        int j=11;
        do
        {
            if(j%2==0)
            {
                System.out.println("do This is even no.:"+j);
            }
            else
            {
                System.out.println("do This is odd no.:"+j);
            }
            j++;
        }while(j<=10);

        
    }
    
}
