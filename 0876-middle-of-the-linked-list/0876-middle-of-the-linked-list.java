class Solution {
    public ListNode middleNode(ListNode head) {
       int len = 0;
       ListNode n = head;

       while(n != null){
        len++;
        n = n.next;
       }

       int middle = len/2;
       
       n = head;
       for(int i = 0; i<middle; i++){
        n=n.next;

       }
       return n;

    
    }
}