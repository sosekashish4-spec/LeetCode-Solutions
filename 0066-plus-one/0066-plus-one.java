class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        int i = (n - 1);
        while(i>=0){ 
            if (digits[i] != 9) {
                digits[i] += carry;
                  return digits;
            } else {
                digits[i] = 0;
                
            }
            i--;
        }
            int[] ans = new int[n + 1];
        if (carry == 1 ) {
            ans[0] = 1;
            for (int m = 1; m < ans.length; m++)
                ans[m] = 0;
        }
            return ans;
      
    }
}