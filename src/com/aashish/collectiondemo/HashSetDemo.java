package com.aashish.collectiondemo;

import java.util.HashSet;

public class HashSetDemo {
    public static void runHashSetDemo() {
        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate, will be ignored

        System.out.println("ORIGINAL SET: " + set);

        // Check if set contains element
        System.out.println("DOES SET CONTAIN 20? " + set.contains(20));

        // Remove an element
        set.remove(10);
        System.out.println("SET AFTER REMOVING 10: " + set);

        // Size of set
        System.out.println("SIZE OF SET: " + set.size());

        // Iterate using for-each
        System.out.println("DISPLAYING SET USING FOR-EACH LOOP:");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clear the set
        set.clear();
        System.out.println("SET AFTER CLEARING: " + set);

        // Check if empty
        System.out.println("IS SET EMPTY? " + set.isEmpty());
    }
}
