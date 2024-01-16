// Search for given element in array

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_49 {
    public static void main(String[] args) {

        int arr[] = { 3, 5, 4, 2, 1, 7, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();

        boolean status = false;

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                status = true;
            }
        }
        if (status == true) {
            System.out.println("Element is avaible in array");
        } else {
            System.out.println("Element is not avaible in array");
        }
        sc.close();
    }

}
