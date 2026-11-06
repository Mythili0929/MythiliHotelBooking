class Book {
    private int bno;
    private String author, title;
    private double cost;
    private boolean status; 
    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getBno() {
        return bno;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public boolean getStatus() {
        return status;
    }
}

public class ArrayBooks {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of books library can store: ");
        int n = sc.nextInt();
        Book[] b = new Book[n];
        int count = 0;
        while (true) {
            System.out.println("\nLibrary Menu");
            System.out.println("1 - Purchase Book");
            System.out.println("2 - Issue Book");
            System.out.println("3 - Return Book");
            System.out.println("4 - Enquiry");
            System.out.println("5 - Stop");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if (choice == 1)
           {
            if (count == n)
            {
            System.out.println("Library is full.");
           continue;
            }
    b[count] = new Book();
    System.out.print("Enter Book No: ");
    b[count].setBno(sc.nextInt());
    System.out.print("Enter Title: ");
    b[count].setTitle(sc.next());
    System.out.print("Enter Author: ");
    b[count].setAuthor(sc.next());
    System.out.print("Enter Cost: ");
    b[count].setCost(sc.nextDouble());
    b[count].setStatus(true);
    count++;
    System.out.println("Book purchased successfully.");
}
else if (choice == 2)
{
    System.out.print("Enter Book No to issue: ");
    int no = sc.nextInt();
    boolean found = false;

    for (int i = 0; i < count; i++)
    {
        if (b[i].getBno() == no)
        {
            found = true;
            if (b[i].getStatus())
            {
                b[i].setStatus(false);
                System.out.println("Book issued successfully.");
            }
            else
            {
                System.out.println("Book already issued.");
            }
            break;
        }
    }

    if (!found)
        System.out.println("Book not found.");
}
             else if (choice == 3)
              {
                System.out.print("Enter Book No to return: ");
                int no = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < count; i++) 
                {
                    if (b[i].getBno() == no) 
                    {
                        found = true;
                        if (!b[i].getStatus()) 
                        {
                            b[i].setStatus(true);
                            System.out.println("Book returned successfully.");
                        } else 
                        {
                            System.out.println("Book was not issued.");
                        }
                        break;
                    }
                }
                if (!found)
                    System.out.println("Book not found.");
            } 
            else if (choice == 4) 
            {
                if (count == 0) 
                {
                    System.out.println("No books available.");
                    continue;
                }
                for (int i = 0; i < count; i++) 
                {
                    System.out.println("Book No: " + b[i].getBno());
                    System.out.println("Title: " + b[i].getTitle());
                    System.out.println("Author: " + b[i].getAuthor());
                    if (b[i].getStatus()) 
                    {
                     System.out.println("Status: Available");
                    }
                    else
                    {
                     System.out.println("Status: Not Available");
                    }
                }
            } 
            else if (choice == 5)
            {
                break;

            }
             else 
            {
                System.out.println("Invalid choice.");
            }
        }
    }
}