class Student
{
    int rollNo,m1,m2,total,average;
    String name;
    int total(int m1,int m2)
    {
        return m1 + m2;
    }
    double average(int total)
    {
        return total/2.0;
    }
    public static void main(String []args)
    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        Student s=new Student();
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the rollno");
        int rollNo=sc.nextInt();
        System.out.println("Enter the two subject marks");
        s.m1=sc.nextInt();
        s.m2=sc.nextInt();
        int total=s.total(s.m1, s.m2);
        double avg=s.average(total);
        System.out.println("STUDENT DETAILS:");
        System.out.println("----------------");
        System.out.println("Name is"+name);
        System.out.println("Roll no is"+rollNo);
        System.out.println("Total is"+ total);
        System.out.println("Average is"+ avg);
    }
}