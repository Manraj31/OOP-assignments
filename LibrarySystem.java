import java.util.Scanner;

class Book {
    int bookID;
    String title;
    String author;
    double price;
    int quantity;

    static String libraryName = "City Central Library";
    static int totalBooksCreated = 0;

    Book() {
        totalBooksCreated++;
    }

    Book(int id, String t, String a, double p, int q) {
        this.bookID = id;
        this.title = t;
        this.author = a;
        this.price = p;
        this.quantity = q;
        totalBooksCreated++;
    }

    Book(Book b) {
        this.bookID = b.bookID;
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
        this.quantity = b.quantity;
        totalBooksCreated++;
    }

    void displayDetails() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Price: $" + price + ", Qty: " + quantity);
    }

    void updatePrice(double price) {
        this.price = price;
    }

    void updatePrice(double price, double discountPercentage) {
        this.price = price - (price * (discountPercentage / 100));
    }

    void purchaseBook(int quantity) {
        this.quantity -= quantity;
    }

    void purchaseBook(int quantity, boolean applyDiscount) {
        if (applyDiscount) {
            this.price = this.price * 0.9;
        }
        this.quantity -= quantity;
    }

    void restockBook(int quantity) {
        this.quantity += quantity;
    }

    static void displayLibraryInfo() {
        System.out.println("Library Name: " + libraryName);
    }

    static void displayTotalBooks() {
        System.out.println("Total books created: " + totalBooksCreated);
    }
}

class PrintedBook extends Book {
    int pages;
    String publisher;

    PrintedBook(int id, String t, String a, double p, int q, int pages, String pub) {
        super(id, t, a, p, q);
        this.pages = pages;
        this.publisher = pub;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(" -> Printed Book: " + pages + " pages, Publisher: " + publisher);
    }
}

class EBook extends Book {
    double fileSize;
    String format;

    EBook(int id, String t, String a, double p, int q, double fs, String f) {
        super(id, t, a, p, q);
        this.fileSize = fs;
        this.format = f;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(" -> EBook: " + fileSize + "MB, Format: " + format);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] library = new Book[10];
        int count = 0;

        while (true) {
            System.out.println("\n   Library Menu   ");
            System.out.println("1. Add Book\n2. Display All\n3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                library[count++] = new Book(id, title, "Author", 100.0, 5);
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    library[i].displayDetails();
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}