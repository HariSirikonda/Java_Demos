
public class Demo2 {
    void countVowels(String str) {
        int vowels = 0;
        int consonents = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonents++;
            }
        }
        System.out.println("vowels: " + vowels);
        System.out.println("consonents: " + consonents);
    }

    boolean checkAnagrams(String s, String t) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            count1[s.charAt(i) - 'a']++;
            count2[t.charAt(i) - 'a']++;
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // String input = "helloworld";
        String str1 = "anagram";
        String str2 = "nagaram";
        Demo2 obj = new Demo2();
        // obj.countVowels(input);
        System.out.println(obj.checkAnagrams(str1, str2));
    }
}
