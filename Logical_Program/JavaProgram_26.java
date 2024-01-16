// Reverse String Program

package Logical_Program;

public class JavaProgram_26 {
    public static void main(String[] args) {
        String name = "chakradhar";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
    }
}