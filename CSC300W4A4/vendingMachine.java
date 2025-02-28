package CSC300W4A4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Created a class for items, with a name and price
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

//Main
public class vendingMachine {
    public static void main(String[] args) {

        //Creating an Array with the item class
        ArrayList<item> items = new ArrayList<>();

        System.out.println("\nPlease select an Item " + "\n");

        items.add(new item("Snickers", 2));
        items.add(new item("Poptarts", 2));
        items.add(new item("Chips", 2));
        items.add(new item("Skittles", 2));

        //print out the items created
        for (item item : items) {
            System.out.println(item);
        }
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        String scanner = sc.nextLine();

        //while statement for if Skittles are selected, returns to the top of the IF statement
while (true){

        if (scanner.equals("Snickers")){
            System.out.println("\nIf you would like to insert $2 in coins type 'Coins', to swipe your credit card type 'Card', or to cancel the transaction type 'Cancel'\n");
            break;
        }
        else if (scanner.equals("Poptarts")){
            System.out.println("\nIf you would like to insert $2 in coins type 'Coins', to swipe your credit card type 'Card', or to cancel the transaction type 'Cancel'\n");
            break;
        }
        else if (scanner.equals("Chips")){
            System.out.println("\nIf you would like to insert $2 in coins type 'Coins', to swipe your credit card type 'Card', or to cancel the transaction type 'Cancel'\n");
            break;
        }
        else if (scanner.equals("Skittles")){
            System.out.println("\nError, Skittles are Sold Out, Please Choose a Different Item.\n");

            //If Skittles are selected, reprint the options 
            for (item item : items) {
                System.out.println(item);
            }

            System.out.println("\n");
            scanner = sc.nextLine();
        }
            }
        
        //When an item is selected, give options of Coins, Card, or Cancel    
        Scanner sca = new Scanner(System.in);
        String choice = sca.nextLine();

        if (choice.equals("Coins")){
            System.out.println("How many dollars worth of coins did you insert?\n");

            Scanner Sc = new Scanner(System.in);
            int Choice = Sc.nextInt();
    
            if (Choice < 2){
                System.out.println("Insufficient Coins, Please Start Again.\n");
            }
            else if (Choice == 2);{
                System.out.println("Your Item is Dispensing, Have a Great Day!\n");
            }
            if (Choice > 2){
                System.out.println("Your Item and Change are Dispensing, Have a Great Day!\n");
                return;
            }
        }
        else if (choice.equals("Card")){
            System.out.println("Processing Credit Card, please wait..\n");
            //Added a 2 second delay to Process the Credit Card
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Transaction Approved, Your Item is Dispensing, Have a Great Day!\n");
        }
        else if (choice.equals("Cancel")){
            System.out.println("Canceling Transaction, Have a Great Day!\n");
            return;
        }
    }
}