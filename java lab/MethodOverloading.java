class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloading m= new MethodOverloading();
        System.out.println("Sum is: " + m.add(10, 20));
        System.out.println("Sum is: " + m.add(5, 10, 15));
        System.out.println("Sum is: " + m.add(2.5, 3.5));
        System.out.println("Sum is: "+m.add(2.3,6.0,8.9));
    }
}