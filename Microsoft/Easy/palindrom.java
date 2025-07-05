// give an  integer  x  return true if x is a palindrome integer.
// otherwise return false.
// input: 121
// output: true

public class palindrom {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int original = x;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev == original;
    }
    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
    }
}
