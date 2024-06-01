package FinalProject;

/**
 * This class represents the entry point of the Appointment System.
 */
public class AppointmentSystem
{
    /**
     * The main method creates an instance of the AppointmentMenu class and runs its menu.
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args)
    {
        // Create an instance of AppointmentMenu class to manage the menu functionality.
        AppointmentMenu menu = new AppointmentMenu();
        
        // Run the appointment management system by executing the menu.
        menu.run();
    }
}
