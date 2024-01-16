// ---> determine given character is vovels or consonent 

package Logical_Program;

import java.util.Scanner;

public class JavaProgram_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your character");
        char c = sc.next().charAt(0);
        char c1 = Character.toLowerCase(c);
        if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
            System.out.println("Your char is Vovels : " + c);
        } else {
            System.out.println("Your char is Consonent : " + c);
        }
        sc.close();
    }

}
