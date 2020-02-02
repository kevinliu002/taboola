import java.util.HashMap;

public class IntegerString {

    public static int stringToInt(String string) {
        /** Question 1: This function converts a string to an integer
         *  without using the built-in parse function.
         *
         *  Input: String
         *  Output: Int
         *
         *  Complexity Analysis: O(n) time, O(1) space.
         */

        //Intiaize variables to hold length of string, index, and result.
        int stringLength = string.length();
        int index = 0;
        int result = 0;


        // Create a hashmap to store 0 to 9, mapping char to int.
        String integers = "0123456789";
        HashMap<Character, Integer> integerLookup = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            integerLookup.put(integers.charAt(i), i);
        }

        // Loop through string and add to result. Note that charAt is equivalent to array access.
        while (index < stringLength) {
            result = (result * 10) + integerLookup.get(string.charAt(index));
            index++;

        }

        //Special Case: If string contains negative symbol.
        if (string.charAt(0) == '-') {
            result = -1 * result;
        }
        return result;
    }


    //Main function.
    public static void main(String[] args) {
        System.out.println(stringToInt("-1239"));

    }

}
