class Solution {
     public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
     }

    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++ ){
            if(isVowel(s.charAt(i)))
             count++;
        }
        int maxi=count;
        for(int i=0;i<s.length()-k;i++){
            if(isVowel(s.charAt(i)))
             count--;
             if(isVowel(s.charAt(i+k)))
             count++;

        if(count>maxi)
        maxi=count;
            
        }
       return maxi; 
    }
}