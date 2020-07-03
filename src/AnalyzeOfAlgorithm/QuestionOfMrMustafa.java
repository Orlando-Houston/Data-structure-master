package AnalyzeOfAlgorithm;

public class QuestionOfMrMustafa {
    public static void main(String[] args) {
        int a=12,  b=8, GCD;
        //int remainder ;

        while(b!=0){
            

           int remainder=a%b;
            a=b;
            b=remainder;


        }
        //System.out.println (remainder);
        System.out.println (b);
        System.out.println (a);
    }
}



