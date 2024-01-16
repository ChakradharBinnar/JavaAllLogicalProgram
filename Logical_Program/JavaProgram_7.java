// ---> Area of the circle

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Redius : ");
        int r = sc.nextInt();
        System.out.println(Math.PI * r * r);
        sc.close();
    }

}
