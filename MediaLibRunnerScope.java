/*
 * Activity 2.5.7
 * Names: Siddhi Ananya and Chandini Chennakesavan
 * The runner for the MediaLibrary program
 */
public class MediaLibRunnerScope
{
  public static void main(String[] args)
  {
    MediaLib myLib = new MediaLib();
    myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
    myLib.addBook(new Book("1984", "Orwell"));
    myLib.addSong(new Song("In Your Eyes"));
    System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);

    //Step 6-13
    Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");
    myBook.adjustRating(4);
    myBook.adjustRating(5);
  }
}