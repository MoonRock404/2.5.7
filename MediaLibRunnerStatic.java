/*
 * Activity 2.5.7
 * Names: Siddhi Ananya and Chandini Chennakesavan
 * The runner for the MediaLibrary program
 */
public class MediaLibRunnerStatic
{
  public static void main(String[] args)
  {
    //Step 1
    System.out.println(MediaLib.getOwner() + "'s Library");

    //Step 8
    MediaLib.changeOwner("Siddhi");
    System.out.println(MediaLib.getOwner());

    MediaLib.owner = "Chandini";
    System.out.println(MediaLib.owner);

    //Step 14 / 17
    System.out.println(MediaLib.getNumEntries());

    //Step 22
    MediaLib myLib = new MediaLib();
    Movie newMovie = new Movie("Raiders of the Lost Ark", 1.9);
    myLib.addMovie(newMovie);
    Book newBook = new Book("1984", "Orwell");
    myLib.addBook(newBook);
    Song newSong = new Song("Stay Stay Stay");
    myLib.addSong(newSong);
    System.out.println(myLib.getNumEntries());
    
  }
}