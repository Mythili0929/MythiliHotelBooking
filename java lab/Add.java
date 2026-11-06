class Add {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String args[])
    {
        Add a= new Add();
       System.out.println("sum is:" +a.add(2,3,4));
       System.out.println("sum is:" +a.add(2,3));
    }
}