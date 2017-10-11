/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.Scanner;

/**
 *
 * @author kmhasan
 */
public class HelloWorld {

    public static void add() {
        int x;
        int y;
        System.out.printf("Enter two numbers\n");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        int result = x + y;
        System.out.printf("Result = %d\n", result);
    }

    public static void printInLoop() {
        int x;
        int y;
        int i;
        System.out.printf("Enter two numbers\n");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        for (i = x; i <= y; i++) {
            System.out.printf("%d\n", i);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //    add();
        printInLoop();
    }

}
