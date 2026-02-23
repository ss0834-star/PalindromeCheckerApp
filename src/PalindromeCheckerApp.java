public class PalindromeCheckerApp {
    static boolean palindrome(String word) {
        String revword = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revword += word.charAt(i);
        }
        if (word.equals(revword)) {

            return true;


        } else {

            return false;

        }

    }

    static boolean palindromearr(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (end >= start) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        float version = 2.0F;
        System.out.println("Welcome to the Palindrome checker");
        System.out.println("version : " + version);
        System.out.println("System initialised successfully");
        boolean status = palindrome("madam");
        if (status) {
            System.out.println("palindrome word");

        } else {
            System.out.println("not a palindrome");
        }
    }
}