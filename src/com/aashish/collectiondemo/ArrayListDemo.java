package com.aashish.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println("------ ARRAYLIST DEMO ------");
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println("ORIGINAL LIST: " + list);

        // Get element
        int element = list.get(0);
        System.out.println("ELEMENT AT INDEX 0 IS: " + element);

        // Add element in between
        list.add(3, 3);
        System.out.println("LIST AFTER INSERTING 3 AT POSITION 4 IS: " + list);

        // Set element
        list.set(0, 5);
        System.out.println("LIST AFTER UPDATING 1ST ELEMENT TO 5 IS: " + list);

        // Remove element
        list.remove(0);
        System.out.println("LIST AFTER REMOVING 1ST ELEMENT IS: " + list);

        // List size
        System.out.println("SIZE IS: " + list.size());

        // Loop - for
        System.out.println("DISPLAYING LIST USING FOR LOOP:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Loop - foreach
        System.out.println("DISPLAYING LIST USING FOR-EACH LOOP:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Check if list contains a value
        System.out.println("DOES LIST CONTAIN 2? " + list.contains(2));

        // Sort the list
        Collections.sort(list);
        System.out.println("LIST AFTER SORTING: " + list);

        // Clear the list
        list.clear();
        System.out.println("LIST AFTER CLEARING: " + list);

        // Check if list is empty
        System.out.println("IS LIST EMPTY? " + list.isEmpty());

        // HashSet demo
        System.out.println("\n------ HASHSET DEMO ------");
        HashSetDemo.runHashSetDemo();
    }
}
