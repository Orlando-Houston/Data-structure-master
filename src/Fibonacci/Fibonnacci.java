package Fibonacci;

public class Fibonnacci {
    // class variable to store the first number in series
    static int first_num = 0;
    // class variable to store the second number in series
    static int second_num = 1;
    // class variable to store the third number in series
    static int third_num = 0;

    // method to print the Fibonacci series recursively
    static void fibonacciSeries(int count){
        // if the current count is greater than zero, then
        // calculate the third number as the
        // sum of first and second number
        // Then change the first number to the second number
        // and the second number to the third number
        if(count > 0){
            third_num = first_num + second_num;
            first_num = second_num;
            second_num = third_num;
            System.out.print(" " + third_num);
            fibonacciSeries(count-1);
        }
    }
}

