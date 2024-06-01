package FinalExamQ41;

import java.util.*;

public class FinalExam {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom", "Dick", "Harry", "Romeo", "Juliet", "William", "Sarah", "Dixon", "Robert", "Tomaz"));

        System.out.println("Before we sort the list of names: " + names + "\n");

        names.sort(Comparator.comparingInt(String::length));

        System.out.println("After we sort the list of names: " + names + "\n");
    }
}
