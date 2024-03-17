package binaryTrees;

public class BinarySearchTree {
    private class Node{
        int val;
        int height;
        Node left;
        Node right;
        public Node(int value){
            this.val = value;
        }
    }
    private Node root;
    public BinarySearchTree(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root node: ");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.val);
        display(node.left,"left child of "+node.val+" : ");
        display(node.right,"right child of "+node.val+" : ");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node, int level){
        if(node==null) return;
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.val);
        }else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value<node.val){
            node.left = insert(value,node.left);
        }
        if(value>node.val){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void populate(int[] nums){
        for(int num:nums){
            insert(num);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length-1);
    }
    private void populateSorted(int[] nums,int s,int e){
        if(s>e){
            return;
        }
        int mid = (s+e)/2;
        insert(nums[mid]);
        populateSorted(nums,s,mid-1);
        populateSorted(nums,mid+1,e);
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }



}
