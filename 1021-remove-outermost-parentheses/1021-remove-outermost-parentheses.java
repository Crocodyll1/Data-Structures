class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        char left = '(';
        char right = ')';

        for(int i=0; i<s.length(); i++){

            char temp = s.charAt(i);
            if(temp == left){
                counter++;
                if(counter > 1){
                    ans.append(left);
                }
            }else{
                counter--;
                if(counter !=0){
                    ans.append(right);
                }
            }

        }
        return ans.toString();
        
    }
}