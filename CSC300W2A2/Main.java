package CSC300W2A2;

public class Main {
    public static void main(String[] args) {
        Project project = new Project('B');
        Employee employee = new Employee("Hunter", 'A', 6841, project);

        System.out.println("\nEmployee: " + employee + "\n");
    }
}
