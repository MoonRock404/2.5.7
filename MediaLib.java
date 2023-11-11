/**
 * Activity 2.5.7
 * Names: Siddhi Ananya and Chandini Chennakesavan
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries = 0;

  public void addBook(Book b)
  {
    if (book == null){
      book = b;
      numEntries ++;
    } else {
      System.out.println("Cannot add a new book: A book already exists");
    }
  }
  
  public void addMovie(Movie m){
    if (movie == null){
      movie = m;
      numEntries ++;
    } else {
      System.out.println("Cannot add a new movie: A movie already exists");
    }
  }

  public void addSong(Song s)
  {
    if (song == null){
      song = s;
      numEntries ++;
    } else {
      System.out.println("Cannot add a new song: A song already exists");
    }
  }
  
  public String toString() 
  {
    String info = "";
    return info;
  }
  
  public static String getOwner(){
    return owner;
  }
  
  public static int getNumEntries(){ 
    return numEntries;
  }
  
  public static void changeOwner(String o){
    owner = o;
  }
}