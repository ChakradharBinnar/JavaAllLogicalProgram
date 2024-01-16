//---> check weather the given input number is even or odd

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your number is Even -> " + num);
        } else {
            System.out.println("Your number is odd -> " + num);
        }
        sc.close();
    }

}
