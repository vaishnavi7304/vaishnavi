package Abstraction;
abstract class Shape
{
    abstract void draw();
}

class Circle extends Shape
{
    @Override
    void draw() 
    {
        System.out.println("I am in Circle");
    }
}

class Rect extends Shape
{
    @Override
    void draw() 
    {
        System.out.println("I am in Rectangle");
    }
}


public class ShapeDemo 
{
    public static void main(String args[]) 
    {
        Shape s = new Circle();
        s.draw();
        Shape s1 = new Rect();
        s1.draw();
        
    }
}
