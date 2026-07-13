class Solution {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder(s).reverse();
        int n = reverse.length();
        StringBuilder output = new StringBuilder(); 
        StringBuilder ok = new StringBuilder(); 
        

        for(int i =0; i<n; i++){
            char ch = reverse.charAt(i);
            
            if(ch != ' '){
                ok.append(ch);
            }else{
                if(ok.length() > 0){
                String ot = new StringBuilder(ok).reverse().toString();
                output.append(" ").append(ot);
                ok.setLength(0);
                }
            }
        }
        if (ok.length() > 0) {
          String ot = new StringBuilder(ok).reverse().toString();
          output.append(" ").append(ot);
        }
        return output.length() == 0 ? "" : output.substring(1);
    }
 }