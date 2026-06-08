class Solution {
    public boolean isPalindrome(String s) {
       String ns = "";
       for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(Character.isAlphabetic(c)||Character.isDigit(c)){
            if(Character.isUpperCase(c))
              ns = ns+Character.toLowerCase(c);
            else
            ns=ns+c;
        }
       }
      
      int left =0;
      int right = ns.length()-1;
      while(left<=right){
        if(ns.charAt(left)==ns.charAt(right)){
            left++;
            right--;
        }else{
            return false;
        }
      }
return true;

    }


}