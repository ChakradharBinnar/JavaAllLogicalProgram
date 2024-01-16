// ---> Print the multiplication number of the given input number.

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
        sc.close();

    }

}
