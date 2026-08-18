public class addFirst {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;

        }
    }
    public void addFirstInFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("Linked List is empty!");
            return;
        }
        Node currNdoe = head;
        while(currNdoe != null){
            System.out.print(currNdoe.data + " -> ");
            currNdoe = currNdoe.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        addFirst list = new addFirst();
        list.addFirstInFirst("O");
        list.addFirstInFirst("r");
        list.addFirstInFirst("e");
        list.addFirstInFirst("z");

        list.print();
    }
}
