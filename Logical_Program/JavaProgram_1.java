// ---> Tacking 2 numbers from user and print their sum

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter your Second Number : ");
        int secondNum = sc.nextInt();
        System.out.println("Addition of the two number is : " + (firstNum + secondNum));
        sc.close();
    }
}