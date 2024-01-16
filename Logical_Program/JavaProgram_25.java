// Reverse String Program

package Logical_Program;

public class JavaProgram_25 {

    public static void main(String[] args) {

        String name = "chikku";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }

}
