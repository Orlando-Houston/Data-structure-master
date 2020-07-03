package SearchSort;

public class SynpLinearSearch {
    public static void main(String[] args) {
        int[] liste={1,2,43,65,76,87,9,4,34};

        int aranilanSayi=76;

        for(int i=0; i<liste.length;i++){

            if(aranilanSayi==liste[i]){
                System.out.println("Aradığınız sayını index'i:"+i+ "\nAradığınız sayı:"+liste[i]);
            }
        }

    }
}
