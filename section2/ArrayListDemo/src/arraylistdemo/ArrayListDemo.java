/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // in C
        int intArray[10];
        int *intArray = (int*) malloc(sizeof(int) * 10);
        
        // in C++
        int intArray[10];
        int *intArray = new int[10];
        */
        // in Java
        int intArray[] = new int[10];
        intArray[0] = 10;
        intArray[2] = 50;
        intArray[1] = intArray[0] + intArray[2];
        for (int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);
        
        double doubleArray[] = {4.5, 1, 45.33, 2};
        for (int i = 0; i < doubleArray.length; i++)
            System.out.println(doubleArray[i]);
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cranberry");
        list.remove(1);
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        String maxLengthString = getMaxLengthString(list);
        System.out.println("Max " + maxLengthString);
    }
    
    public static String getMaxLengthString(ArrayList<String> list) {
        int maxLength = 0;
        String bestString = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                bestString = list.get(i);
            }
        }
            
        return bestString;
    }
    
}
