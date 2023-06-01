package ArrayDemo.StringDemo;

public class stringdemo
{
    public static void main(String args[])
    {
        String s1="vaishnavi Gawde";
        String s2="vhtthal Gawde";
        String s3= s1.concat(s2);
        //System.out.println("first string is:"+s1);
        System.out.println("new string is:"+s3);

        //replace
        String s4=s1.replace('v','V');
        System.out.println("replaced string:"+s4);

        //charAt
        char c= s1.charAt(5);
        System.out.println("character at 5 is:"+c);

        //substring
        String s=s1.substring(5, 9);
        System.out.println("substring is:"+s);

        //upper and lower case
        System.out.println(s1.toLowerCase()+""+s2.toUpperCase());

        //length
        System.out.println("length of the string is:"+s1.length());

        //compareto
        System.out.println("comparing the string"+s1.compareTo(s2));

        //contains
        System.out.println("string contain:"+s1.contains("Gawde"));
        
        //endswith
        System.out.println("the string endswith:"+s2.endsWith("de"));

        //equals
        System.out.println("equals"+s1.equals(s2));

        //isempty
        String s5="";
        System.out.println("String s5 is empty:"+s5.isEmpty());
    }
    
}
