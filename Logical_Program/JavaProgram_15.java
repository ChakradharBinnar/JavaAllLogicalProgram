// ---> Area of rectangle (Formula : Area=L*W)

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your length : ");
        int length = sc.nextInt();
        System.out.print("Enter your Width : ");
        int Width = sc.nextInt();

        int area = length * Width;

        System.out.println("Area of Rectangel is : " + area);
        sc.close();

    }

}
