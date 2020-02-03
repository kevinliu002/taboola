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

        //Intialize variables to flag is integer is seen
        boolean isInteger = false;

        //Loop through string and see if integer is present. Note 40 and 57
        //refer to ASCII values of integers 0 to 9.
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 40 && string.charAt(i) <= 57) {
                isInteger = true;
            }
        }
        return isInteger;
    }

    public static void main(String args[]) {
        System.out.println(ContainsInteger("js654idlkhf"));

    }
}
