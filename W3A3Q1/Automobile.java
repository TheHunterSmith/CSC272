package W3A3Q1;

public class Automobile extends Vehicle {
    private Engine engine;
    private Tires[] tires = new Tires[4];

    public Automobile(int wheelCount, Engine engine, Tires tire) {
        super(wheelCount);
        this.engine = engine;
        for (int i = 0; i < 4; i++) {
            this.tires[i] = tire;
        }
    }

    public void printCharacteristics() {
        System.out.println("Wheel Count: " + getWheelCount());
        System.out.println("Cylinder Count: " + engine.getCylinderCount());
        System.out.println("Tire Size: " + tires[0].getSize());
    }
}