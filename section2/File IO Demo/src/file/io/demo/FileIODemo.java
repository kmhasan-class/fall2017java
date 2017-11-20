/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.io.demo;

import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author kmhasan
 */
public class FileIODemo {

    public void writeToFile() {
        try {
            RandomAccessFile output 
                    = new RandomAccessFile("output.txt", "rw");
            output.writeBytes("Hi!");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot find the output.txt file!");
        } catch (IOException ioe) {
            System.out.println("Some exceptional thing happened!");
        }
    }
    
    public FileIODemo() {
        writeToFile();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new FileIODemo();
    }
    
}
