public class valid_palindrom {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char head = s.charAt(start);
            char tail = s.charAt(end);

            if (!Character.isLetterOrDigit(head)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(tail)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(head) != Character.toLowerCase(tail)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        valid_palindrom solution = new valid_palindrom();

        // Test cases
        String[] testCases = {
                "A man, a plan, a canal: Panama",
                "race a car",
                "Was it a car or a cat I saw?",
                "Madam",
                "No 'x' in Nixon",
                "",
                "a"
        };

        System.out.println("Testing palindrome checker:");
        System.out.println("===========================");

        for (String test : testCases) {
            boolean result = solution.isPalindrome(test);
            System.out.println("Input: \"" + test + "\"");
            System.out.println("Is palindrome: " + result);
            System.out.println();
        }
    }
}
