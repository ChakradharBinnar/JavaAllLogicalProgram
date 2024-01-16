//Delete duplicates from sorted array using index

package Logical_Program;

public class JavaProgram_35 {

    public static void main(String[] args) {

        int[] arr1 = { 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 9 };
        int j = 0;

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] != arr1[i + 1]) {
                arr1[j] = arr1[i];
                j++;
            }
        }
        arr1[j] = arr1[arr1.length - 1];
        for (int k = 0; k <= j; k++) {
            System.out.print(arr1[k] + " ");
        }
    }

}
