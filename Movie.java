/*
 * Activity 2.5.7
 * Names: Siddhi Ananya and Chandini Chennakesavan
 * A Book class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double duration;
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, double a)
  {
    title = t;
    duration = a;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", is  " + duration + " long";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Movie m)
  {
    if(this.title.equals(m.title) && this.duration == m.duration)
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

  public void setDuration(double a) {
    duration = a;
  }
}
