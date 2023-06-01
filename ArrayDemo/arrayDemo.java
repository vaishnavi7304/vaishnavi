package ArrayDemo;

public class arrayDemo 
{
    public static void main (String args[]) 
    {
        int a[]= new int[6];
        a[0]=30;
        a[1]=34;
        a[2]=68;
        a[3]=50;
        a[4]=39;
        a[5]=20;

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        //second way
        System.out.println("second way");
        int b[]={34,56,7,3,2};
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }



       

        
    }
    
}
