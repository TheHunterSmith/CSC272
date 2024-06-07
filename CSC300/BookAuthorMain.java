package CSC300;

public class BookAuthorMain {
    public static void main(String[] args) {
        Author auth = new Author("Mike", "mJones@somewhere.com", 'm');
        Book book = new Book("Great Book ", auth, 14.99);

        System.out.println("\n" + auth.print());
        System.out.println(book.print() + "\n");
    }
}
