package W1A1Q2;

public class person {
    String name;
   int year;

   person(String n, int y){
       this.name = n;
       this.year = y;
   }

   @Override
   public String toString(){
       return "Person Name: " + name + "\nPerson Birth Year: " + year;
   }
}
