package leetcode;

public class firstUnique {

    static int firstuniqchar(String s){
        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (int i = 0; i < s.length(); i++) if (count[s.charAt(i) - 'a'] == 1) return i;
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        int check = firstuniqchar(s1);
        System.out.println(check);
        check = firstuniqchar(s2);
        System.out.println(check);
        check = firstuniqchar(s3);
        System.out.println(check);
    }
}
