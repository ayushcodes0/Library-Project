
/*It is a question given by Harry 
 * You have to implement a library using java class library
 * Methods: addBook(), issueBook(), returnBook(), showAvailableBook()
 * Properties: Array to store the available books,
 * Array to store the issued books
 */


class Library {
    String[] books;
    int no_of_books;
    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book +" has been added");
    }

    void showAvailableBooks() {
        System.out.println(" ");
        System.out.println("Available books are : ");
        for (int i = 0; i<books.length; i++) {
            if (this.books[i] == null) {
                continue;
            }
            System.out.println("* "+ books[i]);
            
        }
    }

    void issueBook(String book) {
        for (int i=0; i<this.books.length; i++) {
            if (this.books[i] == book) {
                System.out.println(" ");
                System.out.println(book+" book has been issued");
                no_of_books--;
                this.books[i] = null;
                return;
            }
            
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book) {   //thoda issue hai
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(" ");
        System.out.println(book +" book has been returned");
    }
}

public class Library_cwh {
    public static void main (String args[]) {
        Library centrLibrary = new Library();
        centrLibrary.addBook("Think and Grow Rich");
        centrLibrary.addBook("Rich Dad Poor Dad");
        centrLibrary.addBook("Algorithms");
        centrLibrary.addBook("Java Dummies");
        centrLibrary.addBook("Let Us C");
        centrLibrary.addBook("Let Us C++");
        centrLibrary.addBook("Interview Crack");
        centrLibrary.addBook("Python");
        centrLibrary.addBook("HC Verma");
        centrLibrary.addBook("Ncert");

        centrLibrary.showAvailableBooks();
        centrLibrary.issueBook("Algorithms");
        centrLibrary.issueBook("Ncert");
        // centrLibrary.issueBook("Python");
        // centrLibrary.issueBook("Let Us C");
        // centrLibrary.issueBook("Let Us C++");
        // centrLibrary.issueBook("Java Dummies");

        centrLibrary.showAvailableBooks();
        centrLibrary.returnBook("Algorithms");
        centrLibrary.returnBook("Ncert");
        // centrLibrary.returnBook("Python");
        // centrLibrary.returnBook("Let Us C");
        centrLibrary.showAvailableBooks();

    }
}