package za.ac.cput.org.Assignment4;

// Open-Close Principle - Bad example

public class GraphicEditor
{
    public void drawShape(Shape s)
    {
        Rectangle R = null;
        Circle r = null;

        if (s.m_type==1)
        {
            drawRectangle(R);
        }
        else if (s.m_type==2) drawCircle(r);

    }
    public void drawCircle(Circle r)
    {

    }
    public void drawRectangle(Rectangle R)
    {

    }
}


class Shape
{
    int m_type;
}

class Rectangle extends Shape
{
    Rectangle()
    {
        super.m_type=1;
    }
}

class Circle extends Shape
{
    Circle()
    {
        super.m_type=2;
    }
}


