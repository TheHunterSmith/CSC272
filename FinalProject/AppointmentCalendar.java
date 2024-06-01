package FinalProject;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a calendar for managing appointments.
 */
public class AppointmentCalendar
{
   // List to store appointments
   private List<Appointments> appointmentList;

   /**
    * Constructor: Initializes the appointment list as an ArrayList.
    */
   public AppointmentCalendar()
   {
       appointmentList = new ArrayList<>();
   }

   /**
    * Checks if the calendar already has a specific appointment.
    *
    * @param app The appointment to check.
    * @return True if the appointment already exists, false otherwise.
    */
   private boolean hasAppointment(Appointments app)
   {
       for (Appointments appointment : appointmentList)
       {
           if (appointment.equals(app))
           {
               // Appointment already exists.
               return true;
           }
       }

       // Appointment does not exist.
       return false;
   }

   /**
    * Adds an appointment to the calendar.
    *
    * @param app The appointment to add.
    * @return True if the appointment is added successfully, false if it already exists.
    */
   public boolean addAppointment(Appointments app)
   {
       if (hasAppointment(app)) {
           // Appointment already exists
           return false;
       }

       // Add the appointment to the list
       appointmentList.add(app);
       return true;
   }

   /**
    * Cancels an appointment from the calendar.
    *
    * @param app The appointment to cancel.
    */
   public void cancelAppointment(Appointments app)
   {
       // Search through the list and find the appointment to cancel
       for (int i = 0; i < appointmentList.size(); i ++)
       {
           if (app.equals(appointmentList.get(i))) {
               // Found the appointment to cancel
               appointmentList.remove(i);
               return;
           }
       }
   }

   /**
    * Finds appointments on a specific date.
    *
    * @param date The date to search for appointments.
    * @return A list of appointments on the specified date.
    */
   public List<Appointments> findAppointmentOnDate(String date)
   {
       // The list to store the appointments on the specified date.
       List<Appointments> appsOnDate = new ArrayList<>();

       // Go through the list and find all appointments with the same date.
       for (Appointments app : appointmentList)
       {
           if (app.isOnDate(date)) {
               appsOnDate.add(app);
           }
       }

       return appsOnDate;
   }
}