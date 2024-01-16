//Palidrome number

package Logical_Program;

public class JavaProgram_28 {
    public static void main(String[] args) {

        int num = 12321;
        String num1 = Integer.toString(num);
        String rev = "";

        for (int i = num1.length() - 1; i >= 0; i--) {
            rev = rev + num1.charAt(i);
        }

        int num2 = Integer.parseInt(rev);
        System.out.println(num2);
        if (num == num2) {
            System.out.println("Number is Palidrome");
        } else {
            System.out.println("Number is not palidrome");
        }
    }

}
