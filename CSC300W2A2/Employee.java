package CSC300W2A2;

public class Employee {
    private int id;
    private Project project;

    public Employee(String name, char code, int i, Project proj) {
        id = i;
        project = proj;
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Project: " + project);
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee ID: " + id + ", Project: " + project;
    }
}
