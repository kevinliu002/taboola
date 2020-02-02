public class IntegerDetect {

    public static boolean ContainsInteger(String string) {
        /** Question 2: This function takes in a string and
         *  determines if an integer is present.
         *
         *  Input: String
         *  Output: Boolean (True if integer is present)
         *
         *  Complexity Analysis: O(N) time, O(1) space
         */

        //Intialize variables to flag is integer is seen, index, and string length.
        boolean isInteger = false;
        int index = 0;
        int StringLength = string.length();

        //Loop through string and see if integer is present. Note 40 and 57
        //refer to ASCII values of integers 0 to 9.
        while (index < StringLength) {
            if (string.charAt(index) >= 40 && string.charAt(index) <= 57) {
                isInteger = true;
            }
            index++;
        }
        return isInteger;
    }

    public static void main(String args[]) {
        System.out.println(ContainsInteger("-0ABCk"));

    }
}
