// ---> circumference or perimeter of the circle.

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your redius : ");
        Float red = sc.nextFloat();

        System.out.println("Primeter or circumference of circle is : " + (2 * Math.PI * red));
        sc.close();

    }

}
