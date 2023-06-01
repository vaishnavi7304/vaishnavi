class animal
{
    int noOfLeg = 4;
    int noOfEyes = 2;
    void display()
    {
        System.out.println("Animals have "+noOfLeg+" legs");
        System.out.println("Animals have "+noOfEyes+" eyes");
    }
}


class dog extends animal
{
        String colour="black";
        String feature="loud barking";
        String like="bones";

    void display()
    {
        System.out.println("Dog is of "+colour+"colour");
        System.out.println("It does a "+feature);
        System.out.println("They like "+like);
        System.out.println("number of legs "+noOfLeg);
        System.out.println("number of eyes "+noOfEyes);

    }
}

class cat extends animal
{
    String name="Ash";
    String colour="White";
    String like="mouse";

    void display()
    {
        System.out.println("Cat is of "+colour);
        System.out.println("they like "+like);
        System.out.println("cat name is "+name);
        System.out.println("number of legs "+noOfLeg);
        System.out.println("number of eyes "+noOfEyes);
    }
}
public class InheritanceDemo 
{
    
    public static void main(String args[]) 
    {
        InheritanceDemo id = new InheritanceDemo();
        animal a = new animal();
        System.out.println("\n");
        cat c = new cat();
        c.display();
        System.out.println("\n");
        dog d = new dog();
        d.display();
        
    }
}
