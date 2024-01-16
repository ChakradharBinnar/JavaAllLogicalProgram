// ---> swap 2 number using third variable

package Logical_Program;

public class JavaProgram_16 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;
        System.out.println("Before swap >>>");
        System.out.println("a=" + a + " & " + "b=" + b);
        System.out.println("After swap >>>");

        temp = a;
        a = b;
        b = temp;

        System.out.println("a=" + a + " & " + "b=" + b);

    }

}
