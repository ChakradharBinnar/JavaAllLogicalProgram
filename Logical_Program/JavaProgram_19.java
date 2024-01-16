// ---> sum of all digits in given number

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number minimum 3 digits are required : ");
        int num = sc.nextInt();
        int sum = 0;
        if (num > 99) {

            while (num > 0) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
        } else {
            System.out.println("Opps ! Your number is not 3 digit number");
        }
        System.out.println("The sum of all digit is >>> " + sum);

        sc.close();
    }
}
