import java.util.HashMap;
import java.util.Map;

public class Longest_Substring {

    public static int longestsubstringwithoutrepeating(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0;
        int maxleng = 0;
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;    
            }
            map.put(ch, right);
            maxleng = Math.max(maxleng, right - left + 1);
        }
        return maxleng;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = longestsubstringwithoutrepeating(s);
        System.out.println(result); // Output: 3
    }
}
