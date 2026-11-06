import java.util.Scanner;
class Student
{
	int rollno;
	String name;
	public void readDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no: ");
		rollno = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
	}
	public void printDetails(){
		System.out.println("Roll No : "+rollno);
		System.out.println("Name : "+name);
	}
}
public class Class
{
    public static void main(String[] args)
  {
	Student s1 = new Student();
	s1.readDetails();
	Student s2 = new Student();
	s2.readDetails();
	s1.printDetails();
	s2.printDetails();
  }      
}