class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int num = x;
        if(x >=0 && x<=9){
            return true;
        }

        if(x < 0){
            return false;
        }
        while(x != 0){
            int element = x %10;
            reversed = reversed *  10 + element;
            x = x /10;

        }
        if(num == reversed){
            return true;
        }else{
            return false;
        }
    }
}