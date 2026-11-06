class Sample
{
    public static void main(String []args)
    {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int sq=n*n;
        System.out.println("The square of the given number is"+sq);
    }
}