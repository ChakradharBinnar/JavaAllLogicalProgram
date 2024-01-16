// ---> Find the avarage of 3 input number

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num : ");
        Float num1 = sc.nextFloat();

        System.out.println("Enter your second num : ");
        Float num2 = sc.nextFloat();

        System.out.println("Enter your third num : ");
        Float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;

        float avg = sum / 3;

        System.out.println("Avg of " + num1 + " , " + num2 + " , " + num3 + " is " + avg);
        sc.close();
    }
}