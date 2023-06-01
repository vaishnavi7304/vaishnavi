package ConstructorDemo;

public class School 
{
    int a;
    School(int a)
    {
        this.a=a;
        System.out.println("University Name is :"+a);
        System.out.println("\n");
        
    }

    void display()
    {
        System.out.println("I am in method"+a);
    }

    School()
    {
        String clgname = "Bhavna Trust Degree College";
        int year = 1989;
        int stdno = 10060;
        String add = "Chembur";
        String pname = "P.Shingham";
    

        System.out.println("I am in default constructor.");
        System.out.println("College name is :"+clgname);
        System.out.println("Year of establishment :"+year);
        System.out.println("No. of Students in the college :"+stdno);
        System.out.println("location :"+add);
        System.out.println("Principal name :"+pname);
        System.out.println("University Name is :"+a);
        System.out.println("\n");
        
    }

    School(String clgname, int year , int stdno , String add, String pname)
    {
        System.out.println("\nI am in parameterized constructor.");
        System.out.println("College name is :"+clgname);
        System.out.println("Year of establishment :"+year);
        System.out.println("No. of Students in the college :"+stdno);
        System.out.println("location :"+add);
        System.out.println("principal name :"+pname);
        System.out.println("University Name is :"+a);
        System.out.println("\n");
    }
    public static void main(String args[]) 
    {
        School sl = new School();
        School sl2 = new School("Bhavna Trust Degree College", 1989, 10060, "Chembur","P.Shingham");
        School sl3 = new School(12);
        sl.display();
    }
    
}
