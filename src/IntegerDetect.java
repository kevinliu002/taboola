public class IntegerDetect {

    public static boolean ContainsInteger(String string) {
        boolean isInteger = false;
        int index = 0;
        int StringLength = string.length();

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
