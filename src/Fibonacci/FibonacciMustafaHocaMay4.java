package Fibonacci;

public class FibonacciMustafaHocaMay4 {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) {
            System.out.println(fib(i));
        }
    }
    public static long fib(int sequence){
        if(sequence <= 1){
            return 1;
        }
        else {
            return fib(sequence-2)+fib(sequence-1);
        }
    }
}
