// ---> print duplicate character along with time in string

package Logical_Program;

import java.util.HashMap;
import java.util.Map;

public class JavaProgram_22 {

    public static void main(String[] args) {

        String s = "chiikuuuu";

        Map<Character, Integer> m = new HashMap<>();
        char[] ch = s.toCharArray();

        for (Character c : ch) {

            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }

        for (Character c : m.keySet()) {
            if (m.get(c) > 1) {
                System.out.println("Repeated value of " + c + " for the " + m.get(c) + " times");
            }
        }

    }

}
