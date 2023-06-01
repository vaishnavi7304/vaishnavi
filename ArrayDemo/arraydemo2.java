package ArrayDemo;

public class arraydemo2 
{
    public static void main(String args[]) 
    {
        int c[] ={10,20,23,-5,43,67,88};
        for(int i=0;i<c.length;i++)
        {   
            //even or odd
            if(c[i]%2==0)
             {
              System.out.println("this is an even no.:"+c[i]);
             }
             else
             {
                System.out.println("this is a odd no.:"+c[i]);
             }
             //positive or negative
             if(c[i]<0)
             {
                System.out.println("\nthis no is negative:"+c[i]);
             }
             else
             {
                System.out.println("this no is positive:"+c[i]);
             }

        }
    }
    
}
