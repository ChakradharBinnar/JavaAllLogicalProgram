// ---> sum of even number 1 to 10

package Logical_Program;

public class JavaProgram_14 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of 1 to 100 number is : " + sum);
    }

}
