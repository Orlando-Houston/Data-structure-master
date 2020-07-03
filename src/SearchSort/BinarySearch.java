package SearchSort;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        // - Binary Search
        int[] binary={12,1,19,2,3,5,6,6,7,8};
        Arrays.sort(binary); //I sorted data {1,2,3,5,6,7,8,19}
        int index = Arrays.binarySearch(binary,5); //  I am looking for 5 in binary array.
        System.out.println(Arrays.toString(binary));
        System.out.println(" :" + index);
    }
}
