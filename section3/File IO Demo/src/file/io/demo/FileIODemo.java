/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.io.demo;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;
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
