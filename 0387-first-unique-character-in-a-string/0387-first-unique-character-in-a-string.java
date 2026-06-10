class Solution {
    public int firstUniqChar(String s) {
        char[] str1 = s.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < str1.length; i++) {
            int j = (int) str1[i];
            arr[j - 97] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}