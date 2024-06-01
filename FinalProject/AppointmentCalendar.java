package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class AppointmentCalendar {
   private List<Appointments> appointmentList;

   public AppointmentCalendar() {
       appointmentList = new ArrayList<>();
   }

   private boolean hasAppointment(Appointments app) {
       for (Appointments appointment : appointmentList) {
           if (appointment.equals(app)) {
               return true;
           }
       }

       return false;
   }

   public boolean addAppointment(Appointments app) {
       if (hasAppointment(app)) {
           return false;
       }

       appointmentList.add(app);
       return true;
   }

   public void cancelAppointment(Appointments app) {
       for (int i = 0; i < appointmentList.size(); i ++) {
           if (app.equals(appointmentList.get(i))) {
               appointmentList.remove(i);
               return;
           }
       }
   }

   public List<Appointments> findAppointmentOnDate(String date) {
       List<Appointments> appsOnDate = new ArrayList<>();

       for (Appointments app : appointmentList) {
           if (app.isOnDate(date)) {
               appsOnDate.add(app);
           }
       }

       return appsOnDate;
   }
}