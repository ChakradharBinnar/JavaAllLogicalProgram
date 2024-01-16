// ---> swaping 2 numbers without using third variable

package Logical_Program;

public class JavaProgram_17 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swaping >>> ");
        System.out.print("a =" + a);
        System.out.println("    b =" + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping >>> ");
        System.out.print("a =" + a);
        System.out.print("  b =" + b);
    }
}
