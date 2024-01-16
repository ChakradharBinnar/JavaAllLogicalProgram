//palidrome number

package Logical_Program;

public class JavaProgram_29 {
    public static void main(String[] args) {

        int num = 1234;
        int num1 = num;
        int rev = 0;
        int temp = 0;

        for (; num > 0;) {

            rev = num % 10;
            temp = temp * 10 + rev;
            num = num / 10;
        }
        System.out.println(temp);

        if (num1 == temp) {
            System.out.println(num1 + " Number is palidrome");
        } else {
            System.out.println(num1 + " is Not Palidrome");
        }
    }

}
