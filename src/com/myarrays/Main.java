/**
 *  Java program to demonstrate dynamic array of objects.
 */

package com.myarrays;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an ArrayList of String type.
        List<String> list = new ArrayList<>();

        // Adding elements to the list.
        list.add("Stuttgart");
        list.add("Frankfurt am Main");
        list.add("Dresden");
        list.add("Berlin");
        list.add("Ludwigsburg");
        list.add("Tamm");

        // Printing the elements of the list to console.
        System.out.println("List: " + list.toString());

        // Creating an array from the list.
        String[] array = list.toArray(new String[0]);

        // Printing the array to console.
        for (String el : array) {
            System.out.print(" - " + el + " - ");
        }

        // Next line.
        System.out.println();

        // Checking amount of elements in the list.
       int amount = list.size();

        // Printing amount to console.
        System.out.println("Number of elements in the list is " + amount);

        // Checking amount of elements in the array.
        int sizeOfArray = array.length;

        // Printing sizeOfArray to console.
        System.out.println("Number of elements in the array is " + sizeOfArray);

        // Deleting element number 4 from the list.
        list.remove(4);

        // Printing the elements of the list to console.
        System.out.println("List: " + list.toString());

        // Checking amount of elements in the list.
        amount = list.size();

        // Printing amount to console.
        System.out.println("Number of elements in the list is " + amount);

    }
}