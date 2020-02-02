import java.util.HashMap;

public class IntegerString {

    public static int StringToInt(String string) {

        int StringLength = string.length();
        int index = 0;
        int result = 0;

        String integers = "0123456789";
        HashMap<Character, Integer> IntegerLookup = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            IntegerLookup.put(integers.charAt(i), i);
        }

        while (index < StringLength) {
            result = result * 10;
            result = result + IntegerLookup.get(string.charAt(index));
            index++;

        }

        if (string.charAt(0) == '-') {
            result = -1 * result;
        }
        return result;
    }


    public static void main(String args[]) {
        System.out.println(StringToInt("-1239"));

    }

}
