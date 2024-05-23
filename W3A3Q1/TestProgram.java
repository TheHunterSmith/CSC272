package W3A3Q1;

public class TestProgram {
    public static void main(String[] args) {
        Engine engine = new Engine(6);
        Tires tire = new Tires("285-75-R16");
        Automobile automobile = new Automobile(4, engine, tire);
        automobile.printCharacteristics();
    }
}