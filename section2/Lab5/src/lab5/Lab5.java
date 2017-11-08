/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kmhasan
 */
public class Lab5 {
   
    public double average(ArrayList<Integer> integerList) {
        // ADD YOUR CODE HERE
        // method is supposed to compute the arithmetic mean
        // of all the numbers in the list
        double sum = 0;
        for (int i = 0; i < integerList.size(); i++)
            sum = sum + integerList.get(i);
        double avg = sum / integerList.size();
        return avg;
    }

    public double standardDeviation(ArrayList<Integer> integerList) {
        // ADD YOUR CODE HERE
        // method is supposed to compute the standard deviation
        // of all the numbers in the list
        return 0.0;
    }
    
    public int maxDistance(ArrayList<Integer> integerList) {
        // ADD YOUR CODE HERE
        // method is supposed to find the maximum distance
        // between any pair of numbers
        // Example [6, 3, 2, 9, 4] -> 7
        return 0;
    }
    
    public int countIntegers(ArrayList<String> stringList) {
        // ADD YOUR CODE HERE
        // method is supposed to count how many strings
        // are actually integers
        // Hint: use charAt method on the string to
        // check if all the characters are digits
        // String s = "124ab";
        // s.charAt(0) >= '0' && s.charAt(0) <= '9'
        int count = 0;
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            boolean isInteger = true;
            for (int j = 0; j < s.length() && isInteger; j++) {
//                if (s.charAt(j) < '0' || s.charAt(j) > '9')
//                    isInteger = false;
                
                if (!Character.isDigit(s.charAt(j)))
                    isInteger = false;
            }
            if (isInteger)
                count++;
        }
        return count;
    }
    
    public ArrayList<String> reverseList(ArrayList<String> stringList) {
        // ADD YOUR CODE HERE
        // method is supposed to create a new list
        // with all the elements kept in reverse order
        // Hint: ["A", "B", "D", "C"]
        // ["C", "D", "B", "A"]
        return null;
    }
    
    
    public Lab5() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("125.01");
        stringList.add("Cranberry");
        stringList.add("33");
        stringList.add("33a55");
        System.out.println(stringList);
        System.out.println(reverseList(stringList));
        System.out.println("# of integers: " + countIntegers(stringList));
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(30);
        intList.add(32);
        intList.add(31);
        intList.add(36);
        System.out.println("Average: " + average(intList));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Lab5();
    }
    
}
