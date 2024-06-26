package CSC300W4A4;

import java.util.ArrayList;
import java.util.Scanner;

class item {
    private String name;
    private int price;

    public item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
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
        Scanner theirChoice = new Scanner(System.in);

        System.out.println("\nPlease select an Item " + "\n");

        items.add(new item("Snickers", 2));
        items.add(new item("Poptarts", 3));
        items.add(new item("Chips", 3));
        items.add(new item("Skittles", 2));

        for (item item : items) {
            System.out.println(item);
        }

        String choice = theirChoice.nextLine();

        if (choice == "Snickers"){
            System.out.println("\nPlease insert $2 in coins or swipe credir card.\n");
        }

    }
}