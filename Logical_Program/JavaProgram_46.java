// Find the missing element in array

package Logical_Program;

public class JavaProgram_46 {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 6 };
        int withMissing = 0;
        int withoutMissing = 0;

        for (int i = 1; i <= arr.length + 1; i++) {
            withoutMissing = withoutMissing + i;
        }
        for (int i : arr) {
            withMissing = withMissing + i;
        }
        System.out.println("The Missing element is : " + (withoutMissing - withMissing));
    }

}
