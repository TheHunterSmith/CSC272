package FinalProject;

/**
 * This class represents an appointment with a description, date, start time, and end time.
 */
public class Appointments
{
   // Instance fields for appointment details
   private String description;
   private String date;
   private String startTime;
   private String endTime;

   /**
    * Constructor: Initializes an appointment with the given details.
    *
    * @param desc   The description of the appointment.
    * @param appointmentDate The date of the appointment.
    * @param start  The start time of the appointment.
    * @param end    The end time of the appointment.
    */
   public Appointments(String desc, String appointmentDate, String start, String end)
   {
       description = desc;
       date = appointmentDate;
       startTime = start;
       endTime = end;
   }

   /**
    * Checks if the appointment is on a specific date.
    *
    * @param onDate The date to check against the appointment date.
    * @return True if the appointment is on the specified date, false otherwise.
    */
   public boolean isOnDate(String onDate)
   {
       return date.equals(onDate);
   }

   /**
    * Checks if two appointments are equal.
    *
    * @param obj The object to compare with this appointment.
    * @return True if the appointments are equal, false otherwise.
    */
   public boolean equals(Object obj)
   {
       if (obj instanceof Appointments)
       {
           // The object is of this class, and we can check the instance fields.
           Appointments app = (Appointments) obj;
           return (description.equals(app.description) && date.equals(app.date) && startTime.equals(app.startTime) && endTime
                   .equals(app.endTime));
       }

       // The object is not even of this class. The two are not equal.
       return false;
   }

   /**
    * Returns a string representation of the appointment.
    *
    * @return A string containing the description, date, start time, and end time of the appointment.
    */
   @Override
   public String toString()
   {
       return (description + " " + date + " " + startTime + " " + endTime);
   }
}