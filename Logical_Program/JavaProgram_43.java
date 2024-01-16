// Generating the random number

package Logical_Program;

public class JavaProgram_43 {
    public static void main(String[] args) {

        int max = 100;
        int min = 50;
        int a = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(a);
    }
}
