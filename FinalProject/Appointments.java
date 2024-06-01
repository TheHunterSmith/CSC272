package FinalProject;

public class Appointments {

   private String description;
   private String date;
   private String startTime;
   private String endTime;

   public Appointments(String desc, String appointmentDate, String start, String end) {
       description = desc;
       date = appointmentDate;
       startTime = start;
       endTime = end;
   }

   public boolean isOnDate(String onDate) {
       return date.equals(onDate);
   }

   public boolean equals(Object obj) {
       if (obj instanceof Appointments) {

           Appointments app = (Appointments) obj;
           return (description.equals(app.description) && date.equals(app.date) && startTime.equals(app.startTime) && endTime
                   .equals(app.endTime));
       }

       return false;
   }

   @Override
   public String toString() {
       return (description + " " + date + " " + startTime + " " + endTime);
   }
}