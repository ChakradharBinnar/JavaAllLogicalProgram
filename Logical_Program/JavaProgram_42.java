// Print even and odd number in given array

package Logical_Program;

public class JavaProgram_42 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Below are even number : ");

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
        System.out.println("Below are odd number : ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + "  ");
            }
        }
    }

}
