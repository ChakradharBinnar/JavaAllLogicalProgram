// Max and Min element in array

package Logical_Program;

public class JavaProgram_47 {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 3, 8, 1, 5, 9 };
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Max element in array is : " + max);
        System.out.println("Min element in array : " + min);
    }
}
