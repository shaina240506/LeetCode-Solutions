class Solution {
    public boolean isPalindrome(int x) {
       int orginal=x;
       int palindrome=0;
       while(x>0){
        int lastDigit=x%10;
        x=x/10;
        palindrome=(palindrome*10)+lastDigit;
       }
     return palindrome==orginal;
}}