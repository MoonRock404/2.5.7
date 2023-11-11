/*
 * Activity 2.5.7
 * Names: Siddhi Ananya and Chandini Chennakesavan
 * A Song class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private int rating;
  
  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\"";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Song s)
  {
    if(this.title.equals(s.title))
      return true;  
    return false;

  }
  
  public void adjustRating(int r)
  {
    if ((rating + r >= 0) && (rating + r <= 10))
      rating += r;

    r = 10;

  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }
}
