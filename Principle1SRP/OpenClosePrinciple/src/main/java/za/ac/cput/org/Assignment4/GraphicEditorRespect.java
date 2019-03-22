package za.ac.cput.org.Assignment4;


// Open-Close Principle - Good example

public class GraphicEditorRespect
{
    public void drawShape(Shape s)
    {
        s.draw();
    }



public abstract class Shape
{
    abstract void draw();
}

public class Rectangle extends Shape
{
    public void draw()
    {
        // draw the rectangle
    }
}

}