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

public class BookEx {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Book b = new Book();  
        while (true) {
            System.out.println("\nLibrary Menu");
            System.out.println("1 - Purchase Book");
            System.out.println("2 - Issue Book");
            System.out.println("3 - Return Book");
            System.out.println("4 - Enquiry");
            System.out.println("5 - Stop");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Book No: ");
                b.setBno(sc.nextInt());

                System.out.print("Enter Title: ");
                b.setTitle(sc.next());

                System.out.print("Enter Author: ");
                b.setAuthor(sc.next());

                System.out.print("Enter Cost: ");
                b.setCost(sc.nextDouble());

                b.setStatus(true); // book available after purchase
                System.out.println("Book purchased successfully.");

            } else if (choice == 2) {
                if (b.getStatus()) {
                    b.setStatus(false);
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Sorry, book is already issued.");
                }

            } else if (choice == 3) {
                if (!b.getStatus()) {
                    b.setStatus(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }

            } else if (choice == 4) {
                System.out.println("Book Title: " + b.getTitle());
                System.out.println("Author: " + b.getAuthor());
                System.out.println("Cost: " + b.getCost());
                System.out.print("Status: ");
                System.out.println(b.getStatus() ? "Available" : "Not Available");

            } else if (choice == 5) {
                System.out.println("Program stopped.");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}