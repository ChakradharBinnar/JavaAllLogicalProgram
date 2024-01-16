// --> Print the number of letter digit spaces and other things

package Logical_Program;

public class JavaProgram_23 {

    public static void main(String[] args) {

        int letter = 0;
        int digit = 0;
        int space = 0;
        int other = 0;

        String s = "chakradhar Binnar cb20";

        char[] c = s.toCharArray();
        for (Character ch : c) {

            if (ch.isLetter(ch)) {
                letter += 1;
            } else if (ch.isDigit(ch)) {
                digit += 1;
            } else if (ch.isWhitespace(ch)) {
                space += 1;
            } else {
                other += 1;
            }
        }
        System.out.println("Space is : " + space);
        System.out.println("Letter is : " + letter);
        System.out.println("digit is : " + digit);
        System.out.println("other is : " + other);
    }
}
