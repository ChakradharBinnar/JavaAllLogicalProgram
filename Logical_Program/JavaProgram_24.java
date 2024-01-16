//Febbonaci series

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_24 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            if (num == c) {
                System.exit(0);
            }

        }
        sc.close();
    }
}
