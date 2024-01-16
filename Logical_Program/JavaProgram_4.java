// ---> Check weather the year is leap or not.

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int yr = sc.nextInt();
        if (((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0)) {
            System.out.println("Your Year is Leap Year : " + yr);
        } else {
            System.out.println("Not Leap Year : " + yr);
        }
        sc.close();
    }

}
