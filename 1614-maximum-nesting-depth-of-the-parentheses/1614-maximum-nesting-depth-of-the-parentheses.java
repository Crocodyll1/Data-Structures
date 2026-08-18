class Solution {
    public int maxDepth(String s) {
       int dept = 0;
       int maxDepth = 0;

       for(char ch : s.toCharArray()){
          if(ch == '('){
            dept++;
            maxDepth = Math.max(dept, maxDepth);
          }
          else if(ch == ')'){
            dept--;
          }
        }
        return maxDepth;


    }
}