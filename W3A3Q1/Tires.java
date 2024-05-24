package W3A3Q1;

public class Tires {
    private String tireSize;

    public Tires(String tireSize) {
        if (tireSize.equals("265-75-R16") || tireSize.equals("285-75-R16")) {
            this.tireSize = tireSize;
        } else {
            throw new IllegalArgumentException("Invalid tire size it must be either 265-75-R16 or 285-75-R16.");
        }
    }

    public String getSize() {
        return tireSize;
    }
}