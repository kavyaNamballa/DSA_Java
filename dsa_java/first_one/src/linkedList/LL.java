package linkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int index,int val){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = getRef(index-1);
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    //insert using recursion
    public void insertRec(int index,int val){
        // 1. void return type and make changes in ll
        // 2. node return type
        head = insertRec(index,val,head);
    }
    private Node insertRec(int index,int val,Node node){
        if(index==0){
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }
        node.next = insertRec(index-1,val,node.next);
        return node;
    }
    public Node getRef(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head==null) tail=null;
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = getRef(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = getRef(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
