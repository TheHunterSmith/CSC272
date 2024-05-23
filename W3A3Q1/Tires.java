package W3A3Q1;

public class Tires {
    private String size;

    public Tires(String size) {
        if (size.equals("265-75-R16") || size.equals("285-75-R16")) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("Invalid tire size. Must be 265-75-R16 or 285-75-R16.");
        }
    }

    public String getSize() {
        return size;
    }
}