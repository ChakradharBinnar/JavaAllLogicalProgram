package Logical_Program;
//Find the duplicate element in array using index

public class JavaProgram_36 {
    public static void main(String[] args) {

        int arr1[] = { 5, 3, 4, 6, 5, 7, 3 };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println(arr1[i] + " is the duplicate element");
                }
            }
        }

    }

}
