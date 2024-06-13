package CSC300W2A2;

public class Project {
    private char code;

    public Project(char c) {
        code = c;
    }

    public void display() {
        System.out.println("Project Code: " + code);
    }

    @Override
    public String toString() {
        return "Project Code: " + code;
    }
}
