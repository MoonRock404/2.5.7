/*
 * Activity 2.5.7
 * Names: Siddhi Ananya and Chandini Chennakesavan
 * A Book class for the Time program
 */
import java.util.Calendar; 

public class Time
{
  
  /*** Constructor ****/
  public Time()
  {
    //System.out.println("Adding book " + t);
  }

  public static String currentTime(){
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
  }
   /*** Accessor methods ***/


  /*** Mutator methods ***/

}
