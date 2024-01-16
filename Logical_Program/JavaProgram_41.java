// Find the sum of all element in array

package Logical_Program;

public class JavaProgram_41 {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 7 };
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("The sum of the all array element is " + sum);
    }

}
