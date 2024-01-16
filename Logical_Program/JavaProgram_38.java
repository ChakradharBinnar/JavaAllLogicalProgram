//Count the number of digit in given number

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();
        int num1 = num;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digit is " + num1 + " in this number is > " + count);
        sc.close();
    }
}
