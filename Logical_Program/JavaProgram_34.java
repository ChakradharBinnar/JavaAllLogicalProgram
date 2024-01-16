//Sort the array

package Logical_Program;

import java.util.Set;
import java.util.TreeSet;

public class JavaProgram_34 {

    public static void main(String[] args) {

        int[] arr = { 4, 2, 3, 1, 8, 6, 7, 9, 5, 2 };

        Set<Integer> s1 = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            s1.add(arr[i]);
        }
        System.out.println(s1);
    }
}
