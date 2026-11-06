class Book
{
    private int bookNo;
    private String author, title;
    private double cost;
    private boolean status;

    Book(int bookNo, String author, String title, double cost)
    {
        this.bookNo = bookNo;
        this.author = author;
        this.title = title;
        this.cost = cost;
        this.status = true;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void issue()
    {
        if(getStatus())
        {
            setStatus(false);
            System.out.println("Book issued successfully");
        }
        else
        {
            System.out.println("The book is Not available");
        }
    }

    public void returnBook()
    {
        if(!getStatus())
        {
            setStatus(true);
            System.out.println("Book returned successfully");
        }
        else
        {
            System.out.println("Book was not issued");
        }
    }

    public void enquiry()
    {
        System.out.println("Book No : " + bookNo);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Cost    : " + cost);

        if(status)
            System.out.println("Status  : Available");
        else
            System.out.println("Status  : Issued");
    }
}

class BookEx
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Book Number: ");
        int bookNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Cost: ");
        double cost = sc.nextDouble();

        Book b = new Book(bookNo, author, title, cost);

        int choice = 0;

        while(choice != 4)
        {
            System.out.println("\n1. Enquiry");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1)
                b.enquiry();
            else if(choice == 2)
                b.issue();
            else if(choice == 3)
                b.returnBook();
            else if(choice == 4)
                System.out.println("Thank you");
            else
                System.out.println("Invalid choice");
        }
    }
}