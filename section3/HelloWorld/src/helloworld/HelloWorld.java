/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author kmhasan
 */
public class HelloWorld {
    public static void addMultipleNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the value of n\n");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum = sum + num;
        }
        
        System.out.printf("Result = %d\n", sum);
    }

    public static void addTwoNumbers() {
        System.out.printf("Enter two numbers\n");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int result = num1 + num2;
        
        System.out.printf("Result = %04d\n", result);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //addTwoNumbers();
        addMultipleNumbers();
    }
    
}
