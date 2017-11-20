/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.demo;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class ArrayListDemo {

    public ArrayListDemo() {
        /*
        //in C
        int x[5]; // static allocation
        int *x = (int*) malloc(5 * sizeof(int)); // dynamic allocation
        
        //in C++
        int x[5];
        int *x = new int[5];
         */
        //in Java
        int x[] = new int[5];
        x[0] = 1;
        x[3] = 5;
        x[4] = 9;

        System.out.println("Array output");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        System.out.println("Arraylist output");
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("Java");
        list.add(15);
        list.add(7);
        list.add(65.23);
        list.add(false);
        list.remove(1);
        list.add(1, 99);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i) + 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ArrayListDemo();
    }

}
