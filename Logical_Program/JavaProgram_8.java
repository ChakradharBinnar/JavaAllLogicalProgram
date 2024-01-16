// ---> Quotitent and reminder

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        float f1 = sc.nextFloat();
        System.out.println("Enter your divisor number : ");
        float f2 = sc.nextFloat();

        System.out.println("Quotitent is : " + (f1 / f2));
        System.out.println("Reminder is : " + (f1 % f2));
        sc.close();

    }

}
