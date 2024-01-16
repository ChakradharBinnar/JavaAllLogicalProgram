// Compair two array is equal or not 

package Logical_Program;

import java.util.Arrays;

public class JavaProgram_44 {
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 1, 2, 3, 4 };

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Given array is equal");
        } else {
            System.out.println("Given array is not equal");
        }
    }
}
