// ---> Perimeter of the Rectangle( p = 2(L+W))

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int length1 = sc.nextInt();
        System.out.print("Enter width : ");
        int width1 = sc.nextInt();

        System.out.println("Perimeter of rectangel is : " + (2 * (length1 + width1)));
        sc.close();
    }

}