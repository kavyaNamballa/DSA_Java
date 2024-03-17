package linkedList;

import java.util.List;

public class SortLL {

    private ListNode head;
    private ListNode tail;
    private int size;
    private class ListNode{
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        SortLL.ListNode node = new SortLL.ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void reverse(){
        head = rev(head);
    }
    public void reverse(ListNode node){
        if(node == tail){
            head = tail;
            return;
        }
        ListNode temp;
        if(tail.next == null) {
            tail.next = node;
            temp = node.next;
            node.next = null;
        }else{
            temp = node.next;
            node.next = tail.next;
            tail.next = node;
        }
        reverse(temp);
    }

    // recursion reverse of linked list
    public void reverseRec(ListNode node){
        if(node==tail){
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // inplace reversal of linked list
    // reverse of linked list without using tail
    public ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            next = (next==null)?null:next.next;
        }
        return prev;
    }
    public void mergeSort(){
        head = sortList(head);
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode node = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                node.next =  list1;
                list1 = list1.next;
                node = node.next;
            }
            else{
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }
        node.next = (list1==null)?list2:list1;
        return dummyHead.next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode midPrev = null;
        ListNode fp=head;
        ListNode sp = head;
        while(fp!=null && fp.next!=null){
            midPrev = sp;
            sp = sp.next;
            fp = fp.next.next;
        }
        midPrev.next = null;
        return sp;
    }
    public ListNode getRef(int index){
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    long find(){
        ListNode temp = head;
        long num = 0;
        int i = 0;
        while(temp!=null){
            num = (long) temp.val *(int)Math.pow(10,i) + num;
            temp = temp.next;
            i++;
        }
        return num;
    }
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    public void bubbleSort(int row,int col){
        if(row==0){
            return;
        }
        if(col < row){
            ListNode first = getRef(col);
            ListNode second  = getRef(col+1);

            if(first.val > second.val){
                // do the swap for that we've three cases
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    ListNode prev = getRef(col-1);
                    prev.next = second;
                    tail = first;
                    second.next = first;
                    first.next = null;
                }else{
                    ListNode prev = getRef(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row,col+1);
        }else {
            bubbleSort(row-1,0);
        }
    }
}
