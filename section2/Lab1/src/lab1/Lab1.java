/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author kmhasan
 */
public class Lab1 {

    public static void task1() {
        // find the average of an array of numbers
        int numbers[] = {13, 4, 5, 2, 3, 1, 3};
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        
        double average = (double) sum / numbers.length;
        
        System.out.printf("Average: %.3f\n", average);
    }
    
    public static void task2() {
        // find the minimum of an array of numbers
        int numbers[] = {13, 4, 5, 2, 3, 1, 3};
        
        int min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        
        System.out.printf("Minimum: %d\n", min);
    }
    
    public static void task3() {
        // find the minimum of an array of numbers
        int numbers[] = {13, 4, 5, 2, 3, 1, 3};
        
        int max = 0;
        
        // ADD YOUR CODE HERE
        
        System.out.printf("Maximum: %d\n", max);
    }
    
    // Homework
    public static void task4() {
        // find out the standard deviation of the following
        // array of numbers
        // Reference: https://en.wikipedia.org/wiki/Standard_deviation
        // Hint: to find out square root of 5, we type Math.sqrt(5)
        int numbers[] = {13, 4, 5, 2, 3, 1, 3};
        
        double stddev = 0.0;
        
        // ADD YOUR CODE HERE
        
        System.out.printf("Standard deviation: %.2f\n", stddev);
    }
    
    public static void task5() {
        // find the geometric mean of a list of numbers
        int numbers[] = {13, 4, 5, 2, 3, 1, 3};
        
        double geommean = 0.0;
        double product = 1;
        for (int i = 0; i < numbers.length; i++)
            product = product * numbers[i];
        
        geommean = Math.pow(product, (double) 1 / numbers.length);
        // ADD YOUR CODE HERE
        // Hint: use Math.pow(x, y) to compute x^y
        System.out.printf("Geometric mean: %.2f\n", geommean);

    }

    public static void task6() {
        // find the maximum distance between a pair of numbers
        int numbers[] = {13, 4, 5, 2, 3, 1, 3};
        
        int largestDistance = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        largestDistance = max - min;
        // ADD YOUR CODE HERE
        // Hint: find max and min and then subtract
        System.out.printf("Largest distance: %d\n", largestDistance);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
    }
    
}
