class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] array = new int[26];

        for(char ch : s.toCharArray()){
            array[ch - 97]++;
        }
        for(char ch : t.toCharArray()){
            array[ch - 97]--;
        }
        for(int num : array){
            if(num != 0){
                return false;
            }
        }
       return true;
    }
}