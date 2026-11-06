class AreaCalculator
{
    double area(double side){
        return side*side;
    }
    double area(double length,double breadth)
    {
        return length*breadth;
    }
    double area(float radius)
    {
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        AreaCalculator obj=new AreaCalculator();
        double side=s.nextFloat();
        double length=s.nextFloat();
        double beadth=s.nextFloat();
        double radius=s.nextFloat();
        double a=obj.area(side);
        double b=obj.area(length , breadth);
        double c=obj.area(radius);
        System.out.println("Area of square"+a);
        System.err.println("Area of reactangle"+b);
        System.err.println("Area of circle"+c);
    }
}