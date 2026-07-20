class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        List<Character>[] arr = new ArrayList[s.length()+1];
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(arr[freq] == null){
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(ch);
        }

        StringBuilder ans = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] != null){
                for(char ch : arr[i]){
                    for(int j = 0; j< i; j++){
                        ans.append(ch);
                    }
                }
            }
        } 
        return ans.toString();

    }
}