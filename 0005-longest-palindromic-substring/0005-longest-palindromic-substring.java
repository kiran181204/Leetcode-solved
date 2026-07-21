class Solution {
    int start=0;
    int maxLen=1;
    public String longestPalindrome(String s) {
        if (s==null || s.length()<2){
            return s;
        }
        for(int i=0;i<s.length();i++){
            expand(s,i,i);      //odd
            expand(s,i,i+1);    //even
        }
        return s.substring(start,start+maxLen);
    }
    private void expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        int Len=right-left-1;
        if(Len>maxLen){
            maxLen=Len;
            start=left+1;
        }
    }
}