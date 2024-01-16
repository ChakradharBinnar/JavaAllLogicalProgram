//Armstrong Number

package Logical_Program;

public class JavaProgram_31 {
    public static void main(String[] args) {

        int num = 153;
        int num1 = num;
        int arm = 0;

        for (; num > 0;) {

            int deci = num % 10;
            arm = arm + (deci * deci * deci);
            num = num / 10;
        }
        if (num1 == arm) {
            System.out.println(num1 + " is armstrong");
        } else {
            System.out.println(num1 + " is not armstrong");
        }
    }
}
