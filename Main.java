//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return it as is
        if (str == null || str.length() <= 1) {
            return str;
        }

        // Recursive case: reverse the substring from index 1 to the end and append the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}