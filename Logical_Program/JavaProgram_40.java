// Count the even and odd number in given digit 

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_40 {
    public static void main(String[] args) {
        int evenNum = 0;
        int oddNum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        int num1 = num;

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evenNum += 1;
            } else {
                oddNum += 1;
            }
            num = num / 10;
        }
        System.out.println("Your number is : " + num1);
        System.out.println("Total even digits in this number is " + evenNum);
        System.out.println("Total odd digits in this number is " + oddNum);
        sc.close();

    }

}
