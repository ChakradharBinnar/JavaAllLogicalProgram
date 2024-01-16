// Compair two array is equal or not without using inbuilt function

package Logical_Program;

public class JavaProgram_45 {
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 1, 2, 3, 4 };

        boolean comparisonStatus = true;

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    comparisonStatus = false;
                }
            }
            if (comparisonStatus == true) {
                System.out.println("Given array is equal");
            } else {
                System.out.println("Given array is not equal");
            }

        } else {
            System.out.println("Given array is not equal");
        }

    }
}
