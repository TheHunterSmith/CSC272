package FinalProject;

import java.util.List;
import java.util.Scanner;

public class AppointmentMenu {
   private static final String[] MENU_OPTIONS = { "Add", "Cancel", "Show", "Quit" };
   private static final int ADD_INDEX = 0;
   private static final int CANCEL_INDEX = 1;
   private static final int SHOW_INDEX = 2;
   private static final int QUIT_INDEX = 3;
   private AppointmentCalendar calendar;
   private UIHandler uih;

   private void init() {
       calendar = new AppointmentCalendar();
       uih = new UIHandler(new Scanner(System.in), System.out);
   }

   public void run() {
       init();

       boolean shouldContinue = true;
       while (shouldContinue) {
           int result = uih.getChoice(MENU_OPTIONS);

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
               shouldContinue = false;
           }

           uih.display("");
       }
   }

   private static final String ADD_PROMPT = "Appointment (Description Date From To)";
   private static final String APPOINTMENT_ALREADY_EXISTS = "This appointment already exists.";

   private void addAction() {
       String[] input = uih.getInput(ADD_PROMPT, 4);

       if (!calendar.addAppointment(new Appointments(input[0], input[1], input[2], input[3]))) {
           uih.display(APPOINTMENT_ALREADY_EXISTS);
       }
   }

   private static final String CANCEL_PROMPT = "Cancel appointments on which date?";
   private static final String CANCEL_INDEX_REQUEST = "Which would you like to cancel?";
   private static final String INDEX_OUT_OF_BOUNDS_MSG = "The index entered is not in the list. No appointment is cancelled.";

   private void cancelAction() {
       String date = uih.getInput(CANCEL_PROMPT);

       List<Appointments> allApps = calendar.findAppointmentOnDate(date);

       for (int i = 0; i < allApps.size(); i++) {
           uih.display(Integer.toString(i + 1) + ") " + allApps.get(i).toString());
       }

       String input = uih.getInput(CANCEL_INDEX_REQUEST);
       int index = Integer.parseInt(input) - 1;

       if (index < 0 || index >= allApps.size()) {
           uih.display(INDEX_OUT_OF_BOUNDS_MSG);
           return;
       }

       calendar.cancelAppointment(allApps.get(index));
   }

   private static final String SHOW_PROMPT = "Show appointments for which date?";
   private static final String SHOW_HEAD = "Appointments:";

   private void showAction() {
       String date = uih.getInput(SHOW_PROMPT);

       List<Appointments> allApps = calendar.findAppointmentOnDate(date);

       uih.display(SHOW_HEAD);
       for (int i = 0; i < allApps.size(); i++) {
           uih.display(allApps.get(i).toString());
       }
   }
}