package W4A4Q1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Country {
    private String name;
    private double area;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return name + " - " + area + " square miles";
    }
}

public class CountrySorter {
    public static void main(String[] args) {
        
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country("Kazakhstan", 1052089));
        countries.add(new Country("Canada", 3855101));
        countries.add(new Country("DR of Congo", 905354));
        countries.add(new Country("United States", 3618783));
        countries.add(new Country("Brazil", 3287955));
        countries.add(new Country("China", 3747877));
        countries.add(new Country("Greenland", 836330));
        countries.add(new Country("Australia", 2969906));
        countries.add(new Country("India", 1269345));
        countries.add(new Country("Russia", 6601665));
        countries.add(new Country("Argentina", 1073518));
        countries.add(new Country("Algeria", 919595));
     
        System.out.println("Countries before sorting: \n");
        for (Country country : countries) {
            System.out.println(country);
        }

     
      Collections.sort(countries, Comparator.comparingDouble(Country::getArea).reversed());

    
        System.out.println("Countries after sorting:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}