package W1A1Q2;

public class student extends person {
    String major;

   student(String _name, int _year, String _major) {
       super(_name, _year);
       this.major = _major;
   }

   @Override
   public String toString() {
       return super.toString() + "\nStudent Major: " + major;
   }
}
