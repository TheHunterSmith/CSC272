package CSC300W2A2;

public class Person {
    private String name;

    public Person(String n) {
        name = n;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
