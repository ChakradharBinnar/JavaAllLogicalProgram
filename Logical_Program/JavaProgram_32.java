//Factorial of number

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur number : ");
        int num = sc.nextInt();

        int facto = 1;

        for (int i = 1; i <= num; i++) {
            facto = i * facto;
        }
        System.out.println("Factorial of " + num + " is " + facto);
        sc.close();
    }

}
