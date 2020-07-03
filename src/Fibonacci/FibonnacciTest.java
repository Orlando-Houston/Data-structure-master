package Fibonacci;

import java.util.Scanner;

public class FibonnacciTest {
    final static int first_num = 0;
    final static int second_num = 1;
    // driver method
    public static void main(String[] args){
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter the number of elements in the series
        // to be displayed
        System.out.println("Enter the total numbers in Fibonacci" +
                " series to be displayed");
        int num = sc.nextInt();
        // display the first two numbers in series
        System.out.print(first_num + " " + second_num);
        // if the number of elements in the series is greater than 2
        // then recursively call the class function fibonacciSeries
        // and display the series
        if (num > 2){
            Fibonnacci.fibonacciSeries(num-2);
        }
        System.out.println();
    }
}

