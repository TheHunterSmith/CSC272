package CSC300W4A4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class item {
    private String name;
    private double price;

    public item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " Dollars.";
    }
}



public class vendingMachine {
    public static void main(String[] args) {

        ArrayList<item> items = new ArrayList<>();

        System.out.println("\nSelect an Item " + "\n");

        items.add(new item("Snickers", 2));
        items.add(new item("Poptarts", 1));
        items.add(new item("Chips", 2));
        items.add(new item("Skittles", 2));

        for (item item : items) {
            System.out.println(item);
        }

        System.out.println("\n");

    }
}
