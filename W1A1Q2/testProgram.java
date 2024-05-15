package W1A1Q2;

public class testProgram {
    public static void main(String[] args) {
        person p = new person("John Smith", 1967);
        student s = new student("Hunter Smith", 1997, "Computer Science");
        instructor i = new instructor("Richard Yonts", 1988, 125000.00);
 
        System.out.println(p);
        System.out.println();
        System.out.println(s);
        System.out.println();
        System.out.println(i);
    }
}
