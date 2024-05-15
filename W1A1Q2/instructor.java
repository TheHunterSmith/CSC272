package W1A1Q2;

public class instructor extends person {
    double salary;

    instructor(String _name, int _year, double _salary) {
        super(_name, _year);
        this.salary = _salary;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\nInstructor Salary: $" + String.format("%,.2f", salary);
    }
}
