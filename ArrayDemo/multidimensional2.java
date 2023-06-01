package ArrayDemo;

public class multidimensional2 
{
    public static void main(String args[]) 
    {
        int a[][]={{1,2,3},
                    {3,4,5},
                    {6,7,8}
                    };

        int b[][]={{8,7,9},
                   {6,5,4},
                   {3,2,1}  
                  };
        int c[][]= new int[3][3];

                    for(int i=0;i<a.length;i++)
                    {
                        for(int j=0;j<a.length;j++)
                        {
                            c[i][j]=a[i][j]*b[i][j];
                            System.out.println(c[i][j]);
                        }
                    }            
    }
    
}
