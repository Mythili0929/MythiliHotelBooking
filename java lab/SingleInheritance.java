class Student
{
    int rollno;
    String name;
    Student(int rn,String n)
    {
        this.rollno=rn;
        this.name=n;
    }
    public void display()
    {
        System.out.println("roll no is "+rollno);
        System.out.println("name is "+name);
    }
}
class StudentEx extends Student
{
    String dept;

    public StudentEx(int rn,String name,String dept) {
        super(rn, name);
        this.dept=dept;
    }
    public void StudentDetails()
    {
        display();
        System.out.println("department is "+dept);
    }
}
class SingleInheritance
{
    public static void main(String[] args) {
        StudentEx se=new StudentEx(364,"Swathi","cse");
        se.StudentDetails();
    }
}