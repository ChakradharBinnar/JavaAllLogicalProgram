//Palidrome String

package Logical_Program;

public class JavaProgram_27 {
    public static void main(String[] args) {
        String name = "nayann";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        if (rev.equals(name)) {
            System.out.println(name + " String is palidrome");
        } else {
            System.out.println("String is not palidrome");
        }
    }
}
