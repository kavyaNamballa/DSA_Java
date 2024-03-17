package linkedList;

//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}


public class Flattenll
{
    Node head;

    void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.next;
        }
        System.out.println();
    }
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Flattenll list = new Flattenll();
        while(t>0)
        {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++)
                arr[i] = sc.nextInt();

            Node temp = null;
            Node tempB = null;
            Node pre = null;
            Node preB = null;
            int flag=1;
            int flag1=1;
            for(int i=0; i<N;i++)
            {
                int m = arr[i];
                m--;
                int a1 = sc.nextInt();
                temp = new Node(a1);
                if(flag == 1)
                {
                    list.head = temp;
                    pre = temp;
                    flag = 0;
                    flag1 = 1;
                }
                else
                {
                    pre.next = temp;
                    pre = temp;
                    flag1 = 1;
                }

                for(int j=0;j<m;j++)
                {
                    int a = sc.nextInt();
                    tempB = new Node(a);
                    if(flag1 == 1)
                    {
                        temp.bottom = tempB;
                        preB = tempB;
                        flag1 = 0;
                    }
                    else
                    {
                        preB.bottom = tempB;
                        preB = tempB;
                    }
                }

            }
            //list.printList();
            GfG g = new GfG();
            Node root = g.flatten(list.head);
            list.printList(root);

            t--;
        }
    }
}
// } Driver Code Ends


/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;

	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of
    the flattened linked list. */
class GfG
{
    Node flatten(Node root)
    {
        // Your code here
        if(root==null || root.next==null) return root;
        root.next = flatten(root.next);
        root = merge(root,root.next);
        return root;
    }
    Node merge(Node head1,Node head2){
        Node dummy = new Node(0);
        Node curr = dummy;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                curr.next = head1;
                head1 = head1.bottom;
            }else{
                curr.next = head2;
                head2 = head2.bottom;
            }
            curr = curr.next;
        }
        while(head1!=null){
            curr.next = head1;
            head1 = head1.bottom;
            curr = curr.next;
        }
        while(head2!=null){
            curr.next = head2;
            head2 = head2.bottom;
            curr = curr.next;
        }
        return dummy.next;
    }
}