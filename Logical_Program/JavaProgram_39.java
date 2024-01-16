//Count the sum of digit in given number

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();
        int num1 = num;

        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("The sum of the digit " + num1 + " is : " + sum);
        sc.close();
    }

}
