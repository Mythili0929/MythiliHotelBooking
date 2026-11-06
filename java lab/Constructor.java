class Student {
    int rollNo;
    String name;
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    Student()
    {
        rollNo=109;
        name="Nikhil";
    }
    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}
    class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student(101, "Mahesh");
        Student s2 = new Student(102, "Sanjay");
        Student s3 = new Student(103, "Rakesh");
        Student s4=new Student();
        s1.display();
        s2.display();
        s3.display(); 
        s4.display();       
    }
}