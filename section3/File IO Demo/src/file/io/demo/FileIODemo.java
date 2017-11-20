/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.io.demo;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kmhasan
 */
public class FileIODemo {
    // Lab task:
    // Read from two files input1.txt and input2.txt
    // Check if the content of both the files are
    // the same or not
    public boolean isIdentical(String filename1, String filename2) {
        // ADD YOUR CODE HERE
        // Hint: you can read one file at a time
        // store the contents (strings) of the files
        // in separate ArrayLists
        ArrayList<String> stringList1 = new ArrayList<>();
        ArrayList<String> stringList2 = new ArrayList<>();
        
        String line;
        try {
            RandomAccessFile input1
                    = new RandomAccessFile(filename1, "r");

            while ((line = input1.readLine()) != null) {
                stringList1.add(line);
            }
            
            RandomAccessFile input2
                    = new RandomAccessFile(filename2, "r");

            while ((line = input2.readLine()) != null) {
                stringList2.add(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Cannot find the input file!");
        } catch (IOException ioe) {
            System.err.println("Some IO exception occured!");
        }
        
        System.out.println(stringList1);
        System.out.println(stringList2);
        
        if (stringList1.size() != stringList2.size())
            return false;
        
        for (int i = 0; i < stringList1.size(); i++)
            if (!stringList1.get(i).equals(stringList2.get(i)))
                return false;
        return true;
    }
    
    public void readFromFile() {

        try {
            RandomAccessFile input
                    = new RandomAccessFile("input.txt", "r");
            String line;

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Cannot find input.txt file!");
        } catch (IOException ioe) {
            System.err.println("Some IO exception occured!");
        }
    }
    
    public FileIODemo() {
        //readFromFile();
        boolean same = isIdentical("input1.txt", "input2.txt");
        System.out.println(same);
        //writeToFile();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new FileIODemo();
    }
    
}
