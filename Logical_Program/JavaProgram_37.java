package Logical_Program;
//Find the duplicate element by using hashset

import java.util.HashSet;
import java.util.Set;

public class JavaProgram_37 {
    public static void main(String[] args) {

        int arr[] = { 3, 5, 6, 3, 7, 8, 6 };

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (s.add(arr[i]) == false) {
                System.out.println(arr[i] + " is duplicate element");
            }
        }
    }
}
