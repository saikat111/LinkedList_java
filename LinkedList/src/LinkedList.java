public class LinkedList {
    private Node head;
   //private  Node head2;
    private  int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToFront(Data data){
         Node new_node =new Node(data);
         new_node.setNext(head);
         head = new_node;
         size++;
    }
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
    public  boolean isEmpty(){
        return head == null;
    }
    public Node removeFromFront(){
        if(isEmpty()){
            return null;
        }
        Node remove = head;
        head = head.getNext();
        size--;
        remove.setNext(null);
        return remove;

    }



}
