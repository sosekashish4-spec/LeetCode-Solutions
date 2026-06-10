class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1) return true;
        char[] ch = word.toCharArray();
        if ((int) ch[0] >= 97 && (int) ch[0] <= 122) {
           String str = word.toLowerCase();
            return str.equals(word);
        }

        if ((int) ch[1] >= 65 && (int) ch[1] <= 90) {
           String str = word.toUpperCase();
            return str.equals(word);
        } else {
            for (int i = 1; i < word.length(); i++) {
                int m = (int) ch[i];
                if ((m >= 65 && m <= 90))
                    return false;
            }
        }
        return true;
    }
}