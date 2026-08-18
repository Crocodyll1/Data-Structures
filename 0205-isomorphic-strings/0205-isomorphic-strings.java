class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> charMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char mapKey = s.charAt(i);
            char mapValue = t.charAt(i);

            if(!charMap.containsKey(mapKey)){
                if(!charMap.containsValue(mapValue)){
                    charMap.put(mapKey, mapValue);
                }
                else{
                    return false;
                }
            }
            else{
                char mappedCharacter = charMap.get(mapKey);
                if(mappedCharacter != mapValue){
                    return false;
                }
            }
        }
        return true;


    }
}