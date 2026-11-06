class Person
{
    String name;
    int age;
    Person(String n,int a)
    {
        name=n;
        age=a;
    }
    public void display()
    {
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }
}
class Employee extends Person{
    int empid;
    Employee(String n,int a,int eid){
        super(n, a);
        empid=eid;
    }
     public void edisplay()
     {
        display();
        System.out.println("employee id is "+empid);
     }
}
class Department extends Employee{
    String dept;
    int salary;
    Department(String n,int a,int eid,String dt,int s)
    {
        super(n, a, eid);
        dept=dt;
        salary=s;
    }
    public void empDetails()
    {
        edisplay();
        System.out.println("deparment is "+dept);
        System.out.println("salary is "+salary);
    }
}
class MultiLevelIn
{
    public static void main(String[] args) {
        Department dp=new Department("Rajesh",24,229,"Software Developer",65000);
        dp.empDetails();
    }
}