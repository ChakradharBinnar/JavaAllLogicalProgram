//Remove duplicate element in array by using hashset

package Logical_Program;

import java.util.HashSet;
import java.util.Set;

public class JavaProgram_33 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 6, 7, 8, 5, 9 };

        Set<Integer> s1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s1.add(arr[i]);
        }
        System.out.println(s1);
    }

}
