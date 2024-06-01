package FinalProject;

import java.util.List;
import java.util.Scanner;

/**
 * This class represents a menu system for managing appointments.
 */
public class AppointmentMenu
{
   // Constants for menu options and indices
   private static final String[] MENU_OPTIONS = { "Add", "Cancel", "Show", "Quit" };
   private static final int ADD_INDEX = 0;
   private static final int CANCEL_INDEX = 1;
   private static final int SHOW_INDEX = 2;
   private static final int QUIT_INDEX = 3;

   // Objects for handling the calendar and user interface
   private AppointmentCalendar calendar;
   private UIHandler uih;

   /**
    * Initialize the objects used in the program.
    */
   private void init()
   {
       // Create instances of AppointmentCalendar and UIHandler
       calendar = new AppointmentCalendar();
       uih = new UIHandler(new Scanner(System.in), System.out);
   }

   /**
    * Main method to run the appointment management system.
    */
   public void run()
   {
       init();

       // Put the program in a main loop so that it keeps running until the user quits.
       boolean shouldContinue = true;
       while (shouldContinue)
       {
           // Get user input for menu choice
           int result = uih.getChoice(MENU_OPTIONS);

           // Execute actions based on user input
           if (result == ADD_INDEX) {
               addAction();
           }
           else if (result == CANCEL_INDEX) {
               cancelAction();
           }
           else if (result == SHOW_INDEX) {
               showAction();
           }
           else if (result == QUIT_INDEX) {
               // User requested to quit, change shouldContinue to false.
               shouldContinue = false;
           }

           // Add spacing for better display
           uih.display("");
       }
   }

   // Constants and prompts for adding an appointment
   private static final String ADD_PROMPT = "Appointment (Description Date From To)";
   private static final String APPOINTMENT_ALREADY_EXISTS = "This appointment already exists.";

   /**
    * Handles interaction with the user when adding an appointment.
    */
   private void addAction()
   {
       // User inputs 4 lines: description, date, start, end.
       String[] input = uih.getInput(ADD_PROMPT, 4);

       // Attempt to add the appointment to the calendar
       if (!calendar.addAppointment(new Appointments(input[0], input[1], input[2], input[3])))
       {
           uih.display(APPOINTMENT_ALREADY_EXISTS);
       }

       // Method returns, control goes back to run.
   }

   // Constants and prompts for canceling an appointment
   private static final String CANCEL_PROMPT = "Cancel appointments on which date?";
   private static final String CANCEL_INDEX_REQUEST = "Which would you like to cancel?";
   private static final String INDEX_OUT_OF_BOUNDS_MSG = "The index entered is not in the list. No appointment is cancelled.";

   /**
    * Handles interaction with the user when canceling an appointment.
    */
   private void cancelAction()
   {
       // Get the date of the appointment from the user
       String date = uih.getInput(CANCEL_PROMPT);

       // Get all the appointments on that date
       List<Appointments> allApps = calendar.findAppointmentOnDate(date);

       // Display the appointments
       for (int i = 0; i < allApps.size(); i++)
       {
           uih.display(Integer.toString(i + 1) + ") " + allApps.get(i).toString());
       }

       // Ask which appointment to cancel
       String input = uih.getInput(CANCEL_INDEX_REQUEST);
       int index = Integer.parseInt(input) - 1;

       // Prevent index out of bounds error
       if (index < 0 || index >= allApps.size()) {
           uih.display(INDEX_OUT_OF_BOUNDS_MSG);
           return;
       }

       // Cancel the appointment
       calendar.cancelAppointment(allApps.get(index));
   }

   // Constants and prompts for showing appointments
   private static final String SHOW_PROMPT = "Show appointments for which date?";
   private static final String SHOW_HEAD = "Appointments:";

   /**
    * Handles interaction with the user when showing appointments.
    */
   private void showAction()
   {
       // Get the date of the appointment from the user
       String date = uih.getInput(SHOW_PROMPT);

       // Get all the appointments on that date
       List<Appointments> allApps = calendar.findAppointmentOnDate(date);

       // Display the appointments
       uih.display(SHOW_HEAD);
       for (int i = 0; i < allApps.size(); i++)
       {
           uih.display(allApps.get(i).toString());
       }
   }
}