/*
 * Activity 2.5.7
 * Names: Siddhi Ananya and Chandini Chennakesavan
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    int myRating = 5;

    /*
    System.out.println("Book created " + myBook);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    System.out.println("myRating=" + myRating);
    myBook.adjustRating(15);
    System.out.println(myBook);
    System.out.println("Book changed!");
    myBook.setTitle("Fellowship of the Ring");
    myBook.adjustRating(5); // or myBook.setAuthor("JRR Tolkien");
    System.out.println("Book:" + myBook);
    System.out.println("Library: " + myLib);
    */
    
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    Movie newMovie = new Movie("Raiders of the Lost Ark", 1.9);
    myLib2.addMovie(newMovie);
    System.out.println(newMovie);
    System.out.println(myLib2);
    
    /*
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);
    Book newBook2 = new Book("1984", "Orwell");
    System.out.println(newBook2 + " equal " + newBook + "? "  + newBook2.equals(newBook));
    newBook2.setAuthor("George Orwell");
    System.out.println(newBook2 + " equal " + newBook + "? "  + newBook2.equals(newBook));
    */

  }
}