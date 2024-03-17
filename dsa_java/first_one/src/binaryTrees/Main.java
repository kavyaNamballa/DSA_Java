package binaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(sc);
//        tree.display();
//        tree.prettyDisplay();
        BinarySearchTree tree = new BinarySearchTree();
//        int[] nums = {5,2,6,4,7,9,8,3,10};
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        tree.populate(nums);
        tree.populateSorted(nums);
        tree.display();
        tree.prettyDisplay();
    }
}
