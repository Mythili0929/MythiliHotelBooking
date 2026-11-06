abstract class Shape
{
    abstract public void area();
}
class Circle extends Shape{
    int r;
    Circle(int r)
    {
        this.r=r;
    }
    public void area(){
        System.out.println("Circle area is "+3.14*r*r);
    }
}
class Rect extends Shape{
    int l,b;
    Rect(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("Rectangle area is "+l*b);
    }
}
class Triangle extends Shape{
    int b,h;
    Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    public void area(){
        System.out.println("Triangle area is "+0.5*h*b);
    }
}
class AbstractClass
{
    public static void main(String[] args) {
        Circle c=new Circle(2);
        Rect r=new Rect(6,3);
        Triangle t=new Triangle(3,5);
        c.area();
        r.area();
        t.area();
    }
}