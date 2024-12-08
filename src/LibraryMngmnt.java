import java.text.SimpleDateFormat;
import java.util.*;

class Book{
    private String name;
    private String author;
    private Date issuedOn;
    //constructor of class book
    public Book(String name, String author, Date issuedOn){
        this.name = name;
        this.author = author;
        this.issuedOn = issuedOn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getIssuedOn() {
        return issuedOn;
    }

    @Override
    public String toString() {
        //STR is a keyword used to indicate that a string template is there. It finishes the use of string.format.
        return STR."Movie{name='\{name}\{'\''}, issuedOn=\{issuedOn}, author=\{author}\{'}'}";
    }
}
public class LibraryMngmnt {
    private List<Book> books;

    //constructor of class libraryMngmnt
    public LibraryMngmnt(){
        this.books = new ArrayList<>();
    }
    public void addBooks(Book book){
        books.add(book);
    }
    public void printBooksInSoetrdOrder(){
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getIssuedOn().compareTo(o2.getIssuedOn());
            }
        });
        for (Book book : books){
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        LibraryMngmnt libraryMngmnt = new LibraryMngmnt();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books you have issued: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Enter book name:");
            String name = sc.nextLine();

            System.out.println("Enter issue date (yyyy-mm-dd):");
            String issuedOnString = sc.nextLine();
            Date issuedOn = null;
            try {
                issuedOn = new SimpleDateFormat("yyyy-MM-dd").parse(issuedOnString);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Enter author name:");
            String author = sc.nextLine();
            sc.nextLine();

            libraryMngmnt.addBooks(new Book(name, author, issuedOn));
        }

        System.out.println("List of books sorted in the order of their issue date is:");
        libraryMngmnt.printBooksInSoetrdOrder();
    }
}


