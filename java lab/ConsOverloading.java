  class Student {
    int rollNo;
    String name;
    int age;
    Student() {
        rollNo = 100;
        name = "hari";
        age = 19;
    }
    Student(int r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }
    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
        age = s.age;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("--------------------");
    }
  }
  class ConsOverloading{
    public static void main(String[] args) {
        Student s1 = new Student();                     
        Student s2 = new Student(101, "Mahesh", 20);    
        Student s3 = new Student(s2);                   
        s1.display();
        s2.display();
        s3.display();
    }
}