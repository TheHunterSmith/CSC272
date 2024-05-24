package W3A3Q1;

public class Engine {
    private int cylinderAmnt;

    public Engine(int cylinderAmnt) {
        if (cylinderAmnt == 4 || cylinderAmnt == 6 || cylinderAmnt == 8) {
            this.cylinderAmnt = cylinderAmnt;
        } else {
            throw new IllegalArgumentException("Invalid cylinder count, it has to be either 4, 6, or 8.");
        }
    }

    public int getCylinderCount() {
        return cylinderAmnt;
    }
}