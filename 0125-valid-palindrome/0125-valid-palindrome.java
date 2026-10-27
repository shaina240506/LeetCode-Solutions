class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            int cLeft=s.charAt(left);
            int cRight=s.charAt(right);
            if(!Character.isLetterOrDigit(cLeft))
            left++;
            else if(!Character.isLetterOrDigit(cRight))
            right--;
            else{
                if(Character.toLowerCase(cLeft)!=Character.toLowerCase(cRight)){
                    return false;
                }
            left++;
            right--;
        }
        }
        return true;
    }
}