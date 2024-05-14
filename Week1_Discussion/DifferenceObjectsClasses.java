//vehicle would be the class here
class vehicle {
    //I am creating String objects within the class and defining what those objects are.
    private String _price;
    private String _brand;
    private String _car;
    vehicle(String t, String b, String p) {

    _price = p;
    _car = t;
    _brand = b;
    }
    String price() {
        return _price;
    }
    String brand() {
        return _brand;
    }
    String car() {
        return _car;
    }
}
public class DifferenceObjectsClasses {
    public static void main(String[] args) {
        vehicle toyota = new vehicle("SUV", "Toyota", "too much." );
        System.out.println("A forerunner is a " + toyota.car() + " that is made by " + toyota.brand() + " that costs " + toyota.price());
    }
}