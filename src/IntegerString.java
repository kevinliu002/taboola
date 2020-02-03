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

        //Intiaize variables to hold index, isNegative flag, and result.
        int index = 0;
        int result = 0;
        boolean isNegative = false;


        // Create a hashmap to store 0 to 9, mapping char to int.
        String integers = "0123456789";
        HashMap<Character, Integer> integerLookup = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            integerLookup.put(integers.charAt(i), i);
        }

        //Special Case: If string contains negative symbol.
        if (string.charAt(0) == '-') {
            isNegative = true;
            index = 1;
        }

        // Loop through string and add to result. Note that charAt is equivalent to array access.
        while (index < string.length()) {
            try {
                result = (result * 10) + integerLookup.get(string.charAt(index));
            } catch (Exception e) {
                System.out.println("Input contains a character other than 0-9. "
                        + "Cannot be converted to integer");
                throw e;
            }
            index++;
        }
        if (isNegative) {
            result = result * -1;
        }
        return result;
    }

    //Main function.
    public static void main(String[] args) {
        System.out.println(stringToInt("1239"));

    }

}
