import java.util.HashSet;
public class Question3{
    static int l(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0, m = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            m = Math.max(m, r - l + 1);
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(l("abcabcbb"));
    }
}

