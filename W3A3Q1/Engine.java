package W3A3Q1;

public class Engine {
    private int cylinderCount;

    public Engine(int cylinderCount) {
        if (cylinderCount == 4 || cylinderCount == 6 || cylinderCount == 8) {
            this.cylinderCount = cylinderCount;
        } else {
            throw new IllegalArgumentException("Invalid cylinder count. Must be 4, 6, or 8.");
        }
    }

    public int getCylinderCount() {
        return cylinderCount;
    }
}