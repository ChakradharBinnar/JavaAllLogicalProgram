// ---> Find the power of number

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        System.out.println("Enter power : ");
        int pow = sc.nextInt();

        int num1 = 1;

        for (int i = 0; i < pow; i++) {
            num1 = num1 * num;
        }
        System.out.println(num1);
        sc.close();
    }
}
